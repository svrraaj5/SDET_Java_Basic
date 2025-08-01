package Array;

public class G_DuplicatenArray {
    public static void main(String[] args) {

        boolean duplicate = false;

        int a[] = {1,2,3,4,1,5};
        for (int i=0;i< a.length;i++)   {
            for (int j=i+1;j<a.length;j++)  {
                if(a[i]==a[j])  {
                    System.out.println("Found Duplicate : "+ a[i] + " position :" + i);
                    duplicate = true;
                }
            }
        }

        if(!duplicate)    {
            System.out.println("No duplicate");
        }
    }
}
