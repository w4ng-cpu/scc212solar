/**
* This class contains the main and selects the classes to run
* @author Allan Wang
*/
public class Driver
{
    /**
    * This is a method that keeps track of time according the 360 degrees of rotation
    */
    public static float timeCheck(float time)
    {
        if (time >= 360)
        {
            time = 0;
        }
        else
        {
            time += 1;
        }
        return time;
    }

    /**
    * This is the main method
    * Instantiate SolarSystem class and call it's methods inside while loop
    */
    public static void main(String[] args) {
        float time = 0;
        SolarSystem solarSystem = new SolarSystem(300, 300);

        while(true) {
            time = timeCheck(time);
            solarSystem.drawSolarObject(0, 0, 20, "ORANGE");
            solarSystem.drawSolarObject(30, 3 * time, 6, "BLUE");
            solarSystem.finishedDrawing();
        }
    }
}