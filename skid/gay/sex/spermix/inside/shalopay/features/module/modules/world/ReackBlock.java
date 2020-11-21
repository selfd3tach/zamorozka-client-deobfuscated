package skid.gay.sex.spermix.inside.shalopay.features.module.modules.world;

import skid.gay.sex.spermix.inside.shalopay.features.module.Module;
import skid.gay.sex.spermix.inside.shalopay.features.module.ModuleCategory;

public class ReackBlock extends Module {
    public ReackBlock() {
        super("ReackBlock", 0, ModuleCategory.WORLD);
    }

    public void onUpdate() {
        this.getState();
    }
}
