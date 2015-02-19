package ninja.earlyequipment.init;

import cpw.mods.fml.common.registry.GameRegistry;
import ninja.earlyequipment.item.*;
import ninja.earlyequipment.item.hardenedwood.*;
import ninja.earlyequipment.reference.Names;

public class EarlyEQItems
{
    public static final ItemEarlyEQ bindingCloth = new ItemBindingCloth();

    public static final ItemEarlyEQPick hardenedWoodPickaxe = new ItemHardenedWoodPickaxe();
    public static final ItemEarlyEQSword hardenedWoodSword = new ItemHardenedWoodSword();
    public static final ItemEarlyEQAxe hardenedWoodAxe = new ItemHardenedWoodAxe();
    public static final ItemEarlyEQShovel hardenedWoodShovel = new ItemHardenedWoodShovel();
    public static final ItemEarlyEQHoe hardenedWoodHoe = new ItemHardenedWoodHoe();

    public static void initialiseItems()
    {
        GameRegistry.registerItem(bindingCloth, Names.Items.BINDING_CLOTH);

        GameRegistry.registerItem(hardenedWoodPickaxe, Names.Tools.HardenedWood.PICKAXE);
        GameRegistry.registerItem(hardenedWoodSword, Names.Tools.HardenedWood.SWORD);
        GameRegistry.registerItem(hardenedWoodAxe, Names.Tools.HardenedWood.AXE);
        GameRegistry.registerItem(hardenedWoodShovel, Names.Tools.HardenedWood.SHOVEL);
        GameRegistry.registerItem(hardenedWoodHoe, Names.Tools.HardenedWood.HOE);
    }
}
