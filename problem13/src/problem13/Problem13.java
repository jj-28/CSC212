/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem13;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author jeffr
 */
public class Problem13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("How many grades do you have?");
        int e = sc.nextInt();
        
        Scanner reader = new Scanner(new FileInputStream("example.txt"));        
        int sum = 0;
        int sm[] = new int[e];
        sm[0] = 999999;
        for (int i = 1; i < sm.length; i++) {
            sm[i] = 0;
        }
        
        int larg[] = new int[e];
        larg[0] = -1;
        for (int i = 1; i < larg.length; i++) {
            larg[i] = 0;
        }
        
        student smallest = new student(0, sm);
        student largest = new student(0, larg);
        while (reader.hasNext()) {
            int id = reader.nextInt();
            int x[] = new int[e];
            for (int i = 0; i < sm.length; i++) x[i] =reader.nextInt();
            
            //if you  dont want something repeated, put it outside of the curly
            student s = new student(id, x);
            
            if (s.total() < smallest.total()) 
                smallest = s;
            if (s.total() > largest.total()) 
                largest = s;
           
            System.out.print("Student ID:" + s.id() + " " + "Grades:" + 
            for (int i = 0; i < e; i++) (System.out.print (s.grade(i) + "\t" + "With a total grade of " + s.total()
                    + " Average Grade of  " + " " + s.average() + " and the lowest grade is " + s.lowestgrade() 
        ;
    }
        System.out.println("student ID: and total with the lowest grade "
                + " " + smallest.id() + " " + smallest.total());
        System.out.println("student ID: and total with the largest grade "
                + " " + largest.id() + " " + largest.total());

// TODO code application logic here
    }
    
}
