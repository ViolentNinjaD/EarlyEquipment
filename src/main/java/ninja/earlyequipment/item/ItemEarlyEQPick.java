package ninja.earlyequipment.item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import ninja.earlyequipment.EarlyEquipment;
import ninja.earlyequipment.creativetab.EarlyEQTabs;

public class ItemEarlyEQPick extends ItemPickaxe
{
    public ItemEarlyEQPick(Item.ToolMaterial material)
    {
        super(material);
        this.setCreativeTab(EarlyEQTabs.tabMain);
        this.maxStackSize = 1;
    }

    @Override
    public String getUnlocalizedName()
    {
        return String.format("item.%s%s", EarlyEquipment.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack)
    {
        return String.format("item.%s%s", EarlyEquipment.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister)
    {
        itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
