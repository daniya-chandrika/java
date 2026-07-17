import java.util.Scanner;
public class LargestOfTwo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter first number:");
        int first = input.nextInt();
        System.out.println("enter second number:");
        int second = input.nextInt();
        if(first>second){
            System.out.println("first number is largest:"+first);
        } else if (first == second) {
            System.out.println("both are equal");
        } else{
            System.out.println("second number is largest:"+second);
        }
    }
}
