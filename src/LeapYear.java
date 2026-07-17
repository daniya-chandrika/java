import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER ANY YEAR:");
        int year = input.nextInt();
        if(year %4 == 0 && year %100 !=0){
            System.out.println("It's  a leap year");
        }
        else{
            System.out.println("not a leap year");
        }
    }
}
