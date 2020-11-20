package skid.gay.sex.spermix.inside.shalopay.features.module.modules.movement;

import java.util.ArrayList;
import net.minecraft.client.Minecraft;
import net.minecraft.network.play.client.CPacketPlayer$Position;
import skid.gay.sex.spermix.inside.shalopay.features.smthLikeInit.Main;
import skid.gay.sex.spermix.inside.shalopay.features.module.Module;
import skid.gay.sex.spermix.inside.shalopay.features.module.ModuleCategory;

public class Fly extends Module {
   
   public static float d = 3.0F;

   public void j() {
      ArrayList var1 = new ArrayList();
      ArrayList var2 = new ArrayList();
      ArrayList var3 = new ArrayList();
      var1.add("Enable");
      var2.add("Enable");
      var2.add("Disable");
      var3.add("Enable");
      var3.add("Disable");
      Main.a.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("Flight", this, false));
      Main.a.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("FlyWalk", this, true));
      Main.a.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("FlyUp", this, false));
   }

   public Fly() {
      super("Fly", 0, ModuleCategory.PLAYER);
   }

   public void g() {
      Minecraft var10000 = mc;
      Minecraft.player.capabilities.isFlying = false;
   }

   public void h() {
      if (this.c()) {
         Minecraft var10000;
         if (Main.a.a("Flight").e()) {
            var10000 = mc;
            Minecraft.player.capabilities.setFlySpeed(0.1F);
            var10000 = mc;
            Minecraft.player.capabilities.isFlying = true;
         }

         double var2;
         Minecraft var10003;
         Minecraft var10004;
         Minecraft var10005;
         if (Main.a.a("FlyWalk").e()) {
            var10000 = mc;
            Minecraft.player.motionY = 0.0D;
            var10000 = mc;
            Minecraft var10001 = mc;
            Minecraft var10002 = mc;
            double var1 = Minecraft.player.posY + 1.0E-10D;
            var10003 = mc;
            Minecraft.player.setPosition(Minecraft.player.posX, var1, Minecraft.player.posZ);
            var10000 = mc;
            Minecraft.player.onGround = true;
            var10000 = mc;
            if (Minecraft.player.ticksExisted % 3 == 0) {
               var10000 = mc;
               var10003 = mc;
               var10004 = mc;
               var2 = Minecraft.player.posY - 1.0E-10D;
               var10005 = mc;
               Minecraft.player.connection.sendPacket(new CPacketPlayer$Position(Minecraft.player.posX, var2, Minecraft.player.posZ, true));
            }
         }

         if (Main.a.a("FlyUp").e() && mc.gameSettings.keyBindJump.isKeyDown()) {
            var10000 = mc;
            Minecraft.player.motionY = 0.9D;
            var10000 = mc;
            if (Minecraft.player.ticksExisted % 3 == 0) {
               var10000 = mc;
               var10003 = mc;
               var10004 = mc;
               var2 = Minecraft.player.posY - 1.0E-10D;
               var10005 = mc;
               Minecraft.player.connection.sendPacket(new CPacketPlayer$Position(Minecraft.player.posX, var2, Minecraft.player.posZ, true));
            }
         }

      }
   }
}
