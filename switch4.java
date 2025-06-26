import java.util.Scanner;

public class switch4 {
    public static void main(String[] args) {
          char ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a vowel");
        ch  = sc.nextLine().charAt(0);
        switch(ch){
            case ('a'):
            System.out.println("apple");
            break;

              case ('e'):
            System.out.println("elephant");
            break;

              case ('i'):
            System.out.println("ice-cream");
            break;

              case ('o'):
            System.out.println("orange");
            break;

              case ('u'):
            System.out.println("umberella");
            break;

             default:
             System.out.println("not a vowel");
        }
    }
    }
