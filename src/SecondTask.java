import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args) {
        System.out.println("Koordinatak:");
        Scanner sc = new Scanner(System.in);
        String coordinateOne = sc.nextLine();
        String coordinateTwo = sc.nextLine();
        sc.close();

        double xOne = Double.parseDouble(coordinateOne.substring(0,1));
        double xTwo = Double.parseDouble(coordinateTwo.substring(0,1));
        double yOne = Double.parseDouble(coordinateOne.substring(2,3));
        double yTwo = Double.parseDouble(coordinateTwo.substring(2,3));
        System.out.println(Math.sqrt(Math.pow(Math.abs(xOne - xTwo), 2) + Math.pow(Math.abs(yOne - yTwo), 2)));
    }
}
