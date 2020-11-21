package skid.gay.sex.spermix.inside.shalopay.features.module.modules.render2;

import skid.gay.sex.spermix.inside.shalopay.features.module.Module;
import skid.gay.sex.spermix.inside.shalopay.features.module.ModuleCategory;

public class Mirror extends Module {
    public Mirror() {
        super("Mirror", 0, ModuleCategory.RENDER2);
    }

    public void onUpdate() {
        this.getState();
    }
}
