package claybucket;

import claybucket.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ClayBucketMod.MODID, name = ClayBucketMod.MODNAME, version = ClayBucketMod.VERSION)
public class ClayBucketMod
{
    public static final String MODID = "claybucket";
    public static final String MODNAME = "Clay Bucket";
<<<<<<< HEAD
    public static final String VERSION = "1.0";
=======
    public static final String VERSION = "1.1";
>>>>>>> 2b744683dd42cb36108baaa2129df77f96a86ff7

    @SidedProxy(clientSide = "claybucket.proxy.ClientProxy", serverSide = "claybucket.proxy.CommonProxy")
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        proxy.registerItems();
<<<<<<< HEAD
        proxy.registerTextures();
=======
>>>>>>> 2b744683dd42cb36108baaa2129df77f96a86ff7
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.registerRecipes();
<<<<<<< HEAD
=======
        proxy.registerTextures();
>>>>>>> 2b744683dd42cb36108baaa2129df77f96a86ff7
    }
}
