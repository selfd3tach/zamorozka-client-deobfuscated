package skid.gay.sex.spermix.inside.shalopay.features.module.modules.player2;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import skid.gay.sex.spermix.inside.shalopay.features.module.Module;
import skid.gay.sex.spermix.inside.shalopay.features.module.ModuleCategory;
import skid.gay.sex.spermix.inside.shalopay.features.module.SmthLikeModuleRegister;
import skid.gay.sex.spermix.inside.shalopay.features.smthLikeInit.Main;

import java.util.ArrayList;

public class HitBox extends Module {

    private final ArrayList d = new ArrayList();

    public HitBox() {
        super("HitBox", 0, ModuleCategory.COMBAT);
    }

    public static float a(Entity var0) {
        Minecraft var10001 = mc;
        if (!var0.equals(Minecraft.player) && SmthLikeModuleRegister.a(HitBox.class).getState()) {
            return Main.a.a("No flags").e() ? 0.9F : (float) Main.a.a("XYZ").f();
        } else {
            return 0.0F;
        }
    }

    public void initModule() {
        new ArrayList();
        new ArrayList();
        Main.a.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("XYZ", this, 1.0D, 0.0D, 20.0D, true));
        Main.a.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("No flags", this, false));
    }

    public void onUpdate() {
        this.getState();
    }
}
