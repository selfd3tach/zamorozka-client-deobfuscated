package skid.gay.sex.spermix.inside.shalopay.features.module.modules.player2;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.network.NetHandlerPlayClient;
import net.minecraft.network.play.client.CPacketPlayer$Position;
import skid.gay.sex.spermix.inside.shalopay.features.module.Module;
import skid.gay.sex.spermix.inside.shalopay.features.module.ModuleCategory;

public class Phase extends Module {
    public Phase() {
        super("Phase", 0, ModuleCategory.PLAYER2);
    }

    public void onUpdate() {
        if (this.getState()) {
            Minecraft var10000 = mc;
            if (!Minecraft.player.isCollidedVertically && mc.gameSettings.keyBindForward.isKeyDown()) {
                var10000 = mc;
                Minecraft.player.noClip = true;
                var10000 = mc;
                Minecraft.player.fallDistance = 0.0F;
                var10000 = mc;
                Minecraft.player.onGround = false;
                var10000 = mc;
                Minecraft.player.motionX = 0.0D;
                var10000 = mc;
                Minecraft.player.motionY = 0.0D;
                var10000 = mc;
                Minecraft.player.motionZ = 0.0D;
                float var1 = 0.1F;
                var10000 = mc;
                Minecraft.player.jumpMovementFactor = var1;
                EntityPlayerSP var17;
                if (mc.gameSettings.keyBindJump.pressed) {
                    var10000 = mc;
                    var17 = Minecraft.player;
                    var17.motionY += var1;
                }

                if (mc.gameSettings.keyBindSneak.pressed) {
                    var10000 = mc;
                    var17 = Minecraft.player;
                    var17.motionY -= var1;
                }

                var10000 = mc;
                double var2 = Math.toRadians(Minecraft.player.rotationYaw);
                var10000 = mc;
                double var4 = Minecraft.player.posX;
                var10000 = mc;
                double var6 = Minecraft.player.posZ;
                double var8 = -Math.sin(var2);
                double var10 = Math.cos(var2);
                var10000 = mc;
                Minecraft var10001 = mc;
                float var21 = Minecraft.player.rotationYaw + (float) (Minecraft.player.moveForward < 0.0F ? 180 : 0);
                var10001 = mc;
                float var15;
                Minecraft var10002;
                if (Minecraft.player.moveStrafing > 0.0F) {
                    var10002 = mc;
                    float var16;
                    if (Minecraft.player.moveForward < 0.0F) {
                        var16 = -0.5F;
                    } else {
                        var10002 = mc;
                        var16 = Minecraft.player.moveForward > 0.0F ? 0.4F : 1.0F;
                    }

                    var15 = -90.0F * var16;
                } else {
                    var15 = 0.0F;
                }

                float var12 = var21 + var15;
                float var13 = (float) Math.cos((double) (var12 + 90.0F) * 3.141592653589793D / 180.0D);
                float var14 = (float) Math.sin((double) (var12 + 90.0F) * 3.141592653589793D / 180.0D);
                var10000 = mc;
                NetHandlerPlayClient var22 = Minecraft.player.connection;
                Minecraft var10003 = mc;
                double var19 = Minecraft.player.motionX = (double) var13 * 0.1D;
                Minecraft var10004 = mc;
                double var20 = Minecraft.player.motionY - 0.1D;
                Minecraft var10005 = mc;
                var22.sendPacket(new CPacketPlayer$Position(var19, var20, Minecraft.player.motionZ = (double) var14 * 0.1D, true));
                var10000 = mc;
                Minecraft.player.motionX = (double) var13 * 0.1D;
                var10000 = mc;
                Minecraft.player.motionY = -0.1D;
                var10000 = mc;
                Minecraft.player.motionZ = (double) var14 * 0.1D;
                var10000 = mc;
                var17 = Minecraft.player;
                var10001 = mc;
                double var18 = Minecraft.player.lastTickPosX = var4 + var8;
                var10002 = mc;
                var10003 = mc;
                var17.setPositionAndUpdate(var18, Minecraft.player.posY, Minecraft.player.lastTickPosZ = var6 + var10);
                var10000 = mc;
                var10003 = mc;
                var19 = Minecraft.player.posX + var8;
                var10004 = mc;
                var10005 = mc;
                Minecraft.player.connection.sendPacket(new CPacketPlayer$Position(var19, Minecraft.player.posY, Minecraft.player.posZ + var10, true));
                var10000 = mc;
                if (Minecraft.player.ticksExisted % 3 == 1) {
                    var10000 = mc;
                    var10003 = mc;
                    var10005 = mc;
                    Minecraft.player.connection.sendPacket(new CPacketPlayer$Position(Minecraft.player.posX, 1.0D, Minecraft.player.posZ, true));
                }

                var10000 = mc;
                var10001 = mc;
                var18 = Minecraft.player.posX + var8;
                var10002 = mc;
                var10003 = mc;
                Minecraft.player.setPositionAndUpdate(var18, Minecraft.player.posY, Minecraft.player.posZ + var10);
                var10000 = mc;
                Minecraft.player.boundingBox.offset(2.0D * Math.cos(Math.toRadians(var2 + 90.0D)), 0.0D, 2.0D * Math.sin(Math.toRadians(var2 + 90.0D)));
                var10000 = mc;
                var10003 = mc;
                var10004 = mc;
                var10005 = mc;
                Minecraft.player.connection.sendPacket(new CPacketPlayer$Position(Minecraft.player.motionX, Minecraft.player.motionY, Minecraft.player.motionZ, true));
                var10000 = mc;
                var10003 = mc;
                var10004 = mc;
                var10005 = mc;
                Minecraft.player.connection.sendPacket(new CPacketPlayer$Position(Minecraft.player.motionX, Minecraft.player.motionY, Minecraft.player.motionZ, false));
            }
        }

    }
}
