package skid.gay.sex.spermix.inside.shalopay.features.module.modules.movement;

import net.minecraft.client.Minecraft;
import net.minecraft.network.play.client.CPacketPlayer$Position;
import skid.gay.sex.spermix.inside.shalopay.features.module.Module;
import skid.gay.sex.spermix.inside.shalopay.features.module.ModuleCategory;
import skid.gay.sex.spermix.inside.shalopay.features.smthLikeInit.Main;

import java.util.ArrayList;

public class FlyJump extends Module {
    public FlyJump() {
        super("FlyJump", 0, ModuleCategory.MOVEMENT);
    }

    public void onUpdate() {
        if (this.getState()) {
            Minecraft var10000;
            if (mc.gameSettings.keyBindForward.isKeyDown() || mc.gameSettings.keyBindLeft.isKeyDown() || mc.gameSettings.keyBindRight.isKeyDown()) {
                var10000 = mc;
                Minecraft.player.jumpMovementFactor = 0.08F;
                var10000 = mc;
                Minecraft.player.motionY = 0.0D;
            }

            Minecraft var10003;
            Minecraft var10004;
            Minecraft var10005;
            for (int var1 = 0; var1 < 10; ++var1) {
                var10000 = mc;
                var10003 = mc;
                var10004 = mc;
                var10005 = mc;
                Minecraft.player.connection.sendPacket(new CPacketPlayer$Position(Minecraft.player.posX, Minecraft.player.posY, Minecraft.player.posZ, true));
            }

            var10000 = mc;
            if (Minecraft.player.ticksExisted % 3 == 0) {
                var10000 = mc;
                var10003 = mc;
                var10004 = mc;
                var10005 = mc;
                Minecraft.player.connection.sendPacket(new CPacketPlayer$Position(Minecraft.player.posX, Minecraft.player.posY, Minecraft.player.posZ, true));
            }

        }
    }

    public void initModule() {
        ArrayList var1 = new ArrayList();
        var1.add("Speed");
        Main.a.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("Jump speed", this, 1.0D, 0.0D, 100.0D, true));
    }

    public void onDisable() {
        Minecraft var10000 = mc;
        Minecraft.player.capabilities.isFlying = false;
    }
}
