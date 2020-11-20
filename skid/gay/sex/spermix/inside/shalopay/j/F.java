package skid.gay.sex.spermix.inside.shalopay.j;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.biome.Biome;

class F implements G {
   public int a(IBlockState var1, IBlockAccess var2, BlockPos var3) {
      Biome var4 = ColorPicker.a(var2, var3);
      if (ColorPicker.h() != null) {
         return ColorPicker.h().a(var4, var3);
      } else {
         return bk.Z.b() ? bk.c(var4, bk.Z) : var4.getWaterColor();
      }
   }

   public boolean c() {
      return false;
   }
}
