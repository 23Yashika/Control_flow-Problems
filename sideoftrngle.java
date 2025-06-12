
// Write a java program to input sides of a triangle and check whether a triangle is equilateral, scalene or isosceles triangle.

import java.util.Scanner;

public class sideoftrngle {
    public static void main(String[] args) {
        int a,b,c;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first side");
        a = sc.nextInt();
        System.out.println("enter Second side");
        b = sc.nextInt();
         System.out.println("enter Third side");
        c = sc.nextInt();

        if((a==b && b==c) && (c==a)){
            System.out.println("The triangle is equilateral Triangle");
        }else if((a==b || b==c) || (a==c)){
             System.out.println("The triangle is Isoceles Triangle");
        }else{
             System.out.println("The triangle is Scalene Triangle");
        }
    }
}
