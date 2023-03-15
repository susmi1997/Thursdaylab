package string_labwork;

import java.util.*;

public class PalindromicSubstrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Set<String> output = findPalindromicSubstrings(input);
        System.out.println(output);
    }

    private static Set<String> findPalindromicSubstrings(String input) {
        Set<String> set = new HashSet<>();
        int len = input.length();
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j <= len; j++) {
                String substring = input.substring(i, j);
                if (isPalindrome(substring)) {
                    set.add(substring);
                }
            }
        }
        return set;
    }

    private static boolean isPalindrome(String s) {
        int len = s.length();
        for (int i = 0; i < len / 2; i++) {
            if (s.charAt(i) != s.charAt(len - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
