package ninja.earlyequipment.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import ninja.earlyequipment.util.RecipeHelper;

public class EarlyEQRecipes
{
    public static void initialiseRecipes()
    {
        //Binding Cloth
        GameRegistry.addRecipe(new ItemStack(EarlyEQItems.bindingCloth, 16), " s ", "sls", " s ",
                Character.valueOf('s'), Items.string,
                Character.valueOf('l'), Items.leather);

        //Hardened Wood
        RecipeHelper.oreShapeless(new ItemStack(EarlyEQItems.hardenedWood, 2), new ItemStack(Blocks.cobblestone, 1), "plankWood");

        GameRegistry.addRecipe(new ItemStack(EarlyEQItems.hardenedWoodPickaxe), "hhh", " s ", " b ",
                Character.valueOf('h'), EarlyEQItems.hardenedWood,
                Character.valueOf('s'), Items.stick,
                Character.valueOf('b'), EarlyEQItems.bindingCloth);

        GameRegistry.addRecipe(new ItemStack(EarlyEQItems.hardenedWoodSword), " h ", " h ", " b ",
                Character.valueOf('h'), EarlyEQItems.hardenedWood,
                Character.valueOf('b'), EarlyEQItems.bindingCloth);

        GameRegistry.addRecipe(new ItemStack(EarlyEQItems.hardenedWoodShovel), " h ", " b ", " s ",
                Character.valueOf('h'), EarlyEQItems.hardenedWood,
                Character.valueOf('b'), EarlyEQItems.bindingCloth,
                Character.valueOf('s'), Items.stick);

        GameRegistry.addRecipe(new ItemStack(EarlyEQItems.hardenedWoodAxe), "hh ", "hb ", " s ",
                Character.valueOf('h'), EarlyEQItems.hardenedWood,
                Character.valueOf('b'), EarlyEQItems.bindingCloth,
                Character.valueOf('s'), Items.stick);

        GameRegistry.addRecipe(new ItemStack(EarlyEQItems.hardenedWoodHoe), "hh ", " b ", " s ",
                Character.valueOf('h'), EarlyEQItems.hardenedWood,
                Character.valueOf('b'), EarlyEQItems.bindingCloth,
                Character.valueOf('s'), Items.stick);
    }
}
