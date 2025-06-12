//Write a java program to print all strong numbers between 1 to n where n is the input given by the user.

import java.util.Scanner;

public class q17loop {
   public static void main(String[] args) {
    int n;
        System.out.println("Enter a num : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.print("Strong no. between 1 to "+n+" : ");
int temp;
   for(int i=1;i<n;i++){
    int m,s;
        s=0;
        temp = i;
        while(temp != 0){
            m=1;
         
            int rem = temp%10;
            for(int j=rem;j>=1;j--){
m *= j;
            }
s += m;
temp = temp/10;
        }   
if(i == s){
    System.out.print(i + ", ");
}
}
   
   
    } 
}
