package skid.gay.sex.spermix.inside.shalopay.features.module.modules.render;

import net.minecraft.client.Minecraft;
import net.minecraft.network.play.client.CPacketPlayer$Position;
import skid.gay.sex.spermix.inside.shalopay.features.module.Module;
import skid.gay.sex.spermix.inside.shalopay.features.module.ModuleCategory;

public class FlyVert extends Module {
   
   public static int f = 0;
   
   public static int d = 0;
   
   public static boolean e = true;

   public void h() {
      if (this.c()) {
         if (mc.gameSettings.keyBindJump.isKeyDown()) {
            Minecraft var10000 = mc;
            if (Minecraft.player.ticksExisted % 10 == 0) {
               var10000 = mc;
               if ((double)Minecraft.player.fallDistance > 0.1D) {
                  var10000 = mc;
                  Minecraft.player.motionY = 1.0E-5D;
                  var10000 = mc;
                  Minecraft.player.fallDistance = 0.0F;
               }
            }

            var10000 = mc;
            if (Minecraft.player.ticksExisted % 6 == 0) {
               var10000 = mc;
               Minecraft.player.motionY = 0.09D;
               var10000 = mc;
               Minecraft.player.fallDistance = 0.2F;
               var10000 = mc;
               Minecraft var10003 = mc;
               Minecraft var10004 = mc;
               Minecraft var10005 = mc;
               Minecraft.player.connection.sendPacket(new CPacketPlayer$Position(Minecraft.player.posX, Minecraft.player.posY, Minecraft.player.posZ, true));
            }

            var10000 = mc;
            if (Minecraft.player.ticksExisted % 4 == 0) {
               var10000 = mc;
               if ((double)Minecraft.player.fallDistance < 0.1D) {
                  var10000 = mc;
                  Minecraft.player.motionY = 0.09D;
                  var10000 = mc;
                  Minecraft.player.fallDistance = 0.5F;
               }
            }
         }

      }
   }

   public FlyVert() {
      super("FlyVert", 0, ModuleCategory.MOVEMENT);
   }
}
