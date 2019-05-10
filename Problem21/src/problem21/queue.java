/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem21;

import java.util.ArrayList;

/**
 *
 * @author mohammad
 */
public class queue {
       ArrayList q = new ArrayList();
       public queue() {
           
       }
       public boolean isEmpty() {
           return q.size() == 0;
       }
       
       public Object peek () {
           if (!isEmpty())
               return q.get(0);
           return null;
       }
       public void dequeue () {
           q.remove(0);
       }
       
       public void enqueue (Object o) {
           q.add(o);
       }
       
}
