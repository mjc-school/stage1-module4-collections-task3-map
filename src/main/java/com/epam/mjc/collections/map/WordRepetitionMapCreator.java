package com.epam.mjc.collections.map;

import java.util.*;


public class WordRepetitionMapCreator {

    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> map = new HashMap<>();
        StringTokenizer s = new StringTokenizer(sentence, " .,");
        while (s.hasMoreTokens()){
            String letter = s.nextToken().toLowerCase();
            map.put(letter, map.getOrDefault(letter, 0)+1);
        }

        return map;
    }
}
