//Deobfuscated with https://github.com/PetoPetko/Minecraft-Deobfuscator3000 using mappings "mc_mappings"!

package skid.gay.sex.spermix.inside.shalopay.features.module.modules.combat;

import skid.gay.sex.spermix.inside.shalopay.features.idk.TimeUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.init.Items;
import net.minecraft.inventory.ClickType;
import net.minecraft.inventory.ContainerPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import skid.gay.sex.spermix.inside.shalopay.features.smthLikeInit.Main;
import skid.gay.sex.spermix.inside.shalopay.features.module.Module;
import skid.gay.sex.spermix.inside.shalopay.features.module.ModuleCategory;

public class AutoTotem extends Module {
   
   private TimeUtils d = new TimeUtils();

   public AutoTotem() {
      super("AutoTotem", 0, ModuleCategory.COMBAT);
   }

   public void j() {
      Main.a.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("AutoHealth", this, 5.0D, 0.0D, 20.0D, true));
      Main.a.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("AutoSpeed", this, 1000.0D, 0.0D, 1000.0D, true));
      Main.a.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("AHealth", this, false));
      Main.a.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("AMatrix", this, true));
   }

   public void h() {
      if (this.c()) {
         Minecraft var10000 = mc;
         ItemStack var1 = Minecraft.player.getItemStackFromSlot(EntityEquipmentSlot.OFFHAND);
         var10000 = mc;
         NonNullList var2 = Minecraft.player.inventory.mainInventory;

         for(int var3 = 0; var3 < var2.size(); ++var3) {
            if (var2.get(var3) != ItemStack.EMPTY && (var1 == null || var1.getItem() != Items.TOTEM_OF_UNDYING) && ((ItemStack)var2.get(var3)).getItem() == Items.TOTEM_OF_UNDYING && this.d.a((float) Main.a.a("AutoHealth").f())) {
               new ItemStack(Items.TOTEM_OF_UNDYING);
               if (Main.a.a("AMatrix").e()) {
                  this.b(var3);
               } else {
                  this.b(var3);
               }

               this.d.a();
               break;
            }
         }

      }
   }

   public void b(int var1) {
      Minecraft var10000 = mc;
      if (Minecraft.player.openContainer instanceof ContainerPlayer) {
         int var10002;
         Minecraft var10005;
         if (Main.a.a("AHealth").e()) {
            var10000 = mc;
            if ((double)Minecraft.player.getHealth() <= Main.a.a("AutoHealth").f()) {
               var10002 = var1 < 9 ? var1 + 36 : var1;
               var10005 = mc;
               mc.playerController.windowClick(0, var10002, 0, ClickType.PICKUP, Minecraft.player);
               var10005 = mc;
               mc.playerController.windowClick(0, 45, 0, ClickType.PICKUP, Minecraft.player);
               var10002 = var1 < 9 ? var1 + 36 : var1;
               var10005 = mc;
               mc.playerController.windowClick(0, var10002, 0, ClickType.PICKUP, Minecraft.player);
            }
         } else {
            var10000 = mc;
            if (Minecraft.player.ticksExisted % 5 == 0) {
               var10005 = mc;
               mc.playerController.windowClick(0, 45, 0, ClickType.PICKUP, Minecraft.player);
               var10002 = var1 < 9 ? var1 + 36 : var1;
               var10005 = mc;
               mc.playerController.windowClick(0, var10002, 0, ClickType.PICKUP, Minecraft.player);
            }
         }
      }

   }
}
