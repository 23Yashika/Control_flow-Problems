import java.util.Scanner;
public class trinum4 {
      public static void main(String[] var0) {
        int n;
      Scanner sc = new Scanner(System.in);
      System.out.println("enter no. of rows : ");
      n = sc.nextInt();
      int k;
      k=1;

     for(int i=n;i>=1;i--){
        for(int j=1;j<=i;j++){
            System.out.print(k);
        }
        System.out.println();
        k++;
     }
}
}
   

