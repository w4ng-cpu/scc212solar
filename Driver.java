import java.util.*;
/**
* This class contains the main and selects the classes to run
* @author Allan Wang
*/
public class Driver
{
    ArrayList<Sun> arraySolar = new ArrayList<Sun>();
    ArrayList<Moon> arrayMoon = new ArrayList<Moon>();
    ArrayList<Asteroid> arrayAsteroid = new ArrayList<Asteroid>();
    public static SolarSystem solarSystem;
    public Random rand = new Random();
    private double time = 0;
    private double speed = 0.01;

    public Driver()
    {
        solarSystem = new SolarSystem(500, 500);       

        createSolarObject();
        createMoonObject();
        while(true)
        {
            drawSolarObject();
            drawMoonObject();
            solarSystem.finishedDrawing();
        }
    }

    /**
    * This is a method that keeps track of time according the 360 degrees of rotation
    */
    public double getTime()
    {
        if (time >= 360)
        {
            time = 0;
        }
        else
        {
            time += speed;
        }
        return time;
    }

    public void createSolarObject()
    {
        Sun sun = new Sun(60, "YELLOW");    
        Sun mercury = new Planet(4, "GRAY", 60, 20);
        Sun venus = new Planet(6, "ORANGE",75, 16);
        Sun earth = new Planet(8, "BLUE", 90, 14);
        Sun mars = new Planet(6, "RED", 105, 11);    
        Sun jupiter = new Planet(16, "LIGHT_GRAY", 140, 6);
        Sun saturn = new Planet(14, "ORANGE", 180, 5);
        Sun uranus = new Planet(10, "CYAN", 210, 3);
        Sun neptune = new Planet(8, "BLUE", 240, 3);

        arraySolar.add(sun);
        arraySolar.add(mercury);        
        arraySolar.add(venus);
        arraySolar.add(earth);
        arraySolar.add(mars);
        arraySolar.add(jupiter);
        arraySolar.add(saturn);
        arraySolar.add(uranus);
        arraySolar.add(neptune);
    }

    public void drawSolarObject()
    {
        for (int i = 0; i < arraySolar.size(); i++)
        {
            solarSystem.drawSolarObject(arraySolar.get(i).getDistance(), arraySolar.get(i).getVelocity() * getTime(), arraySolar.get(i).getDiameter(), arraySolar.get(i).getCol());
        }
    }

    public void createMoonObject()
    {
        Moon moon = new Moon(2, "WHITE", 5, 50, arraySolar.get(3)); //distance col diameter relative to planet velocity relative to planet sun
        Moon lo = new Moon(2,"YELLOW", 10, 40, arraySolar.get(5));
        Moon europa = new Moon(2, "LIGHT_GRAY", 14, 20, arraySolar.get(5));
        Moon ganymede = new Moon(4,"GRAY", 24, 10, arraySolar.get(5));
        Moon callisto = new Moon(4,"LIGHT_GRAY", 5, 0, arraySolar.get(5));

        arrayMoon.add(moon);
        arrayMoon.add(lo);
        arrayMoon.add(europa);
        arrayMoon.add(ganymede);
        arrayMoon.add(callisto);
    }

    public void drawMoonObject()
    {
        for (int i = 0; i < arrayMoon.size(); i++)
        {
            //  distance from sun/center, velocity around sun/center ,diameter ,colour, 
            solarSystem.drawSolarObjectAbout(arrayMoon.get(i).getPlanetDistance(), arrayMoon.get(i).getPlanetVelocity() * getTime(), arrayMoon.get(i).getDiameter(), arrayMoon.get(i).getCol(), arrayMoon.get(i).getDistance(), arrayMoon.get(i).getVelocity() * getTime());
        }
    }

    public void createAsteroidObject()
    {
        
    }

    public void createSaturnRing()
    {

    }


    /**
    * This is the main method
    * Instantiate SolarSystem class and call it's methods inside while loop
    */
    public static void main(String[] args) {

        Driver start = new Driver();
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