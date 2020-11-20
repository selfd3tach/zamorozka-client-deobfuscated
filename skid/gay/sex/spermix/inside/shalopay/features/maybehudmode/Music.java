package skid.gay.sex.spermix.inside.shalopay.features.maybehudmode;

import skid.gay.sex.spermix.inside.shalopay.features.newmegospeed.RadioShanson;
import net.minecraft.client.gui.GuiScreen;
import skid.gay.sex.spermix.inside.shalopay.features.module.Module;
import skid.gay.sex.spermix.inside.shalopay.features.module.ModuleCategory;

public class Music extends Module {
   
   private GuiScreen d;

   public Music() {
      super("Music", 0, ModuleCategory.OTHER);
   }

   public void h() {
      if (this.c()) {
         mc.displayGuiScreen(new RadioShanson(this.d));
         this.b = false;
      }
   }
}
