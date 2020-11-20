package skid.gay.sex.spermix.inside.shalopay.features.module.modules.combat;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.InventoryEffectRenderer;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.ClickType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import skid.gay.sex.spermix.inside.shalopay.features.smthLikeInit.Main;
import skid.gay.sex.spermix.inside.shalopay.features.module.Module;
import skid.gay.sex.spermix.inside.shalopay.features.module.ModuleCategory;

public class AutoArmor extends Module {
   
   private int d;
   
   private final Item e;

   public void j() {
      Main.a.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("ArmorDrop", this, false));
   }

   public void f() {
      this.d = 0;
   }

   private void m() {
      if (this.d > 0) {
         --this.d;
      } else if (!(mc.currentScreen instanceof GuiContainer) || mc.currentScreen instanceof InventoryEffectRenderer) {
         int[] var1 = new int[4];
         int[] var2 = new int[4];

         int var3;
         ItemStack var4;
         Minecraft var10000;
         for(var3 = 0; var3 < 4; ++var3) {
            var10000 = mc;
            var4 = Minecraft.player.inventory.armorItemInSlot(var3);
            if (var4 != null && var4.getItem() instanceof ItemArmor) {
               var2[var3] = ((ItemArmor)var4.getItem()).damageReduceAmount;
            }

            var1[var3] = -1;
         }

         Minecraft var10005;
         for(var3 = 0; var3 < 36; ++var3) {
            var10000 = mc;
            var4 = Minecraft.player.inventory.getStackInSlot(var3);
            if (var4 != null && var4.getItem() instanceof ItemArmor) {
               ItemArmor var5 = (ItemArmor)var4.getItem();
               int var6 = this.a(var5);
               int var7 = var5.damageReduceAmount;
               if (var7 > var2[var6]) {
                  var1[var6] = var3;
                  var2[var6] = var7;
               } else if (Main.a.a("ArmorDrop").e()) {
                  Minecraft var10001 = mc;
                  var10005 = mc;
                  mc.playerController.windowClick(Minecraft.player.inventoryContainer.windowId, var3, 0, ClickType.THROW, Minecraft.player);
               }
            }
         }

         var3 = 0;

         while(var3 < 4) {
            int var8;
            label62: {
               var8 = var1[var3];
               if (var8 != -1) {
                  var10000 = mc;
                  ItemStack var9 = Minecraft.player.inventory.armorItemInSlot(var3);
                  if (var9 == null || !this.a(var9)) {
                     break label62;
                  }

                  var10000 = mc;
                  if (Minecraft.player.inventory.getFirstEmptyStack() != -1) {
                     break label62;
                  }
               }

               ++var3;
               continue;
            }

            if (var8 < 9) {
               var8 += 36;
            }

            int var10002 = 8 - var3;
            var10005 = mc;
            mc.playerController.windowClick(0, var10002, 0, ClickType.QUICK_MOVE, Minecraft.player);
            var10005 = mc;
            mc.playerController.windowClick(0, var8, 0, ClickType.QUICK_MOVE, Minecraft.player);
            break;
         }

         this.d = 3;
      }
   }

   public int a(ItemArmor var1) {
      return var1.armorType.ordinal() - 2;
   }

   public void h() {
      if (this.c()) {
         this.m();
      }

   }

   public boolean a(ItemStack var1) {
      return var1.getItem() == this.e;
   }

   public String a() {
      return "AutoArmor";
   }

   public AutoArmor() {
      super("AutoArmor", 0, ModuleCategory.COMBAT);
      this.e = Item.getItemFromBlock(Blocks.AIR);
   }
}
