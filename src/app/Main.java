package app;
import app.*;

public class Main {

    public static void main(String[] args) {

        Device device = new Device(new Temperature(66, 12, 67),
                new Humidity(53, 55, 3));
        device.displayInfo();

        device.setTemperature(new Temperature(68, 22, 67));
        device.setHumidity(new Humidity(51, 5, 1));
        device.displayInfo();

        device.setTemperature(new Temperature(69, 12, 90));
        device.setHumidity(new Humidity(48, 35, 3));
        device.displayInfo();

        device.setTemperature(new Temperature(67, 22, 66));
        device.setHumidity(new Humidity(49, 5, 1));
        device.displayInfo();

        device.setTemperature(new Temperature(63, 12, 90));
        device.setHumidity(new Humidity(54, 35, 3));
        device.displayInfo();

        device.setTemperature(new Temperature(59, 22, 66));
        device.setHumidity(new Humidity(56, 5, 1));
        device.displayInfo();

        device.setTemperature(new Temperature(53, 22, 66));
        // device.setHumidity(new app.Humidity(56, 5, 1));
        device.displayInfo();
    }
}
