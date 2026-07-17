import java.util.Scanner;
public class SimpleCaluculator {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        System.out.println("enter first number:");
        int first = input.nextInt();
        System.out.println("enter second number:");
        int second = input.nextInt();
        System.out.println("enter operator(+,-,*,/,%):");
        String operator = input.next();
        int result=0;
        switch (operator){
            case "+" :
                result = first + second;
                break;
            case "-":
                result=first - second;
                break;
            case "*":
                result=first*second;
                break;
            case "/":
                result=first/second;
                break;
            case "%":
                result=first%second;
                break;
            default:
                System.out.println("invalid operator");
        }
        System.out.println(result);
    }
}
