package arrays;
import java.util.Scanner;
public class SecondLargest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter the size of the array:");
        int n= input.nextInt();
        int largest=Integer.MIN_VALUE;
        int secondlargest= Integer.MIN_VALUE;
        for(int i= 0; i<n; i++){
            System.out.println("enter element:");
            int value = input.nextInt();
            if(value>largest){
                secondlargest=largest;
                largest = value;
            }
            else if (value > secondlargest && value<largest) {
                secondlargest=value;

            }
        }
        System.out.println("LARGEST AND SECOND LARGEST NUMERS ARE: "+largest+" "+secondlargest);
    }
}
