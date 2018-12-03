package kipster.ng;

import org.apache.logging.log4j.Logger;

import kipster.ng.proxy.CommonProxy;
import kipster.ng.util.RegistryHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = NovamGemma.MODID, name = NovamGemma.MODNAME, version = NovamGemma.MODVERSION)
public class NovamGemma {

    public static final String MODID = "ng";
    public static final String MODNAME = "Novam Gemma";
    public static final String MODVERSION= "1.0";

    public static final CreativeTabs NOVAMGEMMATAB = new NovamGemmaTab("novamgemmatab");
     
    @Mod.Instance(MODID)
	public static NovamGemma instance;
	
    @SidedProxy(clientSide = "kipster.ng.proxy.ClientProxy", serverSide = "kipster.ng.proxy.ServerProxy")
    public static CommonProxy proxy;

  
    @Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		System.out.println(MODNAME + " is doing a thing uWu");
		//proxy.registerRenderers();
		RegistryHandler.preInitRegistries(event);
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		System.out.println("uWu");
		RegistryHandler.initRegistries();
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		System.out.println("uWu");
		RegistryHandler.postInitRegistries();
	}
}