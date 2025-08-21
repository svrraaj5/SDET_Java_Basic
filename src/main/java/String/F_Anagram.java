package String;

import java.util.Arrays;

public class F_Anagram {

    public static boolean isAnagram(String a, String b)    {
        if(a.length() != b.length())    {
            return false;
        }

        char[] c1 = a.toCharArray();
        char[] c2 = b.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        return Arrays.equals(c1, c2);
    }
    public static void main(String[] args) {

        String a = "alwar";
        String b = "waral";
        System.out.println(isAnagram(a,b));

    }
}
