package Array;

public class C_EqualityOfArrays {
    public static void main(String[] args) {
        int a[] = {1,2,3,5,6};
        int b[] = {1,2,3,4,6,1};
        boolean status = true;
        if(a.length == b.length)    {
            for (int i=0;i<a.length;i++)    {
                if(a[i] != b[i])    {
                    status = false;
                }
            }
            if(status == true)  {
                System.out.println("Equal");
            }   else {
                System.out.println("Not Equal");
            }
        }   else    {
            System.out.println("Size aint equal");
        }

    }
}
