package kipster.ng.blocks.blocks;

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

public class BlockImperialQuartziteCobblestone extends Block implements IHasModel
{

		public BlockImperialQuartziteCobblestone(String name, Material material) 
		{
				super(Material.ROCK);
				setUnlocalizedName(name);
				setRegistryName(name);
				setSoundType(SoundType.STONE);
				setHardness(0.8F);
			setCreativeTab(NovamPetram.NOVAMPETRAMTAB);
			
			BlockInit.BLOCKS.add(this);
			ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));

			
		}
		
		 @Override
			public void registerModels() 
			{
				NovamPetram.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
			
		}
		
	}