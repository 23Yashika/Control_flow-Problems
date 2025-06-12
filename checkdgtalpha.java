// Write a java program to input a character from user and check whether given character is alphabet, digit or special character.

import java.util.Scanner;

public class checkdgtalpha {
    public static void main(String[] args) {
        char ch;
        System.out.println("enter a charachter");
        Scanner sc = new Scanner(System.in);
        ch = sc.next().charAt(0);

        if((ch >= 97 && ch <= 122) || (ch >= 65 && ch <= 90)){
            System.out.println("This is Alphabet");
        } else if(ch >= 48 && ch <= 57){
            System.out.println("charachter is digit");
        }else{
             System.out.println("its a symbol");
        }
    }
}
