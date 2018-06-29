/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package basics;

/**
 *
 * @author it20944
 */
public class Request {
    
    Route r;
    String numbppl;
   

    public Request(Route r, String numbppl) {
        this.r = r;
        this.numbppl = numbppl;
    }

    @Override
    public String toString() {
        return  r  +numbppl +"\n";
    }
    
    

    

    
    
    

    
    

    
}
