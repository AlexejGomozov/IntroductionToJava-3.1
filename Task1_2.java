package StringsAndBasicsOfTextProcessing;

/*
 * Замените в строке все вхождения 'word' на 'letter'.
 */

public class Task1_2 {

	public static void main(String[] args) {
        String str = "word tree beer letter word word good word";
        System.out.println(Task1_2.Changer(str));
    }

    public static String Changer(String word) {
        StringBuilder strBuilder = new StringBuilder();
        String letter;
        for (int i = 0; i < word.length(); i++) {
            if (i + 3 < word.length()
                    && word.charAt(i) == 'w'
                    && word.charAt(i + 1) == 'o'
                    && word.charAt(i + 2) == 'r'
                    && word.charAt(i + 3) == 'd') {
                strBuilder.append("letter");
                i = i + 3;
            } else {
                strBuilder.append(word.charAt(i));
            }
        }
        letter = strBuilder.toString();
        return letter;
    }
}
//letter tree beer letter letter letter good letter