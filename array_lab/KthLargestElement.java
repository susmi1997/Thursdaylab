package array_lab;

import java.util.*;

public class KthLargestElement {

    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;
        
        // create a min heap of size k
        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>(k);
        
        // add the first k elements to the min heap
        for (int i = 0; i < k; i++) {
            minHeap.add(arr[i]);
        }
        
        // for the remaining elements, compare with the root of the min heap
        for (int i = k; i < arr.length; i++) {
            if (arr[i] > minHeap.peek()) {
                minHeap.poll();
                minHeap.add(arr[i]);
            }
        }
        
        System.out.println("The " + k + "-th largest element is: " + minHeap.peek());
    }
}
