import java.util.*;

public class CharacterFrequency {
    static void solve(String s){
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(char ch:map.keySet()){
            System.out.println(ch + "=" +map.get(ch));
        }
    }
}
