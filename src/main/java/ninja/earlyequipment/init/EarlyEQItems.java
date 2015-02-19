package ninja.earlyequipment.init;

import cpw.mods.fml.common.registry.GameRegistry;
import ninja.earlyequipment.item.ItemBindingCloth;
import ninja.earlyequipment.item.ItemEarlyEQ;
import ninja.earlyequipment.item.ItemEarlyEQPick;
import ninja.earlyequipment.item.ItemEarlyEQSword;
import ninja.earlyequipment.item.hardenedwood.ItemHardenedWoodPickaxe;
import ninja.earlyequipment.item.hardenedwood.ItemHardenedWoodSword;
import ninja.earlyequipment.reference.Names;

public class EarlyEQItems
{
    public static final ItemEarlyEQ bindingCloth = new ItemBindingCloth();

    public static final ItemEarlyEQPick hardenedWoodPickaxe = new ItemHardenedWoodPickaxe();
    public static final ItemEarlyEQSword hardenedWoodSword = new ItemHardenedWoodSword();

    public static void initialiseItems()
    {
        GameRegistry.registerItem(bindingCloth, Names.Items.BINDING_CLOTH);

        GameRegistry.registerItem(hardenedWoodPickaxe, Names.Tools.HardenedWood.PICKAXE);
        GameRegistry.registerItem(hardenedWoodSword, Names.Tools.HardenedWood.SWORD);
    }
}
