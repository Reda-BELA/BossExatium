package reda.boss.exatium;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import reda.boss.exatium.proxy.CommonProxy;
import reda.boss.exatium.utils.References;

@Mod(modid = References.MODID,name = References.NAME,version = References.VERSION)
public class Main
{
    @Mod.Instance
    public static Main instance;

    @SidedProxy(clientSide = References.CLIENT,serverSide = References.COMMON)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public static void preInit(FMLPreInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public static void Init(FMLInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public static void PostInit(FMLPostInitializationEvent event)
    {

    }

}
