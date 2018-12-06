package kipster.ng;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class NovamPetramTab extends CreativeTabs 
{
	public NovamPetramTab(String label) { super("novampetramtab"); }
	public ItemStack getTabIconItem() { return new ItemStack(Items.DIAMOND);}
}
