//Write a java program to input two numbers from the user and find HCF (Highest Common Factor) / GCD (Greatest Common Divisor).

import java.util.Scanner;

public class q11loop {
    public static void main(String[] args) {
        int n1,n2;
        int hcf;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a num1 : ");
        n1 = sc.nextInt();
         System.out.println("enter a num2 : ");
n2 = sc.nextInt();
hcf = n1<n2 ? n1 : n2;
int i;
for( i=hcf;i>=1;i--){
    if(n1%i == 0 && n2%i == 0){
break;
    }
}
System.out.println("HCF is : "+i);
    }
   
}
