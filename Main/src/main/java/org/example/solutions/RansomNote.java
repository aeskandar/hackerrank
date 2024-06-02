package org.example.solutions;

import java.util.*;

public class RansomNote {
    public static void solution(List<String> magazine, List<String> note) {

        String couldReplicate = "Yes";
        if(magazine.size() < note.size()) {
            System.out.println("No");
        }
        for (String word : note) {
            if (magazine.contains(word)) {
                magazine.remove(word);
            } else {
                couldReplicate = "No";
            }
        }
        System.out.println(couldReplicate);
    }
}
