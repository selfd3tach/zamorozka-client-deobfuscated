package skid.gay.sex.spermix.inside.shalopay.features.module.modules.player2;

import net.minecraft.client.Minecraft;
import net.minecraft.network.play.client.CPacketPlayer$Rotation;
import skid.gay.sex.spermix.inside.shalopay.features.module.Module;
import skid.gay.sex.spermix.inside.shalopay.features.module.ModuleCategory;

import java.util.Random;

public class AntiAfk extends Module {
    public AntiAfk() {
        super("AntiAfk", 0, ModuleCategory.PLAYER2);
    }

    public void onUpdate() {
        if (this.getState()) {
            Random var1 = new Random();
            float var2 = var1.nextFloat() * 90.0F;
            float var3 = var1.nextFloat() * 90.0F;
            Minecraft var10000 = mc;
            if (Minecraft.player.ticksExisted % 7 == 0) {
                var10000 = mc;
                Minecraft var10004 = mc;
                Minecraft.player.connection.sendPacket(new CPacketPlayer$Rotation(var2, Minecraft.player.rotationPitch, false));
                var10000 = mc;
                Minecraft.player.rotationYawHead = var2;
                var10000 = mc;
                Minecraft.player.renderYawOffset = var2;
            }
        }

    }
}
