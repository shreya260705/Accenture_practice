import java.util.*;


public class FirstRepeatingCharacter {
    static char solve(String s){
      HashSet<Character>set=new HashSet<>();
      for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(set.contains(ch)){
            return ch;
        }
        set.add(ch);
      }
      return '-';
    }
}
