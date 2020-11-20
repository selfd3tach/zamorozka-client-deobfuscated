package skid.gay.sex.spermix.inside.shalopay.features.module.modules.render2;

import java.util.Iterator;
import net.minecraft.tileentity.TileEntityEndPortal;
import skid.gay.sex.spermix.inside.shalopay.features.module.Module;
import skid.gay.sex.spermix.inside.shalopay.features.module.ModuleCategory;

public class EndEsp extends Module {
   public EndEsp() {
      super("EndEsp", 0, ModuleCategory.RENDER2);
   }

   public void i() {
      if (this.c()) {
         Iterator var2 = mc.world.loadedTileEntityList.iterator();

         while(var2.hasNext()) {
            Object var1 = var2.next();
            if (var1 instanceof TileEntityEndPortal) {
               skid.gay.sex.spermix.inside.shalopay.features.idk.RenderUtils.b(((TileEntityEndPortal)var1).getPos());
            }
         }
      }

   }
}
