/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem19;

import java.io.FileInputStream;
import java.util.Scanner;
import java.util.*;

/**
 *
 * @author mohammad
 */
public class Problem19 {

    public static String choice(Scanner k) {
        for (;;) {
            System.out.println("a - locate a student");
            System.out.println("b - display all students");
            System.out.println("q - quit");
            System.out.println("d- Honor Roll");
            String response = k.next();
            if (response.equals("a") || response.equals("b") || response.equals("q") || response.equals("d")) {
                return response;
            }

            System.out.println("invalid choice--try again");
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(new FileInputStream("data.txt"));

        allStudents.load(reader);
        /*
         for (int i = 0; i < allStudents.count; i++) {
         System.out.println(allStudents.s[i].id() + "\t" + allStudents.s[i].total());
         }
         System.out.println(allStudents.locate("mohammadi"));

         if (allStudents.locate("Mohammadi") == null) {
         System.out.println("student doesn't exist");
         }
         */
        Scanner keyboard = new Scanner(System.in);
        String c = new String();

        do {
            c = choice(keyboard);
            if (c.equals("a")) {
                System.out.println("Enter student name: ");
                String s = keyboard.next();

                student n = allStudents.locate(s);
                if (n == null) {
                    System.out.println(s + " was not found");
                } else {
                    System.out.println(n);
                }
            }
            if (c.equals("b")) {
                allStudents.displayAll();
            }
            if (c.equals("d")) {
                System.out.println("What grade should honor roll students be above?");
                int min = keyboard.nextInt();
                ArrayList<student> n = allStudents.getHonorRoll(min);
                for (int i =0; i < n.size(); i++) {
                    System.out.println(n.get(i));
            }
            }
        } while (!c.equals("q"));
System.exit(0);
    }
//when you display it there
}
