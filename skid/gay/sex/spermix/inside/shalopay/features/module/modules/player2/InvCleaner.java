package skid.gay.sex.spermix.inside.shalopay.features.module.modules.player2;

import net.minecraft.client.Minecraft;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.ClickType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import skid.gay.sex.spermix.inside.shalopay.features.module.Module;
import skid.gay.sex.spermix.inside.shalopay.features.module.ModuleCategory;

public class InvCleaner extends Module {

    private final Item e;
    private int d;

    public InvCleaner() {
        super("InvCleaner", 0, ModuleCategory.PLAYER2);
        this.e = Item.getItemFromBlock(Blocks.AIR);
    }

    private void m() {
        if (this.d > 0) {
            --this.d;
        } else {
            for (int var1 = 0; var1 < 35; ++var1) {
                Minecraft var10000 = mc;
                ItemStack var2 = Minecraft.player.inventoryContainer.getSlot(var1).getStack();
                if (var2 != null) {
                    var2.getItem().getMaxDamage();
                    boolean var3 = !(var2.getItem() instanceof ItemBlock) && !var2.isItemEnchanted();
                    if (var3) {
                        Minecraft var10005 = mc;
                        mc.playerController.windowClick(0, var1, 0, ClickType.THROW, Minecraft.player);
                        var10005 = mc;
                        mc.playerController.windowClick(0, -999, 0, ClickType.THROW, Minecraft.player);
                    }
                }
            }

            this.d = 3;
        }
    }

    public void onUpdate() {
        if (this.getState()) {
            this.m();
        }

    }

    public void onEnable() {
        this.d = 0;
    }
}
