/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package basics;

/**
 *
 * @author it20944
 */
public class Car {

    String brand;
    String model;
    String tempplate;
    int numseats;
    int leftseats;

    

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getLeftseats() {
        return leftseats;
    }

    public void setLeftseats(int leftseats) {
        this.leftseats = leftseats;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNumseats() {
        return numseats;
    }

    public void setNumseats(int numseats) {
        this.numseats = numseats;
    }

    public String getTempplate() {
        return tempplate;
    }

    public void setTempplate(String tempplate) {
        this.tempplate = tempplate;
    }

    public Car(String brand, String model, String tempplate, int numseats, int leftseats) {
        this.brand = brand;
        this.model = model;
        this.tempplate = tempplate;
        this.numseats = numseats;
        this.leftseats = leftseats;
    }

    @Override
    public String toString() {
        return brand +";" +model +";" +tempplate +";" +numseats +";" +leftseats;
    }
    
    
    

    public void checkaritm(Car c){
        int i = Integer.valueOf(Control.arthatom());      
        if (i <= c.getLeftseats()){
        System.out.println("Iparxoun diathesimes thesois");
        }
        else{
            System.out.println("Den iparxoun diathesimes thesois");
            
        }
    }
    
    
}
