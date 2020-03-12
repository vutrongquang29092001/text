/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bài.pkg5;

import java.util.Scanner;

/**
 *
 * @author vũ trọng quảng
 */
public class Bài5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println(" nhap so thu 1 ");
        int a = sc.nextInt();
        System.out.println(" nhap so thu 2 ");
        int b = sc.nextInt();
     while ( a!=b ) {
         if (a>b ) a= a-b ;
         else b=b-a ;}
         System.out.println(" UCLN la " + a ); }
             
        }
        
        
        
        
    
    

