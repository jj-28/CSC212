/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem.pkg3;

import.java.util.Scanner;

/**
 *
 * @author jeffr
 */
public class change {
    int c; int q; int d; int n; int p;
    
    public change (int x) {
    q = x / 25;
    int leftOver= x % 25;
    
    int d = leftOver / 10;
    leftOver = leftOver % 10;
          
    int n = leftOver / 5;
    leftOver = leftOver % 5;
    
    int p = leftOver / 1;
    leftOver = leftOver % 1;
    
    }            
    public int quarters() {
        return q;
    }
    
    public int dimes() {
        return d;
    }
    
    public int nickels() {
        return n;

    }
    
    public int pennies() {
        return p;
    }
    
}