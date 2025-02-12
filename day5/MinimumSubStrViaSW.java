package day5;

import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class MinimumSubStrViaSW {

    public static List<String> findSubStr(List<String> current, List<String> required){
        // initialize
        Map<String, Integer> currentTable = new Hashtable<>();
        Map<String, Integer> requiredTable = new Hashtable<>();
        int minStart = 0, minLength=Integer.MAX_VALUE;

        // map required list items to required table(HAshtable)
        for(int index = 0;index<required.size();index++){
            requiredTable.put(required.get(index), requiredTable.getOrDefault(required.get(index), 0)+1);
        }

        System.out.println(requiredTable);

        int right=0,left=0, matched = 0;

        for(;right<current.size();right++){
            currentTable.put(current.get(right), currentTable.getOrDefault(current.get(right), 0)+1);
            if(requiredTable.getOrDefault(current.get(right),0)>0){
                matched++;
            }

            
        }
        System.out.println(currentTable);

        return current;
    }

    public static void main(String[] args) {
        List<String> current = Stream.of(
            "browse","search","addtocart",
            "checkout","feedback"
        ).toList();
        List<String> required = Stream.of(
            "search","checkout"
        ).toList();

        findSubStr(current, required);
    }
}
