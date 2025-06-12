//Square Star and Rhombus Star Patterns
//Write a java program to print a square star(*) pattern series of N rows.

import java.util.Scanner;

public class star1 {
    public static void main(String[] args) {
        int n ;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of lines : ");
        n = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
