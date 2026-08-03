package Strings;
import java.util.Scanner;
public class ReverseWords {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter the sentence: ");
        String text = input.nextLine();
        if (text.trim().isEmpty()) {
            System.out.println("Given sentence is empty.");
            return;
        }
        String [] words = text.trim().split("\\s+");
        StringBuilder result = new StringBuilder();
        //int length = words.length - 1;
        //System.out.println(length);
       for(int i = words.length -1; i >= 0; i--){
            result.append(words[i]);
            if(i!=0){
                result.append(" ");
            }
        }
       System.out.println("result: "+result);

        input.close();
    }
}
