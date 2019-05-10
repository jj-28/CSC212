/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem.pkg7;

import java.util.Scanner;
import java.io.FileInputStream;

/**
 *
 * @author jeffr
 */
public class Problem7 {
    
    static String longest= "";
    
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(new FileInputStream("src/problem.pkg7/Problem7.java"));
        int i = 1;

        while (reader.hasNext()) {
            String line = reader.nextLine();
            if (line.length() > longest.length()) {
                longest = line;
            }
        
        }
   displayLongest();
    }
public static void displayLongest() {
        System.out.println(longest);
    }
public static String longer(String s1, String s2) {
    if (s1.length() > s2.length()) return s1;
    return s2;
    
    
/**
     * @param args the command line arguments
     */

}
}
