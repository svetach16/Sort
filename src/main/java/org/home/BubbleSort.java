package org.home;

public class BubbleSort {
    private BubbleSort() {
    }

    public static void sort(int[] a) {
        for (int j = 0; j < a.length - 1; j++) {
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] > a[i + 1]) {
                    int tmp = a[i];

                    a[i] = a[i + 1];
                    a[i + 1] = tmp;
                }
            }
        }
    }
}
