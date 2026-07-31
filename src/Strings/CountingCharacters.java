package Strings;
import java.util.Scanner;
public class CountingCharacters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a string: ");
        String text = input.nextLine();
        int vowels = 0;
        int consonants = 0;
        int digits = 0;
        int specialch = 0;
        for (int i = 0; i < text.length(); i++) {
            char ch = Character.toLowerCase(text.charAt(i));// using this instead of text.tolwercase().charat(index) reduces un necessary convertions
            if (Character.isDigit(ch)) {
                digits++;
            } else if (!(Character.isDigit(ch)) && !(Character.isLetter(ch))) {
                specialch++;
            } else if (("aeiou").indexOf(ch) != -1) {
                vowels++;
            } else if (("aeiou").indexOf(ch) == -1) {
                consonants++;
            }

        }
            System.out.println("vowels: " + vowels);
            System.out.println("consonants: " + consonants);
            System.out.println("digits: " + digits);
            System.out.println("Special characters: " + specialch);
            input.close();

    }
}
