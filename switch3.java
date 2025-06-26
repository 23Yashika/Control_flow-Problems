import java.util.Scanner;

public class switch3 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no.");
       
        n= sc.nextInt();
        int bool;
        if(n%2 == 0){
            bool = 1;
        }else{
            bool =0;
        }
        switch(bool){
            case 1:
            System.out.println(n+" is even no. ");
            break;

              case 0:
        System.out.println(n+" is odd no. ");
            break;
        }  
    }
   
}

