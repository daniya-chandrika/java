package methods;

public class SquareAndSum {
    public static int Square(int number){
        return number * number;

    }
    public static int Sum(int a , int b){
        return a + b;
    }
    public static boolean isEven(int number){
        if(number % 2 ==0){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        int s = Square(6);
        int sum = Sum(10,20);
        boolean result = isEven(17);

        System.out.println(s);
        System.out.println(sum);
        System.out.println(result);
    }
}
