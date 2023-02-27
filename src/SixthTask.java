import java.util.Scanner;

public class SixthTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double number = sc.nextDouble();
        double max = number;
        double min = number;
        double secondMaximum = 0;
        
        while (true) {
            number = sc.nextDouble();
            if (number < 0) {
                sc.close();
                break;
            }
            if (number < min) {
                min = number;
            }
            else if (number > max) {
                secondMaximum = max;
                max = number;
            }
            else if (number < max) {
                secondMaximum = number;
            }
        }
        System.out.println("Max: "+ max + "\nMásodik maximum: " + secondMaximum + "\nMin: " + min);
    }
}
