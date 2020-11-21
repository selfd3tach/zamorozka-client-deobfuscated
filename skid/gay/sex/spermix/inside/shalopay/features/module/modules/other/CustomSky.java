package skid.gay.sex.spermix.inside.shalopay.features.module.modules.other;

import skid.gay.sex.spermix.inside.shalopay.features.module.Module;
import skid.gay.sex.spermix.inside.shalopay.features.module.ModuleCategory;
import skid.gay.sex.spermix.inside.shalopay.features.smthLikeInit.Main;

public class CustomSky extends Module {
    public CustomSky() {
        super("CustomSky", 0, ModuleCategory.OTHER);
    }

    public void initModule() {
        Main.a.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("CustomSky", this, 1.0D, 0.0D, 300.0D, true));
    }
}
