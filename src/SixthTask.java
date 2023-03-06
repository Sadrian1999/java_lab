import java.util.Scanner;

public class SixthTask {
    public static void bubbleSort(double[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    double temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp; 
                }
            }
        }
    }
    public static void main(String[] args) {
        double[] myArray = new double[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = sc.nextDouble();
        }
        sc.close();
        bubbleSort(myArray);
        for (double d : myArray) {
            System.out.println(d);
        }
    }
}
