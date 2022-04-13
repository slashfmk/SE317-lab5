package app;

public abstract class Climate {

    private int max;
    private int min;
    private Trend trend;

    public Climate(int max, int min, Trend trend) {
        this.max = max;
        this.min = min;
        this.trend = trend;
    }

    public Climate() {
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public Trend getTrend() {
        return trend;
    }

    public void setTrend(Trend trend) {
        this.trend = trend;
    }

}