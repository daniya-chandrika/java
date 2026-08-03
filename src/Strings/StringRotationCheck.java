package Strings;
import java.util.Scanner;
public class StringRotationCheck {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println(" enter the first string: ");
        String text1 = input.nextLine();
        System.out.println("enter the second string: ");
        String text2 = input.nextLine();
        if(text1.trim().length()!=text2.trim().length()){
            System.out.println("lengths of the both strings are different ");
            return;
        }
        String joinstring = text1+text1;
        if(joinstring.contains(text2)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        input.close();
    }
}
