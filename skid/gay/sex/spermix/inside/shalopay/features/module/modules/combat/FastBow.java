package skid.gay.sex.spermix.inside.shalopay.features.module.modules.combat;

import net.minecraft.client.Minecraft;
import net.minecraft.item.ItemBow;
import net.minecraft.network.play.client.CPacketPlayerDigging;
import net.minecraft.network.play.client.CPacketPlayerDigging$Action;
import net.minecraft.network.play.client.CPacketPlayerTryUseItem;
import net.minecraft.util.math.BlockPos;
import skid.gay.sex.spermix.inside.shalopay.features.module.Module;
import skid.gay.sex.spermix.inside.shalopay.features.module.ModuleCategory;
import skid.gay.sex.spermix.inside.shalopay.features.smthLikeInit.Main;

public class FastBow extends Module {
    public FastBow() {
        super("FastBow", 0, ModuleCategory.COMBAT);
    }

    public void onUpdate() {
        if (this.getState()) {
            this.m();
        }

    }

    public void initModule() {
        Main.a.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("Speed", this, 2.0D, 0.0D, 5.0D, true));
    }

    public void m() {
        Minecraft var1 = Minecraft.getMinecraft();
        if (Minecraft.player.inventory.getCurrentItem().getItem() instanceof ItemBow && Minecraft.player.isHandActive() && (double) Minecraft.player.getItemInUseMaxCount() >= Main.a.a("Speed").f()) {
            Minecraft.player.connection.sendPacket(new CPacketPlayerDigging(CPacketPlayerDigging$Action.RELEASE_USE_ITEM, BlockPos.ORIGIN, Minecraft.player.getHorizontalFacing()));
            Minecraft.player.connection.sendPacket(new CPacketPlayerTryUseItem(Minecraft.player.getActiveHand()));
            Minecraft.player.stopActiveHand();
        }

    }
}
