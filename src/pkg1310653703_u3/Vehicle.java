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
public class Vehicle implements Benennbar{

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
        name=a;
    }
    
    
    
    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getTüren() {
        return türen;
    }

    public void setTüren(int türen) {
        this.türen = türen;
    }

    public int getPs() {
        return ps;
    }

    public void setPs(int ps) {
        this.ps = ps;
    }
    
 
    
}
