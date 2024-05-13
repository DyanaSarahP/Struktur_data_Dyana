
package uts.struktur.data;

import java.util.HashMap;
import java.util.Map;
public class Menghitung_Jumlah_Elemen {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 2, 4, 1, 5, 2, 3};

        Map<Integer, Integer> countMap = countElements(numbers);

        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            int element = entry.getKey();
            int count = entry.getValue();
            System.out.println("Elemen " + element + " muncul " + count + " kali");
        }
    }

    public static Map<Integer, Integer> countElements(int[] arr) {
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int element : arr) {
            countMap.put(element, countMap.getOrDefault(element, 0) + 1);
        }

        return countMap;
    }
}
