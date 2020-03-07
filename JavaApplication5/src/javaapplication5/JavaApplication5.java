/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import java.util.Scanner;

/**
 *
 * @author vũ trọng quảng
 */
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner sc = new Scanner (System.in)   ;  
        System.out.print("nhap so n ");
        int n = sc.nextInt() ;
        int dem=0 ;
              for ( int i = 1 ; i <= n ; i++ )  {
         
      
                  if ( n%i==0 ) dem++ ;}
                  System.out.println(" uoc cua n la " + dem);
                          
              } }
        
    
    
}}
