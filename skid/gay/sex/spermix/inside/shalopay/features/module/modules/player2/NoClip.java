package skid.gay.sex.spermix.inside.shalopay.features.module.modules.player2;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.Entity;
import net.minecraft.util.Timer;
import skid.gay.sex.spermix.inside.shalopay.features.module.Module;
import skid.gay.sex.spermix.inside.shalopay.features.module.ModuleCategory;
import skid.gay.sex.spermix.inside.shalopay.features.module.SmthLikeModuleRegister;

public class NoClip extends Module {
    public NoClip() {
        super("NoClip", 0, ModuleCategory.PLAYER2);
    }

    public static boolean a(Entity var0) {
        if (SmthLikeModuleRegister.a(NoClip.class).getState()) {
            Minecraft var10000 = mc;
            if (Minecraft.player != null) {
                var10000 = mc;
                if (Minecraft.player.ridingEntity == null) {
                    return true;
                }

                Minecraft var10001 = mc;
                if (var0 == Minecraft.player.ridingEntity) {
                    return true;
                }
            }
        }

        return var0.noClip;
    }

    public void onUpdate() {
        if (this.getState()) {
            Timer var10000 = mc.timer;
            Timer.elapsedTicks = 0.0F;
            Minecraft var2 = mc;
            Minecraft.player.noClip = true;
            var2 = mc;
            Minecraft.player.fallDistance = 0.0F;
            var2 = mc;
            Minecraft.player.onGround = false;
            var2 = mc;
            float var3 = Minecraft.player.fallDistance;
            var2 = mc;
            Minecraft.player.motionY = 0.0D;
            float var1 = 0.03F;
            var2 = mc;
            Minecraft.player.jumpMovementFactor = var1;
            EntityPlayerSP var4;
            if (mc.gameSettings.keyBindJump.pressed) {
                var2 = mc;
                var4 = Minecraft.player;
                var4.motionY += var1;
            }

            if (mc.gameSettings.keyBindSneak.pressed) {
                var2 = mc;
                var4 = Minecraft.player;
                var4.motionY -= var1;
            }

        }
    }

    public void onDisable() {
        Minecraft var10000 = mc;
        Minecraft.player.onGround = false;
    }
}
