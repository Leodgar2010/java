import java.util.ArrayList;
import java.util.Collections;

public class ThirdHomeworkThirdTask {
    public static void main(String[] args) {
        ArrayList<Integer> arr;
        GenerateArray generateArray = new GenerateArray();
        arr = generateArray.newArray();
        System.out.println(Collections.max(arr));
        System.out.println(Collections.min(arr));
        System.out.println(Average(arr));
    }

    public static Double Average(ArrayList<Integer> arr) {
        double result = 0;
        for (int i = 0; i < arr.size(); i++) {
            result += arr.get(i);
        }
        return result / arr.size();

    }
}
/*
Задан целочисленный список ArrayList. Найти минимальное,
максимальное и среднее из этого списка.
 */