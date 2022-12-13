import java.util.*;

public class Laptop {
    private int id;
    private String color;
    private String os;
    private int ram;
    private String discType;
    private int discVolume;
    public Map<Integer, String[]> laptopBase = new HashMap<Integer, String[]>();

    public Laptop(int id, String color, String os, int ram, String discType, int discVolume) {
        this.id = id;
        this.color = color;
        this.os = os;
        this.ram = ram;
        this.discType = discType;
        this.discVolume = discVolume;

    }

    public Laptop() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public int getDiscVolume() {
        return discVolume;
    }

    public void setDiscVolume(int discVolume) {
        this.discVolume = discVolume;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getDiscType() {
        return discType;
    }

    public void setDiscType(String discType) {
        this.discType = discType;
    }

    @Override
    public String toString() {

        return color + " " + os + " " + ram + " " + discType + " " + discVolume;

    }

    public Map addToBase(Laptop newLaptop) {
        String [] x = newLaptop.toString().split(" ");
        laptopBase.put(newLaptop.getId(),x);
        return laptopBase;
    }

    public void findInBase(Map<Integer, String[]> laptopBase) {
        int findID;
        String Condition;
        Scanner input = new Scanner(System.in);

        System.out.println("Введите параметр для поиска: 1-цвет, 2-Операционная система, 3 - Объем оперативной памяти, " +
                "4- Тип жесткого диска, 5-объем жесткого диска");
        findID = input.nextInt();
        System.out.println("Введите условие для поиска");
        Condition = input.next();
        for (int i = 1; i <= laptopBase.size(); i++) {
            if ((Arrays.asList(laptopBase.get(i)).get(findID-1).contains(Condition))) {
                System.out.println(Arrays.asList(laptopBase.get(i)));
            }
        }
    }
}

/*
Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
Создать множество ноутбуков.
Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
“Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет …
Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.

 */