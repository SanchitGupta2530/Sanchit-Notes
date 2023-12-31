// 2. Take name as input and print a greeting message for that particular name.

package com.PracticePrograms;

import java.util.Scanner;

public class Program_02_02 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter your Name : ");
        String name = obj.nextLine();
        System.out.println("Hii " + name + "! Welcome to Java Programming Language !!");
    }
}
