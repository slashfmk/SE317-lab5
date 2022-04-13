public class Humidity extends Climate {

    private int humidity;

    public Humidity(int humidity, int max, int min) {
        super(max, min, Trend.STABLE);
        this.humidity = humidity;
    }

    public Humidity() {
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }
}
