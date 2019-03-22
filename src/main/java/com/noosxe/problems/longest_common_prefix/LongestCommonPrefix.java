package com.noosxe.problems.longest_common_prefix;

/**
 * Solution to a longest common prefix searching problem.
 * Time complexity: O(S), where S is total number of characters in all strings.
 * Space complexity is O(1).
 */
class LongestCommonPrefix {

    private static String longestCommonPrefix(String[] strings) {
        if (strings.length == 0) return "";

        String prefix = strings[0];

        for (int i = 0; i < strings.length; i++) {
            while (strings[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);

                if (prefix.isEmpty()) return "";
            }
        }

        return prefix;
    }

    public static void main(String[] args) {
        String[] strings = {"flower","flow","flight"};

        String result = longestCommonPrefix(strings);

        assert "fl".equals(result) : "Wrong answer";
        System.out.println("Right answer"); 
    }
}
