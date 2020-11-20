package skid.gay.sex.spermix.inside.shalopay.features.module.modules.movement;

import net.minecraft.client.Minecraft;
import net.minecraft.network.play.client.CPacketPlayer$Position;
import skid.gay.sex.spermix.inside.shalopay.features.module.Module;
import skid.gay.sex.spermix.inside.shalopay.features.module.ModuleCategory;

public class Glide extends Module {
   
   public static int d = 0;
   
   public static int f = 0;
   
   public static boolean e = true;

   public void h() {
      if (this.c()) {
         Minecraft var10000 = mc;
         if (Minecraft.player.onGround) {
            f = 0;
         }

         var10000 = mc;
         if (Minecraft.player.fallDistance > 0.0F && f <= 1) {
            if (d > 0 && e) {
               var10000 = mc;
               Minecraft.player.motionY = 0.0D;
               var10000 = mc;
               if (Minecraft.player.ticksExisted % 2 == 0) {
                  var10000 = mc;
                  Minecraft var10003 = mc;
                  Minecraft var10004 = mc;
                  Minecraft var10005 = mc;
                  Minecraft.player.connection.sendPacket(new CPacketPlayer$Position(Minecraft.player.posX, Minecraft.player.posY, Minecraft.player.posZ, true));
               }

               d = 0;
            } else {
               ++d;
            }

            var10000 = mc;
            if ((double)Minecraft.player.fallDistance >= 0.01D) {
               e = false;
            }

            var10000 = mc;
            if ((double)Minecraft.player.fallDistance >= 0.02D) {
               e = true;
               var10000 = mc;
               Minecraft.player.fallDistance = 0.0F;
            }
         }

      }
   }

   public Glide() {
      super("Glide", 0, ModuleCategory.MOVEMENT);
   }
}
