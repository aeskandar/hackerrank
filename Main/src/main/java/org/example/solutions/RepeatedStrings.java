package org.example.solutions;

import java.util.Arrays;
import java.util.stream.Stream;

public class RepeatedStrings {
    public static long solution(String s, long n) {
        long occurrencesInOriginalString = s.chars().filter(c -> c =='a').count();
        long stringLength = (long)s.length();


        long possibleRepetitions = n/stringLength;
        long buffer = n % stringLength;
        long occurrencesInRemainderString = s.substring(0, (int)buffer).chars().filter(c -> c =='a').count();

        return (occurrencesInOriginalString * possibleRepetitions) + occurrencesInRemainderString;
    }
}
