package HashTables;

import java.util.HashMap;

public class twoSum {
    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer> hs=new HashMap<>();
        for(int i=0;i< nums.length;i++){
            int compliment=target-nums[i];
            if(hs.containsKey(compliment)) return new int[]{i,hs.get(compliment)};
            else hs.put(nums[i],i);
        }
        return new int[]{};
    }
}
