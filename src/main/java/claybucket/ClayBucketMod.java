package claybucket;

import claybucket.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = ClayBucketMod.MODID, name = ClayBucketMod.MODNAME, version = ClayBucketMod.VERSION)
public class ClayBucketMod
{
    public static final String MODID = "claybucket";
    public static final String MODNAME = "Clay Bucket";
    public static final String VERSION = "1.1";

    @SidedProxy(clientSide = "claybucket.proxy.ClientProxy", serverSide = "claybucket.proxy.CommonProxy")
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.registerRecipes();
    }
}
