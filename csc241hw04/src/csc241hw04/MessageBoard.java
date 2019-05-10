/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc241hw04;

/**
 *
 * @author jeffr
 */
import java.util.*;

public class MessageBoard implements Iterable {

    private ArrayList<Train> t = new ArrayList<Train>();
    public boolean addTrain(Train s) {
        return t.add(s);
    }

    @Override
    public Iterator<Train> iterator() {
        return t.iterator();
    }

    public void sort() {

        Collections.sort(t);
    }

    private Train getNextTrain() {
        if (!t.isEmpty()) {
            Train j = t.get(0);
            t.remove(j);
            return j;
        } else {
            return null;
        }

    }

    public String announceNext() {
        Train k = this.getNextTrain();
        if (k != null) {
            return "The " + k.getLine() + " train will be arriving nest at "
                    + k.getArrival();
        } else {
            return "There are no scheduled trains";
        }
    }
}
