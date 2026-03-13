import java.util.*;

public class CheckPowerOfTwo {

    static int CheckPowerOfTwo(int n){
        int power = 0;

        while(n > 1){
            if(n % 2 != 0){
                return -1;
            }
            n = n / 2;
            power++;
        }

        return power;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        System.out.println(CheckPowerOfTwo(n));
    }
}