import java.util.*;

public class LeastAbsoluteDifference {

    static int LeastDifference(int arr[], int length, int n){
        int min = Math.abs(arr[0] - n);
        int result = arr[0];

        for(int i = 1; i < length; i++){
            int diff = Math.abs(arr[i] - n);

            if(diff < min){
                min = diff;
                result = arr[i];
            }
        }

        return result;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int length = scan.nextInt();
        int n = scan.nextInt();

        int arr[] = new int[length];

        for(int i = 0; i < length; i++){
            arr[i] = scan.nextInt();
        }

        System.out.println(LeastDifference(arr, length, n));
    }
}