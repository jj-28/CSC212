/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem14;

/**
 *
 * @author mohammad
 */
public class student {

    String id;
    int g1;
    int g2;
    int g3;
    int g4;

    public student(String i, int grade1, int grade2, int grade3, int grade4) {
        id = i;
        g1 = grade1;
        g2 = grade2;
        g3 = grade3;
        g4 = grade4;
    }

    public String id() {
        return id;
    }

    public int total() {

        return g1 + g2 + g3 + g4;
    }

    public double average() {
        return total() / 4;
    }
    public String toString () {
        return "id = " + id + " with grade: " + 
    "\t" + g1 + "\t" + g3+ "\t"  + g4 + "\t" + average() ;}
}
