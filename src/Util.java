import java.util.List;

public class Util {

    public static <E> void swap(List<E> array, int i, int j) {
        E temp = array.get(i);
        array.set(i, array.get(j));
        array.set(j, temp);
    }
}
