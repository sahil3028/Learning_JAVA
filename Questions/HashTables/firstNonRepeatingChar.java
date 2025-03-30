package HashTables;

import java.util.HashMap;

public class firstNonRepeatingChar {
    public class Main {

        public static Character firstNonRepeatingChar(String str) {
            HashMap<Character, Integer> hm = new HashMap<>();

            // First pass: Count occurrences of each character
            for (char c : str.toCharArray()) {
                hm.put(c, hm.getOrDefault(c, 0) + 1);
            }

            // Second pass: Find the first character with a count of 1
            for (char c : str.toCharArray()) {
                if (hm.get(c) == 1) {
                    return c; // Return the first non-repeating character
                }
            }

            return null; // Return null if no non-repeating character is found
        }
}
