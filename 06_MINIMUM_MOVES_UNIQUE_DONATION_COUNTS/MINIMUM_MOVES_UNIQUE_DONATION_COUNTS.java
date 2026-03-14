import java.util.*;

public class MINIMUM_MOVES_UNIQUE_DONATION_COUNTS {

    static int minMoves(int[] donationCounts) {
        Arrays.sort(donationCounts);
        int moves = 0;

        for (int i = 1; i < donationCounts.length; i++) {
            if (donationCounts[i] <= donationCounts[i - 1]) {
                int newValue = donationCounts[i - 1] + 1;
                moves += newValue - donationCounts[i];
                donationCounts[i] = newValue;
            }
        }

        return moves;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] donationCounts = new int[n];

        for (int i = 0; i < n; i++) {
            donationCounts[i] = scan.nextInt();
        }

        System.out.println(minMoves(donationCounts));
    }
}