package skid.gay.sex.spermix.inside.shalopay.features.module.modules.world;

import skid.gay.sex.spermix.inside.shalopay.features.smthLikeInit.Main;
import skid.gay.sex.spermix.inside.shalopay.features.module.Module;
import skid.gay.sex.spermix.inside.shalopay.features.module.ModuleCategory;

public class HorseFly extends Module {
   public void h() {
      if (this.c()) {
         this.m();
      }

   }

   private void m() {
      if (Main.e().isRiding()) {
         Main.e().getLowestRidingEntity().motionY = mc.gameSettings.keyBindJump.pressed ? 1.5D : 0.0D;
      }

   }

   public HorseFly() {
      super("HorseFly", 0, ModuleCategory.WORLD);
   }
}
