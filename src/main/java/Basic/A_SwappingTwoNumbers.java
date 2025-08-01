package Basic;

public class A_SwappingTwoNumbers {

    public static void main(String[] args) {
        int a =10;  //1010
        int b =20;  //10100
        int tmp;

        System.out.println("Before a : " + a);
        System.out.println("Before b : " +b);

//        tmp=a;
//        a=b;
//        b=tmp;

//        a= a+b;
//        b = a-b;
//        a = a-b;

//        a = a*b;
//        b = a/b;
//        a = a/b;

        //bitwise
//        a = a^b;
//        b = a^b;
//        a = a^b;

        //single

        b = a+b - (a=b);

        System.out.println("After a : " + a);
        System.out.println("After b : " +b);

    }
}
