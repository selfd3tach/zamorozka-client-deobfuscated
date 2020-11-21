package skid.gay.sex.spermix.inside.shalopay.features.module.modules.movement;

import net.minecraft.client.Minecraft;
import skid.gay.sex.spermix.inside.shalopay.features.module.Module;
import skid.gay.sex.spermix.inside.shalopay.features.module.ModuleCategory;

public class Jesus extends Module {
    public Jesus() {
        super("Jesus", 0, ModuleCategory.PLAYER);
    }

    public void onUpdate() {
        if (this.getState()) {
            this.m();
        }

    }

    public void m() {
        Minecraft var10000 = mc;
        if (Minecraft.player.isInWater()) {
            var10000 = mc;
            Minecraft.player.motionY = 0.0D;
        }

    }
}
