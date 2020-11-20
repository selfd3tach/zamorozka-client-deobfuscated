package skid.gay.sex.spermix.inside.shalopay.features.module.modules.world;

import net.minecraft.client.Minecraft;
import skid.gay.sex.spermix.inside.shalopay.features.smthLikeInit.Main;
import skid.gay.sex.spermix.inside.shalopay.features.module.Module;
import skid.gay.sex.spermix.inside.shalopay.features.module.ModuleCategory;

public class BoatSpeed2 extends Module {
   public void h() {
      if (this.c()) {
         this.m();
      }

   }

   private void m() {
      if (Main.e().isRiding() && (mc.gameSettings.keyBindForward.isKeyDown() || mc.gameSettings.keyBindLeft.isKeyDown() || mc.gameSettings.keyBindRight.isKeyDown())) {
         Minecraft var10000 = mc;
         Minecraft var10001 = mc;
         float var4 = Minecraft.player.rotationYaw + (float)(Minecraft.player.moveForward < 0.0F ? 180 : 0);
         var10001 = mc;
         float var5;
         if (Minecraft.player.moveStrafing > 0.0F) {
            Minecraft var10002 = mc;
            float var6;
            if (Minecraft.player.moveForward < 0.0F) {
               var6 = -0.5F;
            } else {
               var10002 = mc;
               var6 = Minecraft.player.moveForward > 0.0F ? 0.4F : 1.0F;
            }

            var5 = -90.0F * var6;
         } else {
            var5 = 0.0F;
         }

         float var1 = var4 + var5;
         float var2 = (float)Math.cos((double)(var1 + 90.0F) * 3.141592653589793D / 180.0D);
         float var3 = (float)Math.sin((double)(var1 + 90.0F) * 3.141592653589793D / 180.0D);
         Main.e().getRidingEntity().motionX = (double)var2 * 1.0D;
         Main.e().getRidingEntity().motionZ = (double)var3 * 1.0D;
      }

   }

   public BoatSpeed2() {
      super("BoatSpeed", 0, ModuleCategory.WORLD);
   }
}
