/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package basics;

import java.io.File;
import java.io.PrintWriter;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;
/**
 *
 * @author it20944
 */
public class Control {

  static Scanner fileo;
  static Scanner filer;
  static int day;
  static int month;
  static int hour;
  static int min;
  String poli;
  static Date m;
  int j = 0;
  static Scanner word = new Scanner(System.in);
  static Car c;
  static Route r;
  static Driver d;
  static Request rs;
  Route[] p = new Route[10];
  static int k;
  

  
  static String brand(){
      System.out.println("Dose ti marka tou car");
      word.nextLine();
      return (word.nextLine());
  }

  static String model(){
      System.out.println("Dose to modelo tou car");
      return (word.nextLine()); 
  }
  
  static String tempplate(){
      System.out.println("Dose tis pinakides tou car");
      return (word.nextLine()); 
  }
  
  static int numseats(){
      System.out.println("Dose ton arithmo theseon tou car");
      return (word.nextInt()); 
  }
  
  static int leftseats(){
      System.out.println("Dose tis eleftheres thesis tou car");
      return (word.nextInt());
  }
  
  
  static String citystart(){
      System.out.println("Dose tin arxiki poli");
      return (word.nextLine()); 
  }
  
  
  static String cityend(){
      System.out.println("Dose tin termatiki poli");
      return (word.nextLine()); 
  }
  
  static Date depdate(){
      System.out.println("Dose tin mera");
      day = word.nextInt();    
      System.out.println("Dose ton mina");
      month = word.nextInt();
      return (new Date(2011 ,month ,day));
  }
  
  static Time earlydep(){
      System.out.println("Dose tin noriteri ora anaxorisis ");
      hour = word.nextInt();
      System.out.println("Dose tin noritera lepta anaxorisis ");
      min = word.nextInt();
      return (new Time(hour,min,0));
  }
  
  static Time latedep(){
      System.out.println("Dose tin argoteri ora anaxorisis");
      hour = word.nextInt();
      System.out.println("Dose tin argotera lepta anaxorisis ");
      min = word.nextInt();
      return (new Time(hour,min,0));
  }
  
  static String midstops(){
      System.out.println("Dose tin endiamesi stasi");
      return (word.nextLine());
  }
  
  static String name(){
      System.out.println("Dose to onoma tou odigou");
      word.nextLine();
      return (word.nextLine()); 
  }
  
  static String sex(){
      System.out.println("Dose to filo tou odigou");
      return (word.nextLine()); 
  }
  
  static int contactnum(){
      System.out.println("Dose ton arithmo epikinonias");
      return (word.nextInt()); 
  }
  
  static String contactmail(){
      System.out.println("Dose to mail epikinonias");
      word.nextLine();
      return (word.nextLine()); 
  }
  
  static String expage(){
      System.out.println("Dose ta xronia ebirias");
      return (word.nextLine()); 
      
  }
  
  static String numbppl(){
      System.out.println("Dose ton arithmo atomon");
      word.nextLine();
      return (word.nextLine());
  }
  
  static String arthatom(){
      System.out.println("Dose ton arithmo atomon");
      return word.nextLine();     
  }
  
  
  
  public void dromologia(){
                    
          p[j].citystart = citystart();
          p[j].cityend = cityend();
          p[j].depdate = depdate();
          p[j].earlydep = earlydep();
          p[j].latedep = latedep();
          for(int i=0;i<5;i++){
            p[j].midstops[i] = midstops();
          }
   }
  
   
   
   static public String poli(){
        System.out.println("Dose tin poli");
        return (word.nextLine());
   }

    
   
   
   
   static public Date nea_depdate(){
      System.out.println("Dose tin mera");
      day = word.nextInt();
      System.out.println("Dose ton mina");
      month = word.nextInt();
      return m = new Date(2011 ,month ,day);
   }
   
   static public Time nea_earlydep(){
      System.out.println("Dose tin noriteri ora anaxorisis ");
      hour = word.nextInt();
      System.out.println("Dose tin noritera lepta anaxorisis ");
      min = word.nextInt();
      return (new Time(hour,min,0));
   }
  
   static public Time neo_latedep(){
      System.out.println("Dose tin argoteri ora anaxorisis");
      hour = word.nextInt();
      System.out.println("Dose tin argotera lepta anaxorisis ");
      min = word.nextInt();
      return (new Time(hour,min,0));
   }
    
   public Route checkpinakas(Date m, Time earlydep, Time latedep){
       for(int i=0; i<10; i++){
          j = p[i].depdate.compareTo(m);
          if(j==0){
              if( earlydep.before(p[i].earlydep) || latedep.after(p[i].earlydep)){
                  if ( latedep.before(p[i].latedep) || latedep.after(p[i].latedep)){
                      return p[i];
                  }
              }
          }
       }
       return null;
   }
   
   public static Date readDate(String read){
       String[] tokend = read.split("-");       
       
       int dday = new Integer(tokend[0]).intValue();
       int dmonth = new Integer(tokend[1]).intValue();
       int dyear = new Integer(tokend[2]).intValue();
       
       Date depdate = new Date(dday, dmonth, dyear);
       
       return depdate;    
   }
   
   
   
   public static Time readTime(String read){
       String[] token = read.split(":");       
       
       int dhour = new Integer(token[0]).intValue();
       int dmin = new Integer(token[1]).intValue();
       int sec = 0;
       
       Time t = new Time(dhour,dmin,sec);
       return t;
       
       
   }
   
   
   
   public static Route readRoute(String read){
       String[] tokens = read.split(";");
      
       String citystart = tokens[0];
       String cityend = tokens[1];
       String ddate = tokens[2];
       Date depdate = readDate(ddate);
       String dearlydep = tokens[3];
       Time earlydep = readTime(dearlydep);
       String dlatedep = tokens[4];
       Time latedep = readTime(dlatedep);
       String dmidstops = tokens[5];
       String[] tokenm = dmidstops.split(",");
       String[] midstops = new String[5];
       System.arraycopy(tokenm, 0, midstops, 0, tokenm.length);
       
       Route p = new Route(citystart, cityend, depdate, earlydep, latedep, midstops);
       return p;
       
   }
   
   public static Car readCar(String read){
       String[] tokens = read.split(";");
       
       String brand = tokens[0];
       String model = tokens[1];
       String tempplate = tokens[2];
       int numseats = new Integer(tokens[3]).intValue();
       int leftseats = new Integer(tokens[4]).intValue();
       
       Car p = new Car(brand, model, tempplate, numseats, leftseats);
       return p;
       
       
   }
   
   public static Driver readDriver(String read){
       String[] tokens = read.split(";");
       
       String name = tokens[0];
       String sex = tokens[1];
       int contactnum = new Integer(tokens[2]).intValue();
       String contactmail = tokens[3];
       String expage = tokens[4];
       
       Driver p = new Driver(name, sex, contactnum, contactmail, expage);
       return p;
          
   }
   
           
   
   
   public static ArrayList<Offer> readOffersFromFile(String readoffer){
       ArrayList<Offer> arroffer = new ArrayList();
       
       try{
           fileo = new Scanner(new File(readoffer));
       }
       catch (Exception e){
       }
       
       String Line = fileo.nextLine();
       while(fileo.hasNextLine()){
            Route temp = readRoute(Line);
            Line = fileo.nextLine();
            Car temp1 = readCar(Line);
            Line = fileo.nextLine();
            Driver temp2 = readDriver(Line);
            if(fileo.hasNextLine())
                Line = fileo.nextLine();
            Offer temp3 = new Offer(temp, temp1, temp2);
            arroffer.add(temp3);
            
       }        
       fileo.close();
       return arroffer;

   }
   
   public static ArrayList<Request> readRequestsFromFile(String readrequest){
       ArrayList<Request> arrrequest = new ArrayList();
       
       try{
           filer = new Scanner(new File(readrequest));
       }
       catch (Exception e){
       }
       
       
       String arx = filer.nextLine();
       while(filer.hasNextLine()){
           
           String[] tokens = arx.split(";");
      
           String citystart = tokens[0];
           String cityend = tokens[1];
           String ddate = tokens[2];
           Date depdate = readDate(ddate);
           String dearlydep = tokens[3];
           Time earlydep = readTime(dearlydep);
           String dlatedep = tokens[4];
           Time latedep = readTime(dlatedep);
           String numbppl = tokens[5];
            

           Route p = new Route(citystart, cityend, depdate, earlydep, latedep, null);
           Request temp = new Request(p, numbppl);
           arrrequest.add(temp);
            
           
           arx = filer.nextLine();
            
       }
       
       filer.close();
       return arrrequest;
   }
   
   public static void writeOffersToFile(String writeoffer, ArrayList<Offer> arroffer){
        PrintWriter out = null;
        try{
            out = new PrintWriter(new File(writeoffer));
        }
        catch (Exception e){
        }
        
        for(int i=0;i<arroffer.size();i++)
            out.println(arroffer.get(i));
        
        out.close();
     
    }
   
    public static void writeRequestsToFile(String writerequest, ArrayList<Request> arrrequest){
        PrintWriter out = null;
        try{
            out = new PrintWriter(writerequest);
        }
        catch (Exception e){
        }
        
        for(int i=0;i<arrrequest.size();i++)
            out.println(arrrequest.get(i));        
        
        out.close();
    }
    
    public static void findMatchings (ArrayList<Offer> arroffer, ArrayList<Request> arrrequest){       
        
        PrintWriter out = null;
        try{
            out = new PrintWriter(new File("output.txt"));
        }
        catch (Exception e){
        }
        
        
        
        for (int i=0;i<arrrequest.size();i++){
            int a = 0;
  
            Demo3.eksodos.add("Request:");
            Demo3.eksodos.add(arrrequest.get(i).toString());
            Demo3.eksodos.add("Matching offers:");
            out.println("Request:");
            out.println(arrrequest.get(i));
            out.println("Matching offers:");
            for(int j=0;j<arroffer.size();j++){              
                k = arrrequest.get(i).r.depdate.compareTo(arroffer.get(j).r.depdate);
                if(k == 0 ){
                   if(arrrequest.get(i).r.earlydep.before(arroffer.get(j).r.earlydep) || arrrequest.get(i).r.latedep.after(arroffer.get(j).r.earlydep) || arrrequest.get(i).r.earlydep == arroffer.get(j).r.earlydep || arrrequest.get(i).r.earlydep == arroffer.get(j).r.latedep){
                       if(arrrequest.get(i).r.latedep.before(arroffer.get(j).r.latedep) || arrrequest.get(i).r.latedep.after(arroffer.get(j).r.latedep) || arrrequest.get(i).r.latedep == arroffer.get(j).r.latedep || arrrequest.get(i).r.latedep == arroffer.get(j).r.earlydep){
                           if(arrrequest.get(i).r.citystart.equals(arroffer.get(j).r.citystart)){
                               if(arrrequest.get(i).r.cityend.equals(arroffer.get(j).r.cityend)){
                                   Demo3.eksodos.add(arroffer.get(j).toString());
                                   out.println(arroffer.get(j));
                                   a++;                                                                
                               }
                               for(int z=0;z<arroffer.get(j).r.midstops.length;z++){
                                    if(arrrequest.get(i).r.cityend.equals(arroffer.get(j).r.midstops[z])){
                                        Demo3.eksodos.add(arroffer.get(j).toString());                                       
                                        out.println(arroffer.get(j));
                                        a++;
                                        break;
                                    }
                               }                              
                           }           
                           for(int z=0;z<arroffer.get(j).r.midstops.length;z++){                             
                               if(arrrequest.get(i).r.citystart.equals(arroffer.get(j).r.midstops[z])){                        
                                    if(arrrequest.get(i).r.cityend.equals(arroffer.get(j).r.cityend)){
                                        Demo3.eksodos.add(arroffer.get(j).toString());
                                        out.println(arroffer.get(j));
                                        a++;
                                    }
                                    for(int w=(z++);w<arroffer.get(j).r.midstops.length;w++){                               
                                        if(arrrequest.get(i).r.cityend.equals(arroffer.get(j).r.midstops[w])){
                                            Demo3.eksodos.add(arroffer.get(j).toString());
                                            out.println(arroffer.get(j));
                                            a++;                                          
                                        }                                                                              
                                    }
                                }
                           }
                       }
                   }
                }
            }
            if(a == 0){
            Demo3.eksodos.add("There is no match"+"\n");
            out.println("There is no match");
            }
        }
        
        
        out.close();
        
        
    }
    
    public static void writeMatchingsToFile(String writematches, ArrayList<String> arrstring){
        PrintWriter out = null;
        try{
            out = new PrintWriter(writematches);
        }
        catch (Exception e){
        }
        
        for(int i=0;i<arrstring.size();i++)
            out.println(arrstring.get(i));        
        
        out.close();
    }
    
   

  
  
}
