package kipster.ng.worldgen;


import java.util.Random;

import kipster.ng.NovamPetram;
import kipster.ng.blocks.BlockInit;
import kipster.ng.config.OreGenConfig;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.world.DimensionType;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.event.world.ChunkDataEvent;
import net.minecraftforge.fml.common.IWorldGenerator;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.apache.logging.log4j.Level;

import java.util.ArrayDeque;
import java.util.Random;

public class WorldGenOres implements IWorldGenerator {

    public static final String RETRO_NAME = "NovamGemmmaOreGen";
    public static WorldGenOres instance = new WorldGenOres();

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
        generateWorld(random, chunkX, chunkZ, world, true);
    }
    
    
    public void generateWorld(Random random, int chunkX, int chunkZ, World world, boolean newGen) {
        if (!newGen && !OreGenConfig.RETROGEN) {
            return;
        }

        if (world.provider.getDimension() == DimensionType.OVERWORLD.getId()) {
            if (OreGenConfig.GENERATE_OVERWORLD) {
                addOreSpawn(BlockInit.ANTHRACITE_ORE, (byte) OreType.ORE_OVERWORLD.ordinal(), Blocks.STONE, world, random, chunkX * 16, chunkZ * 16,
                        OreGenConfig.MIN_VEIN_SIZE, OreGenConfig.MAX_VEIN_SIZE, OreGenConfig.CHANCES_TO_SPAWN, 10, 30);
            }
        } 
        if (world.provider.getDimension() == DimensionType.OVERWORLD.getId()) {
            if (OreGenConfig.GENERATE_OVERWORLD) {
                addOreSpawn(BlockInit.LIGNITE_ORE, (byte) OreType.ORE_OVERWORLD.ordinal(), Blocks.STONE, world, random, chunkX * 16, chunkZ * 16,
                        OreGenConfig.MIN_VEIN_SIZE, OreGenConfig.MAX_VEIN_SIZE, OreGenConfig.CHANCES_TO_SPAWN, 44, 60);
            }
        } 
        if (world.provider.getDimension() == DimensionType.OVERWORLD.getId()) {
            if (OreGenConfig.GENERATE_OVERWORLD) {
                addOreSpawn(BlockInit.BITUMINOUS_ORE, (byte) OreType.ORE_OVERWORLD.ordinal(), Blocks.STONE, world, random, chunkX * 16, chunkZ * 16,
                        OreGenConfig.MIN_VEIN_SIZE, OreGenConfig.MAX_VEIN_SIZE, OreGenConfig.CHANCES_TO_SPAWN, 30, 44);
            }
        } 
        if (world.provider.getDimension() == DimensionType.OVERWORLD.getId()) {
            if (OreGenConfig.GENERATE_OVERWORLD) {
                addOreSpawn(BlockInit.PEAT_ORE, (byte) OreType.ORE_OVERWORLD.ordinal(), Blocks.STONE, world, random, chunkX * 16, chunkZ * 16,
                        OreGenConfig.MIN_VEIN_SIZE, OreGenConfig.MAX_VEIN_SIZE, OreGenConfig.CHANCES_TO_SPAWN, 53, 70);
            }
        } 
        
        if (world.provider.getDimension() == DimensionType.OVERWORLD.getId()) {
            if (OreGenConfig.GENERATE_OVERWORLD) {
                addOreSpawn(BlockInit.ANKERITE_ORE, (byte) OreType.ORE_OVERWORLD.ordinal(), Blocks.STONE, world, random, chunkX * 16, chunkZ * 16,
                        OreGenConfig.MIN_VEIN_SIZE, OreGenConfig.MAX_VEIN_SIZE, OreGenConfig.CHANCES_TO_SPAWN, 60, 69);
            }
        } 
        if (world.provider.getDimension() == DimensionType.OVERWORLD.getId()) {
            if (OreGenConfig.GENERATE_OVERWORLD) {
                addOreSpawn(BlockInit.BANDED_ORE, (byte) OreType.ORE_OVERWORLD.ordinal(), Blocks.STONE, world, random, chunkX * 16, chunkZ * 16,
                        OreGenConfig.MIN_VEIN_SIZE, OreGenConfig.MAX_VEIN_SIZE, OreGenConfig.CHANCES_TO_SPAWN, 70, 74);
            }
        } 

        if (world.provider.getDimension() == DimensionType.OVERWORLD.getId()) {
            if (OreGenConfig.GENERATE_OVERWORLD) {
                addOreSpawn(BlockInit.GOETHITE_ORE, (byte) OreType.ORE_OVERWORLD.ordinal(), Blocks.STONE, world, random, chunkX * 16, chunkZ * 16,
                        OreGenConfig.MIN_VEIN_SIZE, OreGenConfig.MAX_VEIN_SIZE, OreGenConfig.CHANCES_TO_SPAWN, 23, 79);
            }
        } 

        if (world.provider.getDimension() == DimensionType.OVERWORLD.getId()) {
            if (OreGenConfig.GENERATE_OVERWORLD) {
                addOreSpawn(BlockInit.HEMATITE_ORE, (byte) OreType.ORE_OVERWORLD.ordinal(), Blocks.STONE, world, random, chunkX * 16, chunkZ * 16,
                        OreGenConfig.MIN_VEIN_SIZE, OreGenConfig.MAX_VEIN_SIZE, OreGenConfig.CHANCES_TO_SPAWN, 37, 77);
            }
        } 

        if (world.provider.getDimension() == DimensionType.OVERWORLD.getId()) {
            if (OreGenConfig.GENERATE_OVERWORLD) {
                addOreSpawn(BlockInit.LIMONITE_ORE, (byte) OreType.ORE_OVERWORLD.ordinal(), Blocks.STONE, world, random, chunkX * 16, chunkZ * 16,
                        OreGenConfig.MIN_VEIN_SIZE, OreGenConfig.MAX_VEIN_SIZE, OreGenConfig.CHANCES_TO_SPAWN, 30, 50);
            }
        } 

        if (world.provider.getDimension() == DimensionType.OVERWORLD.getId()) {
            if (OreGenConfig.GENERATE_OVERWORLD) {
                addOreSpawn(BlockInit.MAGNETITE_ORE, (byte) OreType.ORE_OVERWORLD.ordinal(), Blocks.STONE, world, random, chunkX * 16, chunkZ * 16,
                        OreGenConfig.MIN_VEIN_SIZE, OreGenConfig.MAX_VEIN_SIZE, OreGenConfig.CHANCES_TO_SPAWN, 40, 54);
            }
        } 
        
        if (world.provider.getDimension() == DimensionType.OVERWORLD.getId()) {
            if (OreGenConfig.GENERATE_OVERWORLD) {
                addOreSpawn(BlockInit.MAGNETITE_ORE, (byte) OreType.ORE_OVERWORLD.ordinal(), BlockInit.IMPERIALQUARTZITE_STONE, world, random, chunkX * 16, chunkZ * 16,
                        OreGenConfig.MIN_VEIN_SIZE, OreGenConfig.MAX_VEIN_SIZE, OreGenConfig.CHANCES_TO_SPAWN, 0, 100);
            }
        } 
        
        if (world.provider.getDimension() == DimensionType.OVERWORLD.getId()) {
            if (OreGenConfig.GENERATE_OVERWORLD) {
                addOreSpawn(BlockInit.SIDERITE_ORE, (byte) OreType.ORE_OVERWORLD.ordinal(), Blocks.STONE, world, random, chunkX * 16, chunkZ * 16,
                        OreGenConfig.MIN_VEIN_SIZE, OreGenConfig.MAX_VEIN_SIZE, OreGenConfig.CHANCES_TO_SPAWN, 50, 80);
            }
        } 

        if (world.provider.getDimension() == DimensionType.OVERWORLD.getId()) {
            if (OreGenConfig.GENERATE_OVERWORLD) {
                addOreSpawn(BlockInit.TACONITE_ORE, (byte) OreType.ORE_OVERWORLD.ordinal(), Blocks.STONE, world, random, chunkX * 16, chunkZ * 16,
                        OreGenConfig.MIN_VEIN_SIZE, OreGenConfig.MAX_VEIN_SIZE, OreGenConfig.CHANCES_TO_SPAWN, 60, 74);
            }
        } 
        
        if (world.provider.getDimension() == DimensionType.OVERWORLD.getId()) {
            if (OreGenConfig.GENERATE_OVERWORLD) {
                addOreSpawn(BlockInit.QUARTZIMPERIAL_ORE, (byte) OreType.ORE_OVERWORLD.ordinal(), BlockInit.IMPERIALQUARTZITE_STONE, world, random, chunkX * 16, chunkZ * 16,
                        OreGenConfig.MIN_VEIN_SIZE, OreGenConfig.MAX_VEIN_SIZE, OreGenConfig.CHANCES_TO_SPAWN, 20, 50);
            }
        } 


     
        if (!newGen) {
            world.getChunkFromChunkCoords(chunkX, chunkZ).markDirty();
        }
    }

    public void addOreSpawn(Block block, byte blockMeta, Block targetBlock, World world, Random random, int blockXPos, int blockZPos, int minVeinSize, int maxVeinSize, int chancesToSpawn, int minY, int maxY) {
        WorldGenMinable minable = new WorldGenMinable((block.getStateFromMeta(blockMeta)), minVeinSize + random.nextInt(maxVeinSize - minVeinSize + 1), BlockMatcher.forBlock(targetBlock));
        for (int i = 0 ; i < chancesToSpawn ; i++) {
            int posX = blockXPos + random.nextInt(16);
            int posY = minY + random.nextInt(maxY - minY);
            int posZ = blockZPos + random.nextInt(16);
            minable.generate(world, random, new BlockPos(posX, posY, posZ));
        }
    }

    @SubscribeEvent
    public void handleChunkSaveEvent(ChunkDataEvent.Save event) {
        NBTTagCompound genTag = event.getData().getCompoundTag(RETRO_NAME);
        if (!genTag.hasKey("generated")) {
            // If we did not have this key then this is a new chunk and we will have proper ores generated.
            // Otherwise we are saving a chunk for which ores are not yet generated.
            genTag.setBoolean("generated", true);
        }
        event.getData().setTag(RETRO_NAME, genTag);
    }

    @SubscribeEvent
    public void handleChunkLoadEvent(ChunkDataEvent.Load event) {
        int dim = event.getWorld().provider.getDimension();

        boolean regen = false;
        NBTTagCompound tag = (NBTTagCompound) event.getData().getTag(RETRO_NAME);
        ChunkPos coord = event.getChunk().getPos();

        if (tag != null) {
            boolean generated = OreGenConfig.RETROGEN && !tag.hasKey("generated");
            if (generated) {
                if (OreGenConfig.VERBOSE) {
                    NovamPetram.logger.log(Level.DEBUG, "Queuing Retrogen for chunk: " + coord.toString() + ".");
                }
                regen = true;
            }
        } else {
            regen = OreGenConfig.RETROGEN;
        }

        if (regen) {
            ArrayDeque<ChunkPos> chunks = WorldTickHandler.chunksToGen.get(dim);

            if (chunks == null) {
                WorldTickHandler.chunksToGen.put(dim, new ArrayDeque<>(128));
                chunks = WorldTickHandler.chunksToGen.get(dim);
            }
            if (chunks != null) {
                chunks.addLast(coord);
                WorldTickHandler.chunksToGen.put(dim, chunks);
            }
        }
    }



}