/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem6;

/**
 *
 * @author jeffr
 */
public class student {

    int id;
    int g1;
    int g2;
    int g3;

    public student(int i, int x1, int x2, int x3) {
        id = i;
        g1 = x1;
        g2 = x2;
        g3 = x3;

    }

    public int id() {
        return id;

    }
    public int grade1() {
        return g1;

    }
public int grade2() {
        return g2;

    }
  public int grade3() {
        return g3;

    }
  public int total() {
        return g1+g2+g3;
    }
  public int average() {
        return total()/ 2 ;
    }
  public int lowestgrade() {
        if (g1 <= g2 && g1 < g3 )
            return g1;
        if (g2 <= g3)
            return g2;
        return g3;
    }
} 
