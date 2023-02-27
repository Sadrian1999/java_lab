import java.util.Scanner;

public class ThirdTask{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        sc.close();

        double discriminant = b*b - 4 * a * c;
        if(discriminant < 0){
            System.out.println("Az egyenletnek nincs valós megoldása");
        }
        else if(discriminant == 0){
            double solution = -b / 2*a;
            System.out.println("Eredmény:" + solution);
        }
        else {
            double solutionOne = -b + Math.sqrt(discriminant);
            solutionOne /= 2*a;
            double solutionTwo = -b - Math.sqrt(discriminant);
            solutionTwo /= 2*a;
            System.out.println("Eredmények:\n" + solutionOne + "\n" + solutionTwo);
        }
    }
}