/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication23;

import java.util.Scanner;

/**
 *
 * @author vũ trọng quảng
 */
public class JavaApplication23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int dem = 0;
        int factorial = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so bat ki");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            factorial = factorial * (n - i);
        }
        while (factorial % 10 == 0) {

            dem ++;
            factorial = factorial / 10;

        }

        System.out.println("so chu so 0 " + dem);

    }
}
