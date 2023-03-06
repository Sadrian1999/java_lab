import java.util.Scanner;

public class SecondTask {
    public static double average(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum / numbers.length;
    }
    public static void printAboveAverage(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > average(numbers)) {
                System.out.print(numbers[i] + " ");
            }
        }
    }
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(i + 1 + ".\t");
            numbers[i] = sc.nextInt();
        }
        sc.close();
        System.out.print("Above average: ");
        printAboveAverage(numbers);
        
    }
}
