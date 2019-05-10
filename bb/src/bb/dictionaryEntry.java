package bb;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.s
 */

/**
 *
 * @author jeffr
 */
import java.util.*;

public class dictionaryEntry {

    String word;
    String def;

    public dictionaryEntry(String w, String d) {
        word = w;
        def = d;

    }

    public String getWord() {
        return word;
    }

    public String getDef() {
        return def;

    }

    public String ReplaceDef(String e) {
        def=e;
        return def;
    }

    public String toString() {
       return word + ": " + def;
    }
}



          
          