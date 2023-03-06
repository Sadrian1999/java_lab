import java.util.Scanner;

public class FifthTask {
    public static void arrayOut(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }

    }
    public static void arrayPosition(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0){
                // itt nem immutable objektiumokkal dolgozunk
                array[i] = Math.abs(array[i]);
            }
        }
        /*
         * Szorgalmi részleg
         * parameter:ArrayList<Integer> a
            for (Integer integer : a) {
                if (integer < 0) {
                    integer = Math.abs(integer);
                }
            }
         */
        
    }
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();

        }
        /*
        Szorgalmi reszleg: ArrayList<Integer> a = new ArrayList<Integer>();
        for (int i = 0; i <= 10; i++) {
            a.add(sc.nextInt());
        }
         */
        sc.close();
        arrayOut(numbers);
        arrayPosition(numbers);
        System.out.println("");
        arrayOut(numbers); 
        System.out.println("");
        arrayOut(numbers); 
    }
}