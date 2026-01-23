package String;

// Program 6: Check if two strings are Anagrams
import java.util.Arrays;

public class AnagramCheck {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";

        // Remove spaces and convert to lowercase
        s1 = s1.replaceAll("\\s", "").toLowerCase();
        s2 = s2.replaceAll("\\s", "").toLowerCase();

        // Convert to char arrays
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        // Sort both arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr1, arr2)) {
            System.out.println("Strings are Anagrams");
        } else {
            System.out.println("Strings are NOT Anagrams");
        }
    }
}

