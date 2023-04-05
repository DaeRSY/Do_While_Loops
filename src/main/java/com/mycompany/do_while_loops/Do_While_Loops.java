/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.do_while_loops;

import java.util.Scanner;

/**
 *
 * @author aadiy
 */
public class Do_While_Loops {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       /* System.out.println("Please enter a number");
        int i = 0;
        int c = scan.nextInt();
        int total = 0;
        
        do {
           
            i++;
            total +=i;
        }
        while(i < c);
        
        System.out.println("Total number is = "+total);*/
        
       
        System.out.println("Please enter a number ");
        
        int number = scan.nextInt();
        int total = 0;
        do{
            total += number%10;
            number /= 10;
            System.out.println("Number = "+ number);
        }while (number > 10);
        total += number;
        System.out.println("The sum of the figures = "+ total);
        
    }
}

