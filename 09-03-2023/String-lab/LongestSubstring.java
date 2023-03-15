package string_labwork;

import java.util.*;

public class LongestSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int output = findLongestSubstring(input);
        System.out.println(output);
    }

    private static int findLongestSubstring(String input) {
        int len = input.length();
        if (len <= 1) {
            return len;
        }
        int start = 0, end = 0;
        Set<Character> set = new HashSet<>();
        int maxLength = 0;
        while (end < len) {
            if (!set.contains(input.charAt(end))) {
                set.add(input.charAt(end));
                end++;
                maxLength = Math.max(maxLength, end - start);
            } else {
                set.remove(input.charAt(start));
                start++;
            }
        }
        return maxLength;
    }
}
