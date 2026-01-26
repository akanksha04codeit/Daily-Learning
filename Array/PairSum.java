package Array;

import java.util.Arrays;

public class PairSum {
    public static void main(String[] args) {
        int[] arr = {1, 5, 7, -1, 5};
        int sum = 6;

        Arrays.sort(arr);
        int left = 0;
        int right = arr.length - 1;

        System.out.println("Pairs with sum " + sum + ":");

        while (left < right) {
            int s = arr[left] + arr[right];
            
            if (s == sum) {
                System.out.println(arr[left] + " + " + arr[right]);
                left++;
                right--;
            } else if (s < sum) left++;
            else right--;
        }
    }
}

