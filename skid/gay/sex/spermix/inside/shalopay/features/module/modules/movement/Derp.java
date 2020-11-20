package skid.gay.sex.spermix.inside.shalopay.features.module.modules.movement;

import java.util.Random;
import net.minecraft.client.Minecraft;
import net.minecraft.network.play.client.CPacketPlayer$Rotation;
import skid.gay.sex.spermix.inside.shalopay.features.smthLikeInit.Main;
import skid.gay.sex.spermix.inside.shalopay.features.module.Module;
import skid.gay.sex.spermix.inside.shalopay.features.module.ModuleCategory;

public class Derp extends Module {
   
   private static int d = 4;
   
   private final Random e = new Random();

   public void j() {
      Main.a.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("YouSpin", this, false));
      Main.a.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("PackSpin", this, true));
   }

   public void h() {
      if (this.c()) {
         float var1 = this.e.nextFloat() * 360.0F;
         float var2 = this.e.nextFloat() * 180.0F - 90.0F;
         Minecraft var10000;
         if (Main.a.a("YouSpin").e()) {
            var10000 = mc;
            Minecraft.player.rotationYawHead = var1;
            var10000 = mc;
            Minecraft.player.renderYawOffset = var1;
         }

         if (Main.a.a("PackSpin").e()) {
            var10000 = mc;
            Minecraft var10004 = mc;
            Minecraft.player.connection.sendPacket(new CPacketPlayer$Rotation(var1, Minecraft.player.rotationPitch, false));
         }

      }
   }

   public Derp() {
      super("Derp", 0, ModuleCategory.PLAYER);
   }
}
