/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package basics;

/**
 *
 * @author it20944
 */
public class Driver {

    String name;
    String sex;
    int contactnum;
    String contactmail;
    String expage;

    public String getContactmail() {
        return contactmail;
    }

    public void setContactmail(String contactmail) {
        this.contactmail = contactmail;
    }

    public int getContactnum() {
        return contactnum;
    }

    public void setContactnum(int contactnum) {
        this.contactnum = contactnum;
    }

    public String getExpage() {
        return expage;
    }

    public void setExpage(String expage) {
        this.expage = expage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Driver(String name, String sex, int contactnum, String contactmail, String expage) {
        this.name = name;
        this.sex = sex;
        this.contactnum = contactnum;
        this.contactmail = contactmail;
        this.expage = expage;
    }

    @Override
    public String toString() {
        return name +";" +sex +";" +contactnum +";" +contactmail +";" +expage;
    }
    
    

    
    
    

    
    
}