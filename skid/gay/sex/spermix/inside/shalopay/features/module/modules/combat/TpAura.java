package skid.gay.sex.spermix.inside.shalopay.features.module.modules.combat;

import java.util.List;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.play.client.CPacketPlayer;
import net.minecraft.network.play.client.CPacketPlayer$Position;
import net.minecraft.util.EnumHand;
import skid.gay.sex.spermix.inside.shalopay.features.smthLikeInit.Main;
import skid.gay.sex.spermix.inside.shalopay.features.module.Module;
import skid.gay.sex.spermix.inside.shalopay.features.module.ModuleCategory;

public class TpAura extends Module {
   
   int d;

   private void m() {
      List var1 = mc.world.playerEntities;
      ++this.d;

      for(int var2 = 0; var2 < var1.size(); ++var2) {
         String var10000 = ((EntityPlayer)var1.get(var2)).getName();
         Minecraft var10001 = mc;
         if (var10000 != Minecraft.player.getName()) {
            EntityPlayer var3 = (EntityPlayer)var1.get(1);
            Minecraft var6 = mc;
            float var7 = Minecraft.player.getDistanceToEntity(var3);
            var10001 = mc;
            if (var7 > Minecraft.player.getDistanceToEntity((Entity)var1.get(var2))) {
               var3 = (EntityPlayer)var1.get(var2);
            }

            var6 = mc;
            float var4 = Minecraft.player.getDistanceToEntity(var3);
            if (var4 < 20.0F) {
               var6 = mc;
               if (Minecraft.player.getCooledAttackStrength(0.0F) == 1.0F) {
                  var6 = mc;
                  Minecraft.player.posX = var3.posX;
                  var6 = mc;
                  Minecraft.player.connection.sendPacket(new CPacketPlayer());
                  var6 = mc;
                  Minecraft.player.posZ = var3.posZ;
                  var6 = mc;
                  Minecraft.player.connection.sendPacket(new CPacketPlayer());
                  var6 = mc;
                  Minecraft.player.posY = var3.posY;
                  var6 = mc;
                  Minecraft.player.connection.sendPacket(new CPacketPlayer());

                  for(int var5 = 0; var5 < 10; ++var5) {
                     var6 = mc;
                     Minecraft var10003 = mc;
                     Minecraft var10004 = mc;
                     Minecraft var10005 = mc;
                     Minecraft.player.connection.sendPacket(new CPacketPlayer$Position(Minecraft.player.posX, Minecraft.player.posY, Minecraft.player.posZ, true));
                  }

                  var10001 = mc;
                  mc.playerController.attackEntity(Minecraft.player, var3);
                  var6 = mc;
                  Minecraft.player.swingArm(EnumHand.MAIN_HAND);
                  var6 = mc;
                  Minecraft.player.setSprinting(false);
                  Main.a(String.valueOf((new StringBuilder("Click: X: ")).append(var3.posX).append(", Y: ").append(var3.posY).append(", Z: ").append(var3.posZ)), true);
               }
            }
         }
      }

   }

   public void j() {
      Main.a.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("Distance", this, 7.0D, 0.0D, 20.0D, true));
   }

   public TpAura() {
      super("TpAura", 0, ModuleCategory.COMBAT);
   }

   public void h() {
      if (this.c()) {
         this.m();
      }

   }
}
