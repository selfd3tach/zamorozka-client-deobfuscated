package skid.gay.sex.spermix.inside.shalopay.features.module.modules.player2;

import net.minecraft.client.Minecraft;
import net.minecraft.network.play.client.CPacketEntityAction;
import skid.gay.sex.spermix.inside.shalopay.features.module.Module;
import skid.gay.sex.spermix.inside.shalopay.features.module.ModuleCategory;

public class AntiFire extends Module {
   public void h() {
      if (this.c()) {
         Minecraft var10000 = mc;
         if (!Minecraft.player.capabilities.isCreativeMode) {
            var10000 = mc;
            if (Minecraft.player.isBurning()) {
               var10000 = mc;
               if (Minecraft.player.onGround) {
                  var10000 = mc;
                  Minecraft.player.connection.sendPacket(new CPacketEntityAction());
               }
            }
         }

      }
   }

   public AntiFire() {
      super("AntiFire", 0, ModuleCategory.PLAYER2);
   }
}
