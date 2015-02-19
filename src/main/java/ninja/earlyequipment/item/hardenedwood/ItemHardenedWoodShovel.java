package ninja.earlyequipment.item.hardenedwood;

import ninja.earlyequipment.item.ItemEarlyEQShovel;
import ninja.earlyequipment.reference.Materials;
import ninja.earlyequipment.reference.Names;

public class ItemHardenedWoodShovel extends ItemEarlyEQShovel
{
    public ItemHardenedWoodShovel()
    {
        super(Materials.HARDENED_WOOD);
        this.setUnlocalizedName(Names.Tools.HardenedWood.SHOVEL);
    }
}
