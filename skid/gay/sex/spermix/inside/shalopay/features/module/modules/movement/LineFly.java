package skid.gay.sex.spermix.inside.shalopay.features.module.modules.movement;

import net.minecraft.client.Minecraft;
import skid.gay.sex.spermix.inside.shalopay.features.module.Module;
import skid.gay.sex.spermix.inside.shalopay.features.module.ModuleCategory;

public class LineFly extends Module {
   public LineFly() {
      super("LineFly", 0, ModuleCategory.MOVEMENT);
   }

   public void h() {
      if (this.c()) {
         Minecraft var10000 = mc;
         if (Minecraft.player.fallDistance > 2.0F) {
            var10000 = mc;
            Minecraft.player.motionY = 0.11D;
            var10000 = mc;
            if (Minecraft.player.ticksExisted % 3 == 0) {
               var10000 = mc;
               Minecraft.player.motionY = -0.1D;
            }
         }

      }
   }
}
