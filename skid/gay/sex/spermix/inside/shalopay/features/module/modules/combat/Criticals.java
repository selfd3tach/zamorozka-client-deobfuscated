package skid.gay.sex.spermix.inside.shalopay.features.module.modules.combat;

import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.network.play.client.CPacketPlayer$Position;
import skid.gay.sex.spermix.inside.shalopay.features.module.Module;
import skid.gay.sex.spermix.inside.shalopay.features.module.ModuleCategory;
import skid.gay.sex.spermix.inside.shalopay.features.smthLikeInit.Main;

public class Criticals extends Module {
    public Criticals() {
        super("Criticals", 0, ModuleCategory.COMBAT);
    }

    public static void m() {
        if (Main.a.a("MatrixTest").e()) {
            Minecraft var10000 = mc;
            double var0;
            double var2;
            double var4;
            if (!Minecraft.player.isInWater()) {
                var10000 = mc;
                if (!Minecraft.player.isInsideOfMaterial(Material.LAVA)) {
                    var10000 = mc;
                    if (Minecraft.player.onGround && Minecraft.getMinecraft().objectMouseOver != null && Minecraft.getMinecraft().objectMouseOver.entityHit instanceof EntityLivingBase) {
                        var10000 = mc;
                        var0 = Minecraft.player.posX;
                        var10000 = mc;
                        var2 = Minecraft.player.posY;
                        var10000 = mc;
                        var4 = Minecraft.player.posZ;
                        var10000 = mc;
                        if (Minecraft.player.canBeAttackedWithItem()) {
                            var10000 = mc;
                            Minecraft.player.connection.sendPacket(new CPacketPlayer$Position(var0, var2 + 1.0E-4D, var4, true));
                            var10000 = mc;
                            Minecraft.player.connection.sendPacket(new CPacketPlayer$Position(var0, var2, var4, false));
                            var10000 = mc;
                            Minecraft.player.connection.sendPacket(new CPacketPlayer$Position(var0, var2 + 1.0D, var4, true));
                            var10000 = mc;
                            Minecraft.player.connection.sendPacket(new CPacketPlayer$Position(var0, var2, var4, false));
                            var10000 = mc;
                            Minecraft.player.motionY = 0.3D;
                        }
                    }
                }
            }

            if (Main.a.a("Vanilla").e()) {
                var10000 = mc;
                if (!Minecraft.player.isInWater()) {
                    var10000 = mc;
                    if (!Minecraft.player.isInsideOfMaterial(Material.LAVA)) {
                        var10000 = mc;
                        if (Minecraft.player.onGround && Minecraft.getMinecraft().objectMouseOver != null && Minecraft.getMinecraft().objectMouseOver.entityHit instanceof EntityLivingBase) {
                            var10000 = mc;
                            Minecraft.player.motionY = 0.09D;
                        }
                    }
                }

                if (Main.a.a("Packet").e()) {
                    var10000 = mc;
                    if (!Minecraft.player.isInWater()) {
                        var10000 = mc;
                        if (!Minecraft.player.isInsideOfMaterial(Material.LAVA)) {
                            var10000 = mc;
                            if (Minecraft.player.onGround && Minecraft.getMinecraft().objectMouseOver != null && Minecraft.getMinecraft().objectMouseOver.entityHit instanceof EntityLivingBase) {
                                var10000 = mc;
                                var0 = Minecraft.player.posX;
                                var10000 = mc;
                                var2 = Minecraft.player.posY;
                                var10000 = mc;
                                var4 = Minecraft.player.posZ;
                                var10000 = mc;
                                if (Minecraft.player.canBeAttackedWithItem()) {
                                    var10000 = mc;
                                    Minecraft.player.connection.sendPacket(new CPacketPlayer$Position(var0, var2 + 1.0E-4D, var4, true));
                                    var10000 = mc;
                                    Minecraft.player.connection.sendPacket(new CPacketPlayer$Position(var0, var2, var4, false));
                                    var10000 = mc;
                                    Minecraft.player.connection.sendPacket(new CPacketPlayer$Position(var0, var2 + 1.0D, var4, true));
                                    var10000 = mc;
                                    Minecraft.player.connection.sendPacket(new CPacketPlayer$Position(var0, var2, var4, false));
                                }
                            }
                        }
                    }
                }
            }
        }

    }

    public void initModule() {
        Main.a.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("Vanilla", this, true));
        Main.a.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("Packet", this, false));
        Main.a.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("MatrixTest", this, false));
    }

    public void onUpdate() {
        if (this.getState()) {
            m();
        }

    }
}
