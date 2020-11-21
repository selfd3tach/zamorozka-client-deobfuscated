package skid.gay.sex.spermix.inside.shalopay.features.module.modules.combat;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.EnumHand;
import skid.gay.sex.spermix.inside.shalopay.features.module.Module;
import skid.gay.sex.spermix.inside.shalopay.features.module.ModuleCategory;
import skid.gay.sex.spermix.inside.shalopay.features.smthLikeInit.Main;

import java.util.Iterator;

public class FastAura extends Module {
    public FastAura() {
        super("FastAura", 0, ModuleCategory.COMBAT);
    }

    public void onUpdate() {
        if (this.getState()) {
            Minecraft var10000 = mc;
            if (Minecraft.player.getCooledAttackStrength(0.0F) >= 1.0F) {
                Iterator var2 = mc.world.loadedEntityList.iterator();

                while (var2.hasNext()) {
                    boolean var5;
                    label27:
                    {
                        Object var1 = var2.next();
                        Entity var3 = (Entity) var1;
                        if (!(var3 instanceof EntityPlayerSP) && var3 instanceof EntityLivingBase) {
                            var10000 = mc;
                            if ((double) Minecraft.player.getDistanceToEntity(var3) <= Main.a.a("FDistance").f() && ((EntityLivingBase) var3).getHealth() > 0.0F) {
                                var5 = true;
                                break label27;
                            }
                        }

                        var5 = false;
                    }

                    boolean var4 = var5;
                    if (var4) {
                        var10000 = mc;
                        Minecraft.player.setSprinting(true);
                        mc.clickMouse();
                        var10000 = mc;
                        Minecraft.player.resetCooldown();
                        var10000 = mc;
                        Minecraft.player.swingArm(EnumHand.MAIN_HAND);
                    }
                }
            }

        }
    }

    public void initModule() {
        Main.a.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("FastAttack", this, 3.0D, 0.0D, 50.0D, true));
        Main.a.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("FDistance", this, 3.0D, 0.0D, 4.0D, true));
    }
}
