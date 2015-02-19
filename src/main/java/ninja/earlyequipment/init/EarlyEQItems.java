package ninja.earlyequipment.init;

import cpw.mods.fml.common.registry.GameRegistry;
import ninja.earlyequipment.item.ItemBindingCloth;
import ninja.earlyequipment.item.ItemEarlyEQ;
import ninja.earlyequipment.reference.Names;

public class EarlyEQItems
{
    public static final ItemEarlyEQ bindingCloth = new ItemBindingCloth();

    public static void initialiseItems()
    {
        GameRegistry.registerItem(bindingCloth, Names.Items.BINDING_CLOTH);
    }
}
