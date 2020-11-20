package skid.gay.sex.spermix.inside.shalopay.features.module.modules.render2;

import java.awt.Color;
import java.util.Iterator;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import skid.gay.sex.spermix.inside.shalopay.features.module.Module;
import skid.gay.sex.spermix.inside.shalopay.features.module.ModuleCategory;

public class ItemEsp extends Module {
   public void i() {
      if (this.c()) {
         Iterator var2 = mc.world.loadedEntityList.iterator();

         while(var2.hasNext()) {
            Entity var1 = (Entity)var2.next();
            if (var1 instanceof EntityItem) {
               skid.gay.sex.spermix.inside.shalopay.features.idk.RenderUtils.a(var1, Color.BLUE);
            }
         }

      }
   }

   public ItemEsp() {
      super("ItemEsp", 0, ModuleCategory.RENDER2);
   }
}
