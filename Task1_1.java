package StringsAndBasicsOfTextProcessing;

import java.util.Arrays;

/**
 * Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.
 */

public class Task1_1 {

	public static void main(String[] args) {
        String[] data = {"camelCase", "smthElse", "justAnotherOne", "justDoIt"};
        String[] result = Task1_1.toSnakeCase(data);
        System.out.println(Arrays.toString(result));
    }

    public static String[] toSnakeCase(String[] data) {
        String[] result = new String[data.length];
        int index = 0;
        for (String str : data) {
            StringBuilder tempResult = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                if (Character.isLowerCase(str.charAt(i))) {
                    tempResult.append(str.charAt(i));
                } else
                    tempResult.append("_").append(Character.toLowerCase(str.charAt(i)));
            }
            result[index] = tempResult.toString();
            index++;
        }
        return result;
    }
}
//[camel_case, smth_else, just_another_one, just_do_it]