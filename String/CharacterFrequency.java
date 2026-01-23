package String;

// Program 4: Count frequency of each character
import java.util.HashMap;

public class CharacterFrequency {
    public static void main(String[] args) {
        String input = "hello world";
        HashMap<Character, Integer> freq = new HashMap<>();

        for (char ch : input.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }

        System.out.println("Character Frequency: " + freq);
    }
}
