package skid.gay.sex.spermix.inside.shalopay.features.module.modules.movement;

import net.minecraft.client.Minecraft;
import net.minecraft.network.play.client.CPacketPlayer$Position;
import skid.gay.sex.spermix.inside.shalopay.features.module.Module;
import skid.gay.sex.spermix.inside.shalopay.features.module.ModuleCategory;

public class FlyMatrixNew extends Module {
    public FlyMatrixNew() {
        super("FlyMatrixNew", 0, ModuleCategory.MOVEMENT);
    }

    public void onUpdate() {
        if (this.getState()) {
            Minecraft var10000 = mc;
            Minecraft.player.motionY = -0.01D;
            var10000 = mc;
            Minecraft var10001 = mc;
            float var4 = Minecraft.player.rotationYaw + (float) (Minecraft.player.moveForward < 0.0F ? 180 : 0);
            var10001 = mc;
            float var5;
            Minecraft var10002;
            if (Minecraft.player.moveStrafing > 0.0F) {
                var10002 = mc;
                float var6;
                if (Minecraft.player.moveForward < 0.0F) {
                    var6 = -0.5F;
                } else {
                    var10002 = mc;
                    var6 = Minecraft.player.moveForward > 0.0F ? 0.4F : 1.0F;
                }

                var5 = -90.0F * var6;
            } else {
                var5 = 0.0F;
            }

            float var1 = var4 + var5;
            var10000 = mc;
            Minecraft.player.onGround = true;
            float var2 = (float) Math.cos((double) (var1 + 90.0F) * 3.141592653589793D / 180.0D);
            float var3 = (float) Math.sin((double) (var1 + 90.0F) * 3.141592653589793D / 180.0D);
            var10000 = mc;
            if (Minecraft.player.ticksExisted % 3 == 1) {
                var10000 = mc;
                Minecraft var10003 = mc;
                Minecraft var10004 = mc;
                Minecraft var10005 = mc;
                Minecraft.player.connection.sendPacket(new CPacketPlayer$Position(Minecraft.player.posX, Minecraft.player.posY, Minecraft.player.posZ, true));
                if (mc.gameSettings.keyBindForward.isKeyDown()) {
                    var10000 = mc;
                    var10001 = mc;
                    var10002 = mc;
                    double var7 = Minecraft.player.posY + 0.1D;
                    var10003 = mc;
                    Minecraft.player.setPosition(Minecraft.player.posX, var7, Minecraft.player.posZ);
                }
            }

        }
    }
}
