/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eggs;

/**
 *
 * @author jeffr
 */
public class dozens {
    private int d;
    private int leftOver;
    private int gross;
    
    public dozens (int e){
        gross = e / 144;
        d =  leftOver / 12;  
        leftOver = d % 12;
        
    }

    public int dozeneggs() {
        return d;
    
    }
    
    public int leftOver() {
        return leftOver;
    
    }
    public int gross(){
        return gross;
}