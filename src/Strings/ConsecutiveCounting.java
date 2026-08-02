package Strings;
import java.util.Scanner;
public class ConsecutiveCounting {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter the string: ");
        String text = input.nextLine();
        StringBuilder result = new StringBuilder();
        int length = text.length();
        int count = 1;
        for (int i = 0 ; i < length-1 ; i++){
            if (text.isEmpty()) {
                System.out.println("this is a empty string");
                return;
            }
            if(text.charAt(i)==text.charAt(i+1)){
                count++;
            }else{
                result.append(text.charAt(i));
                result.append(count);
                count = 1;
            }
        }
        result.append(text.charAt(length-1));
        result.append(count);
        System.out.println(result);
        input.close();
    }
}
