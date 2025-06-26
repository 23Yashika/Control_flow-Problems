import java.util.Scanner;

public class nptrn6 {
      public static void main(String[] args) {
        int r,c;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter no. of rows and col : ");
    r = sc.nextInt();
    c = sc.nextInt();
for(int i=r;i>=1;i--){
    for(int j=c;j>=1;j--){
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



