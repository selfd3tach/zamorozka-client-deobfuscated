package skid.gay.sex.spermix.inside.shalopay.features.module.modules.player2;

import net.minecraft.client.Minecraft;
import skid.gay.sex.spermix.inside.shalopay.features.module.Module;
import skid.gay.sex.spermix.inside.shalopay.features.module.ModuleCategory;

public class FastLadder extends Module {
   public FastLadder() {
      super("FastLadder", 0, ModuleCategory.PLAYER2);
   }

   public void h() {
      if (this.c()) {
         Minecraft var10000 = mc;
         if (Minecraft.player.isOnLadder()) {
            var10000 = mc;
            Minecraft.player.motionY = 0.18D;
         }

      }
   }
}
