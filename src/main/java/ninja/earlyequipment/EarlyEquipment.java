package ninja.earlyequipment;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import ninja.earlyequipment.init.EarlyEQItems;
import ninja.earlyequipment.init.EarlyEQRecipes;
import ninja.earlyequipment.proxy.IProxy;
import ninja.earlyequipment.reference.Reference;
import ninja.earlyequipment.util.EarlyEQLogger;

import static ninja.earlyequipment.EarlyEquipment.*;

@Mod(modid = MOD_ID, name = MOD_NAME, version = MOD_VERSION)
public class EarlyEquipment 
{
    public static final String MOD_ID = "earlyequipment";
    public static final String MOD_NAME = "EarlyEquipment";
    public static final String MOD_VERSION = "@VERSION@";

    @Mod.Instance(MOD_ID)
    public static EarlyEquipment instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.SERVER_PROXY)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        EarlyEQLogger.info("Items are being registered!");
        EarlyEQItems.initialiseItems();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        EarlyEQLogger.info("Recipes are being registered!");
        EarlyEQRecipes.initialiseRecipes();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
