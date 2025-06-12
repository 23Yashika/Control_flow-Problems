// Write a java program to print all Prime numbers between 1 to n using loop

import java.util.Scanner;

public class q8loop {
    public static void main(String[] args) {
        int n;
        int flag;
        System.out.println("enter n : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.print("Prime no. b/w 1 to "+n+" are : ");
        for(int i=2;i<=n;i++){
            flag = 0;
            for(int j=2;j<=i/2;j++){
                if(i%j == 0){
                    flag = 1;
                    break;
                }
                }
                if(flag == 0){
                System.out.print(i + ", ");
            }
            }
            
        }
    }

