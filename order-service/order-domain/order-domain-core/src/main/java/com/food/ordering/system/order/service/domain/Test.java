package com.food.ordering.system.order.service.domain;

import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Test {
    public int countDuplicateCharacters(String string) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> dupSet = new HashSet<>();
        for (int i = 0; i < string.length(); i++) {
            Integer value = Integer.valueOf(string.charAt(i));
            if (set.contains(value)) {
                dupSet.add(value);
            }
            set.add(value);
        }
        return dupSet.size();
    }

    public Character findFirstNonRepeatedCharacter(String string) {
        Map<Character, Integer> chars = new HashMap<>();
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            chars.compute(ch, (key, value) -> value == null ? 1 : value++);
        }
        return Character.valueOf((char) 12);
    }


    public String reverseLetter(String letters) {
        StringBuilder builder = new StringBuilder();
        return builder.reverse().toString();
    }

    public String reverseWords1(String str) {

        final Pattern PATTERN = Pattern.compile(" +");

        return PATTERN.splitAsStream(str)
                .map(w -> new StringBuilder(w).reverse())
                .collect(Collectors.joining(" "));
    }

    public String reverseWords2(String str) {
        final String WHITESPACE = " ";

        String[] words = str.split(WHITESPACE);
        StringBuilder reversedString = new StringBuilder();

        for (String word : words) {
            StringBuilder reverseWord = new StringBuilder();

            for (int i = word.length() - 1; i >= 0; i--) {
                reverseWord.append(word.charAt(i));
            }

            reversedString.append(reverseWord).append(WHITESPACE);
        }


        return reversedString.toString();
    }

    Map<Integer, Integer> map = new HashMap<>();

    public int numOfWays(int n) {
        if (n == 0) return 1;
        if (n == 1) return 1;
        if (null != map.get(n)) {
            return map.get(n);
        } else {
            int value = numOfWays(n - 1) + numOfWays(n - 2);
            map.put(n, value);
            return value;
        }
    }

    public static void main(String[] args) {
        Test test = new Test();
        String sentence = "hhhggf hhhh";
        System.out.println(test.numOfWays(1000));

    }
}
