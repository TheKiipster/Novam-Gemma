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
	
	//Coal
	OreDictionary.registerOre("oreCoal", BlockInit.ANTHRACITE_ORE);
	OreDictionary.registerOre("oreCoal", BlockInit.BITUMINOUS_ORE);
	OreDictionary.registerOre("oreCoal", BlockInit.LIGNITE_ORE);
	OreDictionary.registerOre("oreCoal", BlockInit.PEAT_ORE);
	OreDictionary.registerOre("coal", ItemInit.ANTHRACITE_COAL);
	OreDictionary.registerOre("coal", ItemInit.BITUMINOUS_COAL);
	OreDictionary.registerOre("coal", ItemInit.LIGNITE_COAL);
	OreDictionary.registerOre("coal", ItemInit.PEAT_COAL);
	OreDictionary.registerOre("blockCoal", BlockInit.ANTHRACITE_BLOCK);
	OreDictionary.registerOre("blockCoal", BlockInit.BITUMINOUS_BLOCK);
	OreDictionary.registerOre("blockCoal", BlockInit.LIGNITE_BLOCK);
	OreDictionary.registerOre("blockCoal", BlockInit.PEAT_BLOCK);
	
	//Iron
	OreDictionary.registerOre("oreIron", BlockInit.ANKERITE_ORE);
	OreDictionary.registerOre("oreIron", BlockInit.SIDERITE_ORE);
	OreDictionary.registerOre("oreIron", BlockInit.HEMATITE_ORE);
	OreDictionary.registerOre("oreIron", BlockInit.GOETHITE_ORE);
	OreDictionary.registerOre("oreIron", BlockInit.BANDED_ORE);
	OreDictionary.registerOre("oreIron", BlockInit.TACONITE_ORE);
	OreDictionary.registerOre("oreIron", BlockInit.MAGNETITE_ORE);
	OreDictionary.registerOre("oreIron", BlockInit.MAGNETITEIMPERIAL_ORE);
	OreDictionary.registerOre("oreIron", BlockInit.LIMONITE_ORE);
	
	OreDictionary.registerOre("oreQuartz", BlockInit.QUARTZIMPERIAL_ORE);
	System.out.println("Ore Dictionary Registered");
}
}
