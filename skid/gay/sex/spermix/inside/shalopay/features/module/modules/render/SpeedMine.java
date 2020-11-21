package skid.gay.sex.spermix.inside.shalopay.features.module.modules.render;

import net.minecraft.client.Minecraft;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import skid.gay.sex.spermix.inside.shalopay.features.module.Module;
import skid.gay.sex.spermix.inside.shalopay.features.module.ModuleCategory;
import skid.gay.sex.spermix.inside.shalopay.features.smthLikeInit.Main;

public class SpeedMine extends Module {
    public SpeedMine() {
        super("SpeedMine", 0, ModuleCategory.RENDER);
    }

    public void initModule() {
        Main.a.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("level", this, 3.0D, 0.0D, 7.0D, true));
    }

    public void onUpdate() {
        Minecraft var10000;
        if (this.getState()) {
            for (int var1 = 0; (double) var1 < Main.a.a("level").f(); ++var1) {
                var10000 = mc;
                Minecraft.player.addPotionEffect(new PotionEffect(Potion.getPotionById(3), 9999999, var1));
                Main.a.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("level", this, 3.0D, 5.0D, 7.0D, true));
            }
        } else {
            var10000 = mc;
            Minecraft.player.removePotionEffect(Potion.getPotionById(3));
        }

    }
}
