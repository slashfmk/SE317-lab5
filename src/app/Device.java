package app;

public class Device {

    private Temperature[] temperature;
    private Humidity[] humidity;
    private Trend tempTrend;
    private Trend humidTrend;
    private HumidityStatus humidityStatus;

    public Device(Temperature temperature, Humidity humidity) {
        this.temperature = new Temperature[2];
        this.humidity = new Humidity[2];

        this.temperature[0] = null;
        this.humidity[0] = null;

        this.temperature[1] = temperature;
        this.humidity[1] = humidity;
        this.updateHumidityStatus();
    }

    public Device() {
        this.temperature = new Temperature[2];
        this.humidity = new Humidity[2];

        this.temperature[0] = null;
        this.humidity[0] = null;

        this.temperature[1] = null;
        this.humidity[1] = null;

      //  this.updateHumidityStatus();
    }

    public HumidityStatus getHumidityStatus() {
        return humidityStatus;
    }

    private void updateHumidityStatus() {
        //  if (this.humidity[0] == null || this.humidity[1].getHumidity() ) {
        if (this.humidity[1].getHumidity() >= 30 && this.humidity[1].getHumidity() <= 55) {
            this.humidityStatus = HumidityStatus.OK;
        } else if (this.humidity[1].getHumidity() > 55) {
            this.humidityStatus = HumidityStatus.HI;
        } else if (this.humidity[1].getHumidity() < 30) {
            this.humidityStatus = HumidityStatus.LOW;
        }
        // }
    }

    public Temperature getCurrentTemperature() {
        return this.temperature[1];
    }

    public Temperature getPreviousTemperature() {
        return this.temperature[0];
    }

    public void setTemperature(Temperature temperature) {
        if (temperature.getTemp() >= 0 && temperature.getTemp() <= 125) {
            if (this.temperature[0] == null) {
                this.temperature[0] = temperature;
            } else { // if there is a previous one we just put the current
                this.temperature[0] = this.temperature[1];
                this.temperature[1] = temperature;
            }
            this.updateTempTrend();
        } else {
            System.out.println("Invalid value [0 - 125]");
        }
    }

    // app.Humidity
    public Humidity getCurrentHumidity() {
        return this.humidity[1];
    }

    public Humidity getPreviousHumidity() {
        return this.humidity[0];
    }

    public void setHumidity(Humidity humidity) {
        if (humidity.getHumidity() >= 0 && humidity.getHumidity() <= 100) {
            if (this.humidity[0] == null) {
                this.humidity[0] = humidity;
            } else { // if there is a previous one we just put the current
                this.humidity[0] = this.humidity[1];
                this.humidity[1] = humidity;
            }

            this.updateHumidityTrend();

        } else {
            // Exception
            System.out.println("Invalid value [0% - 100%]");
        }
    }


    public Trend getTempTrend() {
        return tempTrend;
    }

    public void setTempTrend(Trend tempTrend) {
        this.tempTrend = tempTrend;
    }

    public Trend getHumidTrend() {
        return humidTrend;
    }

    public void setHumidTrend(Trend humidTrend) {
        this.humidTrend = humidTrend;
    }


    private void updateHumidityTrend() {

        // this.humidTrend = app.Trend.STABLE;

        if (this.humidity[0] != null && this.humidity[0].getHumidity() > this.humidity[1].getHumidity()) {
            this.humidTrend = Trend.DOWN;
        } else if (this.humidity[0] != null && this.humidity[0].getHumidity() == this.humidity[1].getHumidity()) {
            this.humidTrend = Trend.STABLE;
        } else {
            this.humidTrend = Trend.UP;
        }

    }


    private void updateTempTrend() {

        // this.tempTrend = app.Trend.STABLE;

        if (this.temperature[0] != null && this.temperature[0].getTemp() > this.temperature[1].getTemp()) {
            this.tempTrend = Trend.DOWN;
        } else if (this.temperature[0] != null && this.temperature[0].getTemp() < this.temperature[1].getTemp()) {
            this.tempTrend = Trend.UP;
        } else {
            this.tempTrend = Trend.STABLE;
        }

    }


    public void displayInfo() {
        System.out.println("app.Temperature");
        System.out.println("***********");
        System.out.println("Current relative temperature: " + this.temperature[1].getTemp() + "F");
        System.out.println("Max relative temperature: " + this.temperature[1].getMax());
        System.out.println("Min relative temperature: " + this.temperature[1].getMin());

        System.out.println("app.Temperature trend: " + this.getTempTrend());

        System.out.println("Current temp: " + (this.getCurrentTemperature() == null ? "Not recorded" : this.getCurrentTemperature().getTemp()) +
                " | last temp: " + (this.getPreviousTemperature() == null ? "Not recorded" : this.getPreviousTemperature().getTemp()));

        System.out.println("");

        System.out.println("app.Humidity");
        System.out.println("********");
        System.out.println("Current relative humidity: " + this.humidity[1].getHumidity() + "%");
        System.out.println("Max relative humidity: " + this.humidity[1].getMax());
        System.out.println("Min relative humidity: " + this.humidity[1].getMin());

        System.out.println("app.Humidity trend: " + this.getHumidTrend());
        System.out.println("app.Humidity status: " + this.humidityStatus);
        System.out.println("Current app.Humidity: " + (this.getCurrentHumidity() == null ? "Not recorded" : this.getCurrentHumidity().getHumidity()) +
                " | last humidity: " + (this.getPreviousHumidity() == null ? "Not recorded" : this.getPreviousHumidity().getHumidity()));

        System.out.println("----------------------------------------------");

    }


}
