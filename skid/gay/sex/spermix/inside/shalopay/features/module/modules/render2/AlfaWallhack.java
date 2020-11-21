package skid.gay.sex.spermix.inside.shalopay.features.module.modules.render2;

import org.lwjgl.opengl.GL11;
import skid.gay.sex.spermix.inside.shalopay.features.module.Module;
import skid.gay.sex.spermix.inside.shalopay.features.module.ModuleCategory;

import java.util.ArrayList;

public class AlfaWallhack extends Module {

    private final ArrayList d = new ArrayList();

    public AlfaWallhack() {
        super("Alfa-Wallhack", 0, ModuleCategory.RENDER2);
    }

    public void onRender() {
        if (this.getState()) {
            GL11.glDisable(2929);
        }

    }
}
