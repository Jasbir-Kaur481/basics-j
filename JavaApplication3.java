/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.Scanner;

/**
 *
 * @author JASBIR
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       double r;
       
       Scanner input=new  Scanner(System.in);
       System.out.print("Enter the radius of circle:");
       r=input.nextInt();
       System.out.print("The diameter of circle is:"+(r*r));
       
    }
    
}
