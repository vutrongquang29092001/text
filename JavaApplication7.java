<<<<<<< HEAD
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author vũ trọng quảng
 */
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in) ;
       Random rd = new Random();
       int number = rd.nextInt();
       for(int i=1;;i++){
       System.out.println(" nhap n ");
        int n = sc.nextInt();
         if ( n > number ){
            System.out.println("qua cao , thu lai ");
        i++;}
        if (n <number ){
            System.out.println(" qua thap thu lai ");
        i++;} 
        if (n == number ){
            System.out.println(" welcome ban da doan dung ");
         break ;}
    }
    }
}
=======
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author vũ trọng quảng
 */
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in) ;
       Random rd = new Random();
       int number = rd.nextInt();
       int n;
        System.out.println(" nhap n ");
        n = sc.nextInt();
        if ( n > number ){
            System.out.println("qua cao , thu lai ");
        }
        if (n <number ){
            System.out.println(" qua thap thu lai ");
        } 
        if (n == number ){
            System.out.println(" welcome ban da doan dung ");
        }
        
        
        
    }
    
}
>>>>>>> 5421753b5221a70f8a7520d8b10e99999136d80d
