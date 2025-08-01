package Array;

public class H_searchElementInArray {

    public static void main(String[] args) {

        int a[] = {1,2,4,5,2};
        boolean found = false;
        int tmp = 22;

        for (int i=0;i< a.length;i++)   {
            if(tmp == a[i]) {
                found = true;
                System.out.println("Found at Position :"+i);
            }
        }

        if(!found)  {
            System.out.println("Nope");
        }
    }
}
