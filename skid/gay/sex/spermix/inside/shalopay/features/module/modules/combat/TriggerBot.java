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
import java.util.List;

public class TriggerBot extends Module {
    public TriggerBot() {
        super("TriggerBot", 0, ModuleCategory.COMBAT);
    }

    public void onUpdate() {
        if (this.getState()) {
            this.m();
        }

    }

    public void initModule() {
        Main.a.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("TrigDistance", this, 4.0D, 0.0D, 6.0D, true));
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
                        String var9 = ((EntityPlayer) var3.get(var4)).getName();
                        Minecraft var10001 = mc;
                        if (var9 != Minecraft.player.getName()) {
                            EntityPlayer var5 = (EntityPlayer) var3.get(1);
                            Entity var6 = (Entity) var1;
                            boolean var7 = !(var6 instanceof EntityPlayerSP) && var6 instanceof EntityPlayer && ((EntityLivingBase) var6).getHealth() > 0.0F;
                            var10000 = mc;
                            float var8 = Minecraft.player.getDistanceToEntity(var6);
                            if (var6 instanceof EntityLivingBase && (double) var8 < Main.a.a("TrigDistance").f()) {
                                var10000 = mc;
                                if (Minecraft.player.getCooledAttackStrength(0.0F) == 1.0F) {
                                    if (var7 && Minecraft.getMinecraft().objectMouseOver.entityHit instanceof EntityPlayer) {
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

                return;
            }
        }
    }
}
