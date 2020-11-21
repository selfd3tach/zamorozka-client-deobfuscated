package skid.gay.sex.spermix.inside.shalopay.features.module.modules.movement;

import skid.gay.sex.spermix.inside.shalopay.features.module.Module;
import skid.gay.sex.spermix.inside.shalopay.features.module.ModuleCategory;

import java.util.ArrayList;

public class Timer extends Module {
    public Timer() {
        super("Timer", 0, ModuleCategory.PLAYER);
    }

    public void initModule() {
        ArrayList var1 = new ArrayList();
        var1.add("Timer");
        skid.gay.sex.spermix.inside.shalopay.discordrpc.AutoArmor.AimBot.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("Timer speed", this, 1.0D, 0.0D, 20.0D, true));
    }

    public void onUpdate() {
        if (this.getState()) {
            Timer.elapsedTicks = (float) skid.gay.sex.spermix.inside.shalopay.discordrpc.AutoArmor.AimBot.a("Timer speed").f();
        }
    }
}
