/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem21;

import java.util.*;

/**
 *
 * @author mohammad
 */
public class stack {
    ArrayList s = new ArrayList();
    
    public stack () {
        
    }
    
    public boolean isEmpty () {
        return s.size() == 0;
    }
    
    public Object peek () {
        if (isEmpty())
            return null;
            
        return s.get(0);
    }
    
    public void pop() {
        if (!isEmpty()) {
            s.remove(0);
        }
    }
    
    public void push( Object o) {
        s.add(0,o);
        
    }
    
    
    
    
    
}
