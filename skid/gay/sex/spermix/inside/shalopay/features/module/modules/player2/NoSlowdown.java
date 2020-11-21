//Deobfuscated with https://github.com/PetoPetko/Minecraft-Deobfuscator3000 using mappings "mc_mappings"!

package skid.gay.sex.spermix.inside.shalopay.features.module.modules.player2;

import net.minecraft.util.MovementInput;
import skid.gay.sex.spermix.inside.shalopay.features.module.Module;
import skid.gay.sex.spermix.inside.shalopay.features.module.ModuleCategory;
import skid.gay.sex.spermix.inside.shalopay.features.smthLikeInit.Main;

public class NoSlowdown extends Module {
    public NoSlowdown() {
        super("NoSlowdown", 0, ModuleCategory.PLAYER2);
    }

    public void initModule() {
        Main.a.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("NCP", this, true));
        Main.a.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("MATRIX", this, false));
        Main.a.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("REFLEX", this, false));
    }

    public void onUpdate() {
        if (this.getState()) {
            Main.a.a("MATRIX").e();
            MovementInput.moveStrafe *= 1.0F;
            MovementInput.moveForward *= 1.0F;
        }

    }
}
