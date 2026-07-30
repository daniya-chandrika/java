package Strings;
import java.util.Scanner;
public class ReverseString {
    public static void stringConcatenation(String text){
        int len = text.length();
        String reverse="";
        for(int i = len-1 ; i >= 0 ; i --) {
            reverse += text.charAt(i);
        }
        System.out.println(reverse);
    }
    public static void stringBuilder(String text){
        StringBuilder newText = new StringBuilder(text);
        newText.reverse();
        System.out.println(newText);
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter a string: ");
        String text= input.nextLine();
        stringConcatenation(text);
        stringBuilder(text);
        input.close();
    }
}
