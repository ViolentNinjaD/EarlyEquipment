package ninja.earlyequipment;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

import static ninja.earlyequipment.EarlyEquipment.*;

@Mod(modid = MOD_ID, name = MOD_NAME, version = MOD_VERSION)
public class EarlyEquipment 
{
    public static final String MOD_ID = "earlyequipment";
    public static final String MOD_NAME = "EarlyEquipment";
    public static final String MOD_VERSION = "@VERSION@";

    @Mod.Instance(MOD_ID)
    public static EarlyEquipment instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        
    }
}
