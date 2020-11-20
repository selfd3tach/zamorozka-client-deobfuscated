package skid.gay.sex.spermix.inside.shalopay.features.hud;

import skid.gay.sex.spermix.inside.shalopay.features.smthLikeInit.Main;
import skid.gay.sex.spermix.inside.shalopay.features.module.Module;
import skid.gay.sex.spermix.inside.shalopay.features.module.ModuleCategory;

public class TextRadar extends Module {
   public TextRadar() {
      super("TextRadar", 0, ModuleCategory.HUD);
   }

   public void j() {
      Main.a.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("Left Edge", this, true));
      Main.a.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("Centre", this, false));
   }
}
