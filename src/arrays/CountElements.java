package arrays;
import java.util.Scanner;
public class CountElements {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter size of the array:");
        int n= input.nextInt();
        int even =0 ;
        int odd = 0;
        int post =0;
        int neg =0;
        int zero =0;
        for(int i =0; i < n ; i++){
            System.out.println("enter element");
             int value = input.nextInt();
             if(value % 2 ==0){
                 even++;
             }
             if (value % 2 != 0) {
                 odd ++;
             }
             if(value<0){
                 neg++;
             }
             if(value>0){
                 post++;
             }
             if(value ==0){
                 zero++;
             }
        }
        System.out.println("even numbers"+even);
        System.out.println("odd numbers"+odd);
        System.out.println("postives"+post);
        System.out.println("negatives"+neg);
        System.out.println("zeros"+zero);
    }
}
