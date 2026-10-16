package Problem3;

import java.util.Scanner;
import java.util.Arrays;
public class Reverse {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of values:");
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int temp;
        // we switch values of the array from its bounds up to the middle
        for (int i=0; i<n/2; i++){
            temp = arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
