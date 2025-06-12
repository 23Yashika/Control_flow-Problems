// Write a java program to print Fibonacci series up to n terms using loop.

import java.util.Scanner;

public class q5loop {
    public static void main(String[] args) {
       int a=0;
    int b=1;
    int c;
    int n;
    Scanner sc = new Scanner(System.in);
    
    System.out.print("enter num : ");
    n = sc.nextInt();
    System.out.print("Fibonacci series : ");
    System.out.print("0 , 1");
    for(int i=2;i<n;i++){
c = a+b;
a = b;
b = c;
System.out.print(" , " + c );
    }
}
 
    }
    