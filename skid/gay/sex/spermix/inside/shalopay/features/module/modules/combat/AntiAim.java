package skid.gay.sex.spermix.inside.shalopay.features.module.modules.combat;

import java.util.Random;
import net.minecraft.client.Minecraft;
import net.minecraft.network.play.client.CPacketEntityAction;
import net.minecraft.network.play.client.CPacketEntityAction$Action;
import net.minecraft.network.play.client.CPacketPlayer$Rotation;
import skid.gay.sex.spermix.inside.shalopay.features.module.Module;
import skid.gay.sex.spermix.inside.shalopay.features.module.ModuleCategory;

public class AntiAim extends Module {
   
   private final Random d = new Random();

   public void h() {
      if (this.c()) {
         this.m();
      }

   }

   public AntiAim() {
      super("AntiAim", 0, ModuleCategory.COMBAT);
   }

   private void m() {
      Minecraft var10000 = mc;
      if (Minecraft.player.ticksExisted % 10 == 0) {
         var10000 = mc;
         float var1 = Minecraft.player.cameraYaw + this.d.nextFloat() * 180.0F;
         var10000 = mc;
         float var2 = Minecraft.player.cameraPitch + this.d.nextFloat() * 90.0F;
         var10000 = mc;
         Minecraft.player.renderYawOffset = var1;
         var10000 = mc;
         Minecraft.player.connection.sendPacket(new CPacketPlayer$Rotation(var1, var2, false));
      }

      var10000 = mc;
      Minecraft var10003;
      if (Minecraft.player.ticksExisted % 5 == 0) {
         var10000 = mc;
         var10003 = mc;
         Minecraft.player.connection.sendPacket(new CPacketEntityAction(Minecraft.player, CPacketEntityAction$Action.START_SNEAKING));
      }

      var10000 = mc;
      if (Minecraft.player.ticksExisted % 3 == 0) {
         var10000 = mc;
         var10003 = mc;
         Minecraft.player.connection.sendPacket(new CPacketEntityAction(Minecraft.player, CPacketEntityAction$Action.STOP_SNEAKING));
      }

   }
}
