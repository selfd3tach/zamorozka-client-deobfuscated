package skid.gay.sex.spermix.inside.shalopay.features.module.modules.render2;

import skid.gay.sex.spermix.inside.shalopay.features.module.Module;
import skid.gay.sex.spermix.inside.shalopay.features.module.ModuleCategory;

public class FullBright extends Module {
   public FullBright() {
      super("FullBright", 0, ModuleCategory.RENDER2);
   }

   public void h() {
      if (this.c()) {
         mc.gameSettings.gammaSetting = 10.0F;
      } else {
         mc.gameSettings.gammaSetting = 1.0F;
      }

   }
}
