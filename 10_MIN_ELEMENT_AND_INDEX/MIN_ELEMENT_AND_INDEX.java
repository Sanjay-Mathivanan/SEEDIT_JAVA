import java.util.*;

public class MIN_ELEMENT_AND_INDEX {

    static void MinArray(int arr[], int length){
        int min = arr[0];
        int index = 0;

        for(int i = 1; i < length; i++){
            if(arr[i] < min){
                min = arr[i];
                index = i;
            }
        }

        System.out.println(min);
        System.out.println(index);
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = scan.nextInt();
        }

        MinArray(arr, n);
    }
}