package Array;

public class B_EvenAndOddNumInArray {

    public static void main(String[] args) {

        int a[] = {1,3,2,4,5};
        int even_num = 0;
        int odd_num = 0;
        for(int i=0;i<a.length;i++) {
            int tmp = a[i];
            if(tmp%2==0)    {
                even_num++;
            }   else    {
                odd_num++;
            }

        }

        System.out.println("Even Count : " + even_num);
        System.out.println("Odd Count : " + odd_num);
    }
}
