package kipster.ng.util;

import java.io.File;

import kipster.ng.blocks.BlockInit;
import kipster.ng.config.RockGenConfig;
import kipster.ng.items.ItemInit;
import kipster.ng.worldgen.WorldGenOres;
import kipster.ng.worldgen.WorldGenRocks;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.world.WorldType;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@EventBusSubscriber
public class RegistryHandler 
{

	
	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event)
	{
		event.getRegistry().registerAll(ItemInit.ITEMS.toArray(new Item[0]));
	}
	
	@SubscribeEvent
	public static void onBlockRegister(RegistryEvent.Register<Block> event)
	{
		event.getRegistry().registerAll(BlockInit.BLOCKS.toArray(new Block[0]));
	}
	

	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent event)
	{
		for(Item item : ItemInit.ITEMS)
		{
			if(item instanceof IHasModel)
			{
				((IHasModel)item).registerModels();
			}
		}
		
		for(Block block : BlockInit.BLOCKS)
		{
			if(block instanceof IHasModel)
			{
				((IHasModel)block).registerModels();
			}
		}
}
	
	
	public static void preInitRegistries(FMLPreInitializationEvent e)
	{
		
		GameRegistry.registerWorldGenerator(new WorldGenRocks(), 0);
		GameRegistry.registerWorldGenerator(new WorldGenOres(), 0);
		}
	
	public static void initRegistries()
	{
		OreDictionaryHandler.registerOreDictionary();
		FurnaceRecipeHandler.registerFurnaceRecipes();
		GameRegistry.registerFuelHandler(new FuelHandler());
	}
	
	public static void postInitRegistries()
	{
	}
}