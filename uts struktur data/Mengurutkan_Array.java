
package uts.struktur.data;

import java.util.Arrays;
public class Mengurutkan_Array {
    public static void main(String[] args) {
        String[] names = {"Zara", "Emily", "John", "Michael", "Alice", "Bob", "David"};

        System.out.println("Original Array: " + Arrays.toString(names));

        // Insertion Sort
        System.out.println("\nInsertion Sort:");
        insertionSort(names);
        System.out.println("Sorted Array: " + Arrays.toString(names));

        // Reset the array to its original state
        names = new String[]{"Zara", "Emily", "John", "Michael", "Alice", "Bob", "David"};

        // Selection Sort
        System.out.println("\nSelection Sort:");
        selectionSort(names);
        System.out.println("Sorted Array: " + Arrays.toString(names));

        // Reset the array to its original state
        names = new String[]{"Zara", "Emily", "John", "Michael", "Alice", "Bob", "David"};

        // Bubble Sort
        System.out.println("\nBubble Sort:");
        bubbleSort(names);
        System.out.println("Sorted Array: " + Arrays.toString(names));
        }

    // Insertion Sort
    public static void insertionSort(String[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            String key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].compareTo(key) > 0) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    // Selection Sort
    public static void selectionSort(String[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j].compareTo(arr[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            String temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    // Bubble Sort
    public static void bubbleSort(String[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}

