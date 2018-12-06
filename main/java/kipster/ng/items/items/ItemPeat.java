package kipster.ng.items.items;

import java.util.Random;

import kipster.ng.NovamPetram;
import kipster.ng.blocks.BlockInit;
import kipster.ng.items.ItemInit;
import kipster.ng.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class ItemPeat extends Item implements IHasModel
{
	public ItemPeat(String name) 
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(NovamPetram.NOVAMPETRAMTAB);
		
		ItemInit.ITEMS.add(this);
	}

	@Override
	public void registerModels() 
	{
		NovamPetram.proxy.registerItemRenderer(this, 0, "inventory");
	}
}