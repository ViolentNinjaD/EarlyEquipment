package ninja.earlyequipment.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import ninja.earlyequipment.EarlyEquipment;
import ninja.earlyequipment.init.EarlyEQItems;

public class EarlyEQTabs
{
    public static final CreativeTabs tabMain = new CreativeTabs(EarlyEquipment.MOD_ID)
    {
        @Override
        public Item getTabIconItem()
        {
            return EarlyEQItems.bindingCloth;
        }
    };
}
