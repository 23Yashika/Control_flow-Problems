// Write a java program to input electricity unit charge and calculate the total electricity bill according to the given condition:
// For first 50 units Rs. 0.50/unit
// For next 100 units Rs. 0.75/unit
// For next 100 units Rs. 1.20/unit
// For unit above 250 Rs. 1.50/unit
// An additional surcharge of 20% is added to the bill.

import java.util.Scanner;

public class elecunitchrg {
    public static void main(String[] args) {
        int u;
        float ta,amt,schrg;
        System.err.println("enter unit");
        Scanner sc = new Scanner(System.in);
        u = sc.nextInt();
if(u<=50){
    amt = u * 0.50f;
}else if(u <= 150){
    amt = 25 + ((u - 50) * 0.75f);
}else if(u <= 250){
    amt = 100 + ((u - 150) * 1.20f);
}else{
    amt = 220 + ((u-250) * 1.50f);
}

schrg = amt * 0.20f;
ta = schrg + amt;
System.out.println("Total net charge : Rs. "+ta);
    }
    
}


