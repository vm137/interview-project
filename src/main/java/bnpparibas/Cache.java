package bnpparibas;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Cache {
    // LRE
    private String lastKey;
    private int maxSize; // max
    private Map<String, Integer> map = new LinkedHashMap<>();

    public Cache(int size) {
        this.maxSize = size;
    }

    void put(String key, int value) {
        if (!map.containsKey(key) && map.size() == maxSize) {
            map.put(key, value);
            Set<Map.Entry<String, Integer>> entries = map.entrySet();

            Map<String, Integer> newMap = new LinkedHashMap<>();
            for (Map.Entry<String, Integer> entry : entries) {

            }

            map = new LinkedHashMap<>();
            for (int i = 0; i < maxSize; i++) {

            }
        }
    }

    private void removeLst() {
        //
    }

    int get(String key) {
        return map.get(key);
    }

    public static void main(String[] args) {

    }
}
