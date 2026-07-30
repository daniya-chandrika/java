package Strings;
import java.util.Scanner;
public class TwoPointerPalindrome {
    public static boolean isPalindrome(String text){
        int left = 0;
        int right = text.length()-1;
        while(left<right){
            if(text.charAt(left)!=text.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter a string: ");
        String text = input.nextLine();
        if(isPalindrome(text)){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
        input.close();
    }
}
