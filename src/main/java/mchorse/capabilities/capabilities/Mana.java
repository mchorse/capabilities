package mchorse.capabilities.capabilities;

/**
 * Default implementation of IMana
 */
public class Mana implements IMana
{
    private float mana = 250.0F;

    @Override
    public void consume(float points)
    {
        this.mana -= points;

        if (this.mana < 0.0F) this.mana = 0.0F;
    }

    @Override
    public void fill(float points)
    {
        this.mana += points;
    }

    @Override
    public void set(float points)
    {
        this.mana = points;
    }

    @Override
    public float getMana()
    {
        return this.mana;
    }
}