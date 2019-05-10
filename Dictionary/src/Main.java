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
import java.io.*;

public class Main {

    /**
     * @param args the command line arguments
   */
    
    public static String choice(Scanner k) {
        for (;;) {
            Scanner kb= new Scanner (System.in);
            System.out.println("Enter number to choose mode:");
            System.out.println("1. Find Word");
            System.out.println("2. Change Definition");
            System.out.println("3. Add Word/ Defintion");
            System.out.println("4. Delete Word");
            System.out.println("5. Browse");
            System.out.println("6. Quit");
        String response = kb.next();
            if (response.equals("1") || response.equals("2") || response.equals("3") || response.equals("4")|| response.equals("5")|| response.equals("6")) {
                return response;
            } else {
                System.out.println("Invalid response - try again");
            }
        }
    }
    public static void main(String[] args) throws Exception {
        Dictionary r = new Dictionary();
        Scanner reader = new Scanner(new FileInputStream("dict.txt"));
        r.load(reader);
        String c = "";
        do {
            Scanner kb = new Scanner(System.in);
            c = choice(kb);
            if (c.equals("1")) {
                System.out.println("Enter a word to find it's definition");
                String word = kb.next();
                System.out.println(r.find(word));
            }
            else if (c.equals("2")) {
                System.out.println("Enter Word ");
                String e = kb.next();
                System.out.println("Enter defintion ");
                String w = kb.next();
                dictionaryEntry d = new dictionaryEntry(e,w );
                r.x.put(e, d);
                System.out.println("defintion changed");
            }
            else if (c.equals("3")) {

                System.out.println("Enter word and defintion"
                        + "you would like to add");
                String k = kb.next();
                String h = kb.next();
                boolean g = r.Add(k, h);
                if (g == (true)) {
                    System.out.println("Word and defintion added");
                }
                if (g == false) {
                    System.out.println("Word and defintion not added, try again.");
                }
            }
            else if (c.equals("4")) {
                System.out.println("Enter word you would like to delete");
                String v = kb.next();
                if (r.Delete(v) == (true)) {
                    System.out.println("Word deleted");
                } else {
                    System.out.println("Word not deleted, try again");
                }
            }
            else if (c.equals("5")) {
                System.out.println("Please enter what word starts with");
                String o = kb.next();
                r.browse(o);
            }
            else if (c.equals("6")) {
                System.out.println("Thank you!!!!");
            }
        } while (!c.equals("6"));
    }
}
