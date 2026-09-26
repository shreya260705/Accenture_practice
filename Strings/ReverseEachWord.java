import java.util.*;
public class ReverseEachWord {
    static String word(String s){
    String[] words=s.split(" ");
    StringBuilder result=new StringBuilder();
    for(String word:words){
        StringBuilder sb=new StringBuilder(word);
         result.append(sb.reverse()).append(" ");
    }
return result.toString().trim();
    }
    }

