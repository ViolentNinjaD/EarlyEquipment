package ninja.earlyequipment.event;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import ninja.earlyequipment.init.EarlyEQItems;

@SideOnly(Side.CLIENT)
public class ToolTipEvent 
{
    @SubscribeEvent
    public void onToolTip(ItemTooltipEvent event)
    {
        ItemStack stack = event.itemStack;
        Item item = event.itemStack.getItem();
        Block block = Block.getBlockFromItem(event.itemStack.getItem());

        if (item == EarlyEQItems.bindingCloth)
        {
            event.toolTip.add("Magical wizards have infused this item with powers..." +
                    "oh wait, it can only be used to make tools :(");
        }
    }
}
