public class Main {

    public static void main(String[] args) {

        // Data
        Temperature temp1 = new Temperature(70, 12, 67);
        Humidity humidity1 = new Humidity(56, 55, 3);

        Temperature temp2 = new Temperature(40, 22, 67);
        Humidity humidity2 = new Humidity(30, 5, 1);

        Temperature temp3 = new Temperature(30, 12, 90);
        Humidity humidity3 = new Humidity(20, 35, 3);

        Temperature temp4 = new Temperature(90, 22, 66);
        Humidity humidity4 = new Humidity(30, 5, 1);

        Device device = new Device(temp1, humidity1);

        System.out.println("Before\n");
        device.displayInfo();
        System.out.println("---------------------------------\n");

        System.out.println("After\n");
        device.setTemperature(temp2);
        device.setHumidity(humidity2);
        device.displayInfo();

        System.out.println("---------------------------------\n");

        System.out.println("Another read\n");
        device.setTemperature(temp3);
        device.setHumidity(humidity3);
        device.displayInfo();

        System.out.println("---------------------------------\n");

        System.out.println("Another read 2\n");
        device.setTemperature(temp4);
        device.setHumidity(humidity4);
        device.displayInfo();
    }
}
