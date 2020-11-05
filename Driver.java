import java.util.*;
/**
* This class contains the main and selects the classes to run
* @author Allan Wang
*/
public class Driver
{
    ArrayList<Planet> arrayPlanet = new ArrayList<Planet>();

    /**
    * This is a method that keeps track of time according the 360 degrees of rotation
    */
    public float timeCheck(float time)
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

    public void createSolarObject()
    {

    }

    /**
    * This is the main method
    * Instantiate SolarSystem class and call it's methods inside while loop
    */
    public static void main(String[] args) {
        //float time = 0;

        SolarSystem solarSystem = new SolarSystem(300, 300);

        Sun sun = new Sun(20, "ORANGE");
        Planet earth = new Planet(10, "BLUE", 30, 0);
        
        solarSystem.drawSolarObject(0, 0, sun.getDiameter(), sun.getCol());
        solarSystem.drawSolarObject(earth.getDistance(), earth.getVelocity(), earth.getDiameter(), earth.getCol());





/*
        while(true) {
            time = timeCheck(time);
            solarSystem.drawSolarObject(0, 0, 20, "ORANGE");
            solarSystem.drawSolarObject(30, 3 * time, 6, "BLUE");
            solarSystem.finishedDrawing();
        }
*/
    }
}