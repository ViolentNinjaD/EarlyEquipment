package ninja.earlyequipment.item.hardenedwood;

import ninja.earlyequipment.item.ItemEarlyEQSword;
import ninja.earlyequipment.reference.Materials;
import ninja.earlyequipment.reference.Names;

public class ItemHardenedWoodSword extends ItemEarlyEQSword
{
    public ItemHardenedWoodSword()
    {
        super(Materials.HARDENED_WOOD);
        this.setUnlocalizedName(Names.Tools.HardenedWood.SWORD);
    }
}
