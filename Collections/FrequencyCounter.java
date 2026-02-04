package Collections;

import java.util.*;

public class FrequencyCounter {
    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 3, 3, 4};
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        System.out.println("Element Frequencies:");
        map.forEach((k, v) -> System.out.println(k + " -> " + v));
    }
}

