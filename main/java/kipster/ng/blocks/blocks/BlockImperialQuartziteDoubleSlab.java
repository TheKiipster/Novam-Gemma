package kipster.ng.blocks.blocks;

import java.util.Random;

import kipster.ng.NovamPetram;
import kipster.ng.blocks.BlockInit;
import kipster.ng.items.ItemInit;
import kipster.ng.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public abstract class BlockImperialQuartziteDoubleSlab extends BlockImperialQuartziteSlab
{
	private Block half;
	
	public BlockImperialQuartziteDoubleSlab(IBlockState state, Block half)
	{
		super(state);
        this.half = half;
	}
	
	@Override
	public boolean isDouble()
	{
		return true;
	}
	
    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return Item.getItemFromBlock(half);
    }
}