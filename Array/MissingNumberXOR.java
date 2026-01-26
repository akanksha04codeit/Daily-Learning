package Array;

public class MissingNumberXOR {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6}; // Missing: 3
        int n = arr.length + 1;

        int xor1 = 0;
        int xor2 = 0;

        // XOR of all array elements
        for (int num : arr) {
            xor1 ^= num;
        }

        // XOR of all numbers from 1 to n
        for (int i = 1; i <= n; i++) {
            xor2 ^= i;
        }

        int missing = xor1 ^ xor2;

        System.out.println("Missing number is: " + missing);
    }
}

