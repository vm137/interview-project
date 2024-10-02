package epam.interview.comparable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class JavaObjectSorting {
    /**
     * This class shows how to sort primitive arrays, Wrapper classes Object Arrays
     *
     * @param args
     */
    public static void main(String[] args) {
        //sort primitives array like int array
        int[] intArr = {5, 9, 1, 10};
        Arrays.sort(intArr);
        System.out.println(Arrays.toString(intArr));

        //sorting String array
        String[] strArr = {"A", "C", "B", "Z", "E"};
        Arrays.sort(strArr);
        System.out.println(Arrays.toString(strArr));

        //sorting list of objects of Wrapper classes
        List<String> strList = new ArrayList<String>();
        strList.add("A");
        strList.add("C");
        strList.add("B");
        strList.add("Z");
        strList.add("E");
        Collections.sort(strList);
        for (String str : strList)
            System.out.print(" " + str);

        //sorting object array
        Employee[] empArr = new Employee[4];
        empArr[0] = new Employee(10, "Mikey", 25, 10000);
        empArr[1] = new Employee(20, "Arun", 29, 20000);
        empArr[2] = new Employee(5, "Lisa", 35, 5000);
        empArr[3] = new Employee(1, "Pankaj", 32, 50000);

        //sorting employees array using Comparable interface implementation
        Arrays.sort(empArr);
        System.out.println("Default Sorting of Employees list:\n" + Arrays.toString(empArr));
    }
}
