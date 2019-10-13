package week1.day2;

public class OddUpp {
    public static void main(String[] args) {

        String input ="changeme";

        char[] toCharArray = input.toCharArray();

        int length = toCharArray.length;

        for (int i = 0; i < length ; i++) {

            if(i!=0 && i%2!=0)
            {
                System.out.print(Character.toUpperCase(toCharArray[i]));
            }
            else
            {
                System.out.print(toCharArray[i]);
            }

        }

    }
}
