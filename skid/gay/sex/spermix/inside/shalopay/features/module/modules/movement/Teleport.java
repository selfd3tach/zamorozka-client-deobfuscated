package skid.gay.sex.spermix.inside.shalopay.features.module.modules.movement;

import net.minecraft.client.Minecraft;
import net.minecraft.network.play.client.CPacketPlayer$Position;
import net.minecraft.util.math.BlockPos;
import org.lwjgl.input.Mouse;
import skid.gay.sex.spermix.inside.shalopay.features.module.Module;
import skid.gay.sex.spermix.inside.shalopay.features.module.ModuleCategory;

public class Teleport extends Module {
   public void h() {
      if (this.c()) {
         BlockPos var1 = mc.objectMouseOver.getBlockPos();
         if (Mouse.isButtonDown(0)) {
            double var10000 = (double)var1.getX();
            Minecraft var10001 = mc;
            int var2 = (int)(var10000 - Minecraft.player.posX);
            var10000 = (double)var1.getY();
            var10001 = mc;
            int var3 = (int)(var10000 - Minecraft.player.posY);
            var10000 = (double)var1.getZ();
            var10001 = mc;
            int var4 = (int)(var10000 - Minecraft.player.posZ);
            Minecraft var5 = mc;
            Minecraft.player.setPosition((double)var1.getX(), (double)var1.getY(), (double)var1.getZ());
            var5 = mc;
            Minecraft.player.connection.sendPacket(new CPacketPlayer$Position((double)var2, (double)var3, (double)var4, true));
         }

      }
   }

   public Teleport() {
      super("Teleport", 0, ModuleCategory.EXPLOIT);
   }
}
