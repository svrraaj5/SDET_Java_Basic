package Array;

public class E_maxMinArray {

    public static void main(String[] args) {
        int a[] = {11,32,22,34,15};
        int max =a[0];
        int min = a[0];
        for(int i=0;i<a.length;i++) {
            if(a[i]>max)    {
                max = a[i];
            }
        }

        System.out.println("Max is " + max);

        for(int i=0;i<a.length;i++) {
            if(a[i]<min)    {
                min = a[i];
            }
        }

        System.out.println("Min is " + min);

    }
}
