package skid.gay.sex.spermix.inside.shalopay.j;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ColorizerFoliage;
import net.minecraft.world.IBlockAccess;

class E implements G {
   public int a(IBlockState var1, IBlockAccess var2, BlockPos var3) {
      return ColorPicker.g() != null ? ColorPicker.g().a(var2, var3) : ColorizerFoliage.getFoliageColorBirch();
   }

   public boolean c() {
      return ColorPicker.g() == null;
   }
}
