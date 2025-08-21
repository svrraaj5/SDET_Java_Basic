package String;

import java.util.HashSet;
import java.util.Set;

public class G_LongestNonRepeatingSubString {

    public static void main(String[] args) {

        String str = "ababcab";
        Set<Character> hset = new HashSet<>();
        int left = 0;
        int maxLength = 0;
        int start = 0;
        for(int right = 0;right<str.length();right++)   {
            char c = str.charAt(right);

            while(hset.contains(c)) {
                hset.remove(str.charAt(left));
                left++;
            }

            hset.add(c);

            int window = right - left +1;

            if(maxLength< window)   {
                maxLength = window;
                start = left;
            }

        }

        String res = str.substring(start, start+maxLength);
        System.out.println(res);
        System.out.println(maxLength);
    }
}
