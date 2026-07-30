import java.util.Scanner;
public class GradeCaluculator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter your marks:");
        int marks = input.nextInt();
        if(marks>=90){
            System.out.println("grade A");
        }
        else if(marks >= 75){
            System.out.println("grade B ");
        }
        else if(marks>=60){
            System.out.println("grade C");
        }
        else if(marks >=35){
            System.out.println("pass");
        }
        else{
            System.out.println("fail");
        }
    }
}
