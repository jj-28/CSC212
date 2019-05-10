/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;
import java.io.FileInputStream;
import java.util.Scanner;
import java.io.IOException;

/**
 *
 * @author jeffr
 */
public class Assignment2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(new FileInputStream("src/assignment2/runner.txt"));
        
        Runner slowest = new Runner(0, 0, 0, -1);
        Runner fastest = new Runner(0, 1000, 0, 0);

        while (reader.hasNext()) {
            int n = reader.nextInt();
            int h = reader.nextInt();
            int m = reader.nextInt();
            double s = reader.nextDouble();

            Runner r = new Runner(n, h, m, s);

            if (r.total_time() > slowest.total_time()) {
                slowest = r;
            }
            if (r.total_time() < fastest.total_time()) {
                fastest = r;
            }

        }
        System.out.println("The fastest runner is " + fastest.number() + " with the time " + fastest.hours + ":" + fastest.minutes + ":" + fastest.seconds);
        System.out.println("The slowest runner is " + slowest.number() + " with the time " + slowest.hours + ":" + slowest.minutes + ":" + slowest.seconds);
    }
    // TODO code application logic here
}


