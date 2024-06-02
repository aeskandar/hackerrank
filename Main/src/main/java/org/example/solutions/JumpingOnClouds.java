package org.example.solutions;

import java.util.List;

public class JumpingOnClouds {

    public static int solution(List<Integer> clouds) {
        int jumps = 0;

        while (clouds.size() != 1) {
            if (clouds.size() > 2 && clouds.get(2) == 0) {
                clouds = clouds.subList(2, clouds.size());
            } else {
                clouds = clouds.subList(1, clouds.size());
            }
            jumps++;
        }
        return jumps;
    }
}
