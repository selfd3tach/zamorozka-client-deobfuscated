package skid.gay.sex.spermix.inside.shalopay.features.module.modules.combat;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.network.play.client.CPacketPlayer$Rotation;
import net.minecraft.network.play.client.CPacketPlayerTryUseItem;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.MathHelper;
import skid.gay.sex.spermix.inside.shalopay.features.module.Module;
import skid.gay.sex.spermix.inside.shalopay.features.module.ModuleCategory;
import skid.gay.sex.spermix.inside.shalopay.features.smthLikeInit.Main;
import skid.gay.sex.spermix.inside.shalopay.features.smthLikeInit.idk;

import java.util.Iterator;
import java.util.List;

public class MatrixAura extends Module {
    public MatrixAura() {
        super("MatrixAura", 0, ModuleCategory.COMBAT);
    }

    public static float[] b(Entity var0) {
        if (var0 == null) {
            return null;
        } else {
            Minecraft var10001 = mc;
            double var1 = var0.posX - Minecraft.player.posX;
            var10001 = mc;
            double var3 = var0.posZ - Minecraft.player.posZ;
            double var5 = 0.0D;
            double var7 = MathHelper.sqrt_double(var1 * var1 + var3 * var3);
            float var9 = (float) (Math.atan2(var3, var1) * 90.0D / 3.141592653589793D) - 90.0F;
            float var10 = (float) (-(Math.atan2(var5, var7) * 90.0D / 3.141592653589793D));
            float[] var10000 = new float[2];
            Minecraft var10003 = mc;
            Minecraft var10005 = mc;
            var10000[0] = Minecraft.player.rotationYaw + MathHelper.wrapAngleTo180_float(var9 - Minecraft.player.rotationYaw);
            var10003 = mc;
            var10005 = mc;
            var10000[1] = Minecraft.player.rotationPitch + MathHelper.wrapAngleTo180_float(var10 - Minecraft.player.rotationPitch);
            return var10000;
        }
    }

    public static synchronized void a(Entity var0) {
        float[] var1 = b(var0);
        if (var1 != null) {
            Minecraft var10000 = mc;
            Minecraft.player.connection.sendPacket(new CPacketPlayer$Rotation(var1[0] + 1.0F, var1[1] + 1.0F, false));
            var10000 = mc;
            Minecraft.player.renderYawOffset = var1[0];
            var10000 = mc;
            Minecraft.player.rotationYawHead = var1[0];
        }

    }

    private void m() {
        Minecraft var10000 = mc;
        if (Minecraft.player.getCooledAttackStrength(0.0F) >= 1.0F) {
            Iterator var2 = mc.world.loadedEntityList.iterator();

            while (true) {
                Object var1;
                Entity var3;
                boolean var4;
                float var5;
                double var6;
                double var8;
                double var10;
                EntityLivingBase var12;
                float var14;
                Minecraft var10001;
                Minecraft var10002;
                double var23;
                double var24;
                label197:
                do {
                    while (var2.hasNext()) {
                        var1 = var2.next();
                        if (idk.a().b(((Entity) var1).getName())) {
                            continue label197;
                        }

                        if (Main.a.a("AntiBot").e() && ((Entity) var1).isInvisible()) {
                            List var18 = mc.world.playerEntities;

                            for (int var19 = 0; var19 < var18.size(); ++var19) {
                                String var25 = ((EntityPlayer) var18.get(var19)).getName();
                                var10001 = mc;
                                if (var25 != Minecraft.player.getName()) {
                                    EntityPlayer var20 = (EntityPlayer) var18.get(1);
                                    boolean var21 = !(var20 instanceof EntityPlayerSP) && var20 instanceof EntityPlayer && var20.getHealth() > 0.0F;
                                    new ItemStack(Items.FISHING_ROD);
                                    var10000 = mc;
                                    float var22 = Minecraft.player.getDistanceToEntity(var20);
                                    if (var20 instanceof EntityLivingBase && (double) var22 < Main.a.a("MDistance").f()) {
                                        var10000 = mc;
                                        if (Minecraft.player.getCooledAttackStrength(0.0F) == 1.0F && var21) {
                                            var10001 = mc;
                                            if (var20.ticksExisted == Minecraft.player.ticksExisted && !var20.isInvisible()) {
                                                var10001 = mc;
                                                mc.playerController.attackEntity(Minecraft.player, var20);
                                                var10000 = mc;
                                                Minecraft.player.swingArm(EnumHand.MAIN_HAND);
                                                var10000 = mc;
                                                Minecraft.player.setSprinting(true);
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            var3 = (Entity) var1;
                            var4 = !(var3 instanceof EntityPlayerSP) && var3 instanceof EntityPlayer && ((EntityLivingBase) var3).getHealth() > 0.0F;
                            var10000 = mc;
                            var5 = Minecraft.player.getDistanceToEntity(var3);
                            var10001 = mc;
                            var6 = var3.posX - Minecraft.player.posX;
                            var10001 = mc;
                            var8 = var3.posZ - Minecraft.player.posZ;
                            if (var3 instanceof EntityLivingBase) {
                                var12 = (EntityLivingBase) var3;
                                var24 = var12.posY + (double) var12.getEyeHeight();
                                var10001 = mc;
                                var10002 = mc;
                                var10 = var24 - (Minecraft.player.posY + (double) Minecraft.player.getEyeHeight());
                            } else {
                                var24 = (var3.boundingBox.minY + var3.boundingBox.maxY) / 2.0D;
                                var10001 = mc;
                                var10002 = mc;
                                var10 = var24 - (Minecraft.player.posY + (double) Minecraft.player.getEyeHeight());
                            }

                            var23 = MathHelper.sqrt_double(var6 * var6 + var8 * var8);
                            var14 = (float) (Math.atan2(var8, var6) * 180.0D / 3.141592653589793D) - 90.0F;
                            float var15 = (float) (-(Math.atan2(var10, var23) * 180.0D / 3.141592653589793D));
                            if (var4 && (double) var5 < Main.a.a("MDistance").f()) {
                                if (Main.a.a("Face").e()) {
                                    a(var3);
                                    var10001 = mc;
                                    mc.playerController.attackEntity(Minecraft.player, var3);
                                } else {
                                    var10001 = mc;
                                    mc.playerController.attackEntity(Minecraft.player, var3);
                                }

                                if (Main.a.a("AutoDef").e()) {
                                    boolean var16 = true;
                                    float var17 = (float) ((double) ((EntityLivingBase) var3).getHealth() - 0.5D);
                                    var10000 = mc;
                                    if (Minecraft.player.canBeAttackedWithItem() && ((EntityLivingBase) var3).getHealth() == var17) {
                                        Main.a("AntiCheat Lag!", true);
                                    } else {
                                        if (Main.a.a("AntiTrix").e()) {
                                            var10000 = mc;
                                            Minecraft.player.motionY = 0.1D;
                                            if (Main.a.a("Packet").e()) {
                                                var10000 = mc;
                                                Minecraft.player.connection.sendPacket(new CPacketPlayerTryUseItem(EnumHand.MAIN_HAND));
                                            } else if (Main.a.a("Click").e()) {
                                                mc.clickMouse();
                                            } else {
                                                var10000 = mc;
                                                Minecraft.player.attackTargetEntityWithCurrentItem(var3);
                                            }
                                        } else if (Main.a.a("Packet").e()) {
                                            var10000 = mc;
                                            Minecraft.player.connection.sendPacket(new CPacketPlayerTryUseItem(EnumHand.MAIN_HAND));
                                        } else if (Main.a.a("Click").e()) {
                                            mc.clickMouse();
                                        } else {
                                            var10000 = mc;
                                            Minecraft.player.attackTargetEntityWithCurrentItem(var3);
                                        }

                                        var10000 = mc;
                                        Minecraft.player.swingArm(EnumHand.MAIN_HAND);
                                        var10000 = mc;
                                        Minecraft.player.setSprinting(true);
                                    }

                                    return;
                                } else {
                                    if (Main.a.a("AntiTrix").e()) {
                                        var10000 = mc;
                                        Minecraft.player.motionY = 0.1D;
                                        if (Main.a.a("Packet").e()) {
                                            var10000 = mc;
                                            Minecraft.player.connection.sendPacket(new CPacketPlayerTryUseItem(EnumHand.MAIN_HAND));
                                        } else if (Main.a.a("Click").e()) {
                                            mc.clickMouse();
                                        } else {
                                            var10000 = mc;
                                            Minecraft.player.attackTargetEntityWithCurrentItem(var3);
                                        }
                                    } else if (Main.a.a("Packet").e()) {
                                        var10000 = mc;
                                        Minecraft.player.connection.sendPacket(new CPacketPlayerTryUseItem(EnumHand.MAIN_HAND));
                                    } else if (Main.a.a("Click").e()) {
                                        mc.clickMouse();
                                    } else {
                                        var10000 = mc;
                                        Minecraft.player.attackTargetEntityWithCurrentItem(var3);
                                    }

                                    var10000 = mc;
                                    Minecraft.player.swingArm(EnumHand.MAIN_HAND);
                                    var10000 = mc;
                                    Minecraft.player.setSprinting(true);
                                    return;
                                }
                            }
                        }
                    }

                    return;
                } while (!Main.a.a("Friends").e());

                var3 = (Entity) var1;
                var4 = !(var3 instanceof EntityPlayerSP) && var3 instanceof EntityPlayer && ((EntityLivingBase) var3).getHealth() > 0.0F;
                var10000 = mc;
                var5 = Minecraft.player.getDistanceToEntity(var3);
                var10001 = mc;
                var6 = var3.posX - Minecraft.player.posX;
                var10001 = mc;
                var8 = var3.posZ - Minecraft.player.posZ;
                if (var3 instanceof EntityLivingBase) {
                    var12 = (EntityLivingBase) var3;
                    var24 = var12.posY + (double) var12.getEyeHeight();
                    var10001 = mc;
                    var10002 = mc;
                    var10 = var24 - (Minecraft.player.posY + (double) Minecraft.player.getEyeHeight());
                } else {
                    var24 = (var3.boundingBox.minY + var3.boundingBox.maxY) / 2.0D;
                    var10001 = mc;
                    var10002 = mc;
                    var10 = var24 - (Minecraft.player.posY + (double) Minecraft.player.getEyeHeight());
                }

                var23 = MathHelper.sqrt_double(var6 * var6 + var8 * var8);
                if (var4) {
                    if ((double) var5 < Main.a.a("MDistance").f()) {
                        if (Main.a.a("Face").e()) {
                            a(var3);
                            var10001 = mc;
                            mc.playerController.attackEntity(Minecraft.player, var3);
                        } else {
                            var10001 = mc;
                            mc.playerController.attackEntity(Minecraft.player, var3);
                        }

                        if (Main.a.a("AutoDef").e()) {
                            var14 = (float) ((double) ((EntityLivingBase) var3).getHealth() - 0.5D);
                            var10000 = mc;
                            if (Minecraft.player.canBeAttackedWithItem() && ((EntityLivingBase) var3).getHealth() == var14) {
                                Main.a("AntiCheat Lag!", true);
                            } else {
                                if (Main.a.a("AntiTrix").e()) {
                                    var10000 = mc;
                                    Minecraft.player.motionY = 0.1D;
                                    if (Main.a.a("Packet").e()) {
                                        var10000 = mc;
                                        Minecraft.player.connection.sendPacket(new CPacketPlayerTryUseItem(EnumHand.MAIN_HAND));
                                    } else if (Main.a.a("Click").e()) {
                                        mc.clickMouse();
                                    } else {
                                        var10000 = mc;
                                        Minecraft.player.attackTargetEntityWithCurrentItem(var3);
                                    }
                                } else if (Main.a.a("Packet").e()) {
                                    var10000 = mc;
                                    Minecraft.player.connection.sendPacket(new CPacketPlayerTryUseItem(EnumHand.MAIN_HAND));
                                } else if (Main.a.a("Click").e()) {
                                    mc.clickMouse();
                                } else {
                                    var10000 = mc;
                                    Minecraft.player.attackTargetEntityWithCurrentItem(var3);
                                }

                                var10000 = mc;
                                Minecraft.player.swingArm(EnumHand.MAIN_HAND);
                                var10000 = mc;
                                Minecraft.player.setSprinting(true);
                            }
                            break;
                        }
                    } else {
                        if (!Main.a.a("AntiTrix").e()) {
                            if (Main.a.a("Packet").e()) {
                                var10000 = mc;
                                Minecraft.player.connection.sendPacket(new CPacketPlayerTryUseItem(EnumHand.MAIN_HAND));
                            } else if (Main.a.a("Click").e()) {
                                mc.clickMouse();
                            } else {
                                var10000 = mc;
                                Minecraft.player.attackTargetEntityWithCurrentItem(var3);
                            }

                            var10000 = mc;
                            Minecraft.player.swingArm(EnumHand.MAIN_HAND);
                            var10000 = mc;
                            Minecraft.player.setSprinting(true);
                            break;
                        }

                        var10000 = mc;
                        Minecraft.player.motionY = 0.1D;
                        if (Main.a.a("Packet").e()) {
                            var10000 = mc;
                            Minecraft.player.connection.sendPacket(new CPacketPlayerTryUseItem(EnumHand.MAIN_HAND));
                        } else if (Main.a.a("Click").e()) {
                            mc.clickMouse();
                        } else {
                            var10000 = mc;
                            Minecraft.player.attackTargetEntityWithCurrentItem(var3);
                        }
                    }
                }
            }
        }

    }

    public void initModule() {
        Main.a.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("MDistance", this, 4.0D, 0.0D, 6.0D, true));
        Main.a.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("AntiBot", this, false));
        Main.a.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("Friends", this, false));
        Main.a.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("AutoDef", this, true));
        Main.a.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("Face", this, false));
        Main.a.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("Packet", this, false));
        Main.a.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("AntiTrix", this, false));
        Main.a.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("Click", this, false));
    }

    public void onUpdate() {
        if (this.getState()) {
            this.m();
        }

    }
}
