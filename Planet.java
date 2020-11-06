public class Planet extends Sun
{
    private int distance;
    private double velocity;

    public Planet(int diameter, String col, int distance, double velocity)
    {
        super(diameter, col);
        this.distance = distance;
        this.velocity = velocity;
    }

    public int getDistance()
    {
        return this.distance;
    }

    public double getVelocity()
    {
        return this.velocity;
    }
}