package com.noosxe.problems.roman_to_integer;

import java.util.*;

class RomanToInteger {

    private int romanToInt(String s) {
        Map<Character, Integer> symbolMap = new HashMap<>();
        symbolMap.put('I', 1);
        symbolMap.put('V', 5);
        symbolMap.put('X', 10);
        symbolMap.put('L', 50);
        symbolMap.put('C', 100);
        symbolMap.put('D', 500);
        symbolMap.put('M', 1000);

        int[] dec = new int[s.length()];

        int acc = 0;

        for (int i = 0; i < s.length(); i++) {
            dec[i] = symbolMap.get(s.charAt(i));
        }

        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 1) {
                if (dec[i+1] > dec[i]) {
                    acc += (dec[i+1] - dec[i]);
                    i++;
                    continue;
                }
            }

            acc += dec[i];
        }

        return acc;
    }

    public static void main(String[] args) {
        RomanToInteger romanToInteger = new RomanToInteger();
        System.out.println(romanToInteger.romanToInt("III"));
        System.out.println(romanToInteger.romanToInt("IV"));
        System.out.println(romanToInteger.romanToInt("IX"));
        System.out.println(romanToInteger.romanToInt("LVIII"));
        System.out.println(romanToInteger.romanToInt("MCMXCIV"));
    }
}
