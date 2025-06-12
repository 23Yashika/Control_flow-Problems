//Write a java program to print hollow mirrored right triangle star pattern (*) pattern of N rows.

import java.util.Scanner;

public class T4star {
    public static void main(String[] args) {
        int n;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter no. of rows : ");
    n = sc.nextInt();
    for(int i=1;i<=n;i++){
for(int j=1;j<=n-i;j++){
    System.out.print(" ");
}
        for(int j=1;j<=i;j++){
            if(i==1||j==1||i==n||j==i){
                System.out.print("*");
            }else{
                 System.out.print(" ");
            }
        }
        System.out.println();
    }
  }  
    }

