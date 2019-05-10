/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eggs;

import java.util.Scanner;

/**
 *
 * @author jeffr
 */
public class Eggs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Scanner sc = new Scanner (System.in);
            
    System.out.print("How many eggs do you have?");
    int d= sc.nextInt();
        dozens dozens = new dozens(d);
    System.out.println(" You have " + dozens.dozeneggs() + " dozens and " 
            + dozens.leftOver() + " left eggs over. ");
       
// TODO code application logic here
    }
    
}
