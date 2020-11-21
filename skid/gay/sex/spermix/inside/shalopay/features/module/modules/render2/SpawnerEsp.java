package skid.gay.sex.spermix.inside.shalopay.features.module.modules.render2;

import net.minecraft.tileentity.TileEntityMobSpawner;
import skid.gay.sex.spermix.inside.shalopay.features.module.Module;
import skid.gay.sex.spermix.inside.shalopay.features.module.ModuleCategory;

import java.util.Iterator;

public class SpawnerEsp extends Module {
    public SpawnerEsp() {
        super("SpawnerEsp", 0, ModuleCategory.RENDER2);
    }

    public void onRender() {
        if (this.getState()) {
            Iterator var2 = mc.world.loadedTileEntityList.iterator();

            while (var2.hasNext()) {
                Object var1 = var2.next();
                if (var1 instanceof TileEntityMobSpawner) {
                    skid.gay.sex.spermix.inside.shalopay.features.idk.RenderUtils.a(((TileEntityMobSpawner) var1).getPos());
                }
            }
        }

    }
}
