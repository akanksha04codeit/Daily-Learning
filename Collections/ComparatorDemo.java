package Collections;

import java.util.*;

public class ComparatorDemo {
    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();
        list.add(new Student(1, "Rahul"));
        list.add(new Student(3, "Amit"));
        list.add(new Student(2, "Sneha"));

        Collections.sort(list, (a, b) -> a.name.compareTo(b.name));

        System.out.println("Sorted by Name:");
        System.out.println(list);
    }
}

