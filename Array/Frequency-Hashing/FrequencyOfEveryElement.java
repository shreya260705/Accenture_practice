import java.util.*;

public class FrequencyOfEveryElement {
    public static void main(String[] args) {

        int[] arr = {2, 3, 4, 5, 6, 7, 8, 2, 3, 4, 2, 3, 2, 7};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int x : arr) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        System.out.println(map);
    }
}