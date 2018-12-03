package kipster.ng.blocks;

import java.util.ArrayList;
import java.util.List;

import kipster.ng.NovamGemma;
import kipster.ng.blocks.blocks.*;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

public class BlockInit	{
	
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	
	public static final Block IMPERIALQUARTZITE_STONE = new BlockImperialQuartzite("imperialquartzite_stone", Material.ROCK);
	public static final Block IMPERIALQUARTZITE_COBBLESTONE = new BlockImperialQuartziteCobblestone("imperialquartzite_cobblestone", Material.ROCK);
	public static final Block IMPERIALQUARTZITE_STONEBRICK = new BlockImperialQuartziteStonebrick("imperialquartzite_stonebrick", Material.ROCK);
	public static final Block IMPERIALQUARTZITE_STAIRS = new BlockImperialQuartziteStairs("imperialquartzite_stairs", IMPERIALQUARTZITE_COBBLESTONE.getDefaultState());
	public static final Block IMPERIALQUARTZITE_BRICKSTAIRS = new BlockImperialQuartziteBrickStairs("imperialquartzite_brickstairs", IMPERIALQUARTZITE_STONEBRICK.getDefaultState());
}