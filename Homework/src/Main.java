public class Main {
    public static void main(String[] args) {
        Laptop laptop = new Laptop ();
        Laptop laptop1 = new Laptop(1,"красный", "windows10", 16, "HDD", 256 );
        laptop.addToBase(laptop1);
        Laptop laptop2 = new Laptop(2,"синий","linux", 32,"SSD",512);
        laptop.addToBase(laptop2);
        Laptop laptop3 = new Laptop();
        laptop3.setId(3);
        laptop3.setColor("черный");
        laptop3.setOs("NoOs");
        laptop3.setRam(8);
        laptop3.setDiscType("HDD");
        laptop3.setDiscVolume(1024);
        laptop.addToBase(laptop3);
        laptop.findInBase(laptop.laptopBase);


        }


    }

