import java.util.*;
public  class FindduplicateElements {
    public static void main(String[] args){
        int [] arr ={ 2,3 4,2, 4,2,5};
        HashSet<Integer>set=new HashSet<>();
        for(int x:arr){
            if(set.contains(x)){
                System.out.println("Duplicate:" +x);
            }
            set.add(x);
        }
    }
}
