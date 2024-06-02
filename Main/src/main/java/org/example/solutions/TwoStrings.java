package org.example.solutions;

import java.util.HashSet;
import java.util.Set;

public class TwoStrings {

    public static String solution(String s1, String s2) {

        Set<Character> firstSet = new HashSet<>(s1.chars().mapToObj(c -> (char) c).toList());
        Set<Character> secondSet = new HashSet<>(s2.chars().mapToObj(c -> (char) c).toList());

        firstSet.retainAll(secondSet);
        return  firstSet.isEmpty() ? "NO" : "YES";

    }

}
