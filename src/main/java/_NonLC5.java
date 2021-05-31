package main.java;

public class _NonLC5 {
    private static String integerToAscii(int num) {
        StringBuilder sb = new StringBuilder();
        while (num > 0) {
            int lastDigit = num % 10;
            char ch = (char) ('0' + lastDigit);

            // since we are processing the last digit first(reverse order),
            // inserting at 0th position so that output is not in reverse order.
            sb.insert(0, ch);
            num /= 10;
        }
        return sb.toString();
    }
}
