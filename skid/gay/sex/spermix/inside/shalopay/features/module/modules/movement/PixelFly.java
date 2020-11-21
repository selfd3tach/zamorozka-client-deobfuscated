package skid.gay.sex.spermix.inside.shalopay.features.module.modules.movement;

import net.minecraft.client.Minecraft;
import net.minecraft.util.Timer;
import skid.gay.sex.spermix.inside.shalopay.features.module.Module;
import skid.gay.sex.spermix.inside.shalopay.features.module.ModuleCategory;

public class PixelFly extends Module {
    public PixelFly() {
        super("PixelFly", 0, ModuleCategory.MOVEMENT);
    }

    public void onUpdate() {
        if (this.getState()) {
            if ((mc.gameSettings.keyBindForward.isKeyDown() || mc.gameSettings.keyBindLeft.isKeyDown() || mc.gameSettings.keyBindRight.isKeyDown() || mc.gameSettings.keyBindBack.isKeyDown()) && mc.gameSettings.keyBindJump.isKeyDown()) {
                Minecraft var10000 = mc;
                Minecraft var10001 = mc;
                float var4 = Minecraft.player.rotationYaw + (float) (Minecraft.player.moveForward < 0.0F ? 180 : 0);
                var10001 = mc;
                float var5;
                if (Minecraft.player.moveStrafing > 0.0F) {
                    Minecraft var10002 = mc;
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
                float var2 = (float) Math.cos((double) (var1 + 90.0F) * 3.141592653589793D / 180.0D);
                float var3 = (float) Math.sin((double) (var1 + 90.0F) * 3.141592653589793D / 180.0D);
                if (mc.gameSettings.keyBindForward.isKeyDown() || mc.gameSettings.keyBindLeft.isKeyDown() || mc.gameSettings.keyBindRight.isKeyDown() || mc.gameSettings.keyBindBack.isKeyDown() && mc.gameSettings.keyBindJump.isKeyDown()) {
                    var10000 = mc;
                    if (Minecraft.player.ticksExisted % 1 == 0) {
                        var10000 = mc;
                        Minecraft.player.motionY = 0.0D;
                    }

                    Timer.elapsedTicks = 2.0F;
                }
            }

        }
    }
}
