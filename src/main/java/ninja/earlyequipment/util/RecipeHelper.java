package ninja.earlyequipment.util;

import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class RecipeHelper
{
    public static void oreShapeless(ItemStack outputItemStack, Object... objectInputs)
    {
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(outputItemStack, objectInputs));
    }
    public static void oreShaped(ItemStack outputItemStack, Object... objectInputs)
    {
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(outputItemStack, objectInputs));
    }
}
