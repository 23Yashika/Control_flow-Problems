import java.util.Scanner;

public class trinum16 {
     public static void main(String[] var0) {
          int n;
      Scanner sc = new Scanner(System.in);
      System.out.println("enter no. of rows : ");
      n = sc.nextInt();

     
for(int i=1;i<=n*2;i+=2){
   
    for(int j=i;j<=n*2;j += 2){
       
System.out.print(j);

    }
    System.out.println();
}
}
}
