package skid.gay.sex.spermix.inside.shalopay.features.module.modules.player2;

import net.minecraft.client.Minecraft;
import net.minecraft.network.play.client.CPacketPlayer;
import skid.gay.sex.spermix.inside.shalopay.features.module.Module;
import skid.gay.sex.spermix.inside.shalopay.features.module.ModuleCategory;
import skid.gay.sex.spermix.inside.shalopay.features.smthLikeInit.Main;

public class NoFall extends Module {
    public NoFall() {
        super("NoFall", 0, ModuleCategory.PLAYER2);
    }

    public void onUpdate() {
        if (this.getState()) {
            Minecraft var10000;
            if (Main.a.a("Packet").e()) {
                var10000 = mc;
                if (Minecraft.player.fallDistance > 3.0F) {
                    var10000 = mc;
                    Minecraft.player.connection.sendPacket(new CPacketPlayer(true));
                }
            }

            if (Main.a.a("New").e()) {
                var10000 = mc;
                if (Minecraft.player.onGround) {
                    var10000 = mc;
                    Minecraft.player.motionY = -2.0D;
                }
            }

            super.onUpdate();
        }
    }

    public void onDisable() {
    }

    public void onEnable() {
    }

    public void initModule() {
        Main.a.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("Packet", this, true));
        Main.a.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("New", this, false));
    }
}
