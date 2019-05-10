/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem23;
import java.util.*;
/**
 *
 * @author mohammad
 */
public class Problem23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashMap x = new HashMap();
        
        x.put("hello", "a greeting");
        x.put("hi", "another greeting");
        
        System.out.println(x);
     System.out.println(x.get("no"));
        //How do I displau each word and definition stored in x; one at a time?
        Set<String> y= x.keySet();
        String [] m = y.toArray(new String[0]);
        for (int i = 0; i < m.length; i ++) {
        System.out.println(m[i] + " " + x.get(m[i]) );
        
        for (Map.Entry<String, String> entry : x.entrySet()) {
            System.out.println("Word " + entry.)
        }
    }
    }
    
}
