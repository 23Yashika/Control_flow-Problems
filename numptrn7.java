import java.util.Scanner;

public class numptrn7 {
    public static void main(String[] args) {
        int r, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and columns: ");
        r = sc.nextInt();
        c = sc.nextInt();

        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c; j++) {
 if ((i == 1 || i == r) && (j == 1 || j == c)) {
              System.out.print("0");
            } else if (i == 1 || i == r|| j == 1 || j == c) {
              System.out.print("1");
            } else {
               System.out.print("0");
            }
        }
System.out.println();
        }
    }
}
