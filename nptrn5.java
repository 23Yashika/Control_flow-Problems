import java.util.Scanner;

public class nptrn5 {
     public static void main(String[] args) {
        int r,c;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter no. of rows and col : ");
    r = sc.nextInt();
    c = sc.nextInt();
for(int i=1;i<=r;i++){
    for(int j=1;j<=c;j++){
         if (j <= i) {
                    System.out.print(r - j + 1); 
                } else {
                    System.out.print(c - i + 1);  
                }
            }
            System.out.println();
    }
}
     }

