package Strings;
import java.util.Scanner;
public class LongestCommonPrefix {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter how many words do you want in the array: ");
        int length = input.nextInt();
        if (length <= 0) {
            System.out.println("no words provided");
            return;
        }
        String [] array = new String[length];
        for (int i = 0 ; i < length ; i++){
            System.out.println("enter the "+i+" word: ");
            array[i] = input.next();
        }
        int minLength=array[0].length();
        for(int i =0 ; i < length;i++){
            if(array[i].length()<minLength){
                minLength=array[i].length();
            }
        }
        StringBuilder prefix = new StringBuilder();
        for(int i = 0 ; i < minLength ; i++){
            boolean mismatch=false;
            for(String word : array){
                if(array[0].charAt(i)!=word.charAt(i)){
                    mismatch=true;
                    break;
                }

            }
            if(mismatch==true){
                break;
            }
            prefix.append(array[0].charAt(i));
        }
        if(prefix.isEmpty()){
            System.out.println("no common prefix");
            return;
        }
        else{
            System.out.println("the longest common prefix is : "+prefix);
        }
        input.close();
    }
}
