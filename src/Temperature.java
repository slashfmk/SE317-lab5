public class Temperature extends Climate {

    private int temp;

    public Temperature(int temp, int max, int min) {
        super(max, min, Trend.STABLE);
        this.temp = temp;
    }

    public Temperature() {
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

}
