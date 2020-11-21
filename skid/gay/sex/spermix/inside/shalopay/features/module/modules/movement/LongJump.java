package skid.gay.sex.spermix.inside.shalopay.features.module.modules.movement;

import net.minecraft.client.Minecraft;
import net.minecraft.util.Timer;
import skid.gay.sex.spermix.inside.shalopay.features.module.Module;
import skid.gay.sex.spermix.inside.shalopay.features.module.ModuleCategory;
import skid.gay.sex.spermix.inside.shalopay.features.smthLikeInit.Main;

public class LongJump extends Module {
    public LongJump() {
        super("LongJump", 0, ModuleCategory.PLAYER);
    }

    public void initModule() {
        Main.a.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("Cubecraft", this, true));
        Main.a.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("Matrix", this, false));
        Main.a.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("Reflex", this, false));
    }

    public void onUpdate() {
        if (this.getState()) {
            Minecraft var10000;
            Timer var5;
            if (Main.a.a("Cubecraft").e()) {
                Main.a.a("Matrix").a(false);
                Main.a.a("Reflex").a(false);
                if ((mc.gameSettings.keyBindForward.isKeyDown() || mc.gameSettings.keyBindLeft.isKeyDown() || mc.gameSettings.keyBindRight.isKeyDown() || mc.gameSettings.keyBindBack.isKeyDown()) && mc.gameSettings.keyBindJump.isKeyDown()) {
                    var10000 = mc;
                    Minecraft var10001 = mc;
                    float var4 = Minecraft.player.rotationYaw + (float) (Minecraft.player.moveForward < 0.0F ? 180 : 0);
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

                    float var1 = var4 + var6;
                    float var2 = (float) Math.cos((double) (var1 + 90.0F) * 3.141592653589793D / 180.0D);
                    float var3 = (float) Math.sin((double) (var1 + 90.0F) * 3.141592653589793D / 180.0D);
                    if (mc.gameSettings.keyBindForward.isKeyDown() || mc.gameSettings.keyBindLeft.isKeyDown() || mc.gameSettings.keyBindRight.isKeyDown() || mc.gameSettings.keyBindBack.isKeyDown() && mc.gameSettings.keyBindJump.isKeyDown()) {
                        var5 = mc.timer;
                        Timer.elapsedTicks = 0.0F;
                        var10000 = mc;
                        Minecraft.player.motionY = -0.001D;
                        var10000 = mc;
                        if (Minecraft.player.ticksExisted % 4 == 1) {
                            var10000 = mc;
                            Minecraft.player.motionY = 0.001D;
                            var5 = mc.timer;
                            Timer.elapsedTicks = 2.7F;
                        }

                        var10000 = mc;
                        if (Minecraft.player.ticksExisted % 5 == 1) {
                            var5 = mc.timer;
                            Timer.elapsedTicks = 2.0F;
                        }
                    }
                }
            }

            if (Main.a.a("Matrix").e()) {
                Main.a.a("Cubecraft").a(false);
                Main.a.a("Reflex").a(false);
                if (mc.gameSettings.keyBindJump.isKeyDown()) {
                    var5 = mc.timer;
                    Timer.elapsedTicks = 2.7F;
                    var10000 = mc;
                    if (Minecraft.player.ticksExisted % 2 == 0) {
                        var10000 = mc;
                        Minecraft.player.motionY = 0.1D;
                    }
                }
            }

            if (Main.a.a("Reflex").e()) {
                Main.a.a("Cubecraft").a(false);
                Main.a.a("Matrix").a(false);
                if (mc.gameSettings.keyBindJump.isKeyDown()) {
                    var5 = mc.timer;
                    Timer.elapsedTicks = 10.7F;
                    var10000 = mc;
                    if (Minecraft.player.ticksExisted % 2 == 0) {
                        var10000 = mc;
                        Minecraft.player.motionY = 0.1D;
                    }
                }
            }

        }
    }
}
