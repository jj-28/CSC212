/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc241hw04;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author jeffr
 */
public class Main {

    public static void main(String[] args) {
        LocalTime l1 = LocalTime.parse("29:15");
        LocalTime l2 = LocalTime.parse("19:30");
        LocalTime l3 = LocalTime.parse("29:15");
        Train a1 = new Train("A", l1);
        Train a2 = new Train("A",l2);
        Train a4 = new Train("N", l3);
        MessageBoard d= new MessageBoard();
        d.addTrain(a1);
        d.addTrain(a2);
        //d.addTrain(a3);
        d.addTrain(a4);
        
       

            //System.out.println(a2.compareTo(a1));
        
    }
}
