import java.util.*;

public class WORD_AVERAGE_ASCII {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int len = scan.nextInt();
        String str = scan.next();

        int sum = 0;

        for(int i = 0; i < str.length(); i++){
            sum += str.charAt(i);
        }

        double avg = (double) sum / len;

        System.out.printf("%.2f", avg);
    }
}