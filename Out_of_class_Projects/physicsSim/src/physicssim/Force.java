/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package physicssim;

/**
 *
 * @author Kaleb
 */
public class Force {
    
    public String name;
    
    private float force, vector;
    
    public Force(String name){
        this.name = name;
        this.force = 0;
        this.vector = 0;
        
    }
    public Force(String name, float newtons, float vector){
        this(name);
        this.force = newtons;
        this.vector = vector;
    }
    public void setName(String par1){
        this.name = par1;
    }
    public void setForce(float par1){
        this.force = par1;
    }
    public void setVector(float par1){
        this.vector = par1;
    }
    public float getForce(){
        return this.force;
    }
    public float getVector(){
        return this.vector;
    }
    
    public String toString(){
        return this.name;
    }
    public Object clone(){
        return new Force(this.name, this.force, this.vector);
    }
    public boolean equals(Object obj){
        if(obj instanceof Force){
            Force objForce = (Force)((Force)obj).clone();
            return objForce.force == this.force && objForce.vector == this.vector ? true: false;
        }
        return false;
    }
    
}
