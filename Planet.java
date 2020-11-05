public class Planet extends Sun
{
    private int diameter;
    private String col;
    private int distance;
    private int velocity;

    public Planet(int diameter, String col, int distance, int velocity)
    {
        super(diameter, col);
        this.distance = distance;
        this.velocity = velocity;
    }

    public int getDiameter()
    {
        return super.getDiameter();
    }

    public String getCol()
    {
        return super.getCol();
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