/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package basics;

import java.sql.Time;
import java.util.Date;


/**
 *
 * @author it20944
 */
public class Route {

    
    String citystart;
    String cityend;
    Date depdate;
    int day;
    int month;
    Time earlydep;
    Time latedep;
    String midstops[] = new String[5];
    int el;
    
    
    
    public String getCityend() {
        return cityend;
    }

    public void setCityend(String cityend) {
        this.cityend = cityend;
    }

    public String getCitystart() {
        return citystart;
    }

    public void setCitystart(String citystart) {
        this.citystart = citystart;
    }

    public Date getDepdate() {
        return depdate;
    }

    public void setDepdate(Date depdate) {
        this.depdate = depdate;
    }

    public Time getEarlydep() {
        return earlydep;
    }

    public void setEarlydep(Time earlydep) {
        this.earlydep = earlydep;
    }

    public Time getLatedep() {
        return latedep;
    }

    public void setLatedep(Time latedep) {
        this.latedep = latedep;
    }

    public String[] getMidstops() {
        return midstops;
    }

    public void setMidstops(String[] midstops) {
        this.midstops = midstops;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public Route(String citystart, String cityend, Date depdate, Time earlydep, Time latedep, String[] midstops) {
        this.citystart = citystart;
        this.cityend = cityend;
        this.depdate = depdate;
        this.earlydep = earlydep;
        this.latedep = latedep;
        this.midstops = midstops;
    }

    @Override
    public String toString() {           
            String out=citystart +";" +cityend +";" +depdate +";" +earlydep +";" +latedep +";";
            if(midstops == null){
                return out;
            }
            for(int i=0;i<midstops.length;i++){               
                out = out +midstops[i] +",";
            }
            return out;
    }
    
    
    

    

    
    
    public void checkpoli(Route r){       
        int k=0;
        String poli = Control.poli();
        el = poli.compareTo(r.getCitystart());
        if (el == 0){
                k++;  
        }
        el = poli.compareTo(r.getCityend());
        if (el == 0){
                k++;
        }
        for (int i=0;i<5;i++){
            el = poli.compareTo(r.getMidstops()[i]);
            if (el == 0)
                k++;
        }
        if(k>0)
            System.out.println("I poli briskete sto dromologio");
        else
            System.out.println("I poli den briskete sto dromologio");
        
        
                
        
    }
    
    public void checkdromo(Route r){       
        el = r.depdate.compareTo(Control.nea_depdate());
        if (el == 0){           
            Time p = Control.neo_latedep();
            if(latedep == p || latedep.after(p) || earlydep.after(p)){
                Time t = Control.nea_earlydep();
                if (earlydep == t || earlydep.before(t) || latedep.before(t)){
                    System.out.println("I ora ke i mera teriazoun");
                }
                else
                    System.out.println("Den teriazei i argoteri ora anaxorisis");
            }
            else
                    System.out.println("Den teriazei i noriteri ora anaxorisis");
       }
        else
                    System.out.println("Den teriazei i imerominia anaxorisis");
    }

    

    

    
    
   
    

    
    
    

    

}