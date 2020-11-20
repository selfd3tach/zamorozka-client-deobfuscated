package skid.gay.sex.spermix.inside.shalopay.features.module.modules.combat;

import java.util.List;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.MathHelper;
import skid.gay.sex.spermix.inside.shalopay.features.smthLikeInit.Main;
import skid.gay.sex.spermix.inside.shalopay.features.module.Module;
import skid.gay.sex.spermix.inside.shalopay.features.module.ModuleCategory;

public class AimBot extends Module {
   public void j() {
      Main.a.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("AimDist", this, 3.7D, 0.0D, 20.5D, true));
   }

   public void h() {
      if (this.c()) {
         List var1 = mc.world.playerEntities;

         for(int var2 = 0; var2 < var1.size(); ++var2) {
            String var10000 = ((EntityPlayer)var1.get(var2)).getName();
            Minecraft var10001 = mc;
            if (var10000 != Minecraft.player.getName()) {
               EntityPlayer var3 = (EntityPlayer)var1.get(1);
               Minecraft var5 = mc;
               float var6 = Minecraft.player.getDistanceToEntity(var3);
               var10001 = mc;
               if (var6 > Minecraft.player.getDistanceToEntity((Entity)var1.get(var2))) {
                  var3 = (EntityPlayer)var1.get(var2);
               }

               var5 = mc;
               float var4 = Minecraft.player.getDistanceToEntity(var3);
               if ((double)var4 < Main.a.a("AimDist").f()) {
                  var5 = mc;
                  if (Minecraft.player.canEntityBeSeen(var3)) {
                     a((EntityLivingBase)var3);
                  }
               }
            }
         }

      }
   }

   public AimBot() {
      super("AimBot", 0, ModuleCategory.COMBAT);
   }

   public static float[] a(Entity var0) {
      if (var0 == null) {
         return null;
      } else {
         Minecraft var10001 = mc;
         double var1 = var0.posX - Minecraft.player.posX;
         var10001 = mc;
         double var3 = var0.posZ - Minecraft.player.posZ;
         double var5;
         double var10000;
         Minecraft var10002;
         if (var0 instanceof EntityLivingBase) {
            EntityLivingBase var7 = (EntityLivingBase)var0;
            var10000 = var7.posY + (double)var7.getEyeHeight();
            var10001 = mc;
            var10002 = mc;
            var5 = var10000 - (Minecraft.player.posY + (double)Minecraft.player.getEyeHeight());
         } else {
            var10000 = (var0.boundingBox.minY + var0.boundingBox.maxY) / 2.0D;
            var10001 = mc;
            var10002 = mc;
            var5 = var10000 - (Minecraft.player.posY + (double)Minecraft.player.getEyeHeight());
         }

         double var11 = (double)MathHelper.sqrt_double(var1 * var1 + var3 * var3);
         float var9 = (float)(Math.atan2(var3, var1) * 180.0D / 3.141592653589793D) - 90.0F;
         float var10 = (float)(-(Math.atan2(var5, var11) * 180.0D / 3.141592653589793D));
         float[] var12 = new float[2];
         Minecraft var10003 = mc;
         Minecraft var10005 = mc;
         var12[0] = Minecraft.player.rotationYaw + MathHelper.wrapAngleTo180_float(var9 - Minecraft.player.rotationYaw);
         var10003 = mc;
         var10005 = mc;
         var12[1] = Minecraft.player.rotationPitch + MathHelper.wrapAngleTo180_float(var10 - Minecraft.player.rotationPitch);
         return var12;
      }
   }

   public static synchronized void a(EntityLivingBase var0) {
      float[] var1 = a((Entity)var0);
      if (var1 != null) {
         Minecraft var10000 = mc;
         Minecraft.player.rotationYaw = var1[0];
         var10000 = mc;
         Minecraft.player.rotationPitch = var1[1] + 1.0F;
      }

   }
}
