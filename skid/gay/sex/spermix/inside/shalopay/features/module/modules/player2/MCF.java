package skid.gay.sex.spermix.inside.shalopay.features.module.modules.player2;

import net.minecraft.entity.player.EntityPlayer;
import org.lwjgl.input.Mouse;
import skid.gay.sex.spermix.inside.shalopay.features.module.Module;
import skid.gay.sex.spermix.inside.shalopay.features.module.ModuleCategory;
import skid.gay.sex.spermix.inside.shalopay.features.smthLikeInit.Main;
import skid.gay.sex.spermix.inside.shalopay.features.smthLikeInit.idk;

public class MCF extends Module {
    public MCF() {
        super("MCF", 0, ModuleCategory.PLAYER2);
    }

    public void onUpdate() {
        if (this.getState() && Mouse.isButtonDown(2) && mc.objectMouseOver.entityHit != null && mc.objectMouseOver.entityHit instanceof EntityPlayer) {
            EntityPlayer var1 = (EntityPlayer) mc.objectMouseOver.entityHit;
            idk.a().a(var1.getName(), "MCF");
            Main.a(String.valueOf((new StringBuilder(String.valueOf(var1.getName()))).append(" now your friend.")), true);
        }

    }
}
