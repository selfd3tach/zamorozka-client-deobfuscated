package skid.gay.sex.spermix.inside.shalopay.features.module.modules.world;

import skid.gay.sex.spermix.inside.shalopay.features.module.Module;
import skid.gay.sex.spermix.inside.shalopay.features.module.ModuleCategory;

public class FastPlace extends Module {
    public FastPlace() {
        super("FastPlace", 0, ModuleCategory.WORLD);
    }

    public void onUpdate() {
        if (this.getState()) {
            mc.rightClickDelayTimer = 0;
        }

    }

    public void onDisable() {
        mc.rightClickDelayTimer = 6;
    }
}
