package ninja.earlyequipment.proxy;

import net.minecraftforge.common.MinecraftForge;
import ninja.earlyequipment.event.ToolTipEvent;

public class ClientProxy extends CommonProxy
{
    @Override
    public void registerClientEvents()
    {
        MinecraftForge.EVENT_BUS.register(new ToolTipEvent());
    }
}
