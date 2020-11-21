package skid.gay.sex.spermix.inside.shalopay.features.module.modules.render2;

import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import skid.gay.sex.spermix.inside.shalopay.features.module.Module;
import skid.gay.sex.spermix.inside.shalopay.features.module.ModuleCategory;

import java.awt.*;
import java.util.Iterator;

public class ItemEsp extends Module {
    public ItemEsp() {
        super("ItemEsp", 0, ModuleCategory.RENDER2);
    }

    public void onRender() {
        if (this.getState()) {
            Iterator var2 = mc.world.loadedEntityList.iterator();

            while (var2.hasNext()) {
                Entity var1 = (Entity) var2.next();
                if (var1 instanceof EntityItem) {
                    skid.gay.sex.spermix.inside.shalopay.features.idk.RenderUtils.a(var1, Color.BLUE);
                }
            }

        }
    }
}
