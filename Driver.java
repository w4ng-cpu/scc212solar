/**
* This class contains the main and selects the classes to run
* @author Allan Wang
*/
public class Driver
{
    /**
    * This is the main method
    */
    public static void main(String[] args) {
        SolarSystem solarSystem = new SolarSystem(300, 300);
        solarSystem.drawSolarObject(0, 0, 10, "ORANGE");
        solarSystem.drawSolarObjectAbout(30, 0, 4, "BLUE", 0, 0);
    }
}