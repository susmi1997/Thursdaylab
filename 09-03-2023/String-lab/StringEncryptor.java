package string_labwork;
import java.util.*;

public class StringEncryptor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String output = encryptString(input);
        System.out.println(output);
    }

    private static String encryptString(String input) {
        StringBuilder sb = new StringBuilder();
        int len = input.length();
        int i = 0;
        while (i < len) {
            int j = i + 1;
            while (j < len && input.charAt(j) == input.charAt(i)) {
                j++;
            }
            int count = j - i;
            String hexCount = Integer.toHexString(count).toLowerCase();
            sb.append(input.charAt(i)).append(hexCount);
            i = j;
        }
        String intermediate = sb.toString();
        StringBuilder reversed = new StringBuilder(intermediate).reverse();
        StringBuilder encrypted = new StringBuilder();
        for (i = 0; i < reversed.length(); i++) {
            char ch = reversed.charAt(i);
            if (ch >= '0' && ch <= '9') {
                encrypted.append((char)('a' + (ch - '0')));
            } else {
                encrypted.append(ch);
            }
        }
        return encrypted.toString();
    }
}
