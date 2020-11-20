package skid.gay.sex.spermix.inside.shalopay.features.module.modules.combat;

import java.util.List;
import java.util.Random;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import skid.gay.sex.spermix.inside.shalopay.features.smthLikeInit.Main;
import skid.gay.sex.spermix.inside.shalopay.features.module.Module;
import skid.gay.sex.spermix.inside.shalopay.features.module.ModuleCategory;

public class Reach extends Module {
   
   private final Random d = new Random();

   public Reach() {
      super("Reach", 0, ModuleCategory.COMBAT);
   }

   public void h() {
      if (this.c()) {
         List var1 = mc.world.playerEntities;

         for(int var2 = 0; var2 < var1.size(); ++var2) {
            String var10000 = ((EntityPlayer)var1.get(var2)).getName();
            Minecraft var10001 = mc;
            if (var10000 != Minecraft.player.getName()) {
               EntityPlayer var3 = (EntityPlayer)var1.get(1);
               if (mc.gameSettings.keyBindAttack.isKeyDown()) {
                  Minecraft var5 = mc;
                  float var4 = Minecraft.player.getDistanceToEntity(var3);
                  if ((double)var4 < Main.a.a("Reach").f()) {
                     var5 = mc;
                     if (Minecraft.player.canEntityBeSeen(var3)) {
                        var10001 = mc;
                        mc.playerController.attackEntity(Minecraft.player, var3);
                     }
                  }
               }
            }
         }
      }

   }

   public void j() {
      Main.a.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("Reach", this, 3.0D, 0.0D, 7.0D, true));
   }
}
