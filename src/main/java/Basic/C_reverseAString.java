package Basic;

public class C_reverseAString {

    public static void main(String[] args) {

        String s = "Saravanan";
        String rev = "";
        System.out.println("I/P " + s);
//        #1

//        for(int i = s.length()-1;i>=0;i--)  {
//            rev = rev + s.charAt(i);
//        }

//        #2
        StringBuilder sb = new StringBuilder(s);
        StringBuilder revStr = sb.reverse();
        System.out.println("I/P " + revStr);

    }
}
