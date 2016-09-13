package mchorse.capabilities.capabilities;

/**
 * Mana storage capability
 */
public interface IMana
{
    public void consume(float points);

    public void fill(float points);

    public void set(float points);

    public float getMana();
}