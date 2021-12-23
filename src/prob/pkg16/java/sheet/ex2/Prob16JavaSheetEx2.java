/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prob.pkg16.java.sheet.ex2;

import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class Prob16JavaSheetEx2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    System.out.println("Enter the radius of the circle :");
      Scanner input=new Scanner(System.in);
         float r = input.nextFloat();
     if (r>0) {
     System.out.println("Diameter = "+(2*r));
        System.out.println("circumference = "+(2*3.14*r));
           System.out.println("Area = "+(3.14*r*r));
     }   
     else {
         System.out.println("The radius shold be > 0");
     }

     // TODO code application logic here
    }
    
}
