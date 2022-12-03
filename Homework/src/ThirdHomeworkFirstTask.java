import java.util.ArrayList;
import java.util.Collections;

public class ThirdHomeworkFirstTask {
    public static void main(String[] args) {
        ArrayList<Integer> arr;
        GenerateArray generateArray = new GenerateArray();
        arr = generateArray.NewArray();
        Merge(arr);

    }

    public static void Merge(ArrayList<Integer> arr) {
        ArrayList<Integer> arr2 = new ArrayList<>();
        ArrayList<Integer> arr3 = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr2.size() < (arr.size() / 2)) {
                arr2.add(arr.get(i));
            } else arr3.add(arr.get(i));
        }
        System.out.println(arr);
        Collections.sort(arr2);
        Collections.sort(arr3);
        while (true) {
            if (arr3.isEmpty()) {
                result.addAll(arr3);
                break;
            } else if (arr2.isEmpty()) {
                result.addAll(arr3);
                break;
            }
            if (arr2.get(count) <= arr3.get(count)) {
                result.add(arr2.get(count));
                arr2.remove(count);
            } else {
                result.add(arr3.get(count));
                arr3.remove(count);
            }
        }
        System.out.println(result);
    }
}


//Реализовать алгоритм сортировки слиянием