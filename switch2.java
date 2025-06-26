import java.util.Scanner;

public class switch2 {
     public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two no.");
        a = sc.nextInt();
        b= sc.nextInt();
        int bool;
        if(a>b){
            bool = 1;
        }else{
            bool =0;
        }
        switch(bool){
            case 1:
            System.out.println(a+" is greater than "+b);
            break;

              case 0:
           System.out.println(b+" is greater than "+a);
            break;
        }
    }
}
