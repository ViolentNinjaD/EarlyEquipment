package ninja.earlyequipment.item;

import net.minecraft.item.ItemStack;
import ninja.earlyequipment.reference.Names;

public class ItemBindingCloth extends ItemEarlyEQ
{
    public ItemBindingCloth()
    {
        super();
        this.setUnlocalizedName(Names.Items.BINDING_CLOTH);
        this.maxStackSize = 64;
    }


    @Override
    public boolean doesContainerItemLeaveCraftingGrid(ItemStack itemStack)
    {
        return false;
    }
}
