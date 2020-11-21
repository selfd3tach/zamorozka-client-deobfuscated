package skid.gay.sex.spermix.inside.shalopay.features.module.modules.render;

import net.minecraft.client.Minecraft;
import net.minecraft.network.play.client.CPacketPlayer$Position;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import skid.gay.sex.spermix.inside.shalopay.features.module.Module;
import skid.gay.sex.spermix.inside.shalopay.features.module.ModuleCategory;
import skid.gay.sex.spermix.inside.shalopay.features.smthLikeInit.Main;

public class SpeedPoin extends Module {
    public SpeedPoin() {
        super("SpeedPoin", 0, ModuleCategory.RENDER);
    }

    public void onUpdate() {
        Minecraft var10000;
        if (this.getState()) {
            var10000 = mc;
            Minecraft var10001 = mc;
            float var5 = Minecraft.player.rotationYaw + (float) (Minecraft.player.moveForward < 0.0F ? 180 : 0);
            var10001 = mc;
            float var6;
            if (Minecraft.player.moveStrafing > 0.0F) {
                Minecraft var10002 = mc;
                float var7;
                if (Minecraft.player.moveForward < 0.0F) {
                    var7 = -0.5F;
                } else {
                    var10002 = mc;
                    var7 = Minecraft.player.moveForward > 0.0F ? 0.4F : 1.0F;
                }

                var6 = -90.0F * var7;
            } else {
                var6 = 0.0F;
            }

            float var1 = var5 + var6;
            float var2 = (float) Math.cos((double) (var1 + 90.0F) * 3.141592653589793D / 180.0D);
            float var3 = (float) Math.sin((double) (var1 + 90.0F) * 3.141592653589793D / 180.0D);
            if (mc.gameSettings.keyBindForward.isKeyDown()) {
                if (this.getState()) {
                    for (int var4 = 0; (double) var4 < Main.a.a("Speed").f(); ++var4) {
                        var10000 = mc;
                        Minecraft var10003 = mc;
                        Minecraft var10004 = mc;
                        double var8 = Minecraft.player.posY - 1.0E-10D;
                        Minecraft var10005 = mc;
                        Minecraft.player.connection.sendPacket(new CPacketPlayer$Position(Minecraft.player.posX, var8, Minecraft.player.posZ, true));
                        var10000 = mc;
                        Minecraft.player.addPotionEffect(new PotionEffect(Potion.getPotionById(1), 9999999, var4));
                    }
                } else {
                    var10000 = mc;
                    Minecraft.player.removePotionEffect(Potion.getPotionById(1));
                }
            }
        } else {
            var10000 = mc;
            Minecraft.player.removePotionEffect(Potion.getPotionById(1));
        }

    }

    public void initModule() {
        Main.a.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("Speed", this, 3.0D, 0.0D, 7.0D, true));
    }
}
