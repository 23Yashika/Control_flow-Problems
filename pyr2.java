//Write a java program to print hollow pyramid star pattern (*) pattern of N rows

import java.util.Scanner;

public class pyr2 {
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
