package String;

public class D_reverseAWordWithoutChangingPosition {
    public static void main(String[] args) {
        String str = "Saravanan veeran Rajendran";
        String[] words = str.split(" ");

        for(int i=0;i<words.length;i++) {
            String s = words[i];
            char[] charArray = s.toCharArray();

            for(int j=charArray.length -1 ; j>=0;j--)   {
                System.out.print(charArray[j]);
            }

            if(i< words.length-1)   {
                System.out.print(" ");
            }
        }



    }
}
