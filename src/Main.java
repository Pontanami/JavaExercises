import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            array.add((int) (Math.random() * 100));
        }
        double time1 = System.currentTimeMillis();
        List<String> array2 = new ArrayList<>();
        array2.add("cat");
        array2.add("bat");
        array2.add("car");
        array2.add("arm");
        array2.add("act");
        array2.add("ram");
        array2.add("rat");
        array2.add("steam");
        array2.add("bare");
        array2.add("tar");
        array2.add("beak");
        array2.add("arc");
        array2.add("bar");
        array2.add("boss");

        SearchAlgorithms.findAnagrams(array2);
        double time2 = System.currentTimeMillis();
        System.out.println("Time: " + (time2 - time1) / 1000 + " seconds");
    }
}
