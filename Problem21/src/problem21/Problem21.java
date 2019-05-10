/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem21;

import java.util.*;

/**
 *
 * @author mohammad
 */
public class Problem21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        stack l1 = new stack();
        stack l2 = new stack();

        l1.push("hello");
        l1.push("goodbye");

        l2.push(l1.peek());
        l1.pop();

        System.out.println("l1 has: " + l1.peek());
        System.out.println("l2 has: " + l2.peek());

        l2 = l1;

        System.out.println("l1 has: " + l1.peek());
        System.out.println("l2 has: " + l2.peek());

        l2.push("something else");

        System.out.println("l1 has: " + l1.peek());
        System.out.println("l2 has: " + l2.peek());

        System.out.println("l1 is: " + l1);
        System.out.println("l2 is: " + l2);
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            l1.push(r.nextInt(1000));
        }
        stack temp = new stack();
        while (!l1.isEmpty()) {
            System.out.println(l1.peek());
            temp.push(l1.peek());
            l1.pop();
        }
        
        while (!temp.isEmpty()) {
            l1.push(temp.peek());
            temp.pop();
        }
        
        while (!l1.isEmpty()) {
            System.out.println(l1.peek());
            l1.pop();
        }
    }

}
