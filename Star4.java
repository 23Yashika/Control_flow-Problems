//Write a java program to print a rhombus star pattern of N rows.

import java.util.Scanner;

public class Star4 {
    public static void main(String[] args) {
        int n ;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of lines : ");
        n = sc.nextInt();
        int j;
for(int i=1;i<=n;i++){
    for( j=1;j<=n-i;j++){
        System.out.print(" ");
    }
    for(j=1;j<=n;j++){
        System.out.print("*");
    }
System.out.println();
}
    }
}
