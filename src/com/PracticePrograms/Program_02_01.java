// 1. Write a program to print whether a number is even or odd, also take input from the user.

package com.PracticePrograms;

import java.util.Scanner;

public class Program_02_01 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter Your Number : ");
        int number = obj.nextInt();

        if(number%2==0)
        {
            System.out.println("Even");
        }
        else
        {
            System.out.println("Odd");
        }
    }
}
