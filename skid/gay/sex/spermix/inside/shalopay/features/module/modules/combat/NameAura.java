package skid.gay.sex.spermix.inside.shalopay.features.module.modules.combat;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.MathHelper;
import skid.gay.sex.spermix.inside.shalopay.features.module.Module;
import skid.gay.sex.spermix.inside.shalopay.features.module.ModuleCategory;
import skid.gay.sex.spermix.inside.shalopay.features.smthLikeInit.Main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class NameAura extends Module {

    public static ArrayList d = new ArrayList();

    public NameAura() {
        super("NameAura", 0, ModuleCategory.COMBAT);
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

    public void onUpdate() {
        if (this.getState()) {
            this.m();
        }

    }

    public void initModule() {
        Main.a.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("NDistance", this, 4.0D, 0.0D, 6.0D, true));
        Main.a.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("Aim", this, false));
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
                        String var8 = ((EntityPlayer) var3.get(var4)).getName();
                        Minecraft var10001 = mc;
                        if (var8 != Minecraft.player.getName()) {
                            EntityPlayer var5 = (EntityPlayer) var3.get(1);
                            boolean var6 = !(var5 instanceof EntityPlayerSP) && var5 instanceof EntityPlayer && var5.getHealth() > 0.0F;
                            var10000 = mc;
                            float var7 = Minecraft.player.getDistanceToEntity(var5);
                            if ((skid.gay.sex.spermix.inside.shalopay.ColorPicker.CustomMainMenu.Sprint.contains(var5.getName()) || d.contains(var5.getName())) && var5 instanceof EntityLivingBase) {
                                if ((double) var7 < Main.a.a("NDistance").f()) {
                                    var10000 = mc;
                                    if (Minecraft.player.getCooledAttackStrength(0.0F) == 1.0F && var6) {
                                        if (Main.a.a("Aim").e()) {
                                            a(var5);
                                            var10001 = mc;
                                            mc.playerController.attackEntity(Minecraft.player, var5);
                                            var10000 = mc;
                                            Minecraft.player.swingArm(EnumHand.MAIN_HAND);
                                            var10000 = mc;
                                            Minecraft.player.setSprinting(true);
                                        } else {
                                            var10001 = mc;
                                            mc.playerController.attackEntity(Minecraft.player, var5);
                                            var10000 = mc;
                                            Minecraft.player.swingArm(EnumHand.MAIN_HAND);
                                            var10000 = mc;
                                            Minecraft.player.setSprinting(true);
                                        }
                                    }
                                }
                                break;
                            }
                        }
                    }
                }

                return;
            }
        }
    }
}
