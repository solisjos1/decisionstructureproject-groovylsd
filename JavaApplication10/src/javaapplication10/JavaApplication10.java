/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication10;

import java.util.Scanner;

/**
 *
 * @author guerrjos
 */
public class JavaApplication10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner kb = new Scanner (System.in);
        System.out.println("Does 3 x 3 = 9 ? // Type Y or N");
       String str = kb.next();
       System.out.println(str);
       if ("Y".equals(str)) 
            System.out.println("Good Job!\n What day in December is Joseph's"
                    + " Birthday");
         else
           System.out.println("Not a valid choice!\n You're Dumb ...\n");
       String str1 = kb.next();
       if ("11".equals(str1))
           System.out.println("you a real one");
       else
           System.out.println("it be like that");
    }
    
}
