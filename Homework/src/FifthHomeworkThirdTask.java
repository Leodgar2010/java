import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FifthHomeworkThirdTask {

    private static Map<Character, Integer> convertBase;

    public Map<Character,Integer> convertBase (){
        Map<Character, Integer> convert = new HashMap<>();
        convert.put('I', 1);
        convert.put('V', 5);
        convert.put('X', 10);
        convert.put('L', 50);
        convert.put('C', 100);
        convert.put('D', 500);
        convert.put('M', 1000);
        return convert;
    }
    public Integer convertRomanToArabic (Map<Character,Integer> convertBase){
        FifthHomeworkThirdTask.convertBase = convertBase;
        ArrayList<Character> roman = new ArrayList<>();
        ArrayList <Integer> arabic = new ArrayList<>();
        int number = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Введите римское число: ");
        String temp = (input.next());
        input.close();
        for (int i = 0; i < temp.length(); i++) {
            roman.add((temp.charAt(i)));
        }
        for (int i = 0; i < roman.size(); i++) {
            arabic.add (convertBase.get(roman.get(i)));
        }
        if (arabic.size ()==1) {
            number = arabic.get(0);
        }else {
            for (int i = 0; i < arabic.size()-1; i++) {
                if (arabic.get(i + 1)>arabic.get(i)) {
                    number -= arabic.get(i);
                }else {
                    number+= arabic.get(i);
                }
            }

        }
        number += arabic.get(arabic.size()-1);
        return number;

    }
}
/*
Написать метод, который переведет число
из римского формата записи в арабский.
Например, MMXXII = 2022 (правила см. во
вложениях к уроку, где ссылка на репозиторий).
 */
