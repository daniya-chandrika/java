package arrays;
import java.util.Scanner;
public class SumAndAverage {
    public static void main(String[] args){
        int size = 5;
        int sum = 0;
        Scanner input = new Scanner(System.in);
        int arr [ ] = new int[size];
        for(int i=0; i<size; i++){
            System.out.println("enter element:");
            arr[i] = input.nextInt();
            sum += arr[i];
        }
        int avg = sum/size;
        System.out.println("sum of the array:"+sum);
        System.out.println("average of the array:"+avg);
    }
}
