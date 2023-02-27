import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args) {
        System.out.println("Koordinatak:");
        Scanner sc = new Scanner(System.in);
        String coordinateOne = sc.nextLine();
        String coordinateTwo = sc.nextLine();
        sc.close();

        double xOne, xTwo, yOne, yTwo;
        xOne = Double.parseDouble(coordinateOne.substring(0,1));
        xTwo = Double.parseDouble(coordinateTwo.substring(0,1));
        yOne = Double.parseDouble(coordinateOne.substring(2,3));
        yTwo = Double.parseDouble(coordinateTwo.substring(2,3));
        System.out.println(Math.sqrt(Math.pow(Math.abs(xOne - xTwo), 2) + Math.pow(Math.abs(yOne - yTwo), 2)));
    }
}
