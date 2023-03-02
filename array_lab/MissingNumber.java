package array_lab;

public class MissingNumber {

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 3, 7, 8};
        int n = 8;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        
        // calculate the actual sum of the array
        for (int i = 0; i < arr.length; i++) {
            actualSum += arr[i];
        }
        
        int missingNumber = expectedSum - actualSum;
        System.out.println("The missing number is: " + missingNumber);
    }
}
