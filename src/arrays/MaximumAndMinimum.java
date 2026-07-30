package arrays;
import java.util.Scanner;
public class MaximumAndMinimum {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter how many elements do you want to store:");
        int n = input.nextInt();
        System.out.println("enter the first element:");
        int value = input.nextInt();
        int max =value;
        int min =value;
        for(int i = 0 ; i < n ; i++){
            System.out.println("enter element:");
            value= input.nextInt();
            if(value>max )
                max = value;

            if(value< min)
                min = value;

           // System.out.println(arr[i]);
        }
        System.out.println("maximum"+ max);
        System.out.println("minimum"+min);

    }

}
