/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem14;

import java.util.Scanner;

/**
 *
 * @author mohammad
 */
public class allStudents {

    static student s[] = new student[100000];
    static int count = 0;

    public static void load(Scanner sc) {

        while (sc.hasNext()) {
            s[count] = new student(sc.next(), sc.nextInt(), sc.nextInt(),
                    sc.nextInt(), sc.nextInt());
            count++;
        }

    }

    public static student locate(String id) {

        for (int i = 0; i < count; i++) {
            if (s[i].id().equals(id)) {
                return s[i];
            }
        }
        return null;

    }

}
