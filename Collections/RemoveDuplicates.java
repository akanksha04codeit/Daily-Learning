package Collections;

import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 2, 4, 1, 5);

        Set<Integer> unique = new HashSet<>(list);

        System.out.println("Original List: " + list);
        System.out.println("After Removing Duplicates: " + unique);
    }
}

