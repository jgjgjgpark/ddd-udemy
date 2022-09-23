package com.food.ordering.system.order.service.domain;

import java.util.*;

public class StringTest {
    public static void main(String[] args) {

        System.out.println(firstUniqueCharacter("110"));


    }

    private static int firstUniqueCharacter(String data) {
        Map<Character, Integer> counter = new LinkedHashMap<>();
        for (int i = 0; i < data.length(); i++) {
            Character c = data.charAt(i);
            counter.compute(c, (key, oldValue) -> oldValue == null ? 1 : oldValue.intValue() + 1);
        }
        Character character = null;
        for (Map.Entry<Character, Integer> entry : counter.entrySet()) {
            if (entry.getValue().intValue() == 1) {
                character = entry.getKey();
                break;
            }
        }
        if(character == null){
            return -1;
        }
        return data.indexOf(character);
    }

    private static boolean isPalindrum(String input) {
        // Collections.sort()
        int size = input.length();
        if (size == 1 || size == 0) {
            return true;
        } else if (input.length() == 2) {
            return input.charAt(0) == input.charAt(1);
        } else {
            return isPalindrum(input.substring(1, size - 1));
        }
    }

    private void checkNonRepeatedCharacter() {
        StringTest test = new StringTest();
        String sample1 = "ab";
        char result = test.firstNonrepeatedCharacter(sample1);
        System.out.println(result);//a
        String sample2 = "aab";
        result = test.firstNonrepeatedCharacter(sample2);
        System.out.println(result);//b
        String sample3 = "aababc";
        result = test.firstNonrepeatedCharacter(sample3);
        System.out.println(result);//c

    }

    /**
     * @param input
     * @return first non-repeatedCharacter
     * @precondition input != null
     * "aaa" -> throws Exception
     * "a"  -> 'a'
     * "aabbccd" -> 'd'
     */
    private char firstNonrepeatedCharacter(String input) {
        List<Character> characters = new ArrayList<>();
        java.util.Map<Character, Integer> counterMap = new java.util.HashMap<>();
        for (int i = 0; i < input.length(); i++) {
            char temp = input.charAt(i);
            Integer a = counterMap.get(temp);
            if (a == null) {
                characters.add(temp);
                counterMap.put(temp, 1);
            } else {
                counterMap.put(temp, a.intValue() + 1);
            }
        }
        for (char value : characters) {
            if (counterMap.get(value) == 1) {
                return value;
            }
        }
        throw new RuntimeException("no non repeated character");
    }
}
