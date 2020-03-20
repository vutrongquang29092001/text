/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication22;

import java.util.Scanner;

/**
 *
 * @author vũ trọng quảng
 */
public class JavaApplication22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        int [] arr = new int [10] ;
       for ( int i=0 ;i<10;i++)
       {System.out.println("nhap giá trị arr"+ "["+i+"]");
        arr[i] = sc.nextInt() ;  }
       for (int i=0;i<10;i++){
           if (i%2==0)System.out.println("giá trị ở vị trí  "+"["+i+"]"+arr[i]);
       }
       for (int i =0;i<10;i++){
           if (i%2==1)System.out.println("gia trị ở vị trí "+"["+1+"]"+arr[i]);
       }
        for (int i= 0;i<10;i++){
        if(arr[i]%2==0)System.out.println("gia trị ở vị trí  "+"["+1+"] chia het cho 2 "+arr[i]);
    } 
      for (int i= 0;i<10;i++){
          if (arr[i]%5==1)System.out.println("gia trị ở vị trí  "+"["+1+"] chia het cho 5 du 1  "+arr[i]);
          
      }
        for (int i= 0;i<10;i++){
        if(arr[i]%2==0)
      sum = sum + arr[i];
    }System.out.println("tong là " + sum );
    
}}
