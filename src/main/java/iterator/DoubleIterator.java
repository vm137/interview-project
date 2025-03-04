package iterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class DoubleIterator<T> implements Iterator<T> {
    Iterator<T> first;
    Iterator<T> second;
    Iterator<T> current;

    public DoubleIterator(Iterator<T> first, Iterator<T> second) {
        this.first = first;
        this.second = second;
        current = first;
    }

    @Override
    public boolean hasNext() {
        if (!current.hasNext()) {
            if (second.equals(current)) {
                return false;
            }
            current = second;
        }
        return current.hasNext();
    }

    @Override
    public T next() {
        return current.next();
    }

    @Override
    public void remove() {
        current.remove();
        // зачем это я не понял
        // Iterator.super.remove();
    }

    public static void main(String[] args) {
        List<String> places = Arrays.asList("London", "Paris", "New York");
        List<String> numbers = Arrays.asList("one", "two", "three");

        DoubleIterator<String> di = new DoubleIterator<>(places.iterator(), numbers.iterator());
        while (di.hasNext()) {
            System.out.println(di.next());
        }
    }
}
