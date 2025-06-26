import java.util.Scanner;

public class nptrn1 {
     public static void main(String[] args) {
        int r,c;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter no. of rows and col : ");
    r = sc.nextInt();
    c = sc.nextInt();
for(int i=1;i<=r;i++){
    for(int j=1;j<=c;j++){
        System.out.print(i);
    }
    System.out.println();
}

}
}
