package com.noosxe.problems.run_length_dec;

/**
 * Run length decoder.
 * A class that can decode "4A3B2C1D2A" into "AAAABBBCCDAA".
 */
public class RunLengthDec {
    String dec(String input) {
        if (input.length() == 0) {
            return "";
        }

        StringBuilder builder = new StringBuilder();

        char[] s = input.toCharArray();
        for (int i = 0; i < s.length; i+=2) {
            int c = s[i] - '0';

            while (c > 0) {
                builder.append(s[i+1]);
                c--;
            }
        }

        return builder.toString();
    }
}
