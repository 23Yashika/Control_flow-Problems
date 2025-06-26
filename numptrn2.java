import java.util.Scanner;

public class numptrn2 {
     public static void main(String[] args) {
        int r,c;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter no. of rows and col : ");
    r = sc.nextInt();
    c = sc.nextInt();
    for(int i=1;i<=r;i++){
        for(int j=1;j<=c;j++){
if(j%2 == 0){
    System.out.print("1 ");
}else{
    System.out.print("0 ");
}
        }
        System.out.println();
    }
}
}



