package skid.gay.sex.spermix.inside.shalopay.features.module.modules.combat;

import net.minecraft.client.Minecraft;
import skid.gay.sex.spermix.inside.shalopay.features.module.Module;
import skid.gay.sex.spermix.inside.shalopay.features.module.ModuleCategory;
import skid.gay.sex.spermix.inside.shalopay.features.smthLikeInit.Main;

public class AntiKnockBack extends Module {
    public AntiKnockBack() {
        super("Anti-knockback", 0, ModuleCategory.COMBAT);
    }

    public void onUpdate() {
        if (this.getState()) {
            Minecraft var10000 = mc;
            if (Minecraft.player.hurtResistantTime > 0) {
                var10000 = mc;
                if (Minecraft.player.hurtTime > 9 && Main.a.a("NoFlags").e()) {
                    var10000 = mc;
                    Minecraft.player.motionX = 0.0D;
                    var10000 = mc;
                    Minecraft.player.motionY = 0.0D;
                    var10000 = mc;
                    Minecraft.player.motionZ = 0.0D;
                }
            }
        }

    }

    public void initModule() {
        Main.a.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("NoFlags", this, false));
    }
}
