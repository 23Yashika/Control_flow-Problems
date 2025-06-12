//Write a java program to print inverted right triangle star pattern (*) pattern of N rows.

import java.util.Scanner;

public class T5star {
    public static void main(String[] args) {
          int n;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter no. of rows : ");
    n = sc.nextInt();
    for(int i=n;i>=1;i--){
        for(int j=i;j>=1;j--){
            System.out.print("*");
        }
        System.out.println();
    }
    }
}
