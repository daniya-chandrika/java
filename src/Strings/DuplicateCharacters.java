package Strings;
import java.util.Scanner;
public class DuplicateCharacters {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter the string: ");
        String text = input.nextLine();
        String trimmed = text.trim();
        if(text.trim().isEmpty()){
            System.out.println("given is empty string");
            return;
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0 ; i < trimmed.length(); i++){
            char ch = trimmed.charAt(i);
            if(trimmed.indexOf(ch)== i){
                result.append(ch);
            }
            else{
                continue;
            }
        }
        System.out.println("result is : "+result);
        input.close();

    }
}
