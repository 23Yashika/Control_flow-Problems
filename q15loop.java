//Write a java program to find all Perfect numbers between 1 to n where n is the input given by the user.

import java.util.Scanner;

public class q15loop {
     public static void main(String[] var0) {
       int n;
        System.out.println("Enter a num : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.print("Perfect no. between 1 to "+n+" : ");
        int j;
for(j=2;j<n;j++)
{
        int s = 0;
        for(int i=1;i<j;i++){
            if(j%i == 0){
s += i;
            }
        }
        if(s == j){
            System.out.print(j+", ");
        }
   }
}
}
