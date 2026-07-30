import java.util.Scanner;
public class LoginSystem {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter username:");
        String username = input.next();
        System.out.println("ENTER PASSWORD:" );
        String password = input.next();
        if(username.equals("admin")){
            if(password.equals("java123")){
                System.out.println("login successful");
            }
            else{
                System.out.println("wrong password");
            }
        }
        else{
            System.out.println("Invalid user");
        }
    }
}
