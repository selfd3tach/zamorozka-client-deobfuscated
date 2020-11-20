package skid.gay.sex.spermix.inside.shalopay.features.module.modules.render2;

import net.minecraft.client.Minecraft;
import net.minecraft.network.play.client.CPacketPlayer;
import skid.gay.sex.spermix.inside.shalopay.features.module.Module;
import skid.gay.sex.spermix.inside.shalopay.features.module.ModuleCategory;

public class FlyTeleport extends Module {
   public FlyTeleport() {
      super("Fly-Teleport", 0, ModuleCategory.PLAYER);
   }

   public void i() {
      if (this.c()) {
         Minecraft var10000 = mc;
         double var1 = Minecraft.player.posX;
         var10000 = mc;
         double var3 = Minecraft.player.posY;
         var10000 = mc;
         double var5 = Minecraft.player.posZ;
         Minecraft var10001 = mc;
         var1 += Math.cos(Math.toRadians((double)(Minecraft.player.rotationYaw + 90.0F))) * 2.0D;
         var10001 = mc;
         var5 += Math.sin(Math.toRadians((double)(Minecraft.player.rotationYaw + 90.0F))) * 2.0D;
         var10000 = mc;
         Minecraft.player.setPositionAndUpdate(var1, var3 + 0.1D, var5);
         var10000 = mc;
         Minecraft.player.connection.sendPacket(new CPacketPlayer());
      }

   }

   public void g() {
   }
}
