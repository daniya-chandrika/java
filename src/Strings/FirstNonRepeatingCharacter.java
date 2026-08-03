package Strings;
import java.util.Scanner;
public class FirstNonRepeatingCharacter {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter the string: ");
        String text = input.nextLine();
        if(text.trim().isEmpty()){
            System.out.println("the string is empty");
            return;
        }
        String trimmed = text.trim();
        //char result=' ';
        boolean found = false;
        for(int i = 0 ; i< trimmed.length() ; i++){
            char ch = trimmed.charAt(i);
            int count = 0;
            for(int j = 0 ; j < trimmed.length() ; j++){
                if(ch == trimmed.charAt(j)){
                    count++;
                }
            }
            if(count==1){
                //result= ch;
                System.out.println("result is : "+ch);
                found=true;
                break;
            }
        }
        if(!found){
            System.out.println("there is no first non repeating character");
        }
        input.close();
    }
}
