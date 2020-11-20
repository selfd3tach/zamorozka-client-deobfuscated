package skid.gay.sex.spermix.inside.shalopay.features.module.modules.movement;

import java.util.ArrayList;

import skid.gay.sex.spermix.inside.shalopay.features.module.Module;
import skid.gay.sex.spermix.inside.shalopay.features.module.ModuleCategory;

public class Timer extends Module {
   public Timer() {
      super("Timer", 0, ModuleCategory.PLAYER);
   }

   public void j() {
      ArrayList var1 = new ArrayList();
      var1.add("Timer");
      skid.gay.sex.spermix.inside.shalopay.discordrpc.AutoArmor.AimBot.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("Timer speed", this, 1.0D, 0.0D, 20.0D, true));
   }

   public void h() {
      if (this.c()) {
         Timer.elapsedTicks = (float) skid.gay.sex.spermix.inside.shalopay.discordrpc.AutoArmor.AimBot.a("Timer speed").f();
      }
   }
}
