import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        int[] arr = {10, 5, 3, 4, 3, 5};

        HashSet<Integer> set = new HashSet<>();

        for(int x : arr) {

            if(set.contains(x)) {
                System.out.println(x);
                break;
            }

            set.add(x);
        }
    }
}