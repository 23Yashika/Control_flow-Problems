//Write a java program to input a number from the user and check whether the given number is a strong number or not.

import java.util.Scanner;

public class q16loop {
   public static void main(String[] args) {
     int n;
        System.out.println("Enter a num : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int m,s;
        s=0;
        int num;
        num = n;
        while(n != 0){
            m=1;
         
            int rem = n%10;
            for(int i=rem;i>=1;i--){
m *= i;
            }
s += m;
n = n/10;
        }   
if(num == s){
    System.out.println(num + " is a Strong no.");
}else{
    System.out.println(num + " is not a Strong no.");
}
   
}
}

