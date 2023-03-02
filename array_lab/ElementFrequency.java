package array_lab;

import java.util.*;

public class ElementFrequency {

    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 5, 4, 3, 1, 3, 4};
        int n = arr.length;
        Map<Integer, Integer> freqMap = new HashMap<Integer, Integer>();
        
        // count the frequency of each element
        for (int i = 0; i < n; i++) {
            int key = arr[i];
            if (freqMap.containsKey(key)) {
                freqMap.put(key, freqMap.get(key) + 1);
            } else {
                freqMap.put(key, 1);
            }
        }
        
        // print the frequency of each element
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            System.out.println(entry.getKey() + " appears " + entry.getValue() + " times");
        }
    }
}
