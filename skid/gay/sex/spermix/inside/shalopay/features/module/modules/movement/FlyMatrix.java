package skid.gay.sex.spermix.inside.shalopay.features.module.modules.movement;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.network.play.client.CPacketPlayer$Position;
import net.minecraft.util.math.MathHelper;
import skid.gay.sex.spermix.inside.shalopay.features.module.Module;
import skid.gay.sex.spermix.inside.shalopay.features.module.ModuleCategory;

public class FlyMatrix extends Module {
   public void h() {
      if (this.c()) {
         Minecraft var10000 = mc;
         Minecraft.player.motionY = 0.0D;
         var10000 = mc;
         Minecraft var10001 = mc;
         float var6 = Minecraft.player.rotationYaw + (float)(Minecraft.player.moveForward < 0.0F ? 180 : 0);
         var10001 = mc;
         float var8;
         Minecraft var10002;
         if (Minecraft.player.moveStrafing > 0.0F) {
            var10002 = mc;
            float var9;
            if (Minecraft.player.moveForward < 0.0F) {
               var9 = -0.5F;
            } else {
               var10002 = mc;
               var9 = Minecraft.player.moveForward > 0.0F ? 0.4F : 1.0F;
            }

            var8 = -90.0F * var9;
         } else {
            var8 = 0.0F;
         }

         float var1 = var6 + var8;
         var10000 = mc;
         var10001 = mc;
         double var7 = Minecraft.player.motionX * Minecraft.player.motionX;
         var10001 = mc;
         var10002 = mc;
         float var2 = MathHelper.sqrt(var7 + Minecraft.player.motionZ * Minecraft.player.motionZ);
         var10000 = mc;
         float var3 = (float)Math.atan(-Minecraft.player.motionY * 0.3000000029802322D) * 15.0F;
         var10000 = mc;
         Minecraft.player.onGround = true;
         var10000 = mc;
         EntityPlayerSP var4 = Minecraft.player;
         Minecraft var10003 = mc;
         var4.cameraYaw += (var2 - Minecraft.player.cameraYaw) * 0.4F;
         var10000 = mc;
         EntityPlayerSP var5 = Minecraft.player;
         var10003 = mc;
         var5.cameraPitch += (var3 - Minecraft.player.cameraPitch) * 0.8F;
         var10000 = mc;
         if (Minecraft.player.ticksExisted % 3 == 1) {
            var10000 = mc;
            var10003 = mc;
            Minecraft var10004 = mc;
            Minecraft var10005 = mc;
            Minecraft.player.connection.sendPacket(new CPacketPlayer$Position(Minecraft.player.posX, Minecraft.player.posY, Minecraft.player.posZ, true));
         }

      }
   }

   public FlyMatrix() {
      super("FlyMatrix", 0, ModuleCategory.MOVEMENT);
   }
}
