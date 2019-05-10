/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem6;

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;
/**
 *
 * @author jeffr
 */
public class Problem6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner (new FileInputStream("example.txt"));    
        int sum = 0;

        student smallest = new student (0,99999, 0, 0);
        student largest = new student (0, -1, 0, 0);
    while ( reader.hasNext() ) {
        int id= reader.nextInt();
        int x1= reader.nextInt();
        int x2= reader.nextInt();
        int x3= reader.nextInt();
    //if you  dont want something repeated, put it outside of the curly
    student s = new student (id,x1,x2,x3);
    
    if (s.total() < smallest.total() ) smallest = s;
    if(s.total() > largest.total() ) largest = s;
    
    
    System.out.println("Student ID:"+ s.id()  + " " + "Grades:" + s.grade1() 
            + "," + s.grade2() + "," + s.grade3() + " " + "With a total grade of " + s.total()
            + " Average Grade of  " + " " + s.average() + " and the lowest grade is " + s.lowestgrade() );
    }
        System.out.println("student ID: and total with the lowest grade " + 
                " " + smallest.id() + " " + smallest.total() );
        System.out.println("student ID: and total with the largest grade " + 
                " " + largest.id() + " " + largest.total() ); 
        
        
// TODO code application logic here
    }
    
}
