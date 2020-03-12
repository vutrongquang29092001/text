/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bài.pkg2;

import java.util.Scanner;

/**
 *
 * @author vũ trọng quảng
 */
public class Bài2 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here 
        int sum = 0 ;
        Scanner sc = new Scanner(System.in) ;
        System.out.println(" nhap số bất kì "); 
        int n = sc.nextInt() ;
        for (int i = 1 ; i<n ; i++) {
         if ( n % i == 0) {
             sum = sum + i ;
         } 
         
        }
         if (sum == n ) System.out.println(" n là số hoàn hảo ") ;
                 else {System.out.println(" n không là sô hoàn hảo");} 
        
        
        
    }
    
}
