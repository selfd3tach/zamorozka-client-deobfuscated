package skid.gay.sex.spermix.inside.shalopay.features.module.modules.combat;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityEnderCrystal;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import skid.gay.sex.spermix.inside.shalopay.features.module.Module;
import skid.gay.sex.spermix.inside.shalopay.features.module.ModuleCategory;
import skid.gay.sex.spermix.inside.shalopay.features.smthLikeInit.Main;

import java.util.Iterator;

public class CrystalAura extends Module {

    private static final int g = 7;

    private int f;

    private int d;

    private int e;

    public CrystalAura() {
        super("CrystalAura", 0, ModuleCategory.COMBAT);
    }

    public void initModule() {
        Main.a.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("CryDistance", this, 3.7D, 0.0D, 7.0D, true));
        Main.a.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("CrystalWall", this, false));
        Main.a.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("AutoPut", this, false));
        Main.a.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("AutoSidian", this, false));
    }

    public void onUpdate() {
        if (this.getState()) {
            Minecraft var10000 = mc;
            if (Minecraft.player.getCooledAttackStrength(0.0F) >= 1.0F) {
                Iterator var2 = mc.world.loadedEntityList.iterator();

                while (true) {
                    int var4;
                    int var5;
                    int var6;
                    ItemStack var7;
                    BlockPos var8;
                    Block var9;
                    ItemStack var10;
                    Minecraft var10001;
                    do {
                        if (!var2.hasNext()) {
                            return;
                        }

                        Object var1 = var2.next();
                        Entity var3 = (Entity) var1;
                        if (Main.a.a("CrystalWall").e()) {
                            if (var3 instanceof EntityEnderCrystal) {
                                var10000 = mc;
                                if ((double) Minecraft.player.getDistanceToEntity(var3) <= Main.a.a("CryDistance").f()) {
                                    var10000 = mc;
                                    Minecraft.player.setSprinting(false);
                                    var10001 = mc;
                                    mc.playerController.attackEntity(Minecraft.player, var3);
                                    var10000 = mc;
                                    Minecraft.player.swingArm(EnumHand.MAIN_HAND);
                                }
                            }
                        } else if (var3 instanceof EntityEnderCrystal) {
                            var10000 = mc;
                            if ((double) Minecraft.player.getDistanceToEntity(var3) <= Main.a.a("CryDistance").f()) {
                                var10000 = mc;
                                if (Minecraft.player.canEntityBeSeen(var3)) {
                                    var10000 = mc;
                                    Minecraft.player.setSprinting(false);
                                    var10001 = mc;
                                    mc.playerController.attackEntity(Minecraft.player, var3);
                                    var10000 = mc;
                                    Minecraft.player.swingArm(EnumHand.MAIN_HAND);
                                }
                            }
                        }

                        if (Main.a.a("AutoPut").e()) {
                            for (var4 = -g; var4 < g; ++var4) {
                                for (var5 = g; var5 > -g; --var5) {
                                    for (var6 = -g; var6 < g; ++var6) {
                                        var10001 = mc;
                                        this.d = (int) Minecraft.player.posX + var4;
                                        var10001 = mc;
                                        this.e = (int) Minecraft.player.posY + var5;
                                        var10001 = mc;
                                        this.f = (int) Minecraft.player.posZ + var6;
                                        var7 = new ItemStack(Item.getItemById(426));
                                        var8 = new BlockPos(this.d, this.e, this.f);
                                        var9 = mc.world.getBlockState(var8).getBlock();
                                        var10000 = mc;
                                        var10 = Minecraft.player.getHeldItem(EnumHand.MAIN_HAND);
                                        var10000 = mc;
                                        if (Minecraft.player.posY <= (double) (this.e + 1) && (Block.getIdFromBlock(var9) == 49 || Block.getIdFromBlock(var9) == 7) && var10.isItemEqual(var7)) {
                                            var10001 = mc;
                                            mc.playerController.processRightClickBlock(Minecraft.player, mc.world, var8, EnumFacing.NORTH, Vec3d.ZERO, EnumHand.MAIN_HAND);
                                        }
                                    }
                                }
                            }
                        }
                    } while (!Main.a.a("AutoSidian").e());

                    for (var4 = -g; var4 < g; ++var4) {
                        for (var5 = g; var5 > -g; --var5) {
                            for (var6 = -g; var6 < g; ++var6) {
                                var10001 = mc;
                                this.d = (int) Minecraft.player.posX + var4;
                                var10001 = mc;
                                this.e = (int) Minecraft.player.posY + var5;
                                var10001 = mc;
                                this.f = (int) Minecraft.player.posZ + var6;
                                var7 = new ItemStack(Item.getItemById(49));
                                var8 = new BlockPos(this.d, this.e, this.f);
                                var9 = mc.world.getBlockState(var8).getBlock();
                                var10000 = mc;
                                var10 = Minecraft.player.getHeldItem(EnumHand.MAIN_HAND);
                                var10000 = mc;
                                if (Minecraft.player.posY <= (double) (this.e + 1) && Block.getIdFromBlock(var9) == 0 && var10.isItemEqual(var7)) {
                                    var10001 = mc;
                                    mc.playerController.processRightClickBlock(Minecraft.player, mc.world, var8, EnumFacing.NORTH, Vec3d.ZERO, EnumHand.MAIN_HAND);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
