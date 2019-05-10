/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem19;

import java.util.*;

/**
 *
 * @author mohammad
 */
public class allStudents {

    static ArrayList<student> s = new ArrayList<student>();

    public static void load(Scanner sc) {

        while (sc.hasNext()) {
            s.add(new student(sc.next(), sc.nextInt(), sc.nextInt(),
                    sc.nextInt(), sc.nextInt()));
        }

    }

    public static student locate(String id) {

        for (int i = 0; i < s.size(); i++) {
            if (s.get(i).id().equals(id)) {
                return s.get(i);
            }
        }
        return null;

    }

    public static void displayAll() {
        for (int i = 0; i < s.size(); i++) {
            System.out.println(s.get(i));
        }
    }

    /* public static student honorroll(int ) {
        for (int i = 0; i < s.size(); i++); {
        
    if ( min < s.get.(i).total) {
            return s.get(i), ;
                
    
    
    
}
     */
    public static ArrayList <student> getHonorRoll(int min) {
        ArrayList<student> n =  new ArrayList<student>();
        
        for (int i = 0; i < s.size(); i++) {
            student x = s.get(i);
            if (x.total() > min) {
                //System.out.println(x);
            n.add(x);
            }
        }
    return n;
    }
}
