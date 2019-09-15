package mystery2099.mod.init;

import java.util.ArrayList;
import java.util.List;

import mystery2099.mod.objects.Items.ItemBase;
import net.minecraft.block.BlockStone;
import net.minecraft.item.Item;

public class ModItems 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	
	public static final Item COAL_NUGGET = new ItemBase("coal_nugget");
	public static final Item DIAMOND_CHIP = new ItemBase("diamond_chip");
	public static final Item EMERALD_CHIP = new ItemBase("emerald_chip");
	public static final Item QUARTZ_PIECE = new ItemBase("quartz_piece");
}
