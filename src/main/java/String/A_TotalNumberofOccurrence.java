package String;

public class A_TotalNumberofOccurrence {

    public static void main(String[] args) {
        String s = "Saravanan";
        int len = s.length();
        int aftLen = s.replace("a","").length();
        int count = len - aftLen;
        System.out.println(count);
    }
}
