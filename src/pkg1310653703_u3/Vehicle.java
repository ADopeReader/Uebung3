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
public class Vehicle extends Benennbar2{

    private String name;
    private String color;
    private int türen;
    private int ps;
   
    
    public Vehicle(String a, String b, int c, int d){
        name=a;
        color=b;
        türen=c;
        ps=d;
        
    }

    @Override
    public void nenne(String a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
 
    
}
