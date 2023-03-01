import java.util.Scanner;

public class FourthTask {
    /*
     * 5. feladat is ebben
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int factorial = sc.nextInt();
        sc.close();
        int i = 0;
        int solution = 1;

        while(factorial - i > 0) {
            solution *= factorial - i;
            i++;
        }
        System.out.println("while: " + solution);
        solution = 1;
        for(int j = 0; factorial - j > 0; j++){
            solution *= factorial - j;
        }
        System.out.println("for: " + solution); 
    }
}
