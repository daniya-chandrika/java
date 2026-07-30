package methods;

public class ArraySumAndMax {
    public static int findMaximum(int [] arr){
        int max = arr[0];
        for( int num:arr){
            if(num>max){
                max=num;
            }
        }
        return  max;
    }
    public static int findSum(int[]arr){
        int sum=0;
        for (int num:arr){
            sum+=num;
        }
        return sum;
    }
    public static void main(String[] args){
        int[] arr = {10, 20, 30, 40, 50};

        System.out.println(findMaximum(arr));
        System.out.println(findSum(arr));
    }
}
