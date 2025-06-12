// Write a java program to find power of a number using for loop.

import java.util.Scanner;

public class q4loop {
    public static void main(String[] args) {
        int b,e;
Scanner sc = new Scanner(System.in);

        System.out.println("enter base : ");
     b = sc.nextInt();
         System.out.println("enter exponent : ");
e = sc.nextInt();
int m = 1;
for(int i=0;i<e;i++){
    m = m*b;
}

System.out.println("power ans : "+ m);
    }
}
