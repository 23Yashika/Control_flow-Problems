// Write a Program to input a number from user and find all factors of the given number using for loop. 

import java.util.Scanner;

public class q6loop {
    public static void main(String[] args) {
        int n;
        System.out.print("enter num : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
          System.out.print("Factors of "+n+" : 1");
        for(int i=2;i<=n;i++){
if(n%i == 0){
System.out.print(", "+i);
}
        }
    }
}
