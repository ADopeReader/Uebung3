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

    Listee<Benennbar2> ar = new Listee<>(3);
    Vehicle a = new Vehicle("a1","blau",3,0);
    Vehicle b = new Vehicle("a2","blau",3,0);
    Vehicle c = new Vehicle("a3","blau",3,0);
    Vehicle d = new Vehicle("a4","blau",3,0);
   
    ar.save(a);
    ar.save(b);
    ar.save(c);
    ar.save(d);
    
    
    
    for (int i=0; i<ar.getSize();i++)
            System.out.println(ar.getA(i).toString());
    }
    
}
