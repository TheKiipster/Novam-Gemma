package kipster.ng.items;

import java.util.ArrayList;
import java.util.List;

import kipster.ng.NovamPetram;
import kipster.ng.items.items.ItemAnthracite;
import kipster.ng.items.items.ItemBituminous;
import kipster.ng.items.items.ItemLignite;
import kipster.ng.items.items.ItemPeat;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;

public class ItemInit 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	
		public static final Item ANTHRACITE_COAL = new ItemAnthracite("anthracite");
		public static final Item BITUMINOUS_COAL = new ItemBituminous("bituminous");
		public static final Item LIGNITE_COAL = new ItemLignite("lignite");
		public static final Item PEAT_COAL = new ItemPeat("peat");

	
	public static void registerRender(Item item) {
	ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(
			new ResourceLocation(NovamPetram.MODID, item.getUnlocalizedName().substring(5)), "inventory"));
	}

public static void registerRender(Item item, int meta, String fileName) {
	ModelLoader.setCustomModelResourceLocation(item, meta,
			new ModelResourceLocation(new ResourceLocation(NovamPetram.MODID, fileName), "inventory"));
	
	}
}