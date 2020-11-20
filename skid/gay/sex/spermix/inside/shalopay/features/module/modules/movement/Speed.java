package skid.gay.sex.spermix.inside.shalopay.features.module.modules.movement;

import net.minecraft.client.Minecraft;
import net.minecraft.util.Timer;
import skid.gay.sex.spermix.inside.shalopay.features.module.Module;
import skid.gay.sex.spermix.inside.shalopay.features.module.ModuleCategory;

public class Speed extends Module {
   
   public static int d = 0;
   
   public static boolean e = true;
   
   public static int f = 0;

   public Speed() {
      super("Speed", 0, ModuleCategory.PLAYER);
   }

   public void j() {
      skid.gay.sex.spermix.inside.shalopay.discordrpc.AutoArmor.AimBot.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("MatrixSpeed", this, true));
      skid.gay.sex.spermix.inside.shalopay.discordrpc.AutoArmor.AimBot.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("CubeSpeed", this, false));
      skid.gay.sex.spermix.inside.shalopay.discordrpc.AutoArmor.AimBot.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("AACSpeed", this, false));
   }

   public void h() {
      if (this.c()) {
         Minecraft var10000;
         Timer var4;
         if (skid.gay.sex.spermix.inside.shalopay.discordrpc.AutoArmor.AimBot.a("MatrixSpeed").e()) {
            skid.gay.sex.spermix.inside.shalopay.discordrpc.AutoArmor.AimBot.a("CubeSpeed").a(false);
            if (mc.gameSettings.keyBindJump.isKeyDown()) {
               var10000 = mc;
               if (Minecraft.player.ticksExisted % 10 == 0) {
                  var4 = mc.timer;
                  Timer.elapsedTicks = 1.7F;
                  var10000 = mc;
                  Minecraft.player.motionY = -0.01D;
               }
            }
         }

         if (skid.gay.sex.spermix.inside.shalopay.discordrpc.AutoArmor.AimBot.a("CubeSpeed").e()) {
            skid.gay.sex.spermix.inside.shalopay.discordrpc.AutoArmor.AimBot.a("MatrixSpeed").a(false);
            var10000 = mc;
            Minecraft var10001 = mc;
            float var5 = Minecraft.player.rotationYaw + (float)(Minecraft.player.moveForward < 0.0F ? 180 : 0);
            var10001 = mc;
            float var6;
            if (Minecraft.player.moveStrafing > 0.0F) {
               Minecraft var10002 = mc;
               float var7;
               if (Minecraft.player.moveForward < 0.0F) {
                  var7 = -0.5F;
               } else {
                  var10002 = mc;
                  var7 = Minecraft.player.moveForward > 0.0F ? 0.4F : 1.0F;
               }

               var6 = -90.0F * var7;
            } else {
               var6 = 0.0F;
            }

            float var1 = var5 + var6;
            float var2 = (float)Math.cos((double)(var1 + 90.0F) * 3.141592653589793D / 180.0D);
            float var3 = (float)Math.sin((double)(var1 + 90.0F) * 3.141592653589793D / 180.0D);
            var10000 = mc;
            Minecraft.player.motionX = (double)var2 * 0.4D;
            var10000 = mc;
            Minecraft.player.motionZ = (double)var3 * 0.4D;
            var4 = mc.timer;
            Timer.elapsedTicks = 0.0F;
         }

         if (skid.gay.sex.spermix.inside.shalopay.discordrpc.AutoArmor.AimBot.a("AACSpeed").e()) {
            skid.gay.sex.spermix.inside.shalopay.discordrpc.AutoArmor.AimBot.a("CubeSpeed").a(false);
            skid.gay.sex.spermix.inside.shalopay.discordrpc.AutoArmor.AimBot.a("MatrixSpeed").a(false);
            var10000 = mc;
            if (Minecraft.player.ticksExisted % 2 == 0) {
               var4 = mc.timer;
               Timer.elapsedTicks = 2.0F;
            }

            var10000 = mc;
            if (Minecraft.player.ticksExisted % 3 == 0) {
               var4 = mc.timer;
               Timer.elapsedTicks = 0.0F;
            }

            var10000 = mc;
            if (Minecraft.player.ticksExisted % 6 == 0) {
               var4 = mc.timer;
               Timer.elapsedTicks = 0.0F;
            }
         }

      }
   }
}
