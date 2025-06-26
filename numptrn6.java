import java.util.Scanner;

public class numptrn6 {
     public static void main(String[] args) {
        int r,c;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter no. of rows and col : ");
    r = sc.nextInt();
    c = sc.nextInt();
    for(int i=1;i<=r;i++){
        for(int j=1;j<=c;j++){
            if(i==j || (i+j) == (r+1)){
                System.err.print("1");
            }else{
System.err.print("0");
            }
            
        }
        System.out.println();
    }
}
}
