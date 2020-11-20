package skid.gay.sex.spermix.inside.shalopay.features.module.modules.movement;

import net.minecraft.client.Minecraft;
import net.minecraft.network.play.client.CPacketPlayer$Position;
import skid.gay.sex.spermix.inside.shalopay.features.module.Module;
import skid.gay.sex.spermix.inside.shalopay.features.module.ModuleCategory;

public class AirWalk extends Module {
   public void h() {
      if (this.c()) {
         Minecraft.getMinecraft();
         Minecraft.player.onGround = true;
         Minecraft var10000 = mc;
         if (Minecraft.player.ticksExisted % 3 == 1) {
            var10000 = mc;
            Minecraft var10003 = mc;
            Minecraft var10004 = mc;
            Minecraft var10005 = mc;
            Minecraft.player.connection.sendPacket(new CPacketPlayer$Position(Minecraft.player.posX, Minecraft.player.posY, Minecraft.player.posZ, true));
         }

      }
   }

   public AirWalk() {
      super("AirWalk", 0, ModuleCategory.PLAYER);
   }
}
