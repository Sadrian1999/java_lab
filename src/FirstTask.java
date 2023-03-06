public class FirstTask {
    public static int numberOfDivisors(int number){
        int divisors = 0;
        for(int i = 1; i <= number; i++){
            if (number % i == 0) {
                divisors++;
            }
        }
        return divisors;
    }
    public static boolean isPrime(int number){
        return numberOfDivisors(number) == 2 ? true: false;
    }
    public static void main(String[] args) {
        int counter = 0;
        int number = 2;
        while (counter <= 100) {
            if(isPrime(number)){
                System.out.println(counter + ".\t" + number);
                counter++;
            }
            number++;
        }  
    }
}
