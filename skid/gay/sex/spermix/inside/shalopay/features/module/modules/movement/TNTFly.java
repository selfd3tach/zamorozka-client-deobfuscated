package skid.gay.sex.spermix.inside.shalopay.features.module.modules.movement;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import skid.gay.sex.spermix.inside.shalopay.features.module.Module;
import skid.gay.sex.spermix.inside.shalopay.features.module.ModuleCategory;

public class TNTFly extends Module {

    private static final int g = 10;
    private int d;
    private final EnumFacing h;
    private int e;

    private int f;

    public TNTFly() {
        super("TNTFly", 0, ModuleCategory.MOVEMENT);
        this.h = EnumFacing.NORTH;
    }

    public void onUpdate() {
        if (this.getState()) {
            for (int var1 = -g; var1 < g; ++var1) {
                for (int var2 = g; var2 > -g; --var2) {
                    for (int var3 = -g; var3 < g; ++var3) {
                        Minecraft var10001 = mc;
                        this.d = (int) Minecraft.player.posX + var1;
                        var10001 = mc;
                        this.e = (int) Minecraft.player.posY + var2;
                        var10001 = mc;
                        this.f = (int) Minecraft.player.posZ + var3;
                        BlockPos var4 = new BlockPos(this.d, this.e, this.f);
                        Block var5 = mc.world.getBlockState(var4).getBlock();
                        Minecraft var10003 = mc;
                        Minecraft var10004 = mc;
                        double var6 = Minecraft.player.motionY - 0.42D;
                        Minecraft var10005 = mc;
                        if (mc.world.getBlockState(new BlockPos(Minecraft.player.posX, var6, Minecraft.player.posZ)).getBlock() == Blocks.AIR) {
                            var10004 = mc;
                            mc.world.setBlockState(new BlockPos(this.d, Minecraft.player.getPosition().getY() - 1, this.f), Blocks.TNT.getDefaultState(), 2);
                        }
                    }
                }
            }
        }

    }
}
