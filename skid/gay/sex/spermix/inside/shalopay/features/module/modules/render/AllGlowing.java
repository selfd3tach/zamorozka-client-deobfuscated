package skid.gay.sex.spermix.inside.shalopay.features.module.modules.render;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import skid.gay.sex.spermix.inside.shalopay.features.module.Module;
import skid.gay.sex.spermix.inside.shalopay.features.module.ModuleCategory;

import java.util.Iterator;

public class AllGlowing extends Module {
    public AllGlowing() {
        super("AllGlowing", 0, ModuleCategory.RENDER);
    }

    public void onUpdate() {
        Entity var1;
        Minecraft var10001;
        Iterator var2;
        if (this.getState()) {
            var2 = mc.world.loadedEntityList.iterator();

            while (var2.hasNext()) {
                var1 = (Entity) var2.next();
                var10001 = mc;
                if (var1 != Minecraft.player && var1 != null && var1 instanceof EntityPlayer) {
                    ((EntityLivingBase) var1).addPotionEffect(new PotionEffect(Potion.getPotionById(24), 9999999, 8));
                }
            }
        } else {
            var2 = mc.world.loadedEntityList.iterator();

            while (var2.hasNext()) {
                var1 = (Entity) var2.next();
                var10001 = mc;
                if (var1 != Minecraft.player && var1 != null && var1 instanceof EntityPlayer) {
                    ((EntityLivingBase) var1).removePotionEffect(Potion.getPotionById(24));
                }
            }
        }

    }
}
