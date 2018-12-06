package kipster.ng.util;

import kipster.ng.blocks.BlockInit;
import kipster.ng.items.ItemInit;
import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.WorldType;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;


public class FurnaceRecipeHandler 
{

public static void registerFurnaceRecipes() {
	GameRegistry.addSmelting(BlockInit.IMPERIALQUARTZITE_COBBLESTONE, new ItemStack(BlockInit.IMPERIALQUARTZITE_STONE), 1F);
	GameRegistry.addSmelting(BlockInit.ANKERITE_ORE, new ItemStack(Items.IRON_INGOT), 1F);
	GameRegistry.addSmelting(BlockInit.LIMONITE_ORE, new ItemStack(Items.IRON_INGOT), 1F);
	GameRegistry.addSmelting(BlockInit.HEMATITE_ORE, new ItemStack(Items.IRON_INGOT), 1F);
	GameRegistry.addSmelting(BlockInit.GOETHITE_ORE, new ItemStack(Items.IRON_INGOT), 1F);
	GameRegistry.addSmelting(BlockInit.MAGNETITE_ORE, new ItemStack(Items.IRON_INGOT), 1F);
	GameRegistry.addSmelting(BlockInit.SIDERITE_ORE, new ItemStack(Items.IRON_INGOT), 1F);
	GameRegistry.addSmelting(BlockInit.TACONITE_ORE, new ItemStack(Items.IRON_INGOT), 1F);
	GameRegistry.addSmelting(BlockInit.BANDED_ORE, new ItemStack(Items.IRON_INGOT), 1F);
	
	System.out.println("Furnace Recipes Registered");
}
}