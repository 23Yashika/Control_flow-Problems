// Write a program in java to input a number and check whether the number is prime number or not using for loop.

import java.util.Scanner;

public class q7loop {
    public static void main(String[] args) {
        int n ;
        System.out.println("enter a number : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int flag = 0;
        for(int i=2;i<n/2;i++){
            if(n%i == 0){
                flag = 1;
                break;
            }
        }
        if(flag == 1){
            System.out.println(n+" is not a prime number");
        }
        if(flag == 0)
        {
             System.out.println(n+" is a prime number");
        }
    }
}
