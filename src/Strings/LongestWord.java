package Strings;
import java.util.Scanner;
public class LongestWord {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter a string: ");
        String text = input.nextLine();
        String [] arr = text.trim().split("\\s+");
        int maxLength =0 ;
        String longestWord = "";
        for(String word : arr){
            if(word.length()>maxLength){
                maxLength = word.length();
                longestWord = word;
            }
        }
        if(text.trim().isEmpty()){
            System.out.println("longest word is : ");
        }
        else{
            System.out.println("first longest word is : "+longestWord);
        }

        input.close();
    }
}
