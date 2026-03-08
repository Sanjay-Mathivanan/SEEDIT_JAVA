import java.util.*;

public class Value_Of_Cards{

    static int total(int a, int b, int c, int d) {
        return check(a) + check(b) + check(c) + check(d);
    }

    static int check(int card) {

        if (card == 11) return 3; // Jack
        if (card == 9) return 2;  // Nine
        if (card == 1) return 1;  // Ace
        if (card == 10) return 1; // Ten

        return 0;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();

        System.out.println(total(a, b, c, d));
    }
}