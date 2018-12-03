package kipster.ng.items;

import java.util.ArrayList;
import java.util.List;

import kipster.ng.NovamGemma;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;

public class ItemInit 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	
	public static void registerRender(Item item) {
	ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(
			new ResourceLocation(NovamGemma.MODID, item.getUnlocalizedName().substring(5)), "inventory"));
	}

public static void registerRender(Item item, int meta, String fileName) {
	ModelLoader.setCustomModelResourceLocation(item, meta,
			new ModelResourceLocation(new ResourceLocation(NovamGemma.MODID, fileName), "inventory"));
	
	}
}