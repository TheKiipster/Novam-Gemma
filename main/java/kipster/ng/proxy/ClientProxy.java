package kipster.ng.proxy;

import kipster.ng.NovamPetram;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

public class ClientProxy extends CommonProxy 
{
	 public static ResourceLocation[] novamterramPanorama = new ResourceLocation[] {new ResourceLocation("novamterram:textures/gui/title/background/panorama_0.png"), new ResourceLocation("novamterram:textures/gui/title/background/panorama_1.png"), new ResourceLocation("novamterram:textures/gui/title/background/panorama_2.png"), new ResourceLocation("novamterram:textures/gui/title/background/panorama_3.png"), new ResourceLocation("novamterram:textures/gui/title/background/panorama_4.png"), new ResourceLocation("novamterram:textures/gui/title/background/panorama_5.png")};
	
	 @Override
	 public final void registerRenderers()
	    {
	           // GuiMainMenu.TITLE_PANORAMA_PATHS = novamterramPanorama;

	}
	 
	@Override
	public void registerItemRenderer(Item item, int meta, String id) 
	{
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName(), id));
	}
	
	@Override
	public void registerVariantRenderer(Item item, int meta, String filename, String id) 
	{
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(new ResourceLocation(NovamPetram.MODID, filename), id));
	}
}