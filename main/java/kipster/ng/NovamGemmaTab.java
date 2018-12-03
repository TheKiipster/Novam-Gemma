package kipster.ng;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class NovamGemmaTab extends CreativeTabs 
{
	public NovamGemmaTab(String label) { super("novamterramtab"); }
	public ItemStack getTabIconItem() { return new ItemStack(Items.DIAMOND);}
}
