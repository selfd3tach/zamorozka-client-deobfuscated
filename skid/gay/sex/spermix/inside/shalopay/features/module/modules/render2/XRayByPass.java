package skid.gay.sex.spermix.inside.shalopay.features.module.modules.render2;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import skid.gay.sex.spermix.inside.shalopay.features.module.Module;
import skid.gay.sex.spermix.inside.shalopay.features.module.ModuleCategory;
import skid.gay.sex.spermix.inside.shalopay.features.smthLikeInit.Main;

import java.util.ArrayList;

public class XRayByPass extends Module {

    public static ArrayList e = new ArrayList();
    private static final int i = 16;
    public ArrayList d = new ArrayList();
    private int h;
    private int g;
    private final EnumFacing j;

    private int f;

    public XRayByPass() {
        super("XRayByPass", 0, ModuleCategory.EXPLOIT);
        this.j = EnumFacing.NORTH;
    }

    public void initModule() {
        ArrayList var1 = new ArrayList();
        var1.add("Enable");
        var1.add("Disable");
        Main.a.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("FullBright", this, "Enable", var1));
    }

    public void onEnable() {
        for (int var1 = -i; var1 < i; ++var1) {
            for (int var2 = i; var2 > -i; --var2) {
                for (int var3 = -i; var3 < i; ++var3) {
                    Minecraft var10001 = mc;
                    this.f = (int) Minecraft.player.posX + var1;
                    var10001 = mc;
                    this.g = (int) Minecraft.player.posY + var2;
                    var10001 = mc;
                    this.h = (int) Minecraft.player.posZ + var3;
                    BlockPos var4 = new BlockPos(this.f, this.g, this.h);
                    Block var5 = mc.world.getBlockState(var4).getBlock();
                    if (Block.getIdFromBlock(var5) == 56) {
                        mc.playerController.clickBlock(var4, EnumFacing.DOWN);
                    }
                }
            }
        }

        mc.renderGlobal.loadRenderers();
    }

    public void onDisable() {
        mc.renderGlobal.loadRenderers();
    }
}
