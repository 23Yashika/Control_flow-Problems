// Write a program to find maximum between three numbers.


import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
		// write your code here
		int a,b,c;
        System.out.println("enter any three no. : ");
        Scanner sc = new Scanner(System.in);
	a = sc.nextInt();
    b = sc.nextInt();
    c = sc.nextInt();
		int num = greatest(a,b,c);
		System.out.println("greater no: "+num);
	}

	public static int greatest(int m,int n, int q){
		if(m>n && m>q){
			return m;
		}else if(n>m && n>q){
			return n;
		}else{
			return q;
		}
	}
}
