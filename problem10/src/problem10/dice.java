/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem10;
/*helper classes can be used in

*/

/**
 *
 * @author jeffr
 */
public class dice {
    int d1;
    int d2;

    public dice(int d1, int d2) {
        d1 = (int) (Math.random() * 6) + 1;
        d2 = (int) (Math.random() * 6) + 1;
    }

    public int dice1() {
        return d1;
    }

    public int dice2() {
        return d2;
    }

    public int sum() {
        return d1 + d2;
    }

    public boolean snakeEyes() {
        if (sum() == 2) {
            return true;
        }
        return false;
    }

    public boolean win() {
        return (sum() == 7 || sum() == 11);
    }

    public void roll() {
        d1 = (int) (Math.random() * 6) + 1;
        d2 = (int) (Math.random() * 6) + 1;
    }

    public int one() {
        return d2;
    }
}
