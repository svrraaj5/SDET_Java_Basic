package String;

public class B_totalWordsInString {

    public static void main(String[] args) {

        String s = "Paxcom A Paymentus Company";
        int count = 1;
        for(int i=0;i<s.length();i++)   {
            if((s.charAt(i)==' ')&&(s.charAt(i+1)!=' '))    {
                count++;
            }
        }
        System.out.println(count);
    }
}
