public class SeventhTask {
    public static int factorial(int number) {
        if (number == 1) {
            return number;
        }
        else if (number > Integer.MAX_VALUE) {
            return 0;
        }
        else {
            return number * factorial(number - 1);
        }
    }

    public static int nthFibonacci(int n) {
        if (n <= 1) {
            return n;
        } 
        else {
            return nthFibonacci(n - 1) + nthFibonacci(n - 2);
        }
    }
    public static void main(String[] args) {
        System.out.println(nthFibonacci(6));
    }
}
