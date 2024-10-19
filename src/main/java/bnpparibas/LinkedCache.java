package bnpparibas;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Task: write a key-value cache that pops-up on last-used element (put or get) cash should have
 * limited configurable size, defined at configuration the oldest used element should be removed
 * when max size is reached
 * --- reference for LinkedHashMap
 * <a href="https://habr.com/ru/articles/129037/">article</a>
 */
public class LinkedCache {
    private final int size;
    private Map<String, Integer> map;

    public LinkedCache(int size) {
        this.size = size;
        map = new LinkedHashMap<>(size, 0.75f, true);
    }

    public void put(String key, int value) {
        if (map.size() == size) {
            removeLast();
        }
        map.put(key, value);
    }

    private void removeLast() {
        int count = 0;
        Map<String, Integer> newMap = new LinkedHashMap<>(size, 0.75f, true);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (count == 0) {
                count++;
                continue;
            }
            newMap.put(entry.getKey(), entry.getValue());
        }
        this.map = newMap;
    }

    public Integer get(String key) {
        return map.get(key);
    }

    public void printMap() {
        System.out.println(map.toString());
    }

    public static void main(String[] args) {
        LinkedCache cache = new LinkedCache(3);
        cache.put("a", 1);
        cache.put("b", 2);
        cache.put("c", 3);
        cache.get("a");
        cache.put("d", 4);

        System.out.println(cache.get("a"));
        System.out.println(cache.get("b"));

        cache.printMap();
    }
}
