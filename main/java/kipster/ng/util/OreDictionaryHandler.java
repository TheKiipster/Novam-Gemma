package kipster.ng.util;

import kipster.ng.blocks.BlockInit;
import kipster.ng.items.ItemInit;
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
import net.minecraftforge.oredict.OreDictionary;

public class OreDictionaryHandler {
	
	public static void registerOreDictionary() {
		
	//Stone
	OreDictionary.registerOre("stone", BlockInit.IMPERIALQUARTZITE_STONE);
	
	//Cobblestone
	OreDictionary.registerOre("cobblestone", BlockInit.IMPERIALQUARTZITE_COBBLESTONE);
	
	//Stonebrick
	OreDictionary.registerOre("stonebrick", BlockInit.IMPERIALQUARTZITE_STONEBRICK);
	
	System.out.println("Ore Dictionary Registered");
}
}
