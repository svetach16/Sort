import org.home.sort.Sort;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestSort {
    final int size = 10_000;
    int[] array;

    @BeforeEach
    public void fill() {
        array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = -i;
        }
    }

    @AfterEach
    public void check() {
        check(array);
    }

    @Test
    public void testSelection() {
        Sort.selection(array);
    }

    @Test
    public void testMerge() {
        Sort.merge(array);
    }

    @Test
    public void testInsertion() {
        Sort.insertion(array);
    }

    @Test
    public void testHeap() {
        Sort.heap(array);
    }

    @Test
    public void testSuperBubble() {
        Sort.superBubble(array);
    }

    @Test
    public void testBubble() {
        Sort.bubble(array);
    }

    @Test
    public void testQuick() {
        Sort.quick(array, 0, array.length);
    }

    private void check(final int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                throw new IllegalArgumentException("Array isn't sorted");
            }
        }
    }
}
