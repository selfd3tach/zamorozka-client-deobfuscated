package skid.gay.sex.spermix.inside.shalopay.k;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import net.minecraft.block.Block;
import net.minecraft.block.state.BlockStateBase;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.vertex.VertexFormat;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL20;

public class w {
   
   int d;
   
   boolean g;
   
   boolean f;
   
   boolean e;
   
   int b;
   
   long[] h = new long[10];
   
   int a;
   
   int c;
   
   int i = 0;

   public void a(BufferBuilder var1, int var2) {
      FloatBuffer var3 = var1.rawFloatBuffer;
      IntBuffer var4 = var1.rawIntBuffer;
      int var5 = var1.getBufferSize();
      float var6 = var3.get(var2 + 0 * this.a);
      float var7 = var3.get(var2 + 0 * this.a + 1);
      float var8 = var3.get(var2 + 0 * this.a + 2);
      float var9 = var3.get(var2 + 0 * this.a + this.c);
      float var10 = var3.get(var2 + 0 * this.a + this.c + 1);
      float var11 = var3.get(var2 + 1 * this.a);
      float var12 = var3.get(var2 + 1 * this.a + 1);
      float var13 = var3.get(var2 + 1 * this.a + 2);
      float var14 = var3.get(var2 + 1 * this.a + this.c);
      float var15 = var3.get(var2 + 1 * this.a + this.c + 1);
      float var16 = var3.get(var2 + 2 * this.a);
      float var17 = var3.get(var2 + 2 * this.a + 1);
      float var18 = var3.get(var2 + 2 * this.a + 2);
      float var19 = var3.get(var2 + 2 * this.a + this.c);
      float var20 = var3.get(var2 + 2 * this.a + this.c + 1);
      float var21 = var3.get(var2 + 3 * this.a);
      float var22 = var3.get(var2 + 3 * this.a + 1);
      float var23 = var3.get(var2 + 3 * this.a + 2);
      float var24 = var3.get(var2 + 3 * this.a + this.c);
      float var25 = var3.get(var2 + 3 * this.a + this.c + 1);
      float var26 = var16 - var6;
      float var27 = var17 - var7;
      float var28 = var18 - var8;
      float var29 = var21 - var11;
      float var30 = var22 - var12;
      float var31 = var23 - var13;
      float var32 = var27 * var31 - var30 * var28;
      float var33 = var28 * var29 - var31 * var26;
      float var34 = var26 * var30 - var29 * var27;
      float var35 = var32 * var32 + var33 * var33 + var34 * var34;
      float var36 = (double)var35 != 0.0D ? (float)(1.0D / Math.sqrt((double)var35)) : 1.0F;
      var32 *= var36;
      var33 *= var36;
      var34 *= var36;
      var26 = var11 - var6;
      var27 = var12 - var7;
      var28 = var13 - var8;
      float var37 = var14 - var9;
      float var38 = var15 - var10;
      var29 = var16 - var6;
      var30 = var17 - var7;
      var31 = var18 - var8;
      float var39 = var19 - var9;
      float var40 = var20 - var10;
      float var41 = var37 * var40 - var39 * var38;
      float var42 = var41 != 0.0F ? 1.0F / var41 : 1.0F;
      float var43 = (var40 * var26 - var38 * var29) * var42;
      float var44 = (var40 * var27 - var38 * var30) * var42;
      float var45 = (var40 * var28 - var38 * var31) * var42;
      float var46 = (var37 * var29 - var39 * var26) * var42;
      float var47 = (var37 * var30 - var39 * var27) * var42;
      float var48 = (var37 * var31 - var39 * var28) * var42;
      var35 = var43 * var43 + var44 * var44 + var45 * var45;
      var36 = (double)var35 != 0.0D ? (float)(1.0D / Math.sqrt((double)var35)) : 1.0F;
      var43 *= var36;
      var44 *= var36;
      var45 *= var36;
      var35 = var46 * var46 + var47 * var47 + var48 * var48;
      var36 = (double)var35 != 0.0D ? (float)(1.0D / Math.sqrt((double)var35)) : 1.0F;
      var46 *= var36;
      var47 *= var36;
      var48 *= var36;
      float var49 = var34 * var44 - var33 * var45;
      float var50 = var32 * var45 - var34 * var43;
      float var51 = var33 * var43 - var32 * var44;
      float var52 = var46 * var49 + var47 * var50 + var48 * var51 < 0.0F ? -1.0F : 1.0F;
      int var53 = (int)(var32 * 127.0F) & 255;
      int var54 = (int)(var33 * 127.0F) & 255;
      int var55 = (int)(var34 * 127.0F) & 255;
      int var56 = (var55 << 16) + (var54 << 8) + var53;
      var4.put(var2 + 0 * this.a + this.b, var56);
      var4.put(var2 + 1 * this.a + this.b, var56);
      var4.put(var2 + 2 * this.a + this.b, var56);
      var4.put(var2 + 3 * this.a + this.b, var56);
      int var57 = ((int)(var43 * 32767.0F) & '\uffff') + (((int)(var44 * 32767.0F) & '\uffff') << 16);
      int var58 = ((int)(var45 * 32767.0F) & '\uffff') + (((int)(var52 * 32767.0F) & '\uffff') << 16);
      var4.put(var2 + 0 * this.a + 10, var57);
      var4.put(var2 + 0 * this.a + 10 + 1, var58);
      var4.put(var2 + 1 * this.a + 10, var57);
      var4.put(var2 + 1 * this.a + 10 + 1, var58);
      var4.put(var2 + 2 * this.a + 10, var57);
      var4.put(var2 + 2 * this.a + 10 + 1, var58);
      var4.put(var2 + 3 * this.a + 10, var57);
      var4.put(var2 + 3 * this.a + 10 + 1, var58);
      float var59 = (var9 + var14 + var19 + var24) / 4.0F;
      float var60 = (var10 + var15 + var20 + var25) / 4.0F;
      var3.put(var2 + 0 * this.a + 8, var59);
      var3.put(var2 + 0 * this.a + 8 + 1, var60);
      var3.put(var2 + 1 * this.a + 8, var59);
      var3.put(var2 + 1 * this.a + 8 + 1, var60);
      var3.put(var2 + 2 * this.a + 8, var59);
      var3.put(var2 + 2 * this.a + 8 + 1, var60);
      var3.put(var2 + 3 * this.a + 8, var59);
      var3.put(var2 + 3 * this.a + 8 + 1, var60);
   }

   public static void c(BufferBuilder var0) {
      w var1 = var0.sVertexBuilder;
      VertexFormat var2 = var0.getVertexFormat();
      var1.a = var2.getNextOffset() / 4;
      var1.e = var2.hasNormal();
      var1.f = var1.e;
      var1.g = var2.hasUvOffset(0);
      var1.b = var1.e ? var2.getNormalOffset() / 4 : 0;
      var1.c = var1.g ? var2.getUvOffsetById(0) / 4 : 0;
      var1.d = 8;
   }

   public static void d(BufferBuilder var0) {
      if (var0.vertexCount == 0) {
         c(var0);
      }

   }

   public static void b(BufferBuilder var0) {
      var0.sVertexBuilder.a();
   }

   public static void f(BufferBuilder var0) {
      w var1 = var0.sVertexBuilder;
      if (var1.a == 14 && var0.drawMode == 7 && var0.vertexCount % 4 == 0) {
         var1.a(var0, var0.getBufferSize() - 4 * var1.a);
      }

   }

   public static void a(BufferBuilder var0, int[] var1) {
      if (var0.vertexCount == 0) {
         c(var0);
      }

      w var2 = var0.sVertexBuilder;
      if (var2.a == 14) {
         long var3 = var2.h[var2.i];

         for(int var5 = 12; var5 + 1 < var1.length; var5 += 14) {
            var1[var5] = (int)var3;
            var1[var5 + 1] = (int)(var3 >> 32);
         }
      }

   }

   public static void a(IBlockState var0, BlockPos var1, IBlockAccess var2, BufferBuilder var3) {
      Block var4 = var0.getBlock();
      int var5;
      int var6;
      if (var0 instanceof BlockStateBase) {
         BlockStateBase var7 = (BlockStateBase)var0;
         var5 = var7.getBlockId();
         var6 = var7.getMetadata();
      } else {
         var5 = Block.getIdFromBlock(var4);
         var6 = var4.getMetaFromState(var0);
      }

      var5 = skid.gay.sex.spermix.inside.shalopay.ClickGUIMode.Bind.a(var5, var6);
      int var10 = var4.getRenderType(var0).ordinal();
      int var8 = ((var10 & '\uffff') << 16) + (var5 & '\uffff');
      int var9 = var6 & '\uffff';
      var3.sVertexBuilder.a(((long)var9 << 32) + (long)var8);
   }

   public w() {
      this.h[this.i] = 0L;
   }

   public static void a(int var0, int var1, int var2, BufferBuilder var3) {
      if (var2 != 0) {
         VertexFormat var4 = var3.getVertexFormat();
         int var5 = var4.getNextOffset();
         if (var5 == 56) {
            ByteBuffer var6 = var3.getByteBuffer();
            var6.position(32);
            GL20.glVertexAttribPointer(V.av, 2, 5126, false, var5, var6);
            var6.position(40);
            GL20.glVertexAttribPointer(V.aw, 4, 5122, false, var5, var6);
            var6.position(48);
            GL20.glVertexAttribPointer(V.au, 3, 5122, false, var5, var6);
            var6.position(0);
            GL20.glEnableVertexAttribArray(V.av);
            GL20.glEnableVertexAttribArray(V.aw);
            GL20.glEnableVertexAttribArray(V.au);
            GL11.glDrawArrays(var0, var1, var2);
            GL20.glDisableVertexAttribArray(V.av);
            GL20.glDisableVertexAttribArray(V.aw);
            GL20.glDisableVertexAttribArray(V.au);
         } else {
            GL11.glDrawArrays(var0, var1, var2);
         }
      }

   }

   public static void g(BufferBuilder var0) {
      if (var0.getVertexFormat().hasNormal() && var0.drawMode == 7 && var0.vertexCount % 4 == 0) {
         w var1 = var0.sVertexBuilder;
         c(var0);
         int var2 = var0.vertexCount * var1.a;

         for(int var3 = 0; var3 < var2; var3 += var1.a * 4) {
            var1.a(var0, var3);
         }
      }

   }

   public static void e(BufferBuilder var0) {
      w var1 = var0.sVertexBuilder;
      if (var1.a == 14) {
         if (var0.drawMode == 7 && var0.vertexCount % 4 == 0) {
            var1.a(var0, var0.getBufferSize() - 4 * var1.a);
         }

         long var2 = var1.h[var1.i];
         int var4 = var0.getBufferSize() - 14 + 12;
         var0.rawIntBuffer.put(var4, (int)var2);
         var0.rawIntBuffer.put(var4 + 1, (int)(var2 >> 32));
      }

   }

   public void a() {
      this.h[this.i] = 0L;
      --this.i;
   }

   public static void a(BufferBuilder var0) {
      var0.sVertexBuilder = new w();
   }

   public void a(long var1) {
      ++this.i;
      this.h[this.i] = var1;
   }
}
