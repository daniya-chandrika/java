package methods;

public class MiniMethods {
    public static int calculateTotal(int [] arr){
        int sum =0;
        for(int i : arr){
            sum+=i;
        }
        return sum;
    }
    public static double calculateAverage(int number , int size){
        double average = (double)number/ size ;
        return average;
    }
    public static int findHighest(int [] arr){
        int max = arr[0];
        for(int i : arr){
            if(i>max){
                max = i;
            }
        }
        return max;
    }
    public static int findLowest(int [] arr){
        int min = arr[0];
        for(int i : arr){
            if(i<min){
                min = i;
            }
        }
        return min;
    }
    public static boolean isPassed(double number){
        return number >=40;
    }
    public static void displayReport(int total, double average, int highest, int lowest, String result ){
        System.out.println("total marks : "+ total);
        System.out.println("average marks : "+average);
        System.out.println("highest marks : "+highest);
        System.out.println("lowest marks: "+lowest);
        System.out.println("result : "+result);
    }
    public static void main(String[] args){
        int[] marks = {85, 90, 76, 45, 60};
        int size = marks.length;
        int total = calculateTotal(marks);
        double average = calculateAverage(total,size);
        int highest = findHighest(marks);
        int lowest = findLowest(marks);
        String result;
        if(isPassed(average)){
            result = "Pass";
        }
        else{
            result = "Fail";
        }
        displayReport(total, average , highest,  lowest, result);
    }
}
