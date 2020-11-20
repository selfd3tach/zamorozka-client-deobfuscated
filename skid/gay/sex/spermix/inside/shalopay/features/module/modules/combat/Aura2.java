package skid.gay.sex.spermix.inside.shalopay.features.module.modules.combat;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumHand;
import skid.gay.sex.spermix.inside.shalopay.features.smthLikeInit.Main;
import skid.gay.sex.spermix.inside.shalopay.features.module.Module;
import skid.gay.sex.spermix.inside.shalopay.features.module.ModuleCategory;

public class Aura2 extends Module {
   
   private final Random f = new Random();
   
   int d;
   
   int e = 1;

   private void m() {
      List var1 = mc.world.playerEntities;
      ++this.d;

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
            if ((double)var4 < Main.a.a("Distance").f()) {
               var5 = mc;
               if (Minecraft.player.canEntityBeSeen(var3) && this.d > 7) {
                  if (Main.a.a("Heal").c().equalsIgnoreCase("Disable") && Main.a.a("FreeBots").c().equalsIgnoreCase("Disable")) {
                     var10001 = mc;
                     mc.playerController.attackEntity(Minecraft.player, var3);
                     if (Main.a.a("Hand").c().equalsIgnoreCase("Right")) {
                        var5 = mc;
                        Minecraft.player.swingArm(EnumHand.MAIN_HAND);
                     } else {
                        var5 = mc;
                        Minecraft.player.swingArm(EnumHand.OFF_HAND);
                     }
                  }

                  if (Main.a.a("Heal").c().equalsIgnoreCase("Enable") && Main.a.a("FreeBots").c().equalsIgnoreCase("Enable")) {
                     if (var3.getName() != "") {
                        var10001 = mc;
                        mc.playerController.attackEntity(Minecraft.player, var3);
                     }

                     Main.a(String.valueOf((new StringBuilder(String.valueOf(var3.getName()))).append(" Heall: ").append((double)Math.round(var3.getHealth() * 100.0F / 100.0F) / 2.0D)), true);
                     if (Main.a.a("Hand").c().equalsIgnoreCase("Right")) {
                        var5 = mc;
                        Minecraft.player.swingArm(EnumHand.MAIN_HAND);
                     } else {
                        var5 = mc;
                        Minecraft.player.swingArm(EnumHand.OFF_HAND);
                     }
                  }

                  this.d = (int) Main.a.a("Delay").f();
               }
            }
         }
      }

   }

   private void n() {
      if (Main.a.a("Aura-2").c().equalsIgnoreCase("Start")) {
         List var1 = mc.world.playerEntities;
         ++this.d;

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
               if ((double)var4 < Main.a.a("Distance").f()) {
                  var5 = mc;
                  if (Minecraft.player.canEntityBeSeen(var3) && this.d > 7) {
                     var10001 = mc;
                     mc.playerController.attackEntity(Minecraft.player, var3);
                     var5 = mc;
                     Minecraft.player.swingArm(EnumHand.MAIN_HAND);
                     this.d = (int) Main.a.a("Delay").f();
                  }
               }
            }
         }

      }
   }

   public Aura2() {
      super("Killaura", 0, ModuleCategory.COMBAT);
   }

   public void j() {
      ArrayList var1 = new ArrayList();
      ArrayList var2 = new ArrayList();
      ArrayList var3 = new ArrayList();
      ArrayList var4 = new ArrayList();
      var1.add("Right");
      var1.add("Left");
      var2.add("Start");
      var2.add("Stop");
      var3.add("Enable");
      var3.add("Disable");
      var4.add("Enable");
      var4.add("Disable");
      Main.a.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("Heal", this, "Enable", var3));
      Main.a.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("FreeBots", this, "Enable", var4));
      Main.a.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("Hand", this, "Right", var1));
      Main.a.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("Aura-2", this, "Stop", var2));
      Main.a.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("Distance", this, 4.0D, 0.0D, 20.0D, true));
      Main.a.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("Delay", this, 0.1D, 0.0D, 12.0D, true));
      Main.a.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("Yaw", this, 90.0D, 0.0D, 180.0D, true));
      Main.a.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("Pitch", this, 90.0D, 0.0D, 180.0D, true));
   }

   public void h() {
      if (this.c()) {
         this.m();
         this.n();
      }

   }
}
