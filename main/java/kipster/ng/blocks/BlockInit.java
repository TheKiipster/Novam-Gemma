package kipster.ng.blocks;

import java.util.ArrayList;
import java.util.List;

import kipster.ng.NovamPetram;
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

	public static final Block ANTHRACITE_BLOCK = new BlockAnthracite("block_anthracite", Material.ROCK);
	public static final Block ANTHRACITE_ORE = new BlockAnthraciteOre("ore_anthracite", Material.ROCK);
	public static final Block BITUMINOUS_BLOCK = new BlockBituminous("block_bituminous", Material.ROCK);
	public static final Block BITUMINOUS_ORE = new BlockBituminousOre("ore_bituminous", Material.ROCK);
	public static final Block LIGNITE_BLOCK = new BlockLignite("block_lignite", Material.ROCK);
	public static final Block LIGNITE_ORE = new BlockLigniteOre("ore_lignite", Material.ROCK);
	public static final Block PEAT_BLOCK = new BlockPeat("block_peat", Material.ROCK);
	public static final Block PEAT_ORE = new BlockPeatOre("ore_peat", Material.ROCK);
	
	public static final Block ANKERITE_ORE = new BlockAnkeriteOre("ore_ankerite", Material.ROCK);
	public static final Block BANDED_ORE = new BlockBandedOre("ore_banded", Material.ROCK);	
	public static final Block GOETHITE_ORE = new BlockGoethiteOre("ore_goethite", Material.ROCK);
	public static final Block HEMATITE_ORE = new BlockHematiteOre("ore_hematite", Material.ROCK);
	public static final Block LIMONITE_ORE = new BlockLimoniteOre("ore_limonite", Material.ROCK);
	public static final Block MAGNETITE_ORE = new BlockMagnetiteOre("ore_magnetite", Material.ROCK);
	public static final Block MAGNETITEIMPERIAL_ORE = new BlockMagnetiteImperialOre("ore_magnetite_imperial", Material.ROCK);
	public static final Block SIDERITE_ORE = new BlockSideriteOre("ore_siderite", Material.ROCK);
	public static final Block TACONITE_ORE = new BlockTaconiteOre("ore_taconite", Material.ROCK);
	public static final Block QUARTZIMPERIAL_ORE = new BlockQuartzImperialOre("ore_quartz_imperial", Material.ROCK);
}