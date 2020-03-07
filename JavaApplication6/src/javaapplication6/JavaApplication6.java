/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

import java.util.Scanner;

/**
 *
 * @author vũ trọng quảng
 */
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" nhap 10 so bat ki ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();
        int g = sc.nextInt();
        int h = sc.nextInt();
        int j = sc.nextInt();
        int k = sc.nextInt();
        int[] s = {a, b, c, d, e, f, g, h, j, k};
        int max = a;
        int min = a;
        for (int i = 0; i < 10; i++) {
            if (max < s[i]) {
                max = s[i];
            };
            if (min > s[i]) {
                min = s[i];
            };

        }
        System.out.println(" so max la " + max);
        System.out.println(" so min la " + min);

    }
}

// TODO code application logic here

