//Write a java program to input two numbers from user and find LCM (Lowest Common Multiple).

import java.util.Scanner;

public class q10loop {
    public static void main(String[] args) {
        int n1,n2;
        int lcm;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a num1 : ");
        n1 = sc.nextInt();
         System.out.println("enter a num2 : ");
n2 = sc.nextInt();
lcm = n1>n2 ? n1 : n2;
while(true){
    if(lcm%n1 == 0 && lcm%n2 == 0){
 break;
    }
    lcm++;
}

System.out.println("lcm is : "+lcm);

    }
}
