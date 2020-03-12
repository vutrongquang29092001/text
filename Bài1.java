/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bài1;

import java.util.Scanner;

/**
 *
 * @author vũ trọng quảng
 */
public class Bài1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int sum=0;
        Scanner sc = new Scanner(System.in) ;
        System.out.println("nhap hai so nguyen duong ");
        for (int i= 1 ;i<=2 ; i++) { System.out.println(" nhap so thu  " + i);
        int a =sc.nextInt();
        if  (a>=0)
        { sum=sum+a; System.out.println(" tong la "+ sum);}
            else{ System.out.println(" ban nhap sai 1 so nao do ");}
           }
      
        
    }
    
}
