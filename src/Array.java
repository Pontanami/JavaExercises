import java.util.ArrayList;
import java.util.List;

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

   public List<Object> merge(List<Object> array1, List<Object> array2) {
       List<Object> array3 = new ArrayList<>();
       int i = 0;
       int j = 0;
       while (i < array1.size() && j < array2.size()) {
           if ((int)array1.get(i) < (int)array2.get(j)) {
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
