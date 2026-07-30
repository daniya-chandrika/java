import java.util.Scanner;
public class ATMMenu {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        System.out.println("SELECT THE OPTION BELOW:\n" +" 1. Balance\n" +
                "\n" +
                "2. Deposit\n" +
                "\n" +
                "3. Withdraw\n" +
                "\n" +
                "4. Exit\n"+"enter the option number");
        int number = input.nextInt();
        switch (number){
            case 1 -> System.out.println("balance selected");
            case 2 -> System.out.println("DEPOSIT SELETED");
            case 3 -> System.out.println("Withdrawal selected");
            case 4 -> System.out.println("Exit selected");
            default -> System.out.println("INVALID OPTION");
        }
    }
}
