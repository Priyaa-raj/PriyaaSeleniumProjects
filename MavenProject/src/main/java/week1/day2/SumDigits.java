package week1.day2;

public class SumDigits {
    public static void main(String[] args) {

        int input = 1546;

        String temp = String.valueOf(input);
       // int length = temp.length();
        char[] charArray = temp.toCharArray();
        int sum =0;
        for (char c:charArray) {
            sum = sum+Character.getNumericValue(c);
        }
        System.out.println(sum);


        //Below code of line shows java.lang.OutOfMemoryError: Java heap space exception.
        /*int input = 1546;
        List<Integer> ls = new ArrayList<>();
        while (input > 0) {
            input = input % 10;
            ls.add(input);
        }
        for (int t : ls) {
            System.out.println(t);
        }*/
    }
}

