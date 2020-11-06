public class Moon extends Planet
{
    private Sun orbitPlanet;
    
    public Moon(int diameter, String col, int distance, double velocity, Sun orbitPlanet)
    {
        super(diameter, col, distance, velocity); //distance and velocity relative to planet
        this.orbitPlanet = orbitPlanet;
    }

    public int getPlanetDistance()
    {
        return orbitPlanet.getDistance();
    }

    public double getPlanetVelocity()
    {
        return orbitPlanet.getVelocity();
    }
}