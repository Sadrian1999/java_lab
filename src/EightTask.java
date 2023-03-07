import java.util.Stack;

public class EightTask {
    public static void towerOfHanoiAdvanced(int n, Stack<Integer> start, Stack<Integer> mid, Stack<Integer> end) {
         if (n == 1) {
            putOn(end, takeOff(start));
        }
        else {
            towerOfHanoiAdvanced(n - 1, start, end, mid);
            System.out.println("A: " + start + "\nB: " + mid + "\nC: " + end + "\n\n");
            putOn(end, takeOff(start));
            System.out.println("A: " + start + "\nB: " + mid + "\nC: " + end + "\n\n");
            towerOfHanoiAdvanced(n - 1, mid, start, end);
            System.out.println("A: " + start + "\nB: " + mid + "\nC: " + end + "\n\n");
        }
    }

    public static int takeOff(Stack<Integer> tower) {
        return tower.pop();
    }
   
    public static void putOn(Stack<Integer> tower, int disk) {
        tower.push(disk);
    }
   
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
        /* 
        char a = 'A';
        char b = 'B';
        char c = 'C';
        towerOfHanoi(4, a, b, c);
        //*/

        /* 
        Stack<Integer> A = new Stack<>();
        Stack<Integer> B = new Stack<>();
        Stack<Integer> C = new Stack<>();
        //putOn(A, 4);
        //putOn(A,3);
        //putOn(A, 2);
        putOn(A, 1);
        System.out.println("A: " + A + "\nB: " + B + "\nC: " + C + "\n\n");
        towerOfHanoiAdvanced(A.size(), A, B, C);
        //*/

    }
}
