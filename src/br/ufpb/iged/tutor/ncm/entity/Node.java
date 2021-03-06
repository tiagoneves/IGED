
package br.ufpb.iged.tutor.ncm.entity;

import br.ufpb.iged.tutor.ncm.event.EventStateMachine;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author GILBERTO FARIAS
 * 
 * Representa todos os nós do NCM, implementando o padrão Observer
 * para enviar os eventos ocorridos no Nó. 
 */
public abstract class Node extends Entity{
    protected Map<String, Anchor> anchors;
    protected EventStateMachine presetationMachine = null;
    
    Node(){
        this.anchors = new HashMap<String, Anchor>();
    }
    
    public abstract void execute(String interfaceID);
    public abstract void pause();
    public abstract void resume();
    public abstract void resume(String portID);
    public abstract void finish();
    

    public void add(Anchor a){
        this.anchors.put(a.getId(), a);
    }
    
    public void remove(Anchor a){
        this.anchors.remove(a.getId());
    }

    public Anchor getAnchor(String id){
        return this.anchors.get(id);
    }
    
    public Collection<Anchor> getAnchors() {
        return anchors.values();
    }
    
    public int getState(){
        return this.presetationMachine.getStatus();
    }

    Entity getComponentByInterface(String aInterface) {
        return this.anchors.get(aInterface);
    }
    
}
