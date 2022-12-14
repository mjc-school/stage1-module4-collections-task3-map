package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {

    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> map = new HashMap<>();
        for (Map.Entry<Integer, String> source : sourceMap.entrySet()){
            if (map.containsKey(source.getValue())){
                if (map.get(source.getValue()) > source.getKey()) {
                    map.put(source.getValue(), source.getKey());
                }
            }else {
                map.put(source.getValue(), source.getKey());
            }
        }
        return map;
    }
}
