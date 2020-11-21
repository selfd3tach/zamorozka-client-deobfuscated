package skid.gay.sex.spermix.inside.shalopay.features.module.modules.world;

import skid.gay.sex.spermix.inside.shalopay.features.module.Module;
import skid.gay.sex.spermix.inside.shalopay.features.module.ModuleCategory;
import skid.gay.sex.spermix.inside.shalopay.features.smthLikeInit.Main;

public class HorseFly extends Module {
    public HorseFly() {
        super("HorseFly", 0, ModuleCategory.WORLD);
    }

    public void onUpdate() {
        if (this.getState()) {
            this.m();
        }

    }

    private void m() {
        if (Main.e().isRiding()) {
            Main.e().getLowestRidingEntity().motionY = mc.gameSettings.keyBindJump.pressed ? 1.5D : 0.0D;
        }

    }
}
