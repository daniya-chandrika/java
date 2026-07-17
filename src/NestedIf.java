import java.util.Scanner;
public class NestedIf {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter your age");
        int age = input.nextInt();
        System.out.println("enter(true\\false)if you have lincense:");
        boolean has_lincense =input.nextBoolean();
        System.out.println("enter(true\\false) if you have helmet:");
        boolean has_helmet =input.nextBoolean();
        if(age>=18){
            if(has_lincense){
                if(has_helmet){
                    System.out.println("Allowed to drive");
                }
                else{
                    System.out.println("No helmet");
                }
            }
            else{
                System.out.println("No lincense");
            }
        }
        else{
            System.out.println("underage");
        }
    }
}
