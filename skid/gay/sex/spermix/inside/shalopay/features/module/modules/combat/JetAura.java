package skid.gay.sex.spermix.inside.shalopay.features.module.modules.combat;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemAir;
import net.minecraft.item.ItemShield;
import net.minecraft.network.play.client.CPacketPlayerDigging;
import net.minecraft.network.play.client.CPacketPlayerDigging$Action;
import net.minecraft.network.play.client.CPacketPlayerTryUseItem;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import skid.gay.sex.spermix.inside.shalopay.features.module.Module;
import skid.gay.sex.spermix.inside.shalopay.features.module.ModuleCategory;
import skid.gay.sex.spermix.inside.shalopay.features.smthLikeInit.Main;
import skid.gay.sex.spermix.inside.shalopay.features.smthLikeInit.idk;

import java.util.Iterator;
import java.util.List;

public class JetAura extends Module {
    public JetAura() {
        super("JetAura", 0, ModuleCategory.COMBAT);
    }

    public static float[] b(Entity var0) {
        if (var0 == null) {
            return null;
        } else {
            new AxisAlignedBB(var0.posX, var0.posY, var0.posZ, var0.posX, var0.posY, var0.posZ);
            Minecraft var10001 = mc;
            double var2 = var0.posX - Minecraft.player.posX;
            var10001 = mc;
            double var4 = var0.posZ - Minecraft.player.posZ;
            double var6;
            double var10000;
            Minecraft var10002;
            if (var0 instanceof EntityLivingBase) {
                EntityLivingBase var8 = (EntityLivingBase) var0;
                var10000 = var8.posY + (double) var8.getEyeHeight();
                var10001 = mc;
                var10002 = mc;
                var6 = var10000 - (Minecraft.player.posY + (double) Minecraft.player.getEyeHeight() + 1.0D);
            } else {
                var10000 = (var0.boundingBox.minY + var0.boundingBox.maxY) / 2.0D;
                var10001 = mc;
                var10002 = mc;
                var6 = var10000 - (Minecraft.player.posY + (double) Minecraft.player.getEyeHeight() + 1.0D);
            }

            double var12 = MathHelper.sqrt_double(var2 * var2 + var4 * var4);
            float var10 = (float) (Math.atan2(var4, var2) * 180.0D / 3.141592653589793D) - 90.0F;
            float var11 = (float) (-(Math.atan2(var6, var12) * 180.0D / 3.141592653589793D));
            float[] var13 = new float[2];
            Minecraft var10003 = mc;
            Minecraft var10005 = mc;
            var13[0] = Minecraft.player.rotationYaw + MathHelper.wrapAngleTo180_float(var10 - Minecraft.player.rotationYaw);
            var10003 = mc;
            var10005 = mc;
            var13[1] = Minecraft.player.rotationPitch + MathHelper.wrapAngleTo180_float(var11 - Minecraft.player.rotationPitch);
            return var13;
        }
    }

    public static synchronized void a(Entity var0) {
        float[] var1 = b(var0);
        if (var1 != null) {
            Minecraft var10000 = mc;
            Minecraft.player.rotationYaw = var1[0];
            var10000 = mc;
            Minecraft.player.rotationPitch = var1[1] - 4.0F;
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
                while (var2.hasNext()) {
                    Object var1 = var2.next();
                    List var3 = mc.world.playerEntities;

                    for (int var4 = 0; var4 < var3.size(); ++var4) {
                        String var11 = ((EntityPlayer) var3.get(var4)).getName();
                        Minecraft var10001 = mc;
                        if (var11 != Minecraft.player.getName()) {
                            EntityPlayer var5 = (EntityPlayer) var3.get(1);
                            Entity var6 = (Entity) var1;
                            boolean var7 = !(var6 instanceof EntityPlayerSP) && var6 instanceof EntityPlayer && ((EntityLivingBase) var6).getHealth() > 0.0F;
                            var10000 = mc;
                            float var8 = Minecraft.player.getDistanceToEntity(var6);
                            if (var6 instanceof EntityLivingBase && (double) var8 < Main.a.a("JetDistance").f()) {
                                var10000 = mc;
                                if (Minecraft.player.getCooledAttackStrength(0.0F) == 1.0F) {
                                    if (Main.a.a("Nuked").e() && !(var5.getEquipmentAndArmor() instanceof ItemAir)) {
                                        if (var7) {
                                            a(var6);
                                            var10001 = mc;
                                            mc.playerController.attackEntity(Minecraft.player, var6);
                                            var10000 = mc;
                                            Minecraft.player.swingArm(EnumHand.MAIN_HAND);
                                            var10000 = mc;
                                            Minecraft.player.setSprinting(false);
                                        }
                                        break;
                                    }

                                    Minecraft var10003;
                                    Minecraft var10005;
                                    if (Main.a.a("JAntiBot").e()) {
                                        double var9 = (double) Math.round(var5.getHealth() * 100.0F / 100.0F) / 2.0D;
                                        if (var9 == 10.0D) {
                                            var10001 = mc;
                                            if (var5.ticksExisted < Minecraft.player.ticksExisted) {
                                                if (mc.objectMouseOver.entityHit instanceof EntityPlayerSP) {
                                                    var10001 = mc;
                                                    mc.playerController.attackEntity(Minecraft.player, var6);
                                                    var10000 = mc;
                                                    Minecraft.player.swingArm(EnumHand.MAIN_HAND);
                                                    var10000 = mc;
                                                    Minecraft.player.setSprinting(false);
                                                }
                                                continue;
                                            }
                                        }

                                        if (idk.a().b(((Entity) var1).getName())) {
                                            Main.a.a("Friends").e();
                                        } else if (var7) {
                                            if (Main.a.a("Crits").e()) {
                                                var10000 = mc;
                                                Minecraft.player.motionY = 0.1D;
                                                a(var6);
                                                if (Main.a.a("Shield").e()) {
                                                    var10000 = mc;
                                                    if (Minecraft.player.inventory.getCurrentItem().getItem() instanceof ItemShield) {
                                                        var10000 = mc;
                                                        if (Minecraft.player.isHandActive()) {
                                                            var10000 = mc;
                                                            if (Minecraft.player.getItemInUseMaxCount() >= 2) {
                                                                var10000 = mc;
                                                                var10005 = mc;
                                                                Minecraft.player.connection.sendPacket(new CPacketPlayerDigging(CPacketPlayerDigging$Action.RELEASE_USE_ITEM, BlockPos.ORIGIN, Minecraft.player.getHorizontalFacing()));
                                                                var10000 = mc;
                                                                var10003 = mc;
                                                                Minecraft.player.connection.sendPacket(new CPacketPlayerTryUseItem(Minecraft.player.getActiveHand()));
                                                                var10000 = mc;
                                                                Minecraft.player.stopActiveHand();
                                                            }
                                                        }
                                                    }
                                                }

                                                var10001 = mc;
                                                mc.playerController.attackEntity(Minecraft.player, var6);
                                                var10000 = mc;
                                                Minecraft.player.swingArm(EnumHand.MAIN_HAND);
                                                var10000 = mc;
                                                Minecraft.player.setSprinting(false);
                                            } else {
                                                a(var6);
                                                if (Main.a.a("Shield").e()) {
                                                    var10000 = mc;
                                                    if (Minecraft.player.getArmorInventoryList() instanceof ItemShield) {
                                                        var10000 = mc;
                                                        if (Minecraft.player.isHandActive()) {
                                                            var10000 = mc;
                                                            if (Minecraft.player.getItemInUseMaxCount() >= 2) {
                                                                var10000 = mc;
                                                                var10005 = mc;
                                                                Minecraft.player.connection.sendPacket(new CPacketPlayerDigging(CPacketPlayerDigging$Action.RELEASE_USE_ITEM, BlockPos.ORIGIN, Minecraft.player.getHorizontalFacing()));
                                                                var10000 = mc;
                                                                var10003 = mc;
                                                                Minecraft.player.connection.sendPacket(new CPacketPlayerTryUseItem(Minecraft.player.getActiveHand()));
                                                                var10000 = mc;
                                                                Minecraft.player.stopActiveHand();
                                                            }
                                                        }
                                                    }
                                                }

                                                var10001 = mc;
                                                mc.playerController.attackEntity(Minecraft.player, var6);
                                                var10000 = mc;
                                                Minecraft.player.swingArm(EnumHand.MAIN_HAND);
                                                var10000 = mc;
                                                Minecraft.player.setSprinting(false);
                                            }
                                            break;
                                        }
                                    } else if (idk.a().b(((Entity) var1).getName())) {
                                        Main.a.a("Friends").e();
                                    } else if (var7) {
                                        if (Main.a.a("Crits").e()) {
                                            var10000 = mc;
                                            Minecraft.player.motionY = 0.1D;
                                            a(var6);
                                            if (Main.a.a("Shield").e()) {
                                                var10000 = mc;
                                                if (Minecraft.player.inventory.getCurrentItem().getItem() instanceof ItemShield) {
                                                    var10000 = mc;
                                                    if (Minecraft.player.isHandActive()) {
                                                        var10000 = mc;
                                                        if (Minecraft.player.getItemInUseMaxCount() >= 2) {
                                                            var10000 = mc;
                                                            var10005 = mc;
                                                            Minecraft.player.connection.sendPacket(new CPacketPlayerDigging(CPacketPlayerDigging$Action.RELEASE_USE_ITEM, BlockPos.ORIGIN, Minecraft.player.getHorizontalFacing()));
                                                            var10000 = mc;
                                                            var10003 = mc;
                                                            Minecraft.player.connection.sendPacket(new CPacketPlayerTryUseItem(Minecraft.player.getActiveHand()));
                                                            var10000 = mc;
                                                            Minecraft.player.stopActiveHand();
                                                        }
                                                    }
                                                }
                                            }

                                            var10001 = mc;
                                            mc.playerController.attackEntity(Minecraft.player, var6);
                                            var10000 = mc;
                                            Minecraft.player.swingArm(EnumHand.MAIN_HAND);
                                            var10000 = mc;
                                            Minecraft.player.setSprinting(false);
                                        } else {
                                            a(var6);
                                            if (Main.a.a("Shield").e()) {
                                                var10000 = mc;
                                                if (Minecraft.player.getArmorInventoryList() instanceof ItemShield) {
                                                    var10000 = mc;
                                                    if (Minecraft.player.isHandActive()) {
                                                        var10000 = mc;
                                                        if (Minecraft.player.getItemInUseMaxCount() >= 2) {
                                                            var10000 = mc;
                                                            var10005 = mc;
                                                            Minecraft.player.connection.sendPacket(new CPacketPlayerDigging(CPacketPlayerDigging$Action.RELEASE_USE_ITEM, BlockPos.ORIGIN, Minecraft.player.getHorizontalFacing()));
                                                            var10000 = mc;
                                                            var10003 = mc;
                                                            Minecraft.player.connection.sendPacket(new CPacketPlayerTryUseItem(Minecraft.player.getActiveHand()));
                                                            var10000 = mc;
                                                            Minecraft.player.stopActiveHand();
                                                        }
                                                    }
                                                }
                                            }

                                            var10001 = mc;
                                            mc.playerController.attackEntity(Minecraft.player, var6);
                                            var10000 = mc;
                                            Minecraft.player.swingArm(EnumHand.MAIN_HAND);
                                            var10000 = mc;
                                            Minecraft.player.setSprinting(false);
                                        }
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }

                return;
            }
        }
    }

    public void initModule() {
        Main.a.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("JetDistance", this, 4.0D, 0.0D, 6.0D, true));
        Main.a.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("JAntiBot", this, false));
        Main.a.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("Friends", this, true));
        Main.a.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("Nuked", this, false));
        Main.a.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("Shield", this, false));
        Main.a.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("Crits", this, false));
    }

    public void onUpdate() {
        if (this.getState()) {
            this.m();
        }

    }
}
