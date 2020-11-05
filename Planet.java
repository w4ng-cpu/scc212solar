public class Planet extends Sun
{
    private int distance;
    private int velocity;

    public Planet(int distance, int velocity, int diameter, String col)
    {
        super(diameter, col);
        this.distance = distance;
        this.velocity = velocity;
    }

    public int getDistance()
    {
        return this.distance;
    }

    public int getVelocity()
    {
        return this.velocity;
    }
}