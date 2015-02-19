package ninja.earlyequipment.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemPickaxe;
import ninja.earlyequipment.item.ItemBindingCloth;
import ninja.earlyequipment.item.ItemEarlyEQ;
import ninja.earlyequipment.item.hardenedwood.ItemHardenedWoodPickaxe;
import ninja.earlyequipment.reference.Names;

public class EarlyEQItems
{
    public static final ItemEarlyEQ bindingCloth = new ItemBindingCloth();

    public static final ItemPickaxe hardenedWoodPickaxe = new ItemHardenedWoodPickaxe();

    public static void initialiseItems()
    {
        GameRegistry.registerItem(bindingCloth, Names.Items.BINDING_CLOTH);
        GameRegistry.registerItem(hardenedWoodPickaxe, Names.Tools.HardenedWood.PICKAXE);
    }
}
