/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg1310653703_u3;

/**
 *
 * @author Domi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
    Vehicle auto1= new Vehicle("m3", "blau", 2, 430);
        System.out.println(auto1.getName());
    auto1.nenne("m1");
        System.out.println(auto1.getName());
    
    
    /*Listee<Double> list = new Listee(4);
    
    list.save(2.0);
    list.save(5.0);
    list.save(200.0);
    for (int i=0; i<list.getSize();i++)
            System.out.println(list.getA(i).toString());
    }
            */
        
    
    Listee<Benennbar> list = new Listee<>(4);
    Vehicle a = new Vehicle("a1","blau",3,0);
    Vehicle b = new Vehicle("a2","blau",3,0);
    Vehicle c = new Vehicle("a3","blau",3,0);
    Vehicle d = new Vehicle("a4","blau",3,0);
   
    list.save(a);
    list.save(b);
    list.save(c);
    list.save(d);
    
    
    
    for (int i=0; i<list.getSize();i++)
            System.out.println(list.getA(i).getName());
    }
    
}
