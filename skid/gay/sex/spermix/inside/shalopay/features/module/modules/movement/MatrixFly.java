package skid.gay.sex.spermix.inside.shalopay.features.module.modules.movement;

import net.minecraft.client.Minecraft;
import skid.gay.sex.spermix.inside.shalopay.features.module.Module;
import skid.gay.sex.spermix.inside.shalopay.features.module.ModuleCategory;

public class MatrixFly extends Module {
   public void h() {
      if (this.c()) {
         if (mc.gameSettings.keyBindJump.isKeyDown()) {
            Minecraft var10000 = mc;
            Minecraft.player.motionY = 0.0D;
            var10000 = mc;
            if (Minecraft.player.fallDistance == 0.0F) {
               var10000 = mc;
               Minecraft.player.motionY = 0.1D;
            }
         }

      }
   }

   public MatrixFly() {
      super("MatrixFly", 0, ModuleCategory.MOVEMENT);
   }
}
