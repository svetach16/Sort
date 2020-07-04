package org.home;

public final class Sort {
    private Sort() {
    }

    public static void bubble(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j + 1] < a[j]) {
                    int tmp = a[j + 1];

                    a[j + 1] = a[j];
                    a[j] = tmp;
                }
            }
        }
    }

    public static void superBubble(int[] a) {
        boolean wasChanged;

        do {
            wasChanged = false;

            for (int j = 0; j < a.length - 1; j++) {
                if (a[j + 1] < a[j]) {
                    int tmp = a[j];

                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                    wasChanged = true;
                }
            }
        } while (wasChanged);
    }

    public static void select(int[] a) {
        for (int j = 0; j < a.length - 1; j++) {
            int iMin = j;

            for (int i = j + 1; i < a.length; i++) {
                if (a[i] < a[iMin]) {
                    iMin = i;
                }
            }
            int tmp = a[j];

            a[j] = a[iMin];
            a[iMin] = tmp;
        }
    }

    public static void insertion(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j > 0 && (a[j] < a[j - 1]); j--) {
                int tmp = a[j];

                a[j] = a[j - 1];
                a[j - 1] = tmp;
            }
        }
    }

    public static void merge(int[] a) {
        merge(a, new int[a.length], 0, a.length);
    }

    private static void merge(int[] a, int[] tmp, int begin, int end) {
        int len = end - begin;

        if (len <= 1) {
            return;
        }

        int middle = (end + begin) / 2;
        merge(a, tmp, begin, middle);
        merge(a, tmp, middle, end);

        int k = begin;
        int l = middle;

        for (int i = 0; i < len; i++) {
            if ((k == middle) || (l < end && a[k] > a[l])) {
                tmp[i] = a[l++];
            } else {
                tmp[i] = a[k++];
            }
        }
        System.arraycopy(tmp, 0, a, begin, len);
    }


    public static void heap(int[] a) {
        for (int i = a.length / 2; i >= 0; i--) {
            correction(a, i, a.length);
        }
        for (int i = 0; i < a.length - 1; i++) {
            int tmp = a[0];
            a[0] = a[a.length - 1 - i];
            a[a.length - 1 - i] = tmp;
            correction(a, 0, a.length - 1 - i);
        }

    }

    public static void correction(int[] a, int i, int n) {
        while (true) {
            int iRight = i * 2 + 2;
            int iLeft = i * 2 + 1;
            int iMax = i;

            if (iRight < n && a[iMax] < a[iRight]) {
                iMax = iRight;
            }

            if (iLeft < n && a[iMax] < a[iLeft]) {
                iMax = iLeft;
            }

            if (iMax == i) {
                break;
            }

            int tmp = a[i];
            a[i] = a[iMax];
            a[iMax] = tmp;

            i = iMax;
        }

    }
}


