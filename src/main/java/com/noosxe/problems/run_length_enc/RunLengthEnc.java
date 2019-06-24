package com.noosxe.problems.run_length_enc;

/**
 * Run length encoder.
 * A class that can encode "AAAABBBCCDAA" into "4A3B2C1D2A".
 */
public class RunLengthEnc {
    String enc(String input) {
        if (input.length() == 0) {
            return "";
        }

        char[] s = input.toCharArray();

        char prev = s[0];
        int count = 1;

        StringBuilder result = new StringBuilder();

        for (int i = 1; i < s.length; i++) {
            if (s[i] == prev) {
                count++;
            } else {
                result.append(count);
                result.append(prev);

                prev = s[i];
                count = 1;
            }
        }

        result.append(count);
        result.append(prev);

        return result.toString();
    }
}
