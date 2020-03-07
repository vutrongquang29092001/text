/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

import java.util.Scanner;

/**
 *
 * @author vũ trọng quảng
 */
public class JavaApplication8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int max = -1000000 ;
        int min = 1000000 ; 
        Scanner sc = new Scanner(System.in) ;
        int n ;
        for (int i= 1 ;i<=10 ;i++) { 
            System.out.println("nhat so thu  " + i);
             n = sc.nextInt();
             max=Math.max(max, n) ;
             min=Math.min(min, n) ;
             
        }
          System.out.println("the largest is "+ max);
          System.out.println(" the smallest is " + min );
          
        
        
        
        
    }
    
}
