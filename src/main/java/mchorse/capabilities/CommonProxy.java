package mchorse.capabilities;

import mchorse.capabilities.capabilities.CapabilityHandler;
import mchorse.capabilities.capabilities.IMana;
import mchorse.capabilities.capabilities.Mana;
import mchorse.capabilities.capabilities.ManaStorage;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.capabilities.CapabilityManager;

/**
 * Common proxy class 
 */
public class CommonProxy
{
    public void init()
    {
        CapabilityManager.INSTANCE.register(IMana.class, new ManaStorage(), Mana.class);

        MinecraftForge.EVENT_BUS.register(new CapabilityHandler());
        MinecraftForge.EVENT_BUS.register(new EventHandler());
    }
}
