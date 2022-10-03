public class Bus extends Transport{
    public Bus(String brand, String model, int yearRelease, String country, String bodyColor, int maxSpeed) {
        super(brand, model, yearRelease, country, bodyColor, maxSpeed);
    }

    @Override
    public String toString() {
        return "Автобус{"+
                " марка='" + getBrand()+ '\'' +
                ", модель='" + getModel() + '\'' +
                ", год выпуска=" + getYearRelease() +
                ", страна производитель='" + getCountry() + '\'' +
                ", цвет кузова='" + getBodyColor() + '\'' +
                ", максимальная скорость=" + getMaxSpeed() +
                '}';
    }
}
