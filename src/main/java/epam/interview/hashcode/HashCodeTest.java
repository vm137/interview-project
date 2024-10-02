package epam.interview.hashcode;

import java.util.HashMap;
import java.util.Map;

public class HashCodeTest {
    public static void main(String[] args) {
        Map<Student, String> map = new HashMap<>();

        Student s1 = new Student(1, "name-1");
        Student s2 = new Student(2, "name-2");
        Student s3 = new Student(1, "name-1");

        map.put(s1, "one");
        map.put(s2, "two");
        map.put(s3, "three");

        System.out.println(map.get(s1));
        System.out.println(map.get(s2));
        System.out.println(map.get(s3));

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());

        System.out.println(s1.equals(s3));
    }
}
