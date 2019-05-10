/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc241hw04;

/**
 *
 * @author jeffr
 */
import java.util.*;
import java.time.LocalTime;

public class Train implements Comparable<Train> {

    private String line;
    private LocalTime arr;

    public Train(String l, LocalTime a) {
        line = l;
        arr = a;
    
    }

    public String getLine() {
        return line;
    }

    public LocalTime getArrival() {
        return arr;
    }

//    public int compareTo(Object o) {
//        Train other = (Train) o;
//        if (this.getArrival().compareTo(other.getArrival()) == 0) {
//            return this.getLine().compareTo(other.getLine());
//        } else return this.getArrival().compareTo(other.getArrival());
//        
//    }
    public String toString() {
    return line + arr.toString();
        
    }

    @Override
    public int compareTo(Train t) {
     Train other = t;
      if (this.getArrival().compareTo(other.getArrival()) == 0) {
          return this.getLine().compareTo(other.getLine());
      } else return this.getArrival().compareTo(other.getArrival()); 
        
    }
}
