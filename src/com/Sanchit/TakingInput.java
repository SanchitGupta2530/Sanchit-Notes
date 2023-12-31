package com.Sanchit;

import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        /*

        System.out.println(obj.nextLine());

        System.out.print("Enter your Roll No : ");
        int rollno = obj.nextInt();
        System.out.println("Your Roll no is : " + rollno);

         int a = 510_000_000;    // 510 Million -> 10,00,00 this not correct syntax do add underscore in place of comma.

        System.out.println("Value of a is : " + a);



        String name1 = obj.next(); // For only first word
        System.out.println("Value of variable name1 : " + name1);

        String name2 = obj.nextLine(); // For whole line
        System.out.println("Value of variable name2 : " + name2);

        */

        float marks = obj.nextFloat(); // try eg : 564.6758463 , it will only take value upto 564.67584 ->
                                       // This is a classical case of Floating-Point-Error . Values are not accurate in float
                                       // try another example : 10 -> it converts integer input to a float value 10.0
        System.out.println("Value of marks is : " + marks);



    }
}
