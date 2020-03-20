/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication19;

import static java.lang.Math.abs;
import java.util.Scanner;

/**
 *
 * @author vũ trọng quảng
 */
public class JavaApplication19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic her
         int nearValues=0;
        int max = -1000000000;
        int min = 1000000000;
    Scanner sc = new Scanner(System.in);
        System.out.print("nhap đo dai cua mang ");
        int a =sc.nextInt();
        int [] arr = new int[a] ;
        for (int i = 0;i<arr.length;i++) {
            System.out.print( "nhap gia tri cua phan tu :" +  arr[i]);
            arr[i] = sc.nextInt() ;
        } 
          System.out.println("nhap vao mot so tu nhien bat kì x");
        int x =sc.nextInt() ;
        for (int i = 0 ;i< arr.length;i++) {
            if(arr[i]< x ) System.out.println("giá trị nhỏ hơn x là " + arr[i] );}
         
         for (int i = 0 ; i< arr.length;i++ ) {  
          
          if(min>abs(x-arr[i])){
              min=abs(x-arr[i]);
              nearValues=arr[i];
          }
    } System.out.println(" in ra giá trị gan nhát "+ nearValues);
        for (int i = 0 ; i <= 1/2 * arr.length; i ++ ) {
            if (arr[i]==arr.length - i );
        } System.out.println(" day là mảng đối xứng ");
      
     for (int i = 0 ;i <arr.length;i++) {
         if (arr[i]>0&&arr[i]%2==1) { 
             arr[i]-- ;
             System.out.println("in gia trị moi " + arr[i]);
     }}
     for (int i = 0 ; i <arr.length ; i++){ 
         max=Math.max(max, arr[i]);
         min=Math.min(min, arr[i]);
     } System.out.println("gia tri max trong mang la " + max );
        System.out.println("gia trị min - 1 là" + min--);
      
        
        
        
     
        
    
        
        
      
      
        
   
    
    
}}
