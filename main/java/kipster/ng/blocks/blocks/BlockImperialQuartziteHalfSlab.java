package kipster.ng.blocks.blocks;

import java.util.Random;

import kipster.ng.NovamPetram;
import kipster.ng.blocks.BlockInit;
import kipster.ng.items.ItemInit;
import kipster.ng.util.IHasModel;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public abstract class BlockImperialQuartziteHalfSlab extends BlockImperialQuartziteSlab
{
	public BlockImperialQuartziteHalfSlab(IBlockState state)
	{
		super(state);
	}
	
	@Override
	public boolean isDouble()
	{
		return false;
	}
}