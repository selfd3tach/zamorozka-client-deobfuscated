package skid.gay.sex.spermix.inside.shalopay.features.module.modules.combat;

import skid.gay.sex.spermix.inside.shalopay.features.module.Module;
import skid.gay.sex.spermix.inside.shalopay.features.module.ModuleCategory;
import skid.gay.sex.spermix.inside.shalopay.features.smthLikeInit.Main;

public class AutoClicker extends Module {
    public AutoClicker() {
        super("AutoClicker", 0, ModuleCategory.COMBAT);
    }

    public void onUpdate() {
        if (this.getState()) {
            for (int var1 = 0; (double) var1 < Main.a.a("SpeedClick").f(); ++var1) {
                mc.clickMouse();
            }
        }

    }

    public void initModule() {
        Main.a.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("SpeedClick", this, 3.0D, 0.0D, 50.0D, true));
    }
}
