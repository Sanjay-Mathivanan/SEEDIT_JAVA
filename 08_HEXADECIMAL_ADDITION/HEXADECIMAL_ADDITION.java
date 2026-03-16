import java.util.*;

public class HEXADECIMAL_ADDITION {

    static int hexValue(char c){
        if(c >= '0' && c <= '9')
            return c - '0';
        return c - 'A' + 10;
    }

    static char hexChar(int n){
        if(n < 10)
            return (char)(n + '0');
        return (char)(n - 10 + 'A');
    }

    static String addHex(String a, String b){
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        StringBuilder result = new StringBuilder();

        while(i >= 0 || j >= 0 || carry > 0){
            int sum = carry;

            if(i >= 0)
                sum += hexValue(a.charAt(i--));

            if(j >= 0)
                sum += hexValue(b.charAt(j--));

            result.append(hexChar(sum % 16));
            carry = sum / 16;
        }

        return result.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();

        while(t-- > 0){
            String s1 = scan.next();
            String s2 = scan.next();

            System.out.println(addHex(s1, s2));
        }
    }
}