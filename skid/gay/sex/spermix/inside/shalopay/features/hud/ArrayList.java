package skid.gay.sex.spermix.inside.shalopay.features.hud;

import skid.gay.sex.spermix.inside.shalopay.features.smthLikeInit.Main;
import skid.gay.sex.spermix.inside.shalopay.features.module.Module;
import skid.gay.sex.spermix.inside.shalopay.features.module.ModuleCategory;

public class ArrayList extends Module {
   public void j() {
      Main.a.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("UpArrey", this, true));
      Main.a.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("DownArrey", this, false));
      Main.a.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("TestArrey", this, false));
   }

   public ArrayList() {
      super("ArrayList", 0, ModuleCategory.HUD);
   }

   public void h() {
      this.c();
   }
}
