//Write a java program to input a number from user and find Prime factors of the given number using loop.

import java.util.Scanner;

public class q9loop {
    public static void main(String[] args) {
        int n;
        int flag;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a num : ");
        n = sc.nextInt();
        System.out.print("Prime Factors of "+n+" are : ");
for(int i=2;i<=n;i++){
    if(n%i==0){
        flag=0;
        for(int j=2;j<=i/2;j++){
if(i%j == 0){
    flag = 1;
    break;
}
        }
        if(flag == 0){
            System.out.print(i+", ");
        }
    }
}


    }
}
