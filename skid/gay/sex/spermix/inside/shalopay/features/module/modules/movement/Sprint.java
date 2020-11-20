package skid.gay.sex.spermix.inside.shalopay.features.module.modules.movement;

import net.minecraft.client.Minecraft;
import skid.gay.sex.spermix.inside.shalopay.features.module.Module;
import skid.gay.sex.spermix.inside.shalopay.features.module.ModuleCategory;

public class Sprint extends Module {
   public Sprint() {
      super("Sprint", 0, ModuleCategory.PLAYER);
   }

   public void h() {
      if (this.c()) {
         Minecraft var10000 = mc;
         Minecraft.player.setSprinting(true);
      }
   }
}
