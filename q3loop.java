// Write a java program to input number from user and check number is palindrome or not using loop. 

import java.util.Scanner;

public class q3loop {
    public static void main(String[] args) {
        int num;
        System.out.println("enter num : ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        int i = num;
        int rev = 0;
        while(num != 0){
rev = (rev*10) + (num % 10);
num = num /10;
        }
        if(rev == i){
            System.out.println(i + " : is Pallindrome number");
        }else{
            System.out.println(i + " : is not a Pallindrome number");
        }

    }
}
