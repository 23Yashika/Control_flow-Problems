//Write a java program to input a number and check whether the number is a Perfect number or not. 

import java.util.Scanner;

public class q14loop {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter a num : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int s =0;
        for(int i=1;i<n;i++){
            if(n%i == 0){
s += i;
            }
        }
        if(s == n){
            System.out.println(n+" is a perfect number");
        }else{
             System.out.println(n+" is not a perfect number");
        }
    }
}
