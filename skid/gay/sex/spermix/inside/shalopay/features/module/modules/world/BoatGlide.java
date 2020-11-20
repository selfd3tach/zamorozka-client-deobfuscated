package skid.gay.sex.spermix.inside.shalopay.features.module.modules.world;

import net.minecraft.client.Minecraft;
import skid.gay.sex.spermix.inside.shalopay.features.module.Module;
import skid.gay.sex.spermix.inside.shalopay.features.module.ModuleCategory;

public class BoatGlide extends Module {
   public void h() {
      if (this.c()) {
         Minecraft var10000 = mc;
         if (Minecraft.player.isRiding()) {
            var10000 = mc;
            Minecraft.player.getRidingEntity().motionY = 0.0D;
         }
      }

   }

   public BoatGlide() {
      super("BoatGlide", 0, ModuleCategory.b);
   }
}
