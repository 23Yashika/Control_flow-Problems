// Write a java program to input a number and find the sum of first and last digit of the number using a for loop. 

import java.util.Scanner;

public class loop1 {
    public static void main(String[] args) {
    int num ;
    System.out.println("enter number");
    Scanner sc = new Scanner(System.in);
    num = sc.nextInt();
int fd = 0;
    int ld = num % 10;
    while(num != 0){
fd = num % 10;
num = num / 10;
    }

    int sum = fd + ld;
    System.out.println("Sum of first and last digit is : "+ sum);
    }
}
