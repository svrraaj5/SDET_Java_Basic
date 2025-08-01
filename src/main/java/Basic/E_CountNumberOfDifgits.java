package Basic;

public class E_CountNumberOfDifgits {

    public static void main(String[] args) {

        int a = 16272;
        int count =0;

        while(a!=0) {
            count++;
            a = a/10;
        }
        System.out.println("Count : " + count);
    }
}
