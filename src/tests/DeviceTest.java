package tests;

import app.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class DeviceTest {

    public Device device;

    @Before
    public void setUp() {
        device = new Device(
                new Temperature(66, 3, 77),
                new Humidity(66, 12, 55));

        device.setTemperature(new Temperature(66, 3, 77));
        device.setHumidity(new Humidity(66, 12, 55));

    }

    /*
    Set and Test the current and previous Humidity
    for test 1
     */
    @Test
    public void currentHumidityTest1() {
        device.setHumidity(new Humidity(13, 12, 55));
        assertEquals(device.getCurrentHumidity().getHumidity(), 13);
        assertEquals(device.getPreviousHumidity().getHumidity(), 66);
    }

    /*
    Set and Test the current and previous Temperature
    for test 1
     */
    @Test
    public void currentTemperatureTest1() {
        device.setTemperature(new Temperature(68, 12, 55));
        assertEquals(device.getCurrentTemperature().getTemp(), 68);
        assertEquals(device.getPreviousTemperature().getTemp(), 66);
    }

    /*
    Set and Test the current and previous Temperature
    for test 1
     */
    @Test
    public void trendTest1() {
        device.setTemperature(new Temperature(68, 12, 55));
        assertEquals("Trend increasing", device.getTempTrend(), Trend.UP);
    }

    /*
    Test the humidity status for test 1
     */
    @Test
    public void humidityStatus1() {
        device.setHumidity(new Humidity(68, 12, 55));
        assertEquals("Hum. Status up!!", device.getHumidityStatus(), HumidityStatus.HI);
    }


    // Test 2
        /*
    Set and Test the current and previous Humidity
    for test 2
     */
    @Test
    public void currentHumidityTest2() {
        device.setHumidity(new Humidity(51, 12, 55));
        assertEquals("Current Humidity", device.getCurrentHumidity().getHumidity(), 51);
        assertEquals("Prev Humidity", device.getPreviousHumidity().getHumidity(), 66);
    }

    /*
    Set and Test the current and previous Humidity
    for test 2
     */
    @Test
    public void currentTemperatureTest2() {
        device.setTemperature(new Temperature(69, 12, 55));
        assertEquals("Current temp", device.getCurrentTemperature().getTemp(), 69);
        assertEquals("Prev temp", device.getPreviousTemperature().getTemp(), 66);
    }

    /*
    Set and Test the current and previous Temperature
    for test 2
     */
    @Test
    public void trendTest2() {
        device.setTemperature(new Temperature(69, 12, 55));
        assertEquals("Trend increasing", device.getTempTrend(), Trend.UP);
    }

    /*
    Test the humidity status for test 1
     */
    @Test
    public void humidityStatus2() {
        device.setHumidity(new Humidity(68, 12, 55));
        assertEquals("Hum. Status up!!", device.getHumidityStatus(), HumidityStatus.HI);
    }


    // 3

    /*
    Set and Test the current and previous Humidity
    for test 3
     */
    @Test
    public void currentHumidityTest3() {
        device.setHumidity(new Humidity(48, 12, 55));
        assertEquals("Current Humidity", device.getCurrentHumidity().getHumidity(), 48);
        assertEquals("Prev Humidity", device.getPreviousHumidity().getHumidity(), 66);
    }

    /*
    Set and Test the current and previous Temperature
    for test 3
     */
    @Test
    public void currentTemperatureTest3() {
        device.setTemperature(new Temperature(67, 12, 55));
        assertEquals("Current temp", device.getCurrentTemperature().getTemp(), 67);
        assertEquals("Prev temp", device.getPreviousTemperature().getTemp(), 66);
    }

    /*
    Set and Test the current and previous Temperature
    for test 3
     */
    @Test
    public void trendTest3() {
        device.setTemperature(new Temperature(67, 12, 55));
        assertEquals("Trend increasing", device.getTempTrend(), Trend.UP);
    }

    /*
    Test the humidity status for test 3
     */
    @Test
    public void humidityStatus3() {
        device.setHumidity(new Humidity(48, 12, 55));
        assertEquals("Hum. Status up!!", device.getHumidityStatus(), HumidityStatus.HI);
    }

    // 4

    /*
    Set and Test the current and previous Humidity
    for test 4
     */
    @Test
    public void currentHumidityTest4() {
        device.setHumidity(new Humidity(49, 12, 55));
        assertEquals("Current Humidity", device.getCurrentHumidity().getHumidity(), 49);
        assertEquals("Prev Humidity", device.getPreviousHumidity().getHumidity(), 66);
    }

    /*
    Set and Test the current and previous Temperature
    for test 4
     */
    @Test
    public void currentTemperatureTest4() {
        device.setTemperature(new Temperature(63, 12, 55));
        assertEquals("Current temp", device.getCurrentTemperature().getTemp(), 63);
        assertEquals("Prev temp", device.getPreviousTemperature().getTemp(), 66);
    }

    /*
    Set and Test the current and previous Temperature
    for test 4
     */

    @Test
    public void trendTest4() {
        device.setTemperature(new Temperature(63, 12, 55));
        assertEquals("Trend decreasing", device.getTempTrend(), Trend.DOWN);
    }

    /*
    Test the humidity status for test 4
     */
    @Test
    public void humidityStatus4() {
        device.setHumidity(new Humidity(63, 12, 55));
        assertEquals("Hum. Status up!!", device.getHumidityStatus(), HumidityStatus.HI);
    }


    // 5
    /*
    Set and Test the current and previous Humidity
    for test 5
     */
    @Test
    public void currentHumidityTest5() {
        device.setHumidity(new Humidity(54, 12, 55));
        assertEquals("Current Humidity", device.getCurrentHumidity().getHumidity(), 54);
        assertEquals("Prev Humidity", device.getPreviousHumidity().getHumidity(), 66);
    }

        /*
    Set and Test the current and previous Temperature
    for test 5
     */
    @Test
    public void currentTemperatureTest5() {
        device.setTemperature(new Temperature(59, 12, 55));
        assertEquals("Current temp", device.getCurrentTemperature().getTemp(), 59);
        assertEquals("Prev temp", device.getPreviousTemperature().getTemp(), 66);
    }

        /*
    Set and Test the current and previous Temperature
    for test 5
     */
    @Test
    public void trendTest5() {
        device.setTemperature(new Temperature(59, 12, 55));
        assertEquals("Trend decreasing", device.getTempTrend(), Trend.DOWN);
    }

        /*
    Test the humidity status for test 5
     */
    @Test
    public void humidityStatus5() {
        device.setHumidity(new Humidity(54, 12, 55));
        assertEquals("Hum. Status up!!", device.getHumidityStatus(), HumidityStatus.HI);
    }

    // 6

        /*
    Set and Test the current and previous Humidity
    for test 6
     */
    @Test
    public void currentHumidityTest6() {
        device.setHumidity(new Humidity(56, 12, 55));
        assertEquals("Current Humidity", device.getCurrentHumidity().getHumidity(), 56);
        assertEquals("Prev Humidity", device.getPreviousHumidity().getHumidity(), 66);
    }

        /*
    Set and Test the current and previous Temperature
    for test 6
     */
    @Test
    public void currentTemperatureTest6() {
        device.setTemperature(new Temperature(53, 12, 55));
        assertEquals("Current temp", device.getCurrentTemperature().getTemp(), 53);
        assertEquals("Prev temp", device.getPreviousTemperature().getTemp(), 66);
    }

        /*
    Set and Test the current and previous Temperature
    for test 6
     */

    @Test
    public void trendTest6() {
        device.setTemperature(new Temperature(53, 12, 55));
        assertEquals("Trend decreasing", device.getTempTrend(), Trend.DOWN);
    }

    /*
    Test the humidity status for test 6
     */

    @Test
    public void humidityStatus6() {
        device.setHumidity(new Humidity(56, 12, 55));
        assertEquals("Hum. Status up!!", device.getHumidityStatus(), HumidityStatus.HI);
    }
}