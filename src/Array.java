import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Array class with methods that operate on arrays.
 */
public class Array {

    public static void shuffle(List<Integer> array) {
        for (int i = 0; i < array.size(); i++) {
            int j = (int) (Math.random() * array.size());
            Util.swap(array, i, j);
        }
    }

   public List<Integer> merge(List<Integer> array1, List<Integer> array2) {
       List<Integer> array3 = new ArrayList<>();
       int i = 0;
       int j = 0;
       while (i < array1.size() && j < array2.size()) {
           if (array1.get(i) < array2.get(j)) {
               array3.add(array1.get(i));
               i++;
           } else {
               array3.add(array2.get(j));
               j++;
           }
       }
       while (i < array1.size()) {
           array3.add(array1.get(i));
           i++;
       }
       while (j < array2.size()) {
           array3.add(array2.get(j));
           j++;
       }
       return array3;
   }
    public static int minimum(List<Integer> array) {
        int min = array.get(0);
        for (int i = 1; i < array.size(); i++) {
            if (array.get(i) < min) {
                min = array.get(i);
            }
        }
        return min;
    }
    public static int maximum(List<Integer> array) {
        int max = array.get(0);
        for (int i = 1; i < array.size(); i++) {
            if (array.get(i) > max) {
                max = array.get(i);
            }
        }
        return max;
    }

    public static void removeDuplicates(List<Integer> array) {
        int i = 0;
        while (i < array.size() - 1) {
            int j = i + 1;
            while (j < array.size()) {
                if (Objects.equals(array.get(i), array.get(j))) {
                    array.remove(j);
                } else {
                    j++;
                }
            }
            i++;
        }
    }
    public static int findTheMode(List<Integer> array) {
        int mode = array.get(0);
        int modeCount = 0;
        for (int i = 0; i < array.size(); i++) {
            int count = 0;
            for (Integer integer : array) {
                if (Objects.equals(array.get(i), integer)) {
                    count++;
                }
            }
            if (count > modeCount) {
                mode = array.get(i);
                modeCount = count;
            }
        }
        return mode;
    }
}
