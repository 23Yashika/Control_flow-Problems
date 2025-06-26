import java.util.Scanner;

public class numptrn5 {
    


    public static void main(String[] args) {
        int r,c;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter no. of rows and col : ");
    r = sc.nextInt();
    c = sc.nextInt();
    int mr = (r+1)/2;
    int mc = (c+1)/2;
    for(int i=1;i<=r;i++){
        for(int j=1;j<=c;j++){
if(i==mr || j==mc){
    System.out.print("0");
}else{
    System.out.print("1");
}
        }
        System.out.println();
    }
}



}
