/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication27;

import java.util.Scanner;

/**
 *
 * @author vũ trọng quảng
 */
public class JavaApplication27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap a ");
        int a = sc.nextInt();
        System.out.println("nhap b ");
        int b = sc.nextInt();
       int c = earn(a, b);
    }

    static int earn(int a, int b) {

        int earn = a * b;
        if (earn % 3 == 0 && earn % 5 == 0) {
            System.out.println("false");
        } else {
            System.out.println("true");
        }
      return earn  ;
     
    }
}
