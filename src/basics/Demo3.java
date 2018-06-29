/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package basics;

import java.util.ArrayList;

/**
 *
 * @author it20944
 */
public class Demo3 {  
    
    public static ArrayList<Offer> arroffer;
    public static ArrayList<Request> arrrequest;
    public static ArrayList<Request> monorequest;
    public static ArrayList<String> eksodos;
    public static Route r;   
    public static Car c;
    
    public static void main(String[] args){
        
    arroffer = new ArrayList();
    arrrequest = new ArrayList();
    monorequest = new ArrayList();
    eksodos = new ArrayList<String>();
    
    

    arroffer = Control.readOffersFromFile("readoffer.txt");
    arrrequest = Control.readRequestsFromFile("readrequest.txt");
    
    
    
    Menu m = new Menu();
    m.setVisible(true);
        
    }
    
}
