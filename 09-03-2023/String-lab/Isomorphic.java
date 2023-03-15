package string_labwork;

import java.util.*;

public class Isomorphic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        boolean isIsomorphic = checkIsomorphic(str1, str2);
        System.out.println(isIsomorphic);
    }

    private static boolean checkIsomorphic(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        Map<Character, Character> map = new HashMap<>();
        Set<Character> set = new HashSet<>();
        int len = str1.length();

        for (int i = 0; i < len; i++) {
            char c1 = str1.charAt(i);
            char c2 = str2.charAt(i);

            if (map.containsKey(c1)) {
                if (map.get(c1) != c2) {
                    return false;
                }
            } else {
                if (set.contains(c2)) {
                    return false;
                }
                map.put(c1, c2);
                set.add(c2);
            }
        }

        return true;
    }
}
