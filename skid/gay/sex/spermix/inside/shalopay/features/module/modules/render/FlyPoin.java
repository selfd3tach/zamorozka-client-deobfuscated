package skid.gay.sex.spermix.inside.shalopay.features.module.modules.render;

import net.minecraft.client.Minecraft;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.Timer;
import skid.gay.sex.spermix.inside.shalopay.features.smthLikeInit.Main;
import skid.gay.sex.spermix.inside.shalopay.features.module.Module;
import skid.gay.sex.spermix.inside.shalopay.features.module.ModuleCategory;

public class FlyPoin extends Module {
   
   public static int f = 0;
   
   public static int d = 0;
   
   public static boolean e = true;

   public FlyPoin() {
      super("FlyPoin", 0, ModuleCategory.RENDER);
   }

   public void j() {
      Main.a.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("PoinSpeed", this, 1.0D, 0.0D, 3.0D, true));
      Main.a.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("YPoinSpeed", this, false));
   }

   public void h() {
      Minecraft var10000;
      if (this.c()) {
         var10000 = mc;
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
         if (mc.gameSettings.keyBindJump.isKeyDown()) {
            var10000 = mc;
            if (Minecraft.player.fallDistance > 0.0F && f <= 1) {
               if (d > 0 && e) {
                  var10000 = mc;
                  Minecraft.player.addPotionEffect(new PotionEffect(Potion.getPotionById(25), 9999999, 8));
                  d = 0;
               } else {
                  ++d;
               }

               var10000 = mc;
               if ((double)Minecraft.player.fallDistance >= 0.1D) {
                  var10000 = mc;
                  Minecraft.player.removePotionEffect(Potion.getPotionById(25));
                  e = false;
               }

               var10000 = mc;
               if ((double)Minecraft.player.fallDistance >= 0.2D) {
                  var10000 = mc;
                  Minecraft.player.addPotionEffect(new PotionEffect(Potion.getPotionById(25), 9999999, 8));
                  e = true;
                  var10000 = mc;
                  Minecraft.player.fallDistance = 0.0F;
                  if (Main.a.a("YPoinSpeed").e()) {
                     var10000 = mc;
                     Minecraft.player.motionY = Main.a.a("PoinSpeed").f() / 10.0D;
                  }

                  Timer.elapsedTicks = -1000.0F;
               } else {
                  var10000 = mc;
                  Minecraft.player.removePotionEffect(Potion.getPotionById(25));
               }
            }
         } else {
            var10000 = mc;
            Minecraft.player.removePotionEffect(Potion.getPotionById(25));
         }
      } else {
         var10000 = mc;
         Minecraft.player.removePotionEffect(Potion.getPotionById(25));
      }

   }
}
