/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem24;

import java.util.*;

/**
 *
 * @author mohammad
 */
public class Problem24 {

    public static void insertionSort(ArrayList<Integer> x) {
        for (int i = 0; i < x.size() - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < x.size(); j++) {
                if (x.get(smallest).compareTo(x.get(j)) > 0) {
                    smallest = j;
                }
            }
            Integer temp = x.get(i);
            x.set(i, x.get(smallest));
            x.set(smallest, temp);

        }

    }

    public static ArrayList<Integer> quickSort(ArrayList<Integer> x) {
        if (x.size() <= 1) {
            return x;
        }

        int pivot = x.get(0);
        ArrayList left = new ArrayList();
        ArrayList right = new ArrayList();

        for (int i = 1; i < x.size(); i++) {
            if (x.get(i).compareTo(pivot) < 0) {
                left.add(x.get(i));
            } else {
                right.add(x.get(i));
            }
        left = quickSort(left);
        right = quickSort(right);
        left.add(pivot);
        left.addAll(right);
        
        }
        return left;

    }

    public static void out(ArrayList x) {
        for (int i = 0; i < x.size(); i++) {
            System.out.println(x.get(i));
        }
    }

    public static void main(String[] args) {
        ArrayList x = new <Integer>ArrayList();
        Random r = new Random();
        for (int i = 0; i < 100000; i++) {
            x.add(r.nextInt(50000));
        }
        
        ArrayList copy=new ArrayList(x);
        long timeBefore= System.currentTimeMillis();
        
        System.out.println("List before quick sort");
        x=quickSort(x);
      
        System.out.println("List before insertion sort");
        out(x);
      insertionSort(x);
    }

}
