package kipster.ng.config;

import kipster.ng.NovamPetram;
import kipster.ng.util.RegistryHandler;
import net.minecraftforge.common.config.Config;

@Config(modid = NovamPetram.MODID, category = "oregen")
public class OreGenConfig {

    @Config.Comment(value = "Enable retrogen")
    public static boolean RETROGEN = true;

    @Config.Comment(value = "Enable verbose logging for retrogen")
    public static boolean VERBOSE = false;

    @Config.Comment(value = "Generate ore in the overworld")
    public static boolean GENERATE_OVERWORLD = true;

    @Config.Comment(value = "Generate ore in the nether")
    public static boolean GENERATE_NETHER = true;

    @Config.Comment(value = "Generate ore in the end")
    public static boolean GENERATE_END = true;

    @Config.Comment(value = "Minimum size of every ore vein")
    public static int MIN_VEIN_SIZE = 6;

    @Config.Comment(value = "Maximum size of every ore vein")
    public static int MAX_VEIN_SIZE = 10;

    @Config.Comment(value = "Maximum veins per chunk")
    public static int CHANCES_TO_SPAWN = 2;
        
}