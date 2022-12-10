import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class FifthHomeworkFirstTask {
    public Map<Integer, String> fillMap(Map<Integer, String> passports) {
        passports.put(123456, "Иванов");
        passports.put(321456, "Васильев");
        passports.put(234561, "Петрова");
        passports.put(234432, "Иванов");
        passports.put(654321, "Петрова");
        passports.put(345678, "Иванов");
        return passports;
    }

    public void getPassportInfoByName(Map<Integer, String> passports, String name){
        for(Map.Entry<Integer, String> passportsEntry : passports.entrySet()) {
            if (passportsEntry.getValue().equals(name)) {
                System.out.println(passportsEntry.getKey());
            }
        }
    }
}
/*
 Реализуйте структуру телефонной книги с помощью HashMap,
    учитывая, что 1 человек может иметь несколько телефонов.
 */
