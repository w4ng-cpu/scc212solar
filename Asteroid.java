/**
* This class inherits Planet
* @author Allan Wang
*/
public class Asteroid extends Planet
{
    private int startAngle;

    /**
    * This is the constructor for Asteroid
    * */
    public Asteroid(int diameter, String col, int distance, double velocity, int startAngle)
    {
        super(diameter, col, distance, velocity);
        this.startAngle = startAngle;
    }

    public double move(double time)
    {
        return ((super.getVelocity() * time) + startAngle);
    }
}