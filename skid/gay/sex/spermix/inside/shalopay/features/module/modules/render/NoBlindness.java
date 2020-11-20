package skid.gay.sex.spermix.inside.shalopay.features.module.modules.render;

import net.minecraft.client.Minecraft;
import net.minecraft.potion.Potion;
import skid.gay.sex.spermix.inside.shalopay.features.module.Module;
import skid.gay.sex.spermix.inside.shalopay.features.module.ModuleCategory;

public class NoBlindness extends Module {
   public NoBlindness() {
      super("NoBlindness", 0, ModuleCategory.RENDER);
   }

   public void h() {
      if (this.c()) {
         Minecraft var10000 = mc;
         Minecraft.player.removePotionEffect(Potion.getPotionById(15));
      }

   }
}
