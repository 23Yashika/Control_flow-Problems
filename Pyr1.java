//Write a java program to print Pyramid star( equilateral triangle ) pattern of N rows.

import java.util.Scanner;

public class Pyr1 {
    public static void main(String[] args) {
        int n;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter no. of rows : ");
    n = sc.nextInt();
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i;j++){
            System.err.print(" ");
        }
        for(int j=1;j<=(2*i-1);j++){
            System.out.print("*");
        }
        System.out.println();
    }
    }
}
