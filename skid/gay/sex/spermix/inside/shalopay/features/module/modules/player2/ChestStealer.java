package skid.gay.sex.spermix.inside.shalopay.features.module.modules.player2;

import skid.gay.sex.spermix.inside.shalopay.features.idk.TimeUtils;
import net.minecraft.inventory.ClickType;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ContainerChest;
import net.minecraft.item.Item;
import skid.gay.sex.spermix.inside.shalopay.features.smthLikeInit.Main;
import skid.gay.sex.spermix.inside.shalopay.features.module.Module;
import skid.gay.sex.spermix.inside.shalopay.features.module.ModuleCategory;

public class ChestStealer extends Module {
   
   private TimeUtils d = new TimeUtils();

   public ChestStealer() {
      super("ChestStealer", 0, ModuleCategory.PLAYER2);
   }

   public boolean a(Container var1) {
      boolean var2 = true;
      int var3 = 0;

      for(int var4 = var1.inventorySlots.size() == 90 ? 54 : 27; var3 < var4; ++var3) {
         if (var1.getSlot(var3).getHasStack()) {
            var2 = false;
         }
      }

      return var2;
   }

   public void h() {
      if (this.c() && Main.e().openContainer != null && Main.e().openContainer instanceof ContainerChest) {
         ContainerChest var1 = (ContainerChest) Main.e().openContainer;

         for(int var2 = 0; var2 < var1.getLowerChestInventory().getSizeInventory(); ++var2) {
            if (var1.getLowerChestInventory().getStackInSlot(var2).getItem() != Item.getItemById(0) && this.d.a(100.0F)) {
               Main.f().playerController.windowClick(var1.windowId, var2, 0, ClickType.QUICK_MOVE, Main.e());
               this.d.a();
            } else if (this.a(var1)) {
               Main.e().closeScreen();
            }
         }
      }

   }
}
