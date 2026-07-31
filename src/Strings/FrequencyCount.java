package Strings;
import java.util.Scanner;
public class FrequencyCount {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.println("enter a string: ");
        String text = input.nextLine();
        String lower = text.toLowerCase();
        int len = text.length();
        for(int i =0 ; i < len ; i++){
            char ch = lower.charAt(i);
            if(lower.indexOf(ch)!=i){
                continue;
            }
            int count =0;
            for(int j =0 ; j < len ; j++){
                if(lower.charAt(j)==ch){
                    count++;
                }
            }
            System.out.println(ch+" -> "+count);
        }
        input.close();
    }
}
