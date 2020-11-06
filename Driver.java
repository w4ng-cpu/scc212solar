import java.util.*;
/**
* This class contains the main and selects the classes to run
* @author Allan Wang
*/
public class Driver
{
    /**
    * Declaring ArrayList to store SolarObjects
    * <p>
    * Decclaring necessary objects and variables
    */
    ArrayList<Sun> arraySolar = new ArrayList<Sun>();
    ArrayList<Moon> arrayMoon = new ArrayList<Moon>();
    ArrayList<Asteroid> arrayAsteroid = new ArrayList<Asteroid>();
    public static SolarSystem solarSystem;
    public Random rand = new Random();
    private double time = 0;
    private double speed = 0.01;

    /**
    * Constructor for Driver that will be constructed in main
    * <p>
    * Constructor runs SolarObject creation and drawing methods 
    */
    public Driver()
    {
        solarSystem = new SolarSystem(500, 500);       

        createSolarObject();
        createMoonObject();
        createAsteroidObject();

        while(true)
        {
            drawSolarObject();
            drawMoonObject();
            drawAsteroidObject();
            solarSystem.finishedDrawing();
        }
    }

    /**
    * This is a method that keeps track of time according the 360 degrees of rotation
    * @return double This returns the time
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

    /**
    *This creates and stores the sun and planets
    */
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
        Sun neptune = new Planet(8, "BLUE", 240, 4);

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

    /**
    * This draws the sun and planets 
    */
    public void drawSolarObject()
    {
        for (int i = 0; i < arraySolar.size(); i++)
        {
            solarSystem.drawSolarObject(arraySolar.get(i).getDistance(), arraySolar.get(i).getVelocity() * getTime(), arraySolar.get(i).getDiameter(), arraySolar.get(i).getCol());
        }
    }

    /**
    *This creates and stores moons 
    */
    public void createMoonObject()
    {
        Moon moon = new Moon(2, "WHITE", 5, 50, arraySolar.get(3)); // col diameter distance relative to planet velocity relative to planet sun/planet
        Moon lo = new Moon(2,"YELLOW", 10, 40, arraySolar.get(5));
        Moon europa = new Moon(2, "LIGHT_GRAY", 12, 20, arraySolar.get(5));
        Moon ganymede = new Moon(4,"GRAY", 16, 10, arraySolar.get(5));
        Moon callisto = new Moon(4,"LIGHT_GRAY",20, 5, arraySolar.get(5));

        arrayMoon.add(moon);
        arrayMoon.add(lo);
        arrayMoon.add(europa);
        arrayMoon.add(ganymede);
        arrayMoon.add(callisto);
    }

    /**
    * This draws the moons
    */
    public void drawMoonObject()
    {
        for (int i = 0; i < arrayMoon.size(); i++)
        {
            //  distance from sun/center, velocity around sun/center ,diameter ,colour, 
            solarSystem.drawSolarObjectAbout(arrayMoon.get(i).getPlanetDistance(), arrayMoon.get(i).getPlanetVelocity() * getTime(), arrayMoon.get(i).getDiameter(), arrayMoon.get(i).getCol(), arrayMoon.get(i).getDistance(), arrayMoon.get(i).getVelocity() * getTime());
        }
    }

    /**
    *This creates and stores the asteroid belt 
    */
    public void createAsteroidObject()
    {
        for (int i = 0; i < 500; i++)
        {
            Asteroid temp = new Asteroid(rand.nextInt(2) + 1, "WHITE", rand.nextInt(10) + 110, rand.nextInt(5) + 6, rand.nextInt(360));
            arrayAsteroid.add(temp);
        }
    }

    /**
    * This draws the asteroid belt
    */
    public void drawAsteroidObject()
    {
        for(int i = 0; i < arrayAsteroid.size(); i++)
        {
            solarSystem.drawSolarObject(arrayAsteroid.get(i).getDistance(), arrayAsteroid.get(i).move(time), arrayAsteroid.get(i).getDiameter(), arrayAsteroid.get(i).getCol());
        }
    }

    /**
    * This is the static main method
    * <p>
    * Instantiate Driver class
    */
    public static void main(String[] args) {

        Driver start = new Driver();

    }
}