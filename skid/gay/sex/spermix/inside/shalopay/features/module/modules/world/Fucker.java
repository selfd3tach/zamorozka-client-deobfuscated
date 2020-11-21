package skid.gay.sex.spermix.inside.shalopay.features.module.modules.world;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import skid.gay.sex.spermix.inside.shalopay.features.module.Module;
import skid.gay.sex.spermix.inside.shalopay.features.module.ModuleCategory;
import skid.gay.sex.spermix.inside.shalopay.features.smthLikeInit.Main;

public class Fucker extends Module {

    private static final int g = 4;
    private final EnumFacing h;
    private int f;
    private int e;

    private int d;

    public Fucker() {
        super("Fucker", 0, ModuleCategory.WORLD);
        this.h = EnumFacing.NORTH;
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
                    BlockPos var4 = new BlockPos(this.d, this.e, this.f);
                    Block var5 = mc.world.getBlockState(var4).getBlock();
                    if (Block.getIdFromBlock(var5) == 26) {
                        for (int var6 = 0; var6 < 20; ++var6) {
                            mc.playerController.onPlayerDamageBlock(var4, this.h);
                        }
                    }
                }
            }
        }

    }

    public void onUpdate() {
        if (this.getState()) {
            this.m();
        }

    }

    public void initModule() {
        Main.a.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("Def", this, true));
        Main.a.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("Tep", this, false));
    }
}
