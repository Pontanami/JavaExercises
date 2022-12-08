import java.util.List;

public class SortingAlgorithms {

    public static void inserionSort(List<Integer> array) {
        int i = 0;
        while (i < array.size() - 1) {
            int j = i;
            while (j >= 0 && array.get(j) > array.get(j + 1)) {
                Util.swap(array, j, j + 1);
                j--;
            }
            i++;
        }
    }
    private static void partition(List<Integer> array, int low, int high, int pivotIndex) {
        int pivotValue = array.get(pivotIndex);
        Util.swap(array, pivotIndex, high);
        int storeIndex = low;
        for (int i = low; i < high; i++) {
            if (array.get(i) < pivotValue) {
                Util.swap(array, storeIndex, i);
                storeIndex++;
            }
        }
        Util.swap(array, high, storeIndex);
    }
    public static void selectionSort(List<Integer> array) {
        int i = 0;
        while (i < array.size() - 1) {
            int minIndex = i;
            int j = i + 1;
            while (j < array.size()) {
                if (array.get(j) < array.get(minIndex)) {
                    minIndex = j;
                }
                j++;
            }
            Util.swap(array, i, minIndex);
            i++;
        }
    }
}
