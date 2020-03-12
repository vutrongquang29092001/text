/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bài.pkg4;

import java.util.Scanner;

/**
 *
 * @author vũ trọng quảng
 */
public class Bài4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int sum = 0 ;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap số a ");
        int a = sc.nextInt();
        while ( a > 0 ) { 
            sum= sum + a % 10; 
            a =a/10 ;  
        }
        
         
        System.out.println(" tông cac chu so trong a =" + sum );
        
    }}
    

