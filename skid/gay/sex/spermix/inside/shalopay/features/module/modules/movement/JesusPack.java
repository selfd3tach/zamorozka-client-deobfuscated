package skid.gay.sex.spermix.inside.shalopay.features.module.modules.movement;

import net.minecraft.client.Minecraft;
import skid.gay.sex.spermix.inside.shalopay.features.module.Module;
import skid.gay.sex.spermix.inside.shalopay.features.module.ModuleCategory;

public class JesusPack extends Module {
    public JesusPack() {
        super("JesusPack", 0, ModuleCategory.PLAYER);
    }

    public void onUpdate() {
        if (this.getState()) {
            Minecraft var10000 = mc;
            if (Minecraft.player.isInWater()) {
                var10000 = mc;
                if (!Minecraft.player.isCollidedHorizontally) {
                    var10000 = mc;
                    Minecraft.player.motionY = 0.1D;
                    var10000 = mc;
                    Minecraft.player.onGround = true;
                }
            }
        }

    }
}
