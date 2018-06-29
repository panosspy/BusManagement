/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package basics;

/**
 *
 * @author it20944
 */
public class Offer {

    Route r;
    Car c;
    Driver d;

    public Offer(Route r, Car c, Driver d) {
        this.r = r;
        this.c = c;
        this.d = d;
    }

    @Override
    public String toString() {
        return   r +"\n" +c +"\n" +d +"\n";
    }
    
    

    
    
    
    
    
    
    
    
    
}
