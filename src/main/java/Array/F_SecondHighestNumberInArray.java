package Array;

public class F_SecondHighestNumberInArray {

    public static void main(String[] args) {

        int a[] = {11,32,22,34,15};
        Integer highest = null;
        Integer secondHighest = null;

        for(int i : a)  {
            if(highest==null ||i>highest)    {
                secondHighest = highest;
                highest = i;
            } else if ((i!=highest)&&(i>secondHighest||secondHighest==null)) {
                secondHighest = i;
            }
        }

        System.out.println("Second Highest : " + secondHighest);

    }
}
