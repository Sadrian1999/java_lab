
public class EightTask {
    public static void towerOfHanoi(int n, char start_rod, char mid_rod, char to_rod) {
        if (n == 0) {
            return;
        }
        else{
            towerOfHanoi(n - 1, start_rod, to_rod, mid_rod);
            System.out.println(start_rod + " -> " + to_rod);
            towerOfHanoi(n - 1, mid_rod, start_rod, to_rod);
        }

    }
    public static void main(String[] args) {
        char a = 'A';
        char b = 'B';
        char c = 'C';
        towerOfHanoi(4, a, b, c);
    }
}
