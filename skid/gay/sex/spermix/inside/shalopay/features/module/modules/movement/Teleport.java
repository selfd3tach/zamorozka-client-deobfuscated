package skid.gay.sex.spermix.inside.shalopay.features.module.modules.movement;

import net.minecraft.client.Minecraft;
import net.minecraft.network.play.client.CPacketPlayer$Position;
import net.minecraft.util.math.BlockPos;
import org.lwjgl.input.Mouse;
import skid.gay.sex.spermix.inside.shalopay.features.module.Module;
import skid.gay.sex.spermix.inside.shalopay.features.module.ModuleCategory;

public class Teleport extends Module {
    public Teleport() {
        super("Teleport", 0, ModuleCategory.EXPLOIT);
    }

    public void onUpdate() {
        if (this.getState()) {
            BlockPos var1 = mc.objectMouseOver.getBlockPos();
            if (Mouse.isButtonDown(0)) {
                double var10000 = var1.getX();
                Minecraft var10001 = mc;
                int var2 = (int) (var10000 - Minecraft.player.posX);
                var10000 = var1.getY();
                var10001 = mc;
                int var3 = (int) (var10000 - Minecraft.player.posY);
                var10000 = var1.getZ();
                var10001 = mc;
                int var4 = (int) (var10000 - Minecraft.player.posZ);
                Minecraft var5 = mc;
                Minecraft.player.setPosition(var1.getX(), var1.getY(), var1.getZ());
                var5 = mc;
                Minecraft.player.connection.sendPacket(new CPacketPlayer$Position(var2, var3, var4, true));
            }

        }
    }
}
