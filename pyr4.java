//Write a java program to print hollow inverted Pyramid star pattern for N rows

import java.util.Scanner;

public class pyr4 {
    public static void main(String[] args) {
           int n;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter no. of rows : ");
    n = sc.nextInt();
    for(int i=n;i>=1;i--){
        for(int j=n-i;j>=1;j--){
            System.err.print(" ");
        }
        for(int j=1;j<=(2*i-1);j++){
            if(i==1||j==1||j==2*i-1||i==n){
            System.out.print("*");
            }else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
    }
}
