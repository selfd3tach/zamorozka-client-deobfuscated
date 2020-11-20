package skid.gay.sex.spermix.inside.shalopay.features.module.modules.render;

import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import skid.gay.sex.spermix.inside.shalopay.features.smthLikeInit.Main;
import skid.gay.sex.spermix.inside.shalopay.features.module.Module;
import skid.gay.sex.spermix.inside.shalopay.features.module.ModuleCategory;

public class NightVision extends Module {
   public void h() {
      if (this.c()) {
         Main.e().addPotionEffect(new PotionEffect(Potion.getPotionById(16), 9999999, 1));
      } else {
         Main.e().removePotionEffect(Potion.getPotionById(16));
      }

   }

   public NightVision() {
      super("NightVision", 0, ModuleCategory.RENDER);
   }
}
