package org.example.solutions;

import java.util.*;

public class StringsApi {

    public static String reverseStringWithApi(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        return stringBuilder.reverse().toString();
    }

    public static boolean isAnagram(String first, String second) {
        if (first.length() != second.length()) {
            return false;
        }
        List<Character> firstList = new ArrayList<>(first.chars().mapToObj(c -> (char) c).toList());
        List<Character> secondList = new ArrayList<>(second.chars().mapToObj(c -> (char) c).toList());



        firstList.retainAll(secondList);
        ;
        return firstList.size() == secondList.size();
    }

    public static String reverseStringRudimentary(String str) {

        String newString = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            newString = newString + str.charAt(i);
        }

        return newString;

    }

    public static void findFirstNonRepeatingCharacter(String str) {

        Map<Character, Integer> frequencyMap = new LinkedHashMap<>();

        String reversedString = reverseStringWithApi(str);

        for(char c : reversedString.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        char c = '1';
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() == 1) {
                c = entry.getKey();
            }
        }

        if (c == 1) {
            System.out.println("no non repeating characters in the string");
        } else {
            System.out.println("char is " + c);
        }


    }

}

