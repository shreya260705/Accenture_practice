import java.util.HashMap;

public class MostFrequentElements {
    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 2, 1};

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int x : arr) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        int mostFrequent = arr[0];

        for(int x : map.keySet()) {

            if(map.get(x) > map.get(mostFrequent)) {
                mostFrequent = x;
            }
        }

        System.out.println(mostFrequent);
    }
}
