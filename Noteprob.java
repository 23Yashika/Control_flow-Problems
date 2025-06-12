//Write a java program to input amount from user and print minimum number of notes (Rs. 500, 100, 50, 20, 10, 5, 2, 1) required for the amount.

import java.util.Scanner;

public class Noteprob {
    public static void main(String[] args) {
        int amt;
        System.out.println("enter price");
        Scanner sc = new Scanner(System.in);
amt = sc.nextInt();
int note;
int[] arr = {500, 100, 50, 20, 10, 5, 2, 1};
for(int i : arr){
 note = amt/i;
amt = amt - note*i;
System.out.println(i+" Notes are "+note);
}
    }
}
