package Array;

public class I_SortElementsInArray {

    public static void main(String[] args) {

        int a[] = {1,5,4,3,2};
        int tmp;
        for (int i=0;i< a.length;i++)   {
            for (int j=i+1;j<a.length;j++) {
                if (a[i] > a[j]) {
                    tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }
        for (int j : a) {
            System.out.println(j);
        }
    }
}
