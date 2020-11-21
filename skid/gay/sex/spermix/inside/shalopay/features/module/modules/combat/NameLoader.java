package skid.gay.sex.spermix.inside.shalopay.features.module.modules.combat;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiPlayerTabOverlay;
import net.minecraft.client.network.NetHandlerPlayClient;
import net.minecraft.client.network.NetworkPlayerInfo;
import skid.gay.sex.spermix.inside.shalopay.features.module.Module;
import skid.gay.sex.spermix.inside.shalopay.features.module.ModuleCategory;
import skid.gay.sex.spermix.inside.shalopay.features.smthLikeInit.Main;

import java.util.Iterator;
import java.util.List;

public class NameLoader extends Module {
    public NameLoader() {
        super("NameLoader", 0, ModuleCategory.COMBAT);
    }

    public void onUpdate() {
        if (this.getState()) {
            Minecraft var10000 = mc;
            NetHandlerPlayClient var1 = Minecraft.player.connection;
            List var2 = GuiPlayerTabOverlay.ENTRY_ORDERING.sortedCopy(var1.getPlayerInfoMap());
            Iterator var4 = var2.iterator();

            while (var4.hasNext()) {
                NetworkPlayerInfo var3 = (NetworkPlayerInfo) var4.next();
                NameAura.d.add(var3.getGameProfile().getName());
                var3.getPlayerTeam().setNamePrefix("§7NameAura: §3");
            }

            Main.a("Successfully.", true);
        }

    }
}
