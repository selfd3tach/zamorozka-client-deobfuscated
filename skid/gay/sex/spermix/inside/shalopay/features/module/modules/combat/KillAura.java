package skid.gay.sex.spermix.inside.shalopay.features.module.modules.combat;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.EntityShulker;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.play.client.CPacketPlayer;
import net.minecraft.network.play.client.CPacketPlayer$Position;
import net.minecraft.util.EnumHand;
import net.minecraft.util.EnumParticleTypes;
import skid.gay.sex.spermix.inside.shalopay.features.module.Module;
import skid.gay.sex.spermix.inside.shalopay.features.module.ModuleCategory;
import skid.gay.sex.spermix.inside.shalopay.features.smthLikeInit.Main;
import skid.gay.sex.spermix.inside.shalopay.features.smthLikeInit.idk;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class KillAura extends Module {

    float e = 3.0F;

    int d;

    public KillAura() {
        super("KillAura", 0, ModuleCategory.COMBAT);
    }

    public void onUpdate() {
        if (this.getState()) {
            this.m();
        }

    }

    public void initModule() {
        ArrayList var1 = new ArrayList();
        var1.add("Enable");
        var1.add("Disable");
        Main.a.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("Heal", this, "Enable", var1));
        Main.a.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("Distance", this, 3.7D, 0.0D, 20.5D, true));
        Main.a.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("Yaw", this, 90.0D, 0.0D, 180.0D, true));
        Main.a.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("Pitch", this, 90.0D, 0.0D, 180.0D, true));
        Main.a.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("Watch", this, false));
        Main.a.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("Wall", this, true));
        Main.a.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("Particles", this, false));
        Main.a.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("TpReach", this, false));
        Main.a.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("Players", this, true));
        Main.a.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("Mobs", this, false));
        Main.a.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("Animals", this, false));
        Main.a.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("Friends", this, false));
        Main.a.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("Box", this, false));
    }

    private void m() {
        List var1 = mc.world.playerEntities;
        ++this.d;

        for (int var2 = 0; var2 < var1.size(); ++var2) {
            String var10000 = ((EntityPlayer) var1.get(var2)).getName();
            Minecraft var10001 = mc;
            Minecraft var13;
            if (var10000 != Minecraft.player.getName()) {
                EntityPlayer var3 = (EntityPlayer) var1.get(1);
                var13 = mc;
                float var14 = Minecraft.player.getDistanceToEntity(var3);
                var10001 = mc;
                if (var14 > Minecraft.player.getDistanceToEntity((Entity) var1.get(var2))) {
                    var3 = (EntityPlayer) var1.get(var2);
                }

                if (Main.a.a("Particles").e()) {
                    for (int var4 = 1; var4 < 8; ++var4) {
                        mc.world.spawnParticle(EnumParticleTypes.SPIT, var3.posX + Math.sin(var4) * 0.1D, var3.posY + 0.1D, var3.posZ + Math.cos(var4) * 0.3D, 0.0D, 0.0D, 0.0D, new int[0]);
                    }
                }

                if (Main.a.a("Box").e()) {
                    mc.fontRendererObj.drawStringWithShadow(var3.getName(), 3.0F, 300.0F, 5701786);
                }

                float var9;
                Minecraft var10003;
                Minecraft var10004;
                Minecraft var10005;
                if (idk.a().b(var3.getName())) {
                    if (Main.a.a("Players").e() && Main.a.a("Friends").e()) {
                        if (Main.a.a("TpReach").e()) {
                            var13 = mc;
                            var9 = Minecraft.player.getDistanceToEntity(var3);
                            if ((double) var9 < Main.a.a("Distance").f()) {
                                var13 = mc;
                                if (Minecraft.player.getCooledAttackStrength(0.0F) == 1.0F) {
                                    if (Main.a.a("Heal").c().equalsIgnoreCase("Enable")) {
                                        var13 = mc;
                                        Minecraft.player.posX = var3.posX;
                                        var13 = mc;
                                        Minecraft.player.connection.sendPacket(new CPacketPlayer());
                                        var13 = mc;
                                        Minecraft.player.posZ = var3.posZ;
                                        var13 = mc;
                                        Minecraft.player.connection.sendPacket(new CPacketPlayer());
                                        var13 = mc;
                                        Minecraft.player.posY = var3.posY;
                                        var13 = mc;
                                        Minecraft.player.connection.sendPacket(new CPacketPlayer());
                                        var13 = mc;
                                        var10003 = mc;
                                        var10004 = mc;
                                        var10005 = mc;
                                        Minecraft.player.connection.sendPacket(new CPacketPlayer$Position(Minecraft.player.posX, Minecraft.player.posY, Minecraft.player.posZ, false));
                                        if (Main.a.a("Particles").e()) {
                                            for (int var10 = 1; var10 < 8; ++var10) {
                                                mc.world.spawnParticle(EnumParticleTypes.SPIT, var3.posX + Math.sin(var10) * 0.6D, var3.posY + 0.2D, var3.posZ + Math.cos(var10) * 0.3D, 0.0D, 0.0D, 0.0D, new int[0]);
                                            }
                                        }

                                        Main.a(String.valueOf((new StringBuilder(String.valueOf(var3.getName()))).append(" Heall: ").append((double) Math.round(var3.getHealth() * 100.0F / 100.0F) / 2.0D)), true);
                                    } else {
                                        var13 = mc;
                                        Minecraft.player.connection.sendPacket(new CPacketPlayer$Position(var3.posX, var3.posY, var3.posZ, false));
                                        var10001 = mc;
                                        mc.playerController.attackEntity(Minecraft.player, var3);
                                    }

                                    var13 = mc;
                                    Minecraft.player.swingArm(EnumHand.MAIN_HAND);
                                    this.d = -3;
                                }
                            }
                        } else if (Main.a.a("Wall").e()) {
                            var13 = mc;
                            var9 = Minecraft.player.getDistanceToEntity(var3);
                            if ((double) var9 < Main.a.a("Distance").f()) {
                                var13 = mc;
                                if (Minecraft.player.getCooledAttackStrength(0.0F) == 1.0F) {
                                    if (Main.a.a("Heal").c().equalsIgnoreCase("Enable")) {
                                        var10001 = mc;
                                        mc.playerController.attackEntity(Minecraft.player, var3);
                                        Main.a(String.valueOf((new StringBuilder(String.valueOf(var3.getName()))).append(" Heall: ").append((double) Math.round(var3.getHealth() * 100.0F / 100.0F) / 2.0D)), true);
                                    } else {
                                        var10001 = mc;
                                        mc.playerController.attackEntity(Minecraft.player, var3);
                                    }

                                    var13 = mc;
                                    Minecraft.player.swingArm(EnumHand.MAIN_HAND);
                                    this.d = -3;
                                }
                            }
                        } else {
                            var13 = mc;
                            var9 = Minecraft.player.getDistanceToEntity(var3);
                            if ((double) var9 < Main.a.a("Distance").f()) {
                                var13 = mc;
                                if (Minecraft.player.canEntityBeSeen(var3)) {
                                    var13 = mc;
                                    if (Minecraft.player.getCooledAttackStrength(0.0F) == 1.0F) {
                                        if (Main.a.a("Heal").c().equalsIgnoreCase("Enable")) {
                                            var10001 = mc;
                                            mc.playerController.attackEntity(Minecraft.player, var3);
                                            Main.a(String.valueOf((new StringBuilder(String.valueOf(var3.getName()))).append(" Heall: ").append((double) Math.round(var3.getHealth() * 100.0F / 100.0F) / 2.0D)), true);
                                        } else {
                                            var10001 = mc;
                                            mc.playerController.attackEntity(Minecraft.player, var3);
                                        }

                                        var13 = mc;
                                        Minecraft.player.swingArm(EnumHand.MAIN_HAND);
                                        this.d = -3;
                                    }
                                }
                            }
                        }
                    }
                } else if (Main.a.a("Players").e()) {
                    var13 = mc;
                    var9 = Minecraft.player.getDistanceToEntity(var3);
                    float var5;
                    if (Main.a.a("TpReach").e()) {
                        var13 = mc;
                        var5 = Minecraft.player.getDistanceToEntity(var3);
                        if ((double) var5 < Main.a.a("Distance").f()) {
                            var13 = mc;
                            if (Minecraft.player.getCooledAttackStrength(0.0F) == 1.0F) {
                                if (Main.a.a("Heal").c().equalsIgnoreCase("Enable")) {
                                    var13 = mc;
                                    Minecraft.player.posX = var3.posX;
                                    var13 = mc;
                                    Minecraft.player.connection.sendPacket(new CPacketPlayer());
                                    var13 = mc;
                                    Minecraft.player.posZ = var3.posZ;
                                    var13 = mc;
                                    Minecraft.player.connection.sendPacket(new CPacketPlayer());
                                    var13 = mc;
                                    Minecraft.player.posY = var3.posY;
                                    var13 = mc;
                                    Minecraft.player.connection.sendPacket(new CPacketPlayer());
                                    var13 = mc;
                                    var10003 = mc;
                                    var10004 = mc;
                                    var10005 = mc;
                                    Minecraft.player.connection.sendPacket(new CPacketPlayer$Position(Minecraft.player.posX, Minecraft.player.posY, Minecraft.player.posZ, false));
                                    var10001 = mc;
                                    mc.playerController.attackEntity(Minecraft.player, var3);
                                    Main.a(String.valueOf((new StringBuilder(String.valueOf(var3.getName()))).append(" Heall: ").append((double) Math.round(var3.getHealth() * 100.0F / 100.0F) / 2.0D)), true);
                                } else {
                                    var13 = mc;
                                    Minecraft.player.connection.sendPacket(new CPacketPlayer$Position(var3.posX, var3.posY, var3.posZ, false));
                                    var10001 = mc;
                                    mc.playerController.attackEntity(Minecraft.player, var3);
                                }

                                var13 = mc;
                                Minecraft.player.swingArm(EnumHand.MAIN_HAND);
                                this.d = -3;
                            }
                        }
                    } else {
                        var13 = mc;
                        var5 = Minecraft.player.getDistanceToEntity(var3);
                        if (Main.a.a("Wall").e()) {
                            if ((double) var5 < Main.a.a("Distance").f()) {
                                var13 = mc;
                                if (Minecraft.player.getCooledAttackStrength(0.0F) == 1.0F) {
                                    if (Main.a.a("Heal").c().equalsIgnoreCase("Enable")) {
                                        var10001 = mc;
                                        mc.playerController.attackEntity(Minecraft.player, var3);
                                        Main.a(String.valueOf((new StringBuilder(String.valueOf(var3.getName()))).append(" Heall: ").append((double) Math.round(var3.getHealth() * 100.0F / 100.0F) / 2.0D)), true);
                                    } else {
                                        var10001 = mc;
                                        mc.playerController.attackEntity(Minecraft.player, var3);
                                    }

                                    var13 = mc;
                                    Minecraft.player.swingArm(EnumHand.MAIN_HAND);
                                    this.d = -3;
                                }
                            }
                        } else if ((double) var5 < Main.a.a("Distance").f()) {
                            var13 = mc;
                            if (Minecraft.player.canEntityBeSeen(var3)) {
                                var13 = mc;
                                if (Minecraft.player.getCooledAttackStrength(0.0F) == 1.0F) {
                                    if (Main.a.a("Heal").c().equalsIgnoreCase("Enable")) {
                                        var10001 = mc;
                                        mc.playerController.attackEntity(Minecraft.player, var3);
                                        Main.a(String.valueOf((new StringBuilder(String.valueOf(var3.getName()))).append(" Heall: ").append((double) Math.round(var3.getHealth() * 100.0F / 100.0F) / 2.0D)), true);
                                    } else {
                                        var10001 = mc;
                                        mc.playerController.attackEntity(Minecraft.player, var3);
                                    }

                                    var13 = mc;
                                    Minecraft.player.swingArm(EnumHand.MAIN_HAND);
                                    this.d = -3;
                                }
                            }
                        }
                    }
                }
            }

            Iterator var11 = mc.world.loadedEntityList.iterator();

            while (var11.hasNext()) {
                Object var8 = var11.next();
                if (var8 instanceof EntityLivingBase) {
                    EntityLivingBase var12 = (EntityLivingBase) var8;
                    var13 = mc;
                    float var6 = Minecraft.player.getDistanceToEntity(var12);
                    float var7;
                    if (Main.a.a("Mobs").e() && Main.a.a("TpReach").e()) {
                        if (var12 instanceof EntityMob) {
                            var13 = mc;
                            var7 = Minecraft.player.getDistanceToEntity(var12);
                            if ((double) var7 < Main.a.a("Distance").f()) {
                                var13 = mc;
                                if (Minecraft.player.getCooledAttackStrength(0.0F) == 1.0F) {
                                    var13 = mc;
                                    Minecraft.player.connection.sendPacket(new CPacketPlayer$Position(var12.posX, var12.posY, var12.posZ, false));
                                    var10001 = mc;
                                    mc.playerController.attackEntity(Minecraft.player, var12);
                                }
                            }
                        } else if (var12 instanceof EntityMob) {
                            var13 = mc;
                            var7 = Minecraft.player.getDistanceToEntity(var12);
                            if ((double) var7 < Main.a.a("Distance").f()) {
                                var13 = mc;
                                if (Minecraft.player.getCooledAttackStrength(0.0F) == 1.0F) {
                                    var10001 = mc;
                                    mc.playerController.attackEntity(Minecraft.player, var12);
                                }
                            }
                        }
                    }

                    if (Main.a.a("Animals").e()) {
                        if (Main.a.a("TpReach").e()) {
                            if (var12 instanceof EntityAnimal) {
                                var13 = mc;
                                var7 = Minecraft.player.getDistanceToEntity(var12);
                                if ((double) var7 < Main.a.a("Distance").f()) {
                                    var13 = mc;
                                    if (Minecraft.player.getCooledAttackStrength(0.0F) == 1.0F) {
                                        var13 = mc;
                                        Minecraft.player.connection.sendPacket(new CPacketPlayer$Position(var12.posX, var12.posY, var12.posZ, false));
                                        var10001 = mc;
                                        mc.playerController.attackEntity(Minecraft.player, var12);
                                    }
                                }
                            }

                            if (var12 instanceof EntityShulker) {
                                var13 = mc;
                                var7 = Minecraft.player.getDistanceToEntity(var12);
                                if ((double) var7 < Main.a.a("Distance").f()) {
                                    var13 = mc;
                                    if (Minecraft.player.getCooledAttackStrength(0.0F) == 1.0F) {
                                        var13 = mc;
                                        Minecraft.player.connection.sendPacket(new CPacketPlayer$Position(var12.posX, var12.posY, var12.posZ, false));
                                        var10001 = mc;
                                        mc.playerController.attackEntity(Minecraft.player, var12);
                                    }
                                }
                            }
                        } else {
                            if (var12 instanceof EntityAnimal) {
                                var13 = mc;
                                var7 = Minecraft.player.getDistanceToEntity(var12);
                                if ((double) var7 < Main.a.a("Distance").f()) {
                                    var13 = mc;
                                    if (Minecraft.player.getCooledAttackStrength(0.0F) == 1.0F) {
                                        var10001 = mc;
                                        mc.playerController.attackEntity(Minecraft.player, var12);
                                    }
                                }
                            }

                            if (var12 instanceof EntityShulker) {
                                var13 = mc;
                                var7 = Minecraft.player.getDistanceToEntity(var12);
                                if ((double) var7 < Main.a.a("Distance").f()) {
                                    var13 = mc;
                                    if (Minecraft.player.getCooledAttackStrength(0.0F) == 1.0F) {
                                        var10001 = mc;
                                        mc.playerController.attackEntity(Minecraft.player, var12);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

    }
}
