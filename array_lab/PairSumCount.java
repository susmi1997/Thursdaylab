package array_lab;

import java.util.*;

public class PairSumCount {

    public static void main(String[] args) {
        int[] arr = {1, 5, 7, -1};
        int sum = 6;
        int n = arr.length;
        int count = 0;
        Set<Integer> set = new HashSet<Integer>();
        
        for (int i = 0; i < n; i++) {
            int complement = sum - arr[i];
            if (set.contains(complement)) {
                count++;
            }
            set.add(arr[i]);
        }
        
        System.out.println(count);
    }
}
