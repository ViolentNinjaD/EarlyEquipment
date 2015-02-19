package ninja.earlyequipment.item.hardenedwood;

import ninja.earlyequipment.creativetab.EarlyEQTabs;
import ninja.earlyequipment.item.ItemEarlyEQPick;
import ninja.earlyequipment.reference.Materials;
import ninja.earlyequipment.reference.Names;

public class ItemHardenedWoodPickaxe extends ItemEarlyEQPick
{
    public ItemHardenedWoodPickaxe()
    {
        super(Materials.HARDENED_WOOD);
        this.maxStackSize = 1;
        this.setCreativeTab(EarlyEQTabs.tabMain);
        this.setUnlocalizedName(Names.Tools.HardenedWood.PICKAXE);
    }
}
