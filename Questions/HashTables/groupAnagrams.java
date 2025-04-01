package HashTables;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class groupAnagrams {

    public List<List<String>> groupAnagrams( String[] string){
        HashMap<String, List<String>> hs=new HashMap<>();
        for(String i:string){
            char[] ch=i.toCharArray();
            Arrays.sort(ch);
            String sortStr=new String(ch);

            hs.putIfAbsent(sortStr,new ArrayList<>());
            hs.get(sortStr).add(i);

        }
        return new ArrayList<>(hs.values());
    }
}
