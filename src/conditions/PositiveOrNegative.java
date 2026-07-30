import java.util.Scanner;
public class PositiveOrNegative {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number:");
        int number = input.nextInt();
        if(number>0){
            System.out.println("POSITIVE NUMBER");
        }
        else if(number<0){
            System.out.println("NEGATIVE NUMBER");
        }
        else{
            System.out.println("Zero");
        }
    }
}
