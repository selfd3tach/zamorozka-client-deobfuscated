package skid.gay.sex.spermix.inside.shalopay.features.module.modules.render2;

import skid.gay.sex.spermix.inside.shalopay.features.module.Module;
import skid.gay.sex.spermix.inside.shalopay.features.module.ModuleCategory;
import skid.gay.sex.spermix.inside.shalopay.features.smthLikeInit.Main;

import java.util.ArrayList;

public class XRay extends Module {

    public ArrayList d = new ArrayList();

    public XRay() {
        super("X-Ray", 0, ModuleCategory.RENDER2);
    }

    public void onEnable() {
        skid.gay.sex.spermix.inside.shalopay.ColorPicker.Timer.Bind = true;
        mc.renderGlobal.loadRenderers();
        if (Main.a.a("FullBright").c().equalsIgnoreCase("Enable")) {
            if (this.getState()) {
                mc.gameSettings.gammaSetting = 10.0F;
            } else {
                mc.gameSettings.gammaSetting = 1.0F;
            }

        }
    }

    public void initModule() {
        ArrayList var1 = new ArrayList();
        var1.add("Enable");
        var1.add("Disable");
        Main.a.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("FullBright", this, "Enable", var1));
    }

    public void onDisable() {
        skid.gay.sex.spermix.inside.shalopay.ColorPicker.Timer.Bind = false;
        mc.renderGlobal.loadRenderers();
        if (Main.a.a("FullBright").c().equalsIgnoreCase("Disable")) {
            if (this.getState()) {
                mc.gameSettings.gammaSetting = 1.0F;
            }

        }
    }
}
