package bb;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jeffr
 */
import java.util.*;
//import java.io.*;

public class Dictionary {

    static HashMap<String, dictionaryEntry> x = new HashMap();
    public static void load(Scanner sc) {
        while (sc.hasNext()) {
            dictionaryEntry d = new dictionaryEntry(sc.next(), sc.nextLine());
            x.put(d.getWord(),d);

        }
    }
    public boolean Add(String word, String def) {
        if (x.containsKey(word)) {
            //if (x.containsValue(def)) {
            //}
            return false;
        } else {
            dictionaryEntry d = new dictionaryEntry(word,def);
            x.put(word, d);
            return true;
        }

    }
    public String Replace(String word, dictionaryEntry d) {    
            return x.replace(word, d).toString();
}
    public boolean Delete(String word) {
        if (x.containsKey(word)) {
            x.remove(word);
            return true;
        } else {
            return false;
        }

    }

      public String find(String word) {
        if (x.containsKey(word)) {
            return x.get(word).toString();
        } else {
            return "Word not found, search again. ";
        }
    }
      /*
   public void browse(String word) {
        Collection<dictionaryEntry> words = x.values();
        ArrayList<dictionaryEntry>s = new ArrayList<dictionaryEntry>(words);  
        //ArrayList<dictionaryEntry> de= new ArrayList<dictionaryEntry>();
        for(int i = 0; i < s.size(); i++) {
          if(s.get(i).toString().startsWith(word)){
          System.out.println(s.get(i));
          }
        }
} 
*/
public ArrayList browse(String word) {
        Collection<dictionaryEntry> words = x.values();
        ArrayList<dictionaryEntry>s = new ArrayList<dictionaryEntry>(words);   
        ArrayList<dictionaryEntry>defs = new ArrayList<dictionaryEntry>();           
        for(int i = 0; i < s.size(); i++) {
          if(s.get(i).toString().startsWith(word)){
         defs.add(s.get(i));
          }
        
        }        
return defs;
} 
}
