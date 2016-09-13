package mchorse.capabilities;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = CapabilitiesTest.MODID, version = CapabilitiesTest.VERSION)
public class CapabilitiesTest
{
    public static final String MODID = "capabilities-test";
    public static final String VERSION = "0.1";

    @SidedProxy(clientSide = "mchorse.capabilities.CommonProxy", serverSide = "mchorse.capabilities.CommonProxy")
    public static CommonProxy proxy;

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init();
    }
}