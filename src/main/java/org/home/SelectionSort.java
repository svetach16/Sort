package org.home;

public class SelectionSort {
    private SelectionSort() {
    }

    public static void sort(int a[]) {
        for (int j = 0; j < a.length - 1; j++) {
            int iMin = j;

            for (int i = j; i < a.length; i++) {
                if (a[i] < a[iMin]) {
                    iMin = i;
                }
            }
            int tmp = a[j];
            a[j] = a[iMin];
            a[iMin] = tmp;
        }
    }
}