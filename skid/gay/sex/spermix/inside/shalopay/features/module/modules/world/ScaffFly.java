package skid.gay.sex.spermix.inside.shalopay.features.module.modules.world;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import skid.gay.sex.spermix.inside.shalopay.features.module.Module;
import skid.gay.sex.spermix.inside.shalopay.features.module.ModuleCategory;
import skid.gay.sex.spermix.inside.shalopay.features.module.SmthLikeModuleRegister;

public class ScaffFly extends Module {
    public ScaffFly() {
        super("ScaffFly", 0, ModuleCategory.WORLD);
    }

    public void m() {
        Minecraft var10002 = mc;
        BlockPos var1 = (new BlockPos(Minecraft.player)).down();
        if (AirWalk.b(var1).isReplaceable()) {
            int var2 = -1;

            Minecraft var10000;
            int var3;
            for (var3 = 0; var3 < 9; ++var3) {
                var10000 = mc;
                ItemStack var4 = Minecraft.player.inventory.getStackInSlot(var3);
                if (var4.getItem() instanceof ItemBlock && Block.getBlockFromItem(var4.getItem()).getDefaultState().isFullBlock()) {
                    var2 = var3;
                    break;
                }
            }

            if (var2 != -1) {
                var10000 = mc;
                var3 = Minecraft.player.inventory.currentItem;
                var10000 = mc;
                Minecraft.player.inventory.currentItem = var2;
                var10000 = mc;
                Minecraft.player.setSneaking(true);
                Minecraft var10001 = mc;
                mc.playerController.processRightClickBlock(Minecraft.player, mc.world, var1, EnumFacing.NORTH, Vec3d.ZERO, EnumHand.MAIN_HAND);
                var10000 = mc;
                Minecraft.player.inventory.currentItem = var3;
            }
        }
    }

    public void onUpdate() {
        if (this.getState()) {
            this.m();
            SmthLikeModuleRegister.a(SafeWalk.class).getState();
        }

    }

    public void onDisable() {
        Minecraft var10000 = mc;
        Minecraft.player.capabilities.isFlying = false;
    }
}
