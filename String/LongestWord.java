package String;

// Program 7: Find the longest word in a sentence
public class LongestWord {
    public static void main(String[] args) {
        String sentence = "Java programming makes development powerful";
        
        String[] words = sentence.split(" ");
        String longest = "";

        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }

        System.out.println("Sentence: " + sentence);
        System.out.println("Longest Word: " + longest);
        System.out.println("Length: " + longest.length());
    }
}

