//Write a java program to print right triangle star pattern (*) pattern of N rows.

import java.util.Scanner;

public class T1star {
  public static void main(String[] args) {
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter no. of rows : ");
    n = sc.nextInt();
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
  }  
}
