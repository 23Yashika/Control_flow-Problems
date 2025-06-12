//Write a java program to input a number from the user and check whether the given number is an Armstrong number or not.

import java.util.Scanner;

public class q12loop {
    public static void main(String[] args) {
        int n;
        int num ;
        int temp;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter num : ");
        n = sc.nextInt();
        temp = n;
        int d = 0;
while(temp!=0){
int l = temp%10;
d++;
temp = temp/10;
}

        num = n;
        int rem,m;
        int s = 0;
while(n != 0){
    m = 1;
rem = n%10;
for(int i=1;i<=d;i++){
m *= rem;
}
s += m;
n = n/10;
}

if(s == num){
    System.out.println(num + " is Armstrong Number");
}else{
     System.out.println(num + " is not Armstrong Number");
}
    }
}
