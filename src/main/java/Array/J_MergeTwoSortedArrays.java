package Array;

import java.util.Arrays;

public class J_MergeTwoSortedArrays {

    public static int[] mergeArrays(int a[],int b[])   {
        int n1 = a.length;
        int n2 = b.length;
        int[] m = new int[n1+n2];
        int i=0;
        int j=0;
        int k=0;
        while (i<n1 && j<n2) {
            if (a[i] < b[j]) {
                m[k++] = a[i++];
            } else {
                m[k++] = b[j++];
            }
        }

            while (i<n1)    {
                m[k++] = a[i++];
            }

            while (j<n2)    {
                m[k++] = b[j++];
            }
        return m;
        }


    public static void main(String[] args) {
        int a[] = {3,4,6,7};
        int b[] = {5,8};
        int c[] = mergeArrays(a,b);

        System.out.println(Arrays.toString(c));
    }
}
