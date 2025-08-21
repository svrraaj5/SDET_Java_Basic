package String;

import java.util.LinkedHashMap;
import java.util.Map;

public class E_firstNonRepeatingCharacterInString {

    public static Character getCharacter(String str)   {

        if(str.isEmpty() || str == null)    {
            return null;
        }

        Map<Character, Integer> hmap = new LinkedHashMap<>();

        for(char c : str.toCharArray()) {
            hmap.put(c, hmap.getOrDefault(c,0)+1);
        }

        System.out.println(hmap);
        for(Map.Entry<Character, Integer> entry : hmap.entrySet())  {
            if(entry.getValue() == 1) {
                Character value = entry.getKey();
                return value;
            }
        }

        return null;
    }

    public static void main(String[] args) {
        String str = "Saravanan";
        Character s = getCharacter(str);
        System.out.println(s);
    }
}
