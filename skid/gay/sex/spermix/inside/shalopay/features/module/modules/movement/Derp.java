package skid.gay.sex.spermix.inside.shalopay.features.module.modules.movement;

import net.minecraft.client.Minecraft;
import net.minecraft.network.play.client.CPacketPlayer$Rotation;
import skid.gay.sex.spermix.inside.shalopay.features.module.Module;
import skid.gay.sex.spermix.inside.shalopay.features.module.ModuleCategory;
import skid.gay.sex.spermix.inside.shalopay.features.smthLikeInit.Main;

import java.util.Random;

public class Derp extends Module {

    private static final int d = 4;

    private final Random e = new Random();

    public Derp() {
        super("Derp", 0, ModuleCategory.PLAYER);
    }

    public void initModule() {
        Main.a.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("YouSpin", this, false));
        Main.a.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("PackSpin", this, true));
    }

    public void onUpdate() {
        if (this.getState()) {
            float var1 = this.e.nextFloat() * 360.0F;
            float var2 = this.e.nextFloat() * 180.0F - 90.0F;
            Minecraft var10000;
            if (Main.a.a("YouSpin").e()) {
                var10000 = mc;
                Minecraft.player.rotationYawHead = var1;
                var10000 = mc;
                Minecraft.player.renderYawOffset = var1;
            }

            if (Main.a.a("PackSpin").e()) {
                var10000 = mc;
                Minecraft var10004 = mc;
                Minecraft.player.connection.sendPacket(new CPacketPlayer$Rotation(var1, Minecraft.player.rotationPitch, false));
            }

        }
    }
}
