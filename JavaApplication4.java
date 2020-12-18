/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.util.Scanner;

/**
 *
 * @author JASBIR
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double c, r;
        
        
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the radius of circle: ");  
        r=input.nextDouble();
      
        
        c= 2*Math.PI*r;
        
      System.out.printf("The circumfrence of circle is: %lf",c);  
        
        
    }
    
}
