package Excercises.MathExercise;

public class Math {
    final double Pi = 3.141592653589793238;


    public static int Sum(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum;
    }

    public static double Average(double[] nums) {
        double num2 = 0;
        for (int i = 0; i < nums.length; i++) {
            num2 += nums[i];
        }
        double average = num2 / nums.length;
        return average;
    }

    public static double Product(int[] nums) {
        int product = 0;
        for (int i = 0; i < nums.length; i++) {
            product *= nums[i];
        }
        return product;
    }

    public static double Max(int[] nums) {
        int num2 = 0;
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            num2 = nums[i];
            if (max > num2)
                max = max;
            else if (num2 > max)
                max = num2;
            else
                max = max;
        }
        return max;
    }

    public static double Min(int[] nums) {
        int num2 = 0;
        double min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            num2 = nums[i];
            if (min < num2)
                min = min;
            else if (num2 < min)
                min = num2;
            else
                min = min;
        }
        return min;
    }

    public static double Pow(int num, int numOfTimes) {
        int pow = 0;
        int[] nums = new int[numOfTimes - 1];
        for (int i = 0; i < nums.length; i++) {
            num *= num;
        }
        pow = num;
        return pow;
    }

    public static double Factorial(int numOfTimes) {
        int blah = 1;
        int factprialFunction = 1;
        int[] nums = new int[numOfTimes];
        for (int i = 1; i < nums.length; i++) {
            blah = i + 1;
            factprialFunction *= blah;
        }
        return factprialFunction;
    }

    public static int Fibonacci(int numOfTimes) {
        int[] nums = new int[numOfTimes - 1];
        int ActiveNum = 1;
        int PastNum = 0;
        for (int i = 0; i < nums.length; i++){
            int TemporaryNum = ActiveNum;
            ActiveNum = ActiveNum + PastNum;
            PastNum = TemporaryNum;
        }
        return PastNum;
    }

    public static int
}
