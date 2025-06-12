//Write a java program to print a hollow square star pattern with diagonals.

import java.util.Scanner;

public class Star3 {
    public static void main(String[] args) {
        int n ;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of lines : ");
        n = sc.nextInt();
for(int i=1;i<=n;i++){
    for(int j=1;j<=n;j++){
        if(i==1 || i==n || j==1 || j==n|| i==j || j == (n-i+1)){
            System.out.print("*");
        }else{
        System.out.print(" ");
    }
}
System.out.println();
}
    }
}
