import java.util.ArrayList;
import java.util.Scanner;

public class ThirdTask {
    public static double average(ArrayList<Integer> numbers) {
        int sum = 0;
        for (Integer integer : numbers) {
            sum += integer;
        }
        return sum / numbers.size();
    }
    public static void printAboveAverage(ArrayList<Integer> numbers) {
        for (Integer integer : numbers) {
            if (average(numbers) < integer) {
                System.out.print(integer + " ");
            }
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print(i + 1 + ".\t");
            numbers.add(sc.nextInt());
        }
        sc.close();
        System.out.print("Above average: ");
        printAboveAverage(numbers);   
    }
}
