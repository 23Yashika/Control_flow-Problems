 import java.util.Scanner;
public class trinum5 {
   public static void main(String[] var0) {
        int n;
      Scanner sc = new Scanner(System.in);
      System.out.println("enter no. of rows : ");
      n = sc.nextInt();
      int k;
      k=n;

     for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print(k);
        }
        System.out.println();
        k--;
     }
}
}
   



