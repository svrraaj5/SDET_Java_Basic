package Basic;

public class B_ReverseANumber {

    public static void main(String[] args) {

        int a = 185;
        int rev = 0;

        System.out.println("I/P " + a);
        // #1

//        while(a!=0) {
//
//            rev = (rev *10)+(a%10);
//            a = a /10;
//        }

        // #2

//        StringBuffer sb = new StringBuffer(String.valueOf(a));
//        StringBuffer revStr = sb.reverse();

        // #3
        StringBuilder sb = new StringBuilder(String.valueOf(a));
        StringBuilder revStr = sb.reverse();

        System.out.println("O/P " + revStr);
    }
}
