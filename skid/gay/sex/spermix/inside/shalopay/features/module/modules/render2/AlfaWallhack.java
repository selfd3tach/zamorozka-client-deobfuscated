package skid.gay.sex.spermix.inside.shalopay.features.module.modules.render2;

import java.util.ArrayList;
import org.lwjgl.opengl.GL11;
import skid.gay.sex.spermix.inside.shalopay.features.module.Module;
import skid.gay.sex.spermix.inside.shalopay.features.module.ModuleCategory;

public class AlfaWallhack extends Module {
   
   private final ArrayList d = new ArrayList();

   public AlfaWallhack() {
      super("Alfa-Wallhack", 0, ModuleCategory.RENDER2);
   }

   public void i() {
      if (this.c()) {
         GL11.glDisable(2929);
      }

   }
}
