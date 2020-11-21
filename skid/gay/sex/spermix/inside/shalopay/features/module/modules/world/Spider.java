package skid.gay.sex.spermix.inside.shalopay.features.module.modules.world;

import net.minecraft.client.Minecraft;
import net.minecraft.network.play.client.CPacketPlayer$Position;
import skid.gay.sex.spermix.inside.shalopay.features.module.Module;
import skid.gay.sex.spermix.inside.shalopay.features.module.ModuleCategory;
import skid.gay.sex.spermix.inside.shalopay.features.smthLikeInit.Main;

import java.util.ArrayList;

public class Spider extends Module {
    public Spider() {
        super("Spider", 0, ModuleCategory.MOVEMENT);
    }

    public void initModule() {
        new ArrayList();
        new ArrayList();
        Main.a.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("Defaulted", this, false));
        Main.a.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("Matrix", this, true));
    }

    public void onUpdate() {
        if (this.getState()) {
            Minecraft var10000;
            if (Main.a.a("Defaulted").e()) {
                var10000 = mc;
                if (Minecraft.player.isCollidedHorizontally) {
                    var10000 = mc;
                    Minecraft.player.motionY = 0.1D;
                }
            } else {
                if (!Main.a.a("Matrix").e()) {
                    return;
                }

                var10000 = mc;
                if (Minecraft.player.isCollidedHorizontally) {
                    var10000 = mc;
                    if (Minecraft.player.ticksExisted % 5 == 0) {
                        var10000 = mc;
                        Minecraft.player.motionY = 0.0D;
                    }

                    var10000 = mc;
                    if (Minecraft.player.ticksExisted % 2 == 0) {
                        var10000 = mc;
                        Minecraft.player.motionY = 0.4D;
                        var10000 = mc;
                        Minecraft var10003 = mc;
                        Minecraft var10004 = mc;
                        double var1 = Minecraft.player.posY + 0.01D;
                        Minecraft var10005 = mc;
                        Minecraft.player.connection.sendPacket(new CPacketPlayer$Position(Minecraft.player.posX, var1, Minecraft.player.posZ, true));
                    }
                }

                super.onUpdate();
            }

        }
    }
}
