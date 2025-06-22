import java.util.ArrayList;
import java.util.Comparator;

/**
 * Provides utility methods for sorting ArrayLists using the selection sort algorithm.
 */
public class SelectionSort {
    /**
     * Sorts an ArrayList using selection sort with a specified comparator.
     *
     * @param <T>       the type of elements in the list
     * @param list      the ArrayList to be sorted
     * @param comparator the comparator to determine the order of elements
     */
    public static <T> void selectionSort(ArrayList<T> list, Comparator<T> comparator) {
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            int minIndex = findMinIndex(list, i, n, comparator);
            swapElements(list, i, minIndex);
        }
    }

    /**
     * Finds the index of the minimum element in the specified range of the list.
     *
     * @param <T>       the type of elements in the list
     * @param list      the ArrayList to search
     * @param start     the starting index of the range
     * @param end       the ending index of the range (exclusive)
     * @param comparator the comparator to determine the order
     * @return the index of the minimum element
     */
    private static <T> int findMinIndex(ArrayList<T> list, int start, int end, Comparator<T> comparator) {
        int minIndex = start;
        for (int j = start + 1; j < end; j++) {
            if (comparator.compare(list.get(j), list.get(minIndex)) < 0) {
                minIndex = j;
            }
        }
        return minIndex;
    }

    /**
     * Swaps two elements in the ArrayList at the specified indices.
     *
     * @param <T>   the type of elements in the list
     * @param list  the ArrayList containing the elements
     * @param i     the index of the first element
     * @param j     the index of the second element
     */
    private static <T> void swapElements(ArrayList<T> list, int i, int j) {
        if (i != j) {
            T temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
        }
    }
}