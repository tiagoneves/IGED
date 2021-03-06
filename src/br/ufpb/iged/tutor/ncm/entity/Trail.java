
package br.ufpb.iged.tutor.ncm.entity;

import br.ufpb.iged.tutor.ncm.event.EntityEvent;
import br.ufpb.iged.tutor.players.ApressPlayer;
import br.ufpb.iged.tutor.players.Player;
import br.ufpb.iged.tutor.players.event.ActionUserEvent;
import br.ufpb.iged.tutor.players.event.PlayerEvent;
import br.ufpb.iged.tutor.players.event.PlayerListener;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;

/**
 *
 * @author GILBERTO FARIAS
 */
public class Trail extends CompositeNode implements PlayerListener{
    
    List<Node> lista = null;
    ListIterator<Node> iNode = null;
    Node currentNode = null;
    
    //Player de slides
    Player player = null;
    
    public int direction;
    
    public Trail()
    {
        this.lista = new LinkedList<Node>();
    }
    
    public Node getCurrentNode() {
        return this.currentNode;
    }
    
    /*
     * Coloca como no corrente, o elemento que tenha o id passado como parametro.
     */
    public void home(String componentID){
        if(this.nodes.size() > 0){    
            iNode = this.lista.listIterator();
            while(iNode.hasNext()){
                currentNode = iNode.next();
                System.out.println("MEDIA: " + currentNode.getId());
                if(currentNode.getId().equals(componentID)){
                    iNode.set(currentNode);
                    break;
                }
            }
        }
        this.direction = Trail.NEXT;
    }
    
    @Override
    public void execute(String portID){
        if(this.player == null){
            this.player = ApressPlayer.getInstance();
            this.player.addListener(this);
        }
        this.player.init();
        this.player.execute();
        
        
        System.out.println("Execute TRAIL - Port : " + portID);
        Port p = this.getPort(portID);
        this.home(p.getComponent());
        this.execute(p);
    }
    
    @Override
    public void pause(){
        if(this.getState() != EntityEvent.OCCURING)
            return;
        
        this.player.pause();
        super.pause();
    }
    
    @Override
    public void resume() {
        System.out.println("RESUME TRAIL");
        
        this.player.resume();
        super.resume();
        
        if((currentNode != null)
                    && (currentNode.getState() != EntityEvent.OCCURING))
                currentNode.resume();
    }
    
    @Override
    public void finish(){
        if((currentNode != null)
                    &&(currentNode.getState() != EntityEvent.SLEEPING))
                currentNode.finish();
        
        if(this.getState() != EntityEvent.SLEEPING){
                this.player.finish();
                this.player.removeListener(this);
                super.finish();
        }
    }
    
    private void changeExecution(Node current, Node last){
        if(current != null){
            //if(current instanceof ContentNode)
            System.out.println("Change: " + current.getId());
            ((ContentNode)current).execute();
        }
        
        if(last != null)
            last.finish();
    }
    
    public void next() throws NoSuchElementException{
        
        if(iNode.hasNext()){
            if(this.direction == PREVIOUS)
                iNode.next();
            Node last = currentNode;
            currentNode = iNode.next();
            //iNode.set(currentNode);
            this.changeExecution(currentNode, last);
            this.direction = Trail.NEXT;
        }else
            throw new NoSuchElementException("Fim do trail.");
    }
    
    public void previus() throws NoSuchElementException{
        if(iNode.hasPrevious()){
            if(this.direction == NEXT)
                iNode.previous();
            Node last = currentNode;
            currentNode = iNode.previous();
            //iNode.set(currentNode);
            this.changeExecution(currentNode, last);
            this.direction = Trail.PREVIOUS;
        }else
            throw new NoSuchElementException("Fim do trail.");
    }
    
    @Override
    public void add(Node n){
        this.nodes.put(n.getId(), n);
        this.lista.add(n);
    }
    
    public Element toXML(Document doc){
    
        Element element = doc.createElement("trail");       
        element.setAttribute("id", getId());
    
        return element;
    
    }
    
     public Trail toReadXML(NamedNodeMap namedNode){
    
        this.setId(namedNode.getNamedItem("id").getNodeValue());
        
        return this;
    
    }

    @Override
    public void receiveEvent(PlayerEvent e) {
        if(e instanceof ActionUserEvent){
            ActionUserEvent aue = (ActionUserEvent)e;
            System.out.println("---------Trail receive Event: " + aue.getAction());
            switch(aue.getAction()){
                case ActionUserEvent.CLOSE_PLAYER:
                    this.finish();
                    break;
                    
                case ActionUserEvent.SELECT_NEXT_NODE: 
                    this.next();
                    break;
                    
                case ActionUserEvent.SELECT_PREVIUS_NODE: 
                    this.previus();
                    break;
            }
        }
    }
    
    private static final int NEXT = 0;
    private static final int PREVIOUS = 1;
}
