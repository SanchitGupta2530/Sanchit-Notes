package com.Sanchit;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {

        //When one type of data is assigned to another type of variable , and automatic type-conversion will take place if the following conditions are met :
        // 1. The two types should be compatible.
        // 2. Destination type should be greater than the source type.

        Scanner obj = new Scanner(System.in);

        int num1 = obj.nextInt();
        int num2 = obj.nextInt();
        int sum12 = num1 + num2;
        // Here if we give float value as input it will give error as we are asking for smaller value int but giving greater value float.
        System.out.println("Sum = " + sum12);

        float num3 = obj.nextFloat();
        float num4 = obj.nextFloat();
        float sum34 = num3 + num4;
        // Here if we give int value as input it will not give error as we are asking for greater value float but giving smaller value int.
        // Here try giving integer input , Java will automatically convert to float. eg : num3 = 10 and num4 = 20 , output : 30.0
        System.out.println("Sum = " + sum34);

       /* This piece of code will give error
        int num5 = obj.nextFloat();
        int num6 = obj.nextFloat();
        // LHS should be greater than RHS. here LHS is int , RHS is float -> here LHS < RHS
        // Now float > int in general as float supports both integer and decimal
        */

        float num7 = obj.nextInt();
        float num8 = obj.nextInt();
        float sum78 = num7 + num8;
        // LHS is float , RHS is int -> here LHS > RHS hence no error
        System.out.println("Sum = " + sum78);


        // ----------------------------------
        // Now Java is not automatically converting int to float (smaller to bigger)
        // That we can achieve by doing that manually knows as "TYPE CASTING" (casting incompatible types)
        // All the automatic conversions are helpful, but they might not fulfill all our needs, Hence we need to do this manually using Type Casting
        // This is sometimes called as NARROWING CONVERSION , as we are manually saying narrow the float into the integer (going bigger to smaller)

        //  int num9 = 67.56f;     This will give error. trying to give float get int (bigger to smaller)
        int num10 = (int) 67.56f;   //By Type casting , it stops giving error. We give float get int (bigger to smaller)
        System.out.println(num10);

        // ----------------------------------

        int number = 'A';
        System.out.println(number); // It prints "ASCII" value to char 'A' which is converted to int

        // ----------------------------------
        // Automatic Type Promotion in expressions
        int a = 257;
        // byte b = a; This will give error as byte is 256 (-128 to 127 , total 256 including 0)
        byte b = (byte) a; // This will give remainder left after range of 256
        // 257 % 256 = 1
        System.out.println(b);

        byte p = 40;
        byte q = 50;
        byte r = 100;
        int s = p * q / r ;
        // here p * q is 40*50 = 2000 which exceeds range of byte.
        // So Java automatically Promotes the intermediate expression p * q to integer
        System.out.println(s);

        byte m = 50;
       // m = m * 2;  // This will give error. While performing m*2 it automatically converts it into int and into cannot be assigned to a byte.

        // ----------------------------------

        // Overall example

        byte bb = 42;
        char cc = 'a';
        short ss = 1024;
        int ii = 50000;
        float ff = 5/67f;
        double dd = 0.1234;
         double result = (ff * bb) + (ii / cc) - (dd * ss);
         // (float * byte) + (integer / char) - (double * short)
         // (byte is promoted to float) + ( char is promoted to integer) - (short is promoted to double)
         // float + integer - double = Double

        System.out.println( (ff * bb) + " + " + (ii / cc) + " - " + (dd * ss));
        System.out.println(result);

    }
}
