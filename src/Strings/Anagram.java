package Strings;
import java.util.Scanner;
public class Anagram {
    public static boolean anagram(String string1 , String string2){
        if(string1.length()!=string2.length()){
            return false;
        }
        for(int i=0 ; i < string1.length() ; i++){
            char ch1 = string1.charAt(i);
            if(string1.indexOf(ch1)!= i){
                continue;
            }
            int count1 =0;
            int count2 =0;
            for(int j = 0 ; j<string1.length() ; j++) {
                if (ch1 == string1.charAt(j)) {
                    count1++;
                }
                if (ch1 == string2.charAt(j)) {
                    count2++;
                }
            }
            if(count1!=count2){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter string 1 : ");
        String text1 = input.nextLine();
        System.out.println("enter string 2 : ");
        String text2 = input.nextLine();
        String string1 = text1.toLowerCase();
        String string2 = text2.toLowerCase();
       if(anagram(string1,string2)){
           System.out.println("they are anagrams");
       }
       else{
           System.out.println("they are not anagrams");
       }
       input.close();
    }
}
