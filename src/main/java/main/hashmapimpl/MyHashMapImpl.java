package main.hashmapimpl;

import java.util.Map;
import java.util.Objects;

public class MyHashMapImpl<K, V> implements MyMapInterface<K, V> {

    static final int DEFAULT_INITIAL_CAPACITY = 1 << 4; // aka 16
    static final float DEFAULT_LOAD_FACTOR = 0.75f;

    Node<K, V>[] table;
    int size;

    public MyHashMapImpl() {
        this.size = DEFAULT_INITIAL_CAPACITY;
        table = (Node<K, V>[]) new Node[size];
    }

    static class Node<K, V> {
        final int hash;
        final K key;
        V value;
        Node<K, V> next;

        public Node(int hash, K key, V value, Node<K, V> next) {
            this.hash = hash;
            this.key = key;
            this.value = value;
            this.next = next;
        }

        public final K getKey() {
            return key;
        }

        public final V getValue() {
            return value;
        }

        public final String toString() {
            return key + "=" + value;
        }

        public final int hashCode() {
            return Objects.hashCode(key) ^ Objects.hashCode(value);
        }

        public final V setValue(V newValue) {
            V oldValue = value;
            value = newValue;
            return oldValue;
        }

        public final boolean equals(Object o) {
            if (o == this)
                return true;

            return o instanceof Map.Entry<?, ?> e
                && Objects.equals(key, e.getKey())
                && Objects.equals(value, e.getValue());
        }
    }

    static int hash(Object key) {
        int h;
        return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
    }

    @Override
    public void put(K key, V value) {
        int hash = hash(key);
        int index = getIndex(hash);
        Node<K, V> newNode = new Node<>(hash, key, value, table[index]);
        // check: if such key already exists (then rewrite node)
        table[index] = newNode;
    }

    @Override
    public V get(K key) {
        int hash = hash(key);
        int index = getIndex(hash);
        Node<K, V> node = table[index];
        while (node != null) {
            if (Objects.equals(node.getKey(), key)) {
                return node.getValue();
            }
            node = node.next;
        }
        return null;
    }

    private int getIndex(int hash) {
        return hash & (size - 1);
    }

    public static void main(String[] args) {
        MyHashMapImpl mmi = new MyHashMapImpl();

        for (int i = 0; i < 100; i++) {
            mmi.put("key-" + i, "value-" + i);
        }
    }
}
