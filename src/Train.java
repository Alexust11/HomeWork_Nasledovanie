public class Train extends Transport {

    private float pricetrip; //    Цена поездки
    private float travelTime; //    Время поездки
    private String stationNameDeparture; // Название станции отбытия
    private String stationFinal; //    Конечная остановка
    private int NumberWagons; //    Количество вагонов

    public Train(String brand, String model, int yearRelease, String country, String bodyColor, int maxSpeed, float pricetrip, float travelTime, String stationNameDeparture, String stationFinal, int numberWagons) {
        super(brand, model, yearRelease, country, bodyColor, maxSpeed);
        this.pricetrip = pricetrip;
        this.travelTime = travelTime;
        this.stationNameDeparture = stationNameDeparture;
        this.stationFinal = stationFinal;
        NumberWagons = numberWagons;
    }

    public float getPricetrip() {
        return pricetrip;
    }

    public float getTravelTime() {
        return travelTime;
    }

    public String getStationNameDeparture() {
        return stationNameDeparture;
    }

    public String getStationFinal() {
        return stationFinal;
    }

    public int getNumberWagons() {
        return NumberWagons;
    }

    public void setPricetrip(float pricetrip) {
        this.pricetrip = pricetrip;
    }

    public void setStationNameDeparture(String stationNameDeparture) {
        this.stationNameDeparture = stationNameDeparture;
    }

    public void setStationFinal(String stationFinal) {
        this.stationFinal = stationFinal;
    }

    @Override
    public String toString() {
        return "Train{" +
                "pricetrip=" + pricetrip +
                ", travelTime=" + travelTime +
                ", stationNameDeparture='" + stationNameDeparture + '\'' +
                ", stationFinal='" + stationFinal + '\'' +
                ", NumberWagons=" + NumberWagons +
                '}';
    }
}
