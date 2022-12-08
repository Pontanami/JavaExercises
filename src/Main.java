import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){
        List<Integer> array = new ArrayList<>();
        for(int i = 0; i < 100; i++) {
            array.add((int)(Math.random() * 100));
        }
        System.out.println(array);;
        SortingAlgorithms.selectionSort(array);
        System.out.println(array);
    }
}
