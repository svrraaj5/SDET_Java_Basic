package String;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class C_HashMap_NumberofLetters {

    public static void main(String[] args) {
        String s = "Saravanan";
        Map<Character,Integer> hmap = new LinkedHashMap<>();

        for(int i=0;i<s.length();i++)   {
            if(hmap.containsKey(s.charAt(i)))   {
                hmap.put(s.charAt(i), hmap.get(s.charAt(i))+1);
            } else {
                hmap.put(s.charAt(i),1);
            }
        }

        System.out.println(hmap);
        for(Map.Entry<Character, Integer> entry : hmap.entrySet())  {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
