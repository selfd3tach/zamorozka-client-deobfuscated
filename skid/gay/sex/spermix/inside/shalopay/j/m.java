package skid.gay.sex.spermix.inside.shalopay.j;

import java.util.Arrays;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ChunkCache;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.Chunk$EnumCreateEntityType;

public class m implements IBlockAccess {
   
   private ChunkCache a;
   
   private int d;
   
   private IBlockState[] f;
   
   private int b;
   
   private int c;
   
   private static ClickGUI h;
   
   private static ClickGUI g;
   
   private int[] e;

   public IBlockState getBlockState(BlockPos var1) {
      if (this.f == null) {
         return this.a.getBlockState(var1);
      } else {
         int var2 = this.a(var1);
         if (var2 >= 0 && var2 < this.f.length) {
            IBlockState var3 = this.f[var2];
            if (var3 == null) {
               var3 = this.a.getBlockState(var1);
               this.f[var2] = var3;
            }

            return var3;
         } else {
            return this.a.getBlockState(var1);
         }
      }
   }

   static {
      g = new ClickGUI(Integer.TYPE, 16);
      h = new ClickGUI(IBlockState.class, 16);
   }

   public boolean isAirBlock(BlockPos var1) {
      return this.a.isAirBlock(var1);
   }

   public Biome getBiome(BlockPos var1) {
      return this.a.getBiome(var1);
   }

   public int getStrongPower(BlockPos var1, EnumFacing var2) {
      return this.a.getStrongPower(var1, var2);
   }

   public void b() {
      g.a(this.e);
      this.e = null;
      h.a(this.f);
      this.f = null;
   }

   public TileEntity a(BlockPos var1, Chunk$EnumCreateEntityType var2) {
      return this.a.getTileEntity(var1, var2);
   }

   public boolean c() {
      return this.a.extendedLevelsInChunkCache();
   }

   public m(ChunkCache var1, BlockPos var2, int var3) {
      this.a = var1;
      this.b = var2.getX() - var3;
      this.c = var2.getY() - var3;
      this.d = var2.getZ() - var3;
   }

   private int a(BlockPos var1) {
      int var2 = var1.getX() - this.b;
      int var3 = var1.getY() - this.c;
      int var4 = var1.getZ() - this.d;
      return var2 * 400 + var4 * 20 + var3;
   }

   public int getCombinedLight(BlockPos var1, int var2) {
      int var3;
      if (this.e == null) {
         var3 = this.a.getCombinedLight(var1, var2);
         if (FastAura.bd() && !this.getBlockState(var1).isOpaqueCube()) {
            var3 = V.a(var1, var3);
         }

         return var3;
      } else {
         var3 = this.a(var1);
         if (var3 >= 0 && var3 < this.e.length) {
            int var4 = this.e[var3];
            if (var4 == -1) {
               var4 = this.a.getCombinedLight(var1, var2);
               if (FastAura.bd() && !this.getBlockState(var1).isOpaqueCube()) {
                  var4 = V.a(var1, var4);
               }

               this.e[var3] = var4;
            }

            return var4;
         } else {
            return this.a.getCombinedLight(var1, var2);
         }
      }
   }

   public WorldType getWorldType() {
      return this.a.getWorldType();
   }

   public void a() {
      if (this.e == null) {
         this.e = (int[])g.a(8000);
      }

      Arrays.fill(this.e, -1);
      if (this.f == null) {
         this.f = (IBlockState[])h.a(8000);
      }

      Arrays.fill(this.f, (Object)null);
   }

   public TileEntity getTileEntity(BlockPos var1) {
      return this.a.getTileEntity(var1, Chunk$EnumCreateEntityType.CHECK);
   }
}
