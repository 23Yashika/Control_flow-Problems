import java.util.Scanner;

public class trinum17 {
    
  public static void main(String[] var0) {
          Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for (int i = n; i >= 1; i--) {
            for (int j = (i * 2)-1; j <= n * 2; j += 2) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
}
}

