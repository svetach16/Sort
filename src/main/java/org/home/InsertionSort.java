package org.home;

public class InsertionSort {
    private InsertionSort() {
    }

    public static void sort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int j = i - 1;
            int el = a[i];

            while (j >= 0 && a[j] > el) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = el;
        }
    }
}