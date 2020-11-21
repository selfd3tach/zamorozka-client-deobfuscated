package skid.gay.sex.spermix.inside.shalopay.features.module.modules.movement;

import net.minecraft.client.Minecraft;
import net.minecraft.network.play.client.CPacketPlayer$Position;
import skid.gay.sex.spermix.inside.shalopay.features.module.Module;
import skid.gay.sex.spermix.inside.shalopay.features.module.ModuleCategory;

public class NewGlide extends Module {
    public NewGlide() {
        super("NewGlide", 0, ModuleCategory.MOVEMENT);
    }

    public void onUpdate() {
        if (this.getState()) {
            Minecraft var10000 = mc;
            if (Minecraft.player.ticksExisted % 10 == 0) {
                var10000 = mc;
                if ((double) Minecraft.player.fallDistance > 0.1D) {
                    var10000 = mc;
                    Minecraft.player.motionY = 0.0D;
                    var10000 = mc;
                    Minecraft.player.fallDistance = 0.0F;
                }
            }

            label24:
            {
                var10000 = mc;
                if (Minecraft.player.ticksExisted % 5 != 0) {
                    var10000 = mc;
                    if (Minecraft.player.fallDistance != 0.0F) {
                        break label24;
                    }
                }

                var10000 = mc;
                Minecraft.player.fallDistance = 0.0F;
                var10000 = mc;
                Minecraft var10003 = mc;
                Minecraft var10004 = mc;
                Minecraft var10005 = mc;
                Minecraft.player.connection.sendPacket(new CPacketPlayer$Position(Minecraft.player.posX, Minecraft.player.posY, Minecraft.player.posZ, true));
            }

            var10000 = mc;
            if (Minecraft.player.ticksExisted % 2 == 0) {
                var10000 = mc;
                if ((double) Minecraft.player.fallDistance < 0.1D) {
                    var10000 = mc;
                    Minecraft.player.motionY = 0.0D;
                    var10000 = mc;
                    Minecraft.player.fallDistance = 0.2F;
                }
            }

        }
    }
}
