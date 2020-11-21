package skid.gay.sex.spermix.inside.shalopay.features.module.modules.player2;

import skid.gay.sex.spermix.inside.shalopay.features.module.Module;
import skid.gay.sex.spermix.inside.shalopay.features.module.ModuleCategory;
import skid.gay.sex.spermix.inside.shalopay.features.smthLikeInit.Main;

public class KeepSprint extends Module {
    public KeepSprint() {
        super("KeepSprint", 0, ModuleCategory.PLAYER2);
    }

    public void initModule() {
        Main.a.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("FastSprint", this, false));
    }
}
