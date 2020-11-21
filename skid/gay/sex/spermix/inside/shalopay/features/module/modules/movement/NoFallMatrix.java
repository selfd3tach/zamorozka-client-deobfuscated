package skid.gay.sex.spermix.inside.shalopay.features.module.modules.movement;

import net.minecraft.client.Minecraft;
import net.minecraft.network.play.client.CPacketPlayer$Position;
import skid.gay.sex.spermix.inside.shalopay.features.module.Module;
import skid.gay.sex.spermix.inside.shalopay.features.module.ModuleCategory;

public class NoFallMatrix extends Module {
    public NoFallMatrix() {
        super("NoFallMatrix", 0, ModuleCategory.PLAYER2);
    }

    public void onUpdate() {
        if (this.getState()) {
            Minecraft var10000 = mc;
            double var1;
            Minecraft var10003;
            Minecraft var10004;
            Minecraft var10005;
            if (Minecraft.player.fallDistance > 4.0F) {
                var10000 = mc;
                var10003 = mc;
                var10004 = mc;
                var1 = Minecraft.player.posY - 0.1D;
                var10005 = mc;
                Minecraft.player.connection.sendPacket(new CPacketPlayer$Position(Minecraft.player.posX, var1, Minecraft.player.posZ, true));
                var10000 = mc;
                Minecraft.player.motionY = -1.0D;
            }

            var10000 = mc;
            if (Minecraft.player.fallDistance == 0.001F) {
                var10000 = mc;
                var10003 = mc;
                var10004 = mc;
                var1 = Minecraft.player.posY + 0.01D;
                var10005 = mc;
                Minecraft.player.connection.sendPacket(new CPacketPlayer$Position(Minecraft.player.posX, var1, Minecraft.player.posZ, true));
            }

        }
    }
}
