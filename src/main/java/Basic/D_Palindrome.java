package Basic;

public class D_Palindrome {

    public static void main(String[] args) {

        //Number
        int a = 1001;
        int tmp=a;
        int rev =0;

        while(a!=0) {
            rev = rev *10 + (a%10);
            a = a/10;
        }

        if(rev == tmp) {
            System.out.println("Palindrome");
        }   else    {
            System.out.println("Not Palindrome");
        }

        //String
        String str = "Malayalam";
        String revString = "";

        for(int i = str.length()-1;i>=0;i--)    {
            revString = revString + str.charAt(i);
        }
        if(revString.equalsIgnoreCase(str)) {
            System.out.println("Palindrome");
        }   else    {
            System.out.println("Not Palindrome");
        }


    }
}
