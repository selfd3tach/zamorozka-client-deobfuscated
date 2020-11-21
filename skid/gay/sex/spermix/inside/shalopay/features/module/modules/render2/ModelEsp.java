package skid.gay.sex.spermix.inside.shalopay.features.module.modules.render2;

import net.minecraft.client.network.NetworkPlayerInfo;
import skid.gay.sex.spermix.inside.shalopay.features.module.Module;
import skid.gay.sex.spermix.inside.shalopay.features.module.ModuleCategory;
import skid.gay.sex.spermix.inside.shalopay.features.smthLikeInit.Main;

public class ModelEsp extends Module {
    public ModelEsp() {
        super("ModelEsp", 0, ModuleCategory.RENDER2);
    }

    public void onUpdate() {
        if (this.getState()) {
            NetworkPlayerInfo var1 = new NetworkPlayerInfo(mc.session.getProfile());
            var1.getGameProfile().getName().replaceAll("�\\w", "Zamorozka");
        }

    }

    public void initModule() {
        Main.a.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("LineStroke", this, false));
        Main.a.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("FullStroke", this, true));
    }
}
