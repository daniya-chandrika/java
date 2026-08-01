package Strings;
import java.util.Scanner;
public class WordCounter {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter the string: ");
        String text = input.nextLine();
        if(text.trim().isEmpty()){
            System.out.println("the no of words are: 0");
        }
        else{
            String [] arr = text.trim().split("\\s+");
            System.out.println("the no of words are: "+ arr.length);
        }
        input.close();
    }
}
