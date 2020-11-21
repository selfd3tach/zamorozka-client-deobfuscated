package skid.gay.sex.spermix.inside.shalopay.features.module.modules.render2;

import net.minecraft.client.Minecraft;
import net.minecraft.network.play.client.CPacketPlayer;
import skid.gay.sex.spermix.inside.shalopay.features.module.Module;
import skid.gay.sex.spermix.inside.shalopay.features.module.ModuleCategory;

public class FlyTeleport extends Module {
    public FlyTeleport() {
        super("Fly-Teleport", 0, ModuleCategory.PLAYER);
    }

    public void onRender() {
        if (this.getState()) {
            double var1 = Minecraft.player.posX;
            double var3 = Minecraft.player.posY;
            double var5 = Minecraft.player.posZ;
            var1 += Math.cos(Math.toRadians(Minecraft.player.rotationYaw + 90.0F)) * 2.0D;
            var5 += Math.sin(Math.toRadians(Minecraft.player.rotationYaw + 90.0F)) * 2.0D;
            Minecraft.player.setPositionAndUpdate(var1, var3 + 0.1D, var5);
            Minecraft.player.connection.sendPacket(new CPacketPlayer());
        }

    }

    public void onDisable() {
    }
}
