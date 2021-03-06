
package br.ufpb.iged.tutor.ncm.event;

import br.ufpb.iged.tutor.ncm.entity.Entity;

/**
 *
 * @author GILBERTO FARIAS
 */
public abstract class EntityEvent {
    
    private int occurrences = 0; 
    private int staus = EntityEvent.SLEEPING;
    protected Entity source = null;

    public EntityEvent(){
        
    }
    
    public EntityEvent(EntityEvent e){
        this.occurrences = e.occurrences;
        this.staus = e.staus;
        this.source = e.source;
    }
    
    public int getOccurrences() {
        return occurrences;
    }

    void incrOccurrences() {
        ++this.occurrences;
    }

    public int getStaus() {
        return staus;
    }

    void setStaus(int staus) {
        this.staus = staus;
    }
    
    public abstract Entity getSource();
    public abstract EntityEvent getCopy();
    
    public static final int SLEEPING = 0;
    public static final int PAUSED = 1;
    public static final int OCCURING = 2;
}
