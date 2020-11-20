package skid.gay.sex.spermix.inside.shalopay.features.maybehudmode;

import java.util.ArrayList;

import skid.gay.sex.spermix.inside.shalopay.features.smthLikeInit.Main;
import skid.gay.sex.spermix.inside.shalopay.features.module.Module;
import skid.gay.sex.spermix.inside.shalopay.features.module.ModuleCategory;

public class HudMode extends Module {
   public HudMode() {
      super("ClickGUI", 54, ModuleCategory.HUDMODE);
   }

   public void f() {
      super.f();
      mc.displayGuiScreen(Main.i);
      this.k();
   }

   public void j() {
      ArrayList var1 = new ArrayList();
      ArrayList var2 = new ArrayList();
      var1.add("New");
      var2.add("Defaulted");
      var2.add("Rainbow");
      Main.a.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("Design", this, "New", var1));
      Main.a.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("Type", this, "Defaulted", var2));
      Main.a.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("Sound", this, false));
      Main.a.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("GuiRed", this, 39.0D, 0.0D, 255.0D, true));
      Main.a.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("GuiGreen", this, 30.0D, 0.0D, 255.0D, true));
      Main.a.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("GuiBlue", this, 255.0D, 0.0D, 255.0D, true));
   }
}
