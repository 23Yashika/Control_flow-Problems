// Write a java program to input a number from the user and calculate product of its digits.

import java.util.Scanner;

public class q2loop {
    public static void main(String[] args) {
        int num;
        System.out.println("enter num : ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        int m = 1;
        while(num != 0){
            m = m * (num%10);
            num = num/10;
        }
        System.out.println("digit multiplication : "+m);
    }
}
