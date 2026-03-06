import java.util.*;

public class Counting_On_Fingers {

    static int Counting(int n) {

        int r = n % 8;

        if (r == 1) return 1;
        if (r == 2) return 2;
        if (r == 3) return 3;
        if (r == 4) return 4;
        if (r == 5) return 5;
        if (r == 6) return 4;
        if (r == 7) return 3;

        return 2;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        System.out.println(Counting(n));
    }
}