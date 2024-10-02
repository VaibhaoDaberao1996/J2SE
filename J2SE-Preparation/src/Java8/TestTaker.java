package Java8;
import java.util.*;

public class TestTaker {

    public static String[] findMaxAnagramGroup(String words) {
        // Split the input string into individual words
        String[] wordArray = words.split(" ");

        // Create a map to store the anagram groups
        Map<String, List<String>> anagramGroups = new HashMap<>();

        // Iterate through each word
        for (String word : wordArray) {
            // Sort the characters of the word
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);

            // Add the word to the corresponding anagram group
            if (!anagramGroups.containsKey(sortedWord)) {
                anagramGroups.put(sortedWord, new ArrayList<>());
            }
            anagramGroups.get(sortedWord).add(word);
        }

        // Find the largest anagram group
        List<String> largestGroup = new ArrayList<>();
        for (List<String> group : anagramGroups.values()) {
            if (group.size() > largestGroup.size()) {
                largestGroup = group;
            }
        }

        // Convert the list to an array and return it
        return largestGroup.toArray(new String[0]);
    }

    public static void main(String[] args) {
        String words = "eat tea tan ate nat bat";
        String[] result = findMaxAnagramGroup(words);
        System.out.println(Arrays.toString(result));
    }
}