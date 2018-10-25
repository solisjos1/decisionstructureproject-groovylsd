/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifelse;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import static java.lang.System.out;

/**
 *
 * @author rbowlen
 */

public class IfElse {

     /**
      * @param args the command line arguments
      * @throws java.io.FileNotFoundException
      */
     public static void main(String[] args) throws FileNotFoundException {
          
        /**
         * Age checker
         */
        File file = new File("ages.txt");
        Scanner scan = new Scanner(file);
          
        // Notify user of what they can do at each given age.
        int age;
        
        
        while(scan.hasNext()) {
             age = scan.nextInt();
             
             //Check driving
             if(age >= 16) {
                  out.println("At age " + age + " a person is old enough to drive.");
             } else {
                  out.println("At age " + age + " a person is not old enough to drive.");
             }
             
             //Check voting
             if(age >= 18) {
                  out.println("At age " + age + " a person is old enough to vote.");
             } else {
                  out.println("At age " + age + " a person is not old enough to vote.");
             }
             
             //Check drinking
             if(age >= 21) {
                  out.println("At age " + age + " a person is old enough to drink.\n");
             } else {
                  out.println("At age " + age + " a person is not old enough to drink.\n");
             }
        }
        
        /**
         * Quotients
         */
        file = new File("quotients.txt");
        scan = new Scanner(file);
        
        while(scan.hasNext()) {
             double a = scan.nextDouble();
             double b = scan.nextDouble();
             double quotient;
             double remainder;
             
             if(a == b) {
                  quotient = 1;
                  remainder = 0;
                  out.println("Quotient: " + quotient);
             } else if(a > b) {
                  quotient =  a / b;
                  remainder = a % b;
                  out.println("Quotient: " + quotient);
             } else {
                  quotient = b /a;
                  remainder = b % a;
                  out.println("Quotient: " + quotient);
             }
             
             if(remainder != 0){
                  out.println("Remainder: " + remainder);
             }
        }
        
        /**
         * 
         */
     }
}
