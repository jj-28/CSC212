/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem17;

import java.util.*;

/**
 *
 * @author mohammad
 */
public class Problem17 {

    public static void displayStars(int x[][]) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (x[i][j] == 1) {
                    System.out.print("*" + "\t");
                } else {
                    System.out.print(" " + "\t");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] x = new int[10];

        int[][] twoD = new int[10][10];

        for (int i = 0; i < 10; i++) {
            x[i] = 0;
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                twoD[i][j] = 0;
            }
        }

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                x[i] = 1;
            } else {
                x[i] = 0;
            }

        }

        System.out.println();
        System.out.println();

        displayStars(twoD);

        for (int i = 0; i < 10; i++) {
            System.out.println(x[i]);
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i % 2 == 0) {
                    twoD[i][j] = 1;
                } else {
                    twoD[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(twoD[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

        displayStars(twoD);

        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {

                twoD[i][j] = r.nextInt(2);

            }
        }
        System.out.println();
        System.out.println();

        displayStars(twoD);
       for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i==3 || i==4 || i==5) {
                    twoD[i][j] = 1;
                } else {
                    twoD[i][j] = 0;
                }
            }
        }
        System.out.println();
        System.out.println();

        displayStars(twoD);        
        
        
        
    }

}
