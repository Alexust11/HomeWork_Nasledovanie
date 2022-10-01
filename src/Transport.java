public class Transport {
    private String brand;
    private String model;
    private int yearRelease;//год выпуска
    private String country;//страна производитель
    private String bodyColor;// цвет кузова
    private int maxSpeed;

    public Transport(String brand, String model, int yearRelease, String country, String bodyColor, int maxSpeed) {
        this.brand = brand;
        this.model = model;
        this.yearRelease = yearRelease;
        this.country = country;
        if (bodyColor != null || bodyColor != "") {
            this.bodyColor = bodyColor;
        } else {
            this.bodyColor = "Цвет не установлен";
        }
        if (maxSpeed >0 ) {
            this.maxSpeed = maxSpeed;
        } else {
            this.maxSpeed = 0;
        }


    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYearRelease() {
        return yearRelease;
    }

    public String getCountry() {
        return country;
    }

    public String getBodyColor() {
        return bodyColor;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setBodyColor(String bodyColor) {
        if (bodyColor != null || bodyColor != "") {
            this.bodyColor = bodyColor;
        } else {
            this.bodyColor = "Цвет не установлен";
        }
            }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed >0 ) {
            this.maxSpeed = maxSpeed;
        } else {
            this.maxSpeed = 0;
        }

    }

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", yearRelease=" + yearRelease +
                ", country='" + country + '\'' +
                ", bodyColor='" + bodyColor + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
