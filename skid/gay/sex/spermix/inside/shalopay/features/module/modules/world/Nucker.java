package skid.gay.sex.spermix.inside.shalopay.features.module.modules.world;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.network.play.client.CPacketPlayerDigging;
import net.minecraft.network.play.client.CPacketPlayerDigging$Action;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import skid.gay.sex.spermix.inside.shalopay.features.module.Module;
import skid.gay.sex.spermix.inside.shalopay.features.module.ModuleCategory;

public class Nucker extends Module {

    private static final int g = 4;
    private final EnumFacing h;
    private int f;
    private int d;
    private int e;

    public Nucker() {
        super("Nucker", 0, ModuleCategory.WORLD);
        this.h = EnumFacing.NORTH;
    }

    public void onUpdate() {
        if (this.getState()) {
            this.m();
        }

    }

    private void m() {
        for (int var1 = -g; var1 < g; ++var1) {
            for (int var2 = g; var2 > -g; --var2) {
                for (int var3 = -g; var3 < g; ++var3) {
                    Minecraft var10001 = mc;
                    this.d = (int) Minecraft.player.posX + var1;
                    var10001 = mc;
                    this.e = (int) Minecraft.player.posY + var2;
                    var10001 = mc;
                    this.f = (int) Minecraft.player.posZ + var3;
                    boolean var4 = false;
                    float var5 = 0.0F;
                    BlockPos var6 = new BlockPos(this.d, this.e, this.f);
                    Block var7 = mc.world.getBlockState(var6).getBlock();
                    if (mc.gameSettings.keyBindAttack.isKeyDown()) {
                        int var8 = Block.getIdFromBlock(Minecraft.getMinecraft().world.getBlockState(Minecraft.getMinecraft().objectMouseOver.getBlockPos()).getBlock());
                        if (Block.getIdFromBlock(var7) == var8) {
                            Minecraft.getMinecraft();
                            Minecraft.player.connection.sendPacket(new CPacketPlayerDigging(CPacketPlayerDigging$Action.STOP_DESTROY_BLOCK, var6, this.h));
                        }
                    }
                }
            }
        }

    }
}
