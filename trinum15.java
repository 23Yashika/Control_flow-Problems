import java.util.Scanner;

public class trinum15 {
     
    public static void main(String[] var0) {
          int n;
      Scanner sc = new Scanner(System.in);
      System.out.println("enter no. of rows : ");
      n = sc.nextInt();
    int k=0;
     
for(int i=n;i>=1;i--){
     k=i;
    for(int j=i;j>=1;j--){
       
System.out.print(k);
 k++;
    }
    System.out.println();
}
}
}

