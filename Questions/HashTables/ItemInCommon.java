
package HashTables;

import java.util.HashMap;

public class ItemInCommon {

        public boolean itemInCommon(int[] array1, int[] array2) {
            HashMap<Integer, Boolean> myHashMap = new HashMap<>();

            for (int i : array1) {
                myHashMap.put(i, true);
            }

            for (int j : array2) {
                if (myHashMap.get(j) != null) return true;
            }

            return false;
        }

    }


