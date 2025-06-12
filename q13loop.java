//Write a java program to print all Armstrong numbers between 1 to n where n is the input given by the user.

import java.util.Scanner;

public class q13loop {
    public static void main(String[] args) {
        int n;
        int num ;
        int temp;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter num : ");
        n = sc.nextInt();
        // temp = n;
        
        System.out.print("Armstron no. are : ");
        for(int i = 2;i<=n;i++)
        {
int d = 0;
temp = i;
while(temp!=0){
int l = temp%10;
d++;
temp = temp/10;
}

        num = i;
        int rem,m;
        int s = 0;
        temp = i;
while(temp != 0){
    m = 1;
rem = temp%10;
for(int j=1;j<=d;j++){
m *= rem;
}
s += m;
temp = temp/10;
}

if(s == num){
    System.out.print(num + ", ");
}
    }
}
    }

