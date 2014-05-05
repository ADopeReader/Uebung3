/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg1310653703_u3;

/**
 *
 * @author Domi
 * @param <T>
 */
public class Listee <T extends Benennbar2>{
    
    private Object[] a  ;
    private int size;
    
    public Listee(int x){
        size=x;
        a= new Object[size]; 
    }
    
    /* public void save(T obj){
        int i=0;
        
        while (true){
            
            if (a[i]==null){
                a[i]=obj;
                break;
            }
            if (a[i]!=null&&i<a.length){
                i++;
            }
            else
                System.out.println("Array leider voll "+obj+" konnte nicht eingefügt werden.");
                        break ;
                
         }
    }*/
    
    public void save(T param)   
   {
    int i = 0;
    
    while (true)
    {
    if (a [i] == null){a [i] = param;break;}
    if (a [i] != null && i < a.length-1){i++;}
    else {System.out.println("Dieses Array ist voll, überschüssige Elemente wurden nicht eingefügt!");break;}
    }
     
   }
        
    
    public T getA(int i) {
        return (T) a[i];
    }

    public int getSize() {
        return size;
    }

    public void setA(T[] a) {
        this.a = a;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    
}
