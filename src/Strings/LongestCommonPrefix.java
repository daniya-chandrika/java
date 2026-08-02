package Strings;
import java.util.Scanner;
public class LongestCommonPrefix {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter how many words do you want in the array: ");
        int length = input.nextInt();
        String [] array = new String[length];
        for (int i = 0 ; i <= length ; i++){
            System.out.println("enter the "+i+"word: ");
            array[i] = input.next();
        }
        int minLength=0;
        for(int i =0 ; i < length;i++){
            if(array[i].length()<minLength){
                minLength=array[i].length();
            }
        }
        StringBuilder prefix = new StringBuilder();
        for(int i = 0 ; i <= minLength ; i++){
            for(String word : array){
                if(){

                }
                else{
                    break;
                }
            }
            prefix.append(word[i]);
        }
    }
}
