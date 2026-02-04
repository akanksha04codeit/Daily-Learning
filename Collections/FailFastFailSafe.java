package Collections;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFastFailSafe {
    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);

        List<Integer> list2 = new CopyOnWriteArrayList<>();
        list2.add(1);
        list2.add(2);

        // Fail-Fast
        try {
            for (Integer i : list1) {
                list1.add(3);
            }
        } catch (Exception e) {
            System.out.println("Fail-Fast Exception");
        }

        // Fail-Safe
        for (Integer i : list2) {
            list2.add(3);
        }

        System.out.println("Fail-Safe List: " + list2);
    }
}

