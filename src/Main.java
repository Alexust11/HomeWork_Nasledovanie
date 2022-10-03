public class Main {
    public static void main(String[] args) {
        Car bmw = new Car("bmw", "bmw X5", 2020, "FRG", "Black", 200, "автомат", 2.2f, "седан", "у477см124", 6, "летняя");
        bmw.setRegNumber("q123iop124");
        System.out.println("____________________Задание 1____________________");

        System.out.println(bmw.toString()+", модель- "+bmw.getBrand()+", марка- "+bmw.getModel()+", рег.номер- "+bmw.getRegNumber());


        Train train1 = new Train("Поезд Ласточка","B-901", 2011, " Россия", "", 301, 3500f,0f,"Белорусского вокзала","Минск-Пассажирский", 11);
        Train train2 = new Train("Поезд Ленинград","D-125", 2019, " Россия", "", 270, 1700f,0f,"Ленинградского вокзала","Ленинград-Пассажирский", 8);
        System.out.println("____________________Задание 2____________________");

        System.out.println(train1);
        System.out.println(train2);
        Bus bus1 = new Bus("Gaz","Газель Next",2022,"Россия", "желтый", 110);
        Bus bus2 = new Bus("Лиаз","Лиаз-4292",2022,"Россия", "серо-голубой", 120);
        Bus bus3 = new Bus("СитиРитм-10","VolgaBus 5270GH",2022,"Россия", "желтый", 100);


        System.out.println("____________________Задание 3____________________");
        System.out.println(bus1);
        System.out.println(bus2);
        System.out.println(bus3);
        System.out.println("____________________Задание 4____________________");
        bus1.refill();
        bmw.refill();
        train1.refill();

    }
}