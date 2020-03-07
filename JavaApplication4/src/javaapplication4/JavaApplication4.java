/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.util.Scanner;

/**
 *
 * @author vũ trọng quảng
 */
public class JavaApplication4 {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in) ;   
        System.out.print(" nhap so duong bat ki ");
        int dem = 0 ; 
        int n = sc.nextInt() ;
        for ( int i = 1; i <= n ; i++) {
            if ( n % i == 0) dem++ ;
           
            } 
        if ( dem == 2 ) {  System.out.println( n + " la so nguyen to ");} 
        else {System.out.println( n + " ko la so nguyen to ");
            
        }
        }
        
    
    
    
    
    
    }

    }


