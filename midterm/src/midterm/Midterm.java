/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midterm;

/**
 *
 * @author jeffr
 */
public class Midterm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name = "Richard-M-Nixon"; //there is a dash between each word pair.
        boolean startWord = true;
        for (int i = 0; i < name.length(); i++) {
            if (startWord) {
                System.out.print(name.charAt(i));
            }
            if (name.charAt(i) == ' ') //checking for a space
            {
                startWord = true;
            } else {
                startWord = false;
            }
        }
        System.out.println(startWord);
        int a= 2;
        int b= 5;
        int c= 7;
        if (a < b) {
        
    }
        // TODO code application logic here
    }

}
