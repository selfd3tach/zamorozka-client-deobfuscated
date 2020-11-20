package skid.gay.sex.spermix.inside.shalopay.j;

import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.BlockDoublePlant;
import net.minecraft.block.BlockFence;
import net.minecraft.block.BlockFenceGate;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.BlockFlowerPot;
import net.minecraft.block.BlockLever;
import net.minecraft.block.BlockLever$EnumOrientation;
import net.minecraft.block.BlockMushroom;
import net.minecraft.block.BlockPane;
import net.minecraft.block.BlockRedstoneTorch;
import net.minecraft.block.BlockReed;
import net.minecraft.block.BlockSapling;
import net.minecraft.block.BlockSnow;
import net.minecraft.block.BlockTallGrass;
import net.minecraft.block.BlockTorch;
import net.minecraft.block.BlockWall;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.IBakedModel;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class c {
   
   private static IBakedModel a = null;

   public static IBlockState c() {
      return Blocks.SNOW_LAYER.getDefaultState();
   }

   private static boolean a(IBlockAccess var0, BlockPos var1) {
      Block var2 = Blocks.SNOW_LAYER;
      return var0.getBlockState(var1.north()).getBlock() != var2 && var0.getBlockState(var1.south()).getBlock() != var2 && var0.getBlockState(var1.west()).getBlock() != var2 && var0.getBlockState(var1.east()).getBlock() != var2 ? false : var0.getBlockState(var1.down()).isOpaqueCube();
   }

   private static boolean a(Block var0, IBlockState var1) {
      if (var1.isFullCube()) {
         return false;
      } else if (var1.isOpaqueCube()) {
         return false;
      } else if (var0 instanceof BlockSnow) {
         return false;
      } else if (var0 instanceof BlockBush && (var0 instanceof BlockDoublePlant || var0 instanceof BlockFlower || var0 instanceof BlockMushroom || var0 instanceof BlockSapling || var0 instanceof BlockTallGrass)) {
         return true;
      } else if (!(var0 instanceof BlockFence) && !(var0 instanceof BlockFenceGate) && !(var0 instanceof BlockFlowerPot) && !(var0 instanceof BlockPane) && !(var0 instanceof BlockReed) && !(var0 instanceof BlockWall)) {
         if (var0 instanceof BlockRedstoneTorch && var1.getValue(BlockTorch.FACING) == EnumFacing.UP) {
            return true;
         } else {
            if (var0 instanceof BlockLever) {
               Comparable var2 = var1.getValue(BlockLever.FACING);
               if (var2 == BlockLever$EnumOrientation.UP_X || var2 == BlockLever$EnumOrientation.UP_Z) {
                  return true;
               }
            }

            return false;
         }
      } else {
         return true;
      }
   }

   public static IBakedModel b() {
      return a;
   }

   public static boolean a(IBlockAccess var0, IBlockState var1, BlockPos var2) {
      Block var3 = var1.getBlock();
      return !a(var3, var1) ? false : a(var0, var2);
   }

   public static void a() {
      a = FastAura.R().getBlockRendererDispatcher().getBlockModelShapes().getModelForState(Blocks.SNOW_LAYER.getDefaultState());
   }
}
