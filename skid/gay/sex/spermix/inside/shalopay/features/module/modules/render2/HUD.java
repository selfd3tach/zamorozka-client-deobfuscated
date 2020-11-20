package skid.gay.sex.spermix.inside.shalopay.features.module.modules.render2;

import skid.gay.sex.spermix.inside.shalopay.features.smthLikeInit.Main;
import skid.gay.sex.spermix.inside.shalopay.features.module.Module;
import skid.gay.sex.spermix.inside.shalopay.features.module.ModuleCategory;

import java.util.ArrayList;

public class HUD extends Module {
   public void h() {
      if (this.c()) {
         Main.a.a("Fps").e();
      }

   }

   public void j() {
      ArrayList var1 = new ArrayList();
      var1.add("Enable");
      var1.add("Disable");
      Main.a.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("LineGui", this, true));
      Main.a.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("NewGui", this, false));
      Main.a.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("RainBow", this, "Disable", var1));
      Main.a.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("Fps", this, false));
      Main.a.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("Model", this, false));
      Main.a.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("InfoBoard", this, false));
      Main.a.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("PlayerBoard", this, false));
      Main.a.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("ModuleState", this, true));
      Main.a.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("ArmorStatus", this, false));
   }

   public HUD() {
      super("HUD", 0, ModuleCategory.RENDER2);
   }
}
