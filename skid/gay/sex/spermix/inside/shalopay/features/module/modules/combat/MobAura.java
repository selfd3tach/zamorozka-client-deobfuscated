package skid.gay.sex.spermix.inside.shalopay.features.module.modules.combat;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumHand;
import skid.gay.sex.spermix.inside.shalopay.features.module.Module;
import skid.gay.sex.spermix.inside.shalopay.features.module.ModuleCategory;
import skid.gay.sex.spermix.inside.shalopay.features.smthLikeInit.Main;

import java.util.Iterator;

public class MobAura extends Module {
    public MobAura() {
        super("MobAura", 0, ModuleCategory.COMBAT);
    }

    public void initModule() {
        Main.a.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("MobDistance", this, 3.7D, 0.0D, 20.5D, true));
        Main.a.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("MobWall", this, false));
        Main.a.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("MobAim", this, true));
    }

    public void onUpdate() {
        if (this.getState()) {
            Minecraft var10000 = mc;
            if (Minecraft.player.getCooledAttackStrength(0.0F) >= 1.0F) {
                Iterator var2 = mc.world.loadedEntityList.iterator();

                while (var2.hasNext()) {
                    Entity var3;
                    boolean var6;
                    label48:
                    {
                        Object var1 = var2.next();
                        var3 = (Entity) var1;
                        if (!(var3 instanceof EntityPlayerSP) && !(var3 instanceof EntityPlayer) && var3 instanceof EntityLivingBase) {
                            var10000 = mc;
                            if ((double) Minecraft.player.getDistanceToEntity(var3) <= Main.a.a("MobDistance").f() && ((EntityLivingBase) var3).getHealth() > 0.0F) {
                                var6 = true;
                                break label48;
                            }
                        }

                        var6 = false;
                    }

                    boolean var4;
                    label57:
                    {
                        var4 = var6;
                        if (!(var3 instanceof EntityPlayerSP) && !(var3 instanceof EntityPlayer) && var3 instanceof EntityLivingBase) {
                            var10000 = mc;
                            if ((double) Minecraft.player.getDistanceToEntity(var3) <= Main.a.a("MobDistance").f() && ((EntityLivingBase) var3).getHealth() > 0.0F) {
                                var10000 = mc;
                                if (Minecraft.player.canEntityBeSeen(var3)) {
                                    var6 = true;
                                    break label57;
                                }
                            }
                        }

                        var6 = false;
                    }

                    boolean var5 = var6;
                    Minecraft var10001;
                    if (Main.a.a("MobWall").e()) {
                        if (var5) {
                            if (Main.a.a("MobAim").e()) {
                                JetAura.a(var3);
                                var10000 = mc;
                                Minecraft.player.setSprinting(false);
                                var10001 = mc;
                                mc.playerController.attackEntity(Minecraft.player, var3);
                                var10000 = mc;
                                Minecraft.player.swingArm(EnumHand.MAIN_HAND);
                            } else {
                                var10000 = mc;
                                Minecraft.player.setSprinting(false);
                                var10001 = mc;
                                mc.playerController.attackEntity(Minecraft.player, var3);
                                var10000 = mc;
                                Minecraft.player.swingArm(EnumHand.MAIN_HAND);
                            }
                        }
                    } else if (var4) {
                        if (Main.a.a("MobAim").e()) {
                            JetAura.a(var3);
                            var10000 = mc;
                            Minecraft.player.setSprinting(false);
                            var10001 = mc;
                            mc.playerController.attackEntity(Minecraft.player, var3);
                            var10000 = mc;
                            Minecraft.player.swingArm(EnumHand.MAIN_HAND);
                        } else {
                            var10000 = mc;
                            Minecraft.player.setSprinting(false);
                            var10001 = mc;
                            mc.playerController.attackEntity(Minecraft.player, var3);
                            var10000 = mc;
                            Minecraft.player.swingArm(EnumHand.MAIN_HAND);
                        }
                    }
                }
            }

        }
    }
}
