package skid.gay.sex.spermix.inside.shalopay.features.module.modules.world;

import skid.gay.sex.spermix.inside.shalopay.features.idk.B;
import skid.gay.sex.spermix.inside.shalopay.features.idk.C;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.network.play.client.CPacketPlayer$Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import skid.gay.sex.spermix.inside.shalopay.features.module.Module;
import skid.gay.sex.spermix.inside.shalopay.features.module.ModuleCategory;

public class Scaffold extends Module {
   public static float b(double var0, double var2, double var4) {
      Minecraft var10001 = mc;
      double var6 = var0 - Minecraft.player.posX;
      var10001 = mc;
      double var8 = var2 - Minecraft.player.posY;
      var10001 = mc;
      double var10 = var4 - Minecraft.player.posZ;
      double var12 = (double)MathHelper.sqrt_double(var6 * var6 + var10 * var10);
      return (float)(-(Math.atan2(var8, var12) * 180.0D / 3.141592653589793D));
   }

   public static float a(double var0, double var2, double var4) {
      Minecraft var10001 = mc;
      double var6 = var0 - Minecraft.player.posX;
      var10001 = mc;
      double var8 = var2 - Minecraft.player.posY;
      var10001 = mc;
      double var10 = var4 - Minecraft.player.posZ;
      double var12 = (double)MathHelper.sqrt_double(var6 * var6 + var10 * var10);
      return (float)(Math.atan2(var10, var6) * 180.0D / 3.141592653589793D) - 90.0F;
   }

   public void m() {
      Minecraft var10002 = mc;
      BlockPos var1 = (new BlockPos(Minecraft.player)).down();
      Minecraft var10000 = mc;
      Minecraft.player.connection.sendPacket(new CPacketPlayer$Rotation(a((double)var1.getX(), (double)var1.getY(), (double)var1.getZ()), b((double)var1.getX(), (double)var1.getY(), (double)var1.getZ()), false));
      if (AirWalk.b(var1).isReplaceable()) {
         int var2 = -1;

         int var3;
         for(var3 = 0; var3 < 9; ++var3) {
            var10000 = mc;
            ItemStack var4 = Minecraft.player.inventory.getStackInSlot(var3);
            if (!C.a(var4) && var4.getItem() instanceof ItemBlock && Block.getBlockFromItem(var4.getItem()).getDefaultState().isFullBlock()) {
               var2 = var3;
               break;
            }
         }

         if (var2 != -1) {
            var10000 = mc;
            var3 = Minecraft.player.inventory.currentItem;
            var10000 = mc;
            Minecraft.player.inventory.currentItem = var2;
            skid.gay.sex.spermix.inside.shalopay.ColorPicker.Bind.a(var1);
            if (mc.gameSettings.keyBindJump.isKeyDown()) {
               var10000 = mc;
               Minecraft.player.motionY = 0.2D;
            }

            var10000 = mc;
            Minecraft.player.inventory.currentItem = var3;
         }
      }
   }

   public void h() {
      if (this.c()) {
         this.m();
      }

   }

   public Scaffold() {
      super("Scaffold", 0, ModuleCategory.WORLD);
   }
}
