public class Main {
    public static void main(String[] args) {
        Car bmw = new Car("bmw", "bmw X5", 2020, "FRG", "Black", 200, "автомат", 2.2f, "седан", "у477см124", 6, "летняя");
        bmw.setRegNumber("q123iop124");
        System.out.println(bmw.toString()+", модель- "+bmw.getBrand()+", марка- "+bmw.getModel()+", рег.номер- "+bmw.getRegNumber());

    }
}