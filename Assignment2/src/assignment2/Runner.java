/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

/**
 *
 * @author jeffr
 */
public class Runner {
        double t;
        int number; 
        int hours; 
        int minutes;
        double seconds;
        double sum;
        
    public Runner (int n, int h, int m, double s) {
        
        number  = n; 
        hours = h; 
        minutes = m;
        seconds = s;
        //double total_time=t;
     
    }
    public int number() {
        return number;
    
    }
    
    public int hours() {
        return hours;
    }
    
    public int minutes() {
        return minutes;
    }
    
    public double seconds() {
        return  seconds;
    }
    public double total_time() {
        t = hours *3600 + minutes * 60 + seconds;
        return t;
    }
}
    //public double total_time() {
        //return (hours + minutes + seconds);
    
   

