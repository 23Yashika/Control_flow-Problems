//Write a Java program to print the inverted/mirrored rhombus star pattern of N rows.

import java.util.Scanner;

public class Star5 {
    public static void main(String[] args) {
       int n ;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of lines : ");
        n = sc.nextInt();
        int j;
for(int i=n;i>=1;i--){
    for( j=n-i;j>=1;j--){
        System.out.print(" ");
    }
    for(j=n;j>=1;j--){
        System.out.print("*");
    }
System.out.println();
} 
    }
}
