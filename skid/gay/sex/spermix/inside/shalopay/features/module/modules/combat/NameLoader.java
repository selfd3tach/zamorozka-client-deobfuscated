package skid.gay.sex.spermix.inside.shalopay.features.module.modules.combat;

import java.util.Iterator;
import java.util.List;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiPlayerTabOverlay;
import net.minecraft.client.network.NetHandlerPlayClient;
import net.minecraft.client.network.NetworkPlayerInfo;
import skid.gay.sex.spermix.inside.shalopay.features.smthLikeInit.Main;
import skid.gay.sex.spermix.inside.shalopay.features.module.Module;
import skid.gay.sex.spermix.inside.shalopay.features.module.ModuleCategory;

public class NameLoader extends Module {
   public void h() {
      if (this.c()) {
         Minecraft var10000 = mc;
         NetHandlerPlayClient var1 = Minecraft.player.connection;
         List var2 = GuiPlayerTabOverlay.ENTRY_ORDERING.sortedCopy(var1.getPlayerInfoMap());
         Iterator var4 = var2.iterator();

         while(var4.hasNext()) {
            NetworkPlayerInfo var3 = (NetworkPlayerInfo)var4.next();
            NameAura.d.add(var3.getGameProfile().getName());
            var3.getPlayerTeam().setNamePrefix("§7NameAura: §3");
         }

         Main.a("Successfully.", true);
      }

   }

   public NameLoader() {
      super("NameLoader", 0, ModuleCategory.COMBAT);
   }
}
