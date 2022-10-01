public class Car extends Transport{

    private String kpp;// кпп автомат/механика
    private float engineVolume;// объем двигателя
    private String typeBody;// тип кузова
    private String regNumber;// рег.номер
    private int numberSeats; // количество мест
    private String tireSeason;//тип резины летняя/зимняя

    public Car(String brand, String model, int yearRelease, String country, String bodyColor, int maxSpeed, String kpp, float engineVolume, String typeBody, String regNumber, int numberSeats, String tireSeason) {
        super(brand, model, yearRelease, country, bodyColor, maxSpeed);
        this.kpp = kpp;
        this.engineVolume = engineVolume;
        this.typeBody = typeBody;
        this.regNumber = regNumber;
        this.numberSeats = numberSeats;
        this.tireSeason = tireSeason;
    }

    public String getKpp() {
        return kpp;
    }

    public float getEngineVolume() {
        return engineVolume;
    }

    public String getTypeBody() {
        return typeBody;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public int getNumberSeats() {
        return numberSeats;
    }

    public String getTireSeason() {
        return tireSeason;
    }

    public void setEngineVolume(float engineVolume) {
        this.engineVolume = engineVolume;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public void setTireSeason(String tireSeason) {
        this.tireSeason = tireSeason;
    }

    @Override
    public String toString() {
        return "Car{" +
                "kpp='" + kpp + '\'' +
                ", engineVolume=" + engineVolume +
                ", typeBody='" + typeBody + '\'' +
                ", regNumber='" + regNumber + '\'' +
                ", numberSeats=" + numberSeats +
                ", tireSeason='" + tireSeason + '\'' +
                '}';
    }
}
