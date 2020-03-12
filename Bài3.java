/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bài.pkg3;

import java.util.Scanner;

/**
 *
 * @author vũ trọng quảng
 */
public class Bài3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 1  ;
        Scanner sc = new Scanner(System.in);
        System.out.println(" nhap so n= ");
        int n = sc.nextInt() ;
        for (int i = 1;i <= n ; i++) { 
            a= a*i ;
        } 
        System.out.println("n! = " + a);
    }
    
}
