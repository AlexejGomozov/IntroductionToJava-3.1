package StringsAndBasicsOfTextProcessing;

/*
 * В строке найти количество цифр.
 */

public class Task1_3 {

	public static void main(String[] args) {
        String str = "s5a78s2a14d 54asd a545da 661da";
        Task1_3.findDigits(str);
    }

    private static void findDigits(String strings) {
        char[] array = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        int count = 0;
        for (int i = 0; i < strings.length(); i++) {
            for (int j = 0; j < array.length; j++) {
                if (strings.charAt(i) == array[j]) {
                    count++;
                }
            }
        }
        System.out.print("The quantity of digits: " + count);
    }
}
//The quantity of digits: 14