package skid.gay.sex.spermix.inside.shalopay.j;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Map;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.RenderGlobal;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemMap;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraft.world.storage.MapData;

public class bp {
   public static boolean a(ItemArmor var0, ItemStack var1) {
      if (bk.bC.b()) {
         return bk.b(var0, bk.bC, var1);
      } else {
         int var2 = var0.getColor(var1);
         return var2 != 16777215;
      }
   }

   public static boolean a(ItemStack var0) {
      return !bk.by.b() ? var0.isItemDamaged() : bk.b(var0.getItem(), bk.by, var0);
   }

   public static InputStream a(String var0) {
      if (!bk.eG.c()) {
         return null;
      } else {
         Object var1 = bk.a(bk.eG);
         if (var1 == null) {
            return null;
         } else {
            if (var0.startsWith("/")) {
               var0 = var0.substring(1);
            }

            byte[] var2 = (byte[])bk.g(var1, bk.eH, var0);
            if (var2 == null) {
               return null;
            } else {
               ByteArrayInputStream var3 = new ByteArrayInputStream(var2);
               return var3;
            }
         }
      }
   }

   public static void a(ResourceLocation var0) {
      if (!bk.Q.b()) {
         Object var1 = bk.f(bk.N);
         bk.g(var1, bk.Q, var0);
      }

   }

   public static void a(String var0, Object var1) {
      Map var2 = (Map)bk.a(bk.cx);
      if (var2 != null) {
         var2.put(var0, var1);
      }

   }

   public static boolean a(RenderGlobal var0, float var1, int var2) {
      return !bk.bk.b() ? false : bk.b(bk.bk, var0, var1, var2);
   }

   public static boolean a(IBlockState var0) {
      Block var1 = var0.getBlock();
      return !bk.am.b() ? var1.hasTileEntity() : bk.b(var1, bk.am, var0);
   }

   public static MapData a(ItemMap var0, ItemStack var1, World var2) {
      return bk.aP.b() ? ((ItemMap)var1.getItem()).getMapData(var1, var2) : var0.getMapData(var1, var2);
   }

   public static int a(IBlockState var0, IBlockAccess var1, BlockPos var2) {
      return bk.as.b() ? bk.c(var0, bk.as, var1, var2) : var0.getLightValue();
   }

   public static void a(ResourceLocation var0, String var1) {
      if (!bk.P.b()) {
         Object var2 = bk.f(bk.N);
         bk.g(var2, bk.P, var0, var1);
      }

   }
}
