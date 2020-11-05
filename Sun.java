/**
* This class is the constructor for Suns
* @author Allan Wang
*/
public class Sun
{
    private int diameter;
    private String col;

    public Sun(int diameter, String col)
    {
        this.diameter = diameter;
        this.col = col;
    }

    public int getDiameter()
    {
        return this.diameter;
    }

    public String getCol()
    {
        return this.col;
    }
}