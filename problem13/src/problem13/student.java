/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem13;

/**
 *
 * @author jeffr
 */
public class student {

    int id;
    int g[];

    /*[] mean an array. it is undefined.
    holds many pieces of information.
    
     */
    public student(int i, int x[]) {
        id = i;
        g = x;
    }

    public int id() {
        return id;

    }

    public int grade(int which) {
        return g[which];
    }

    public int total() {
        int sum = 0;
        // sum is set to g [0] + g[1] + g[2]+ g[3] etc..
        for (int j = 0; j < g.length; j++) {
            sum += g[j];
        }
        //+= takes whats in the cell off the array and adds it to sum
        return sum; 
    }

    public int average() {
        return total() / g.length;
/*tells us how many cells we have

        */  
}

    public int lowestgrade() {
        int lowestOne = 99999;
        for (int j = 0; j < g.length; j++) {
            if (g[j] < lowestOne) {
            lowestOne = g[j];
            }
        }
        return lowestOne;
        }
        
        
        /*if (g[1] <= g[2] && g1 < g3) {
            return g1;
        }
        if (g2 <= g3) {
            return g2;
        }
        return g3; */
    }
