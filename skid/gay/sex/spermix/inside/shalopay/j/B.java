package skid.gay.sex.spermix.inside.shalopay.j;

import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Biomes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.biome.Biome;

class B implements G {
   public int a(IBlockState var1, IBlockAccess var2, BlockPos var3) {
      Biome var4 = ColorPicker.a(var2, var3);
      return ColorPicker.d() != null && var4 == Biomes.SWAMPLAND ? ColorPicker.d().a(var4, var3) : var4.getGrassColorAtPos(var3);
   }

   public boolean c() {
      return false;
   }
}
