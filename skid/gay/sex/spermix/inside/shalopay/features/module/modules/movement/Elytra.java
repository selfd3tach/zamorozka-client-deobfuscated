package skid.gay.sex.spermix.inside.shalopay.features.module.modules.movement;

import net.minecraft.client.Minecraft;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.network.play.client.CPacketPlayer$Position;
import skid.gay.sex.spermix.inside.shalopay.features.module.Module;
import skid.gay.sex.spermix.inside.shalopay.features.module.ModuleCategory;
import skid.gay.sex.spermix.inside.shalopay.features.smthLikeInit.Main;

public class Elytra extends Module {
    public Elytra() {
        super("Elytra+", 0, ModuleCategory.MOVEMENT);
    }

    public void initModule() {
        Main.a.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("SpeedFly", this, 1.0D, 0.0D, 20.0D, true));
    }

    public void onUpdate() {
        if (this.getState()) {
            Minecraft var10000 = mc;
            ItemStack var1 = Minecraft.player.getItemStackFromSlot(EntityEquipmentSlot.CHEST);
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

            float var2 = var5 + var6;
            float var3 = (float) Math.cos((double) (var2 + 90.0F) * 3.141592653589793D / 180.0D);
            float var4 = (float) Math.sin((double) (var2 + 90.0F) * 3.141592653589793D / 180.0D);
            var10000 = mc;
            if (Minecraft.player.isElytraFlying()) {
                var10000 = mc;
                if (Minecraft.player.ticksExisted % 10 == 0) {
                    var10000 = mc;
                    if ((double) Minecraft.player.fallDistance > 0.1D) {
                        var10000 = mc;
                        Minecraft.player.motionY = 0.0D;
                        var10000 = mc;
                        Minecraft.player.fallDistance = 0.0F;
                    }
                }

                var10000 = mc;
                if (Minecraft.player.ticksExisted % 6 == 0) {
                    if (mc.gameSettings.keyBindJump.isKeyDown()) {
                        var10000 = mc;
                        Minecraft.player.motionY = 1.0D;
                    }

                    var10000 = mc;
                    Minecraft.player.fallDistance = 0.2F;
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
                        Minecraft.player.fallDistance = 0.5F;
                    }
                }
            }

        }
    }
}
