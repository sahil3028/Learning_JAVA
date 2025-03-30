package HashTables;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class FindDuplicates {
    public static List<Integer> findDuplicates(int[] a) {
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for (int i : a) {
            if (seen.contains(i)) {
                duplicates.add(i);  // O(1) operation
            } else {
                seen.add(i);  // O(1) operation
            }
        }
        return new ArrayList<>(duplicates); // Convert HashSet to List, O(n)
    }
}
