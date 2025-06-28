import java.util.Scanner;

public class trinum20 {
        public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        int k;
        k=1;
for(int i=1;i<=n;i++){
    for(int j=1;j<=i;j++){
        if(k%2 == 1){
            System.out.print("1");
        }else{
            System.out.print("0");
        }
        k++;
    }
    System.out.println();
    
}
       
        }
}
