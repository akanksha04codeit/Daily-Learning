package Collections;

import java.util.*;

class Student implements Comparable<Student> {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int compareTo(Student s) {
        return this.id - s.id;
    }

    public String toString() {
        return id + " " + name;
    }
}

public class ComparableDemo {
    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();
        list.add(new Student(3, "Rahul"));
        list.add(new Student(1, "Amit"));
        list.add(new Student(2, "Sneha"));

        Collections.sort(list);
        System.out.println(list);
    }
}

