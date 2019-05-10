/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem14;

import java.io.FileInputStream;
import java.util.Scanner;

/**
 *
 * @author mohammad
 */
public class Problem14 {

    public static String choice(Scanner k) {
//if you dont need to make multiple instances of an object, it needs to be static
        for (;;) {
            System.out.println("a- locate a student");
            System.out.println("b- display all students");
            System.out.println("q- quit");
            String response = k.next();
            if (response.equals("a") || response.equals("b") || response.equals("q")) {
                return response;
            }
            System.out.println("invalid choice, try again");

        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(new FileInputStream("data.txt"));
        allStudents.load(reader);
//dont need an object of allaccounts/allstudents, because there is only one array
        //no constructors,

        /*for (int i = 0; i < allStudents.count; i++) {
            System.out.println(allStudents.s[i].id() + "\t" + allStudents.s[i].total());
        }
        System.out.println(allStudents.locate("mohammadi"));
        
        if (allStudents.locate("Mohammadi")  ==  null) System.out.println("student doesn't exist");
         */
        Scanner keyboard = new Scanner(System.in);
        {
            String c = choice(keyboard);
            do {
                if (c.equals("a")) {
                    System.out.println("Enter Student Name:");
                    String s = keyboard.next();
                    student n = allStudents.locate(s);
                    if (n == null) {
                        System.out.println("Student" + s + "not found");

                    } else {
                        System.out.println(n);
                    }
                }
                if (c.equals("b")) {
                   for (int i = 0; i < allStudents.count; i++) {
            System.out.println(allStudents.s[i].id() + "\t" + allStudents.s[i].total());
                   }
                   System.out.println(s.toString());
                   }
            } while (!c.equals("q"));

        }
    }
}
