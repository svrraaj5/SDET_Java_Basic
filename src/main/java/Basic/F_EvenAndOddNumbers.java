package Basic;

public class F_EvenAndOddNumbers {

    public static void main(String[] args) {

        int even_num = 0;
        int odd_num = 0;

        int a = 1526287;

        while (a!=0)    {
            int tmp = a%10;
            if(tmp%2==0)    {
                even_num++;
            }   else    {
                odd_num++;
            }
            a = a/10;
        }
        System.out.println("Even Count : " + even_num);
        System.out.println("Odd Count : " + odd_num);
    }
}
