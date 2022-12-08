import java.util.List;

public class SearchAlgorithms {
    public static int binarySearch(List<Integer> array, int key) {
        int low = 0;
        int high = array.size() - 1;
        boolean isAscending = array.get(low) < array.get(high);
        while (low <= high) {
            int mid = (low + high) / 2;
            if (array.get(mid) == key) {
                return mid;
            }
            if (isAscending) {
                if (key < array.get(mid)) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            else {
                if (key > array.get(mid)) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
        }
        return -1;
    }

    public static int binarySearchRecursive(List<Integer> array, int key) {
        int low = 0;
        int high = array.size() - 1;
        return binarySearchRecursive(array, key, low, high);
    }

    private static int binarySearchRecursive(List<Integer> array, int key, int low, int high) {
        if (low > high) {
            return -1;
        }
        int mid = (low + high) / 2;
        if (array.get(mid) == key) {
            return mid;
        }
        if (key < array.get(mid)) {
            return binarySearchRecursive(array, key, low, mid - 1);
        } else {
            return binarySearchRecursive(array, key, mid + 1, high);
        }
    }
    public static int integer_square_root(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be >= 0");
        }
        if (n <= 1) {
            return n;
        }
        int low = 0;
        int high = n;
        while (low <= high) {
            int mid = (low + high) / 2;
            int mid_squared = mid * mid;
            if (mid_squared == n) {
                return mid;
            }
            if (mid_squared < n) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return high;
    }

    public int minimum(List<Integer> array) {
        int min = array.get(0);
        for (int i = 1; i < array.size(); i++) {
            if (array.get(i) < min) {
                min = array.get(i);
            }
        }
        return min;
    }
}
