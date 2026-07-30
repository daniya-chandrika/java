package arrays;
import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter size of the array");
        int n = input.nextInt();
        int [ ] arr = new int[n];
        for(int i =0 ;i<n;i++){
            System.out.println("enter element:");
            arr[i]= input.nextInt();
        }
        System.out.println("enter target value to find:");
        int target = input.nextInt();
        int index=-1;
        for(int i = 0 ; i<n;i++){
            if(arr[i]==target){
                index =i;
                break;
            }

        }
        if(index!=-1){
            System.out.println("target fount at index "+index);
        }
        else{
            System.out.println("target not found");
        }


    }
}
