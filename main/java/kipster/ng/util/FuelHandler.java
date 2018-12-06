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

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.ForgeEventFactory;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;
import net.minecraftforge.fml.common.IFuelHandler;
import net.minecraftforge.fml.common.registry.GameRegistry;

public  class FuelHandler implements IFuelHandler{

	@Override
	public int getBurnTime(ItemStack fuel) {
		if (fuel.getItem() == ItemInit.ANTHRACITE_COAL) {
			return 1600;
		}
		if (fuel.getItem() == ItemInit.BITUMINOUS_COAL) {
			return 1600;
		}
		if (fuel.getItem() == ItemInit.LIGNITE_COAL) {
			return 1600;
		}
		if (fuel.getItem() == ItemInit.PEAT_COAL) {
			return 1600;
		}
		if (fuel.getItem() == Item.getItemFromBlock(BlockInit.ANTHRACITE_BLOCK)) {
			return 16000;
		}
		if (fuel.getItem() == Item.getItemFromBlock(BlockInit.BITUMINOUS_BLOCK)) {
			return 16000;
		}
		if (fuel.getItem() == Item.getItemFromBlock(BlockInit.LIGNITE_BLOCK)) {
			return 16000;
		}
		if (fuel.getItem() == Item.getItemFromBlock(BlockInit.PEAT_BLOCK)) {
			return 16000;
		}
		return 0;
	
	}
} 