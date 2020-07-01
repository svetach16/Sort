package org.home;

public class SuperBubble {
    private SuperBubble() {
    }

    public static void sort(int a[]) {
        boolean wasChanged;

        do {
            wasChanged = false;

            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] > a[i + 1]) {
                    int tmp = a[i];

                    a[i] = a[i + 1];
                    a[i + 1] = tmp;
                    wasChanged = true;
                }
            }
        } while (wasChanged);
    }
}