package ninja.earlyequipment.init;

import cpw.mods.fml.common.registry.GameRegistry;
import ninja.earlyequipment.item.*;
import ninja.earlyequipment.item.hardenedwood.*;
import ninja.earlyequipment.reference.Names;

public class EarlyEQItems
{
    //Binding Cloth
    public static final ItemEarlyEQ bindingCloth = new ItemBindingCloth();

    //Hardened Wood
    public static final ItemEarlyEQ hardenedWood = new ItemHardenedWood();
    public static final ItemEarlyEQPick hardenedWoodPickaxe = new ItemHardenedWoodPickaxe();
    public static final ItemEarlyEQSword hardenedWoodSword = new ItemHardenedWoodSword();
    public static final ItemEarlyEQAxe hardenedWoodAxe = new ItemHardenedWoodAxe();
    public static final ItemEarlyEQShovel hardenedWoodShovel = new ItemHardenedWoodShovel();
    public static final ItemEarlyEQHoe hardenedWoodHoe = new ItemHardenedWoodHoe();

    public static void initialiseItems()
    {
        //Binding Cloth
        GameRegistry.registerItem(bindingCloth, Names.Items.BINDING_CLOTH);

        //Hardened Wood
        GameRegistry.registerItem(hardenedWood, Names.Items.HARDENED_WOOD);
        GameRegistry.registerItem(hardenedWoodPickaxe, Names.Tools.HardenedWood.PICKAXE);
        GameRegistry.registerItem(hardenedWoodSword, Names.Tools.HardenedWood.SWORD);
        GameRegistry.registerItem(hardenedWoodAxe, Names.Tools.HardenedWood.AXE);
        GameRegistry.registerItem(hardenedWoodShovel, Names.Tools.HardenedWood.SHOVEL);
        GameRegistry.registerItem(hardenedWoodHoe, Names.Tools.HardenedWood.HOE);
    }
}
