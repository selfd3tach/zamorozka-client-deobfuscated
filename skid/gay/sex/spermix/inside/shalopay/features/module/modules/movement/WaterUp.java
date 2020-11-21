package skid.gay.sex.spermix.inside.shalopay.features.module.modules.movement;

import net.minecraft.client.Minecraft;
import skid.gay.sex.spermix.inside.shalopay.features.module.Module;
import skid.gay.sex.spermix.inside.shalopay.features.module.ModuleCategory;

public class WaterUp extends Module {

    public static float d = 3.0F;

    public WaterUp() {
        super("WaterUp", 0, ModuleCategory.MOVEMENT);
    }

    public void onDisable() {
        Minecraft var10000 = mc;
        Minecraft.player.capabilities.isFlying = false;
    }

    public void onUpdate() {
        if (this.getState()) {
        }
    }
}
