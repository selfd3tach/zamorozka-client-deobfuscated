package skid.gay.sex.spermix.inside.shalopay.j;

import java.util.IdentityHashMap;
import java.util.Map;
import net.minecraft.client.renderer.block.model.BakedQuad;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.MathHelper;

public class aQ {
   
   public int a = 1;
   
   private Map[] c = new Map[8];
   
   public boolean b = false;

   public boolean a() {
      return this.a != 2 && this.a != 4 ? this.b : true;
   }

   public synchronized BakedQuad a(BakedQuad var1, int var2, boolean var3) {
      int var4 = var2;
      if (var3) {
         var4 = var2 | 4;
      }

      if (var4 > 0 && var4 < this.c.length) {
         Object var5 = this.c[var4];
         if (var5 == null) {
            var5 = new IdentityHashMap(1);
            this.c[var4] = (Map)var5;
         }

         BakedQuad var6 = (BakedQuad)((Map)var5).get(var1);
         if (var6 == null) {
            var6 = this.b(var1, var2, var3);
            ((Map)var5).put(var1, var6);
         }

         return var6;
      } else {
         return var1;
      }
   }

   private boolean a(BakedQuad var1) {
      TextureAtlasSprite var2 = var1.getSprite();
      float var3 = var2.getMinU();
      float var4 = var2.getMaxU();
      float var5 = var4 - var3;
      float var6 = var5 / 256.0F;
      float var7 = var2.getMinV();
      float var8 = var2.getMaxV();
      float var9 = var8 - var7;
      float var10 = var9 / 256.0F;
      int[] var11 = var1.getVertexData();
      int var12 = var11.length / 4;

      for(int var13 = 0; var13 < 4; ++var13) {
         int var14 = var13 * var12;
         float var15 = Float.intBitsToFloat(var11[var14 + 4]);
         float var16 = Float.intBitsToFloat(var11[var14 + 4 + 1]);
         if (!this.a(var15, var3, var6) && !this.a(var15, var4, var6)) {
            return false;
         }

         if (!this.a(var16, var7, var10) && !this.a(var16, var8, var10)) {
            return false;
         }
      }

      return true;
   }

   public aQ(String var1) {
      if (var1.equals("4")) {
         this.a = 4;
      } else if (var1.equals("2")) {
         this.a = 2;
      } else if (var1.equals("F")) {
         this.b = true;
      } else if (var1.equals("4F")) {
         this.a = 4;
         this.b = true;
      } else if (var1.equals("2F")) {
         this.a = 2;
         this.b = true;
      } else {
         FastAura.b(String.valueOf((new StringBuilder("NaturalTextures: Unknown type: ")).append(var1)));
      }

   }

   private BakedQuad b(BakedQuad var1, int var2, boolean var3) {
      int[] var4 = var1.getVertexData();
      int var5 = var1.getTintIndex();
      EnumFacing var6 = var1.getFace();
      TextureAtlasSprite var7 = var1.getSprite();
      if (!this.a(var1)) {
         var2 = 0;
      }

      var4 = this.a(var4, var2, var3);
      BakedQuad var8 = new BakedQuad(var4, var5, var6, var7);
      return var8;
   }

   private int[] a(int[] var1, int var2, boolean var3) {
      int[] var4 = (int[])var1.clone();
      int var5 = 4 - var2;
      if (var3) {
         var5 += 3;
      }

      var5 %= 4;
      int var6 = var4.length / 4;

      for(int var7 = 0; var7 < 4; ++var7) {
         int var8 = var7 * var6;
         int var9 = var5 * var6;
         var4[var9 + 4] = var1[var8 + 4];
         var4[var9 + 4 + 1] = var1[var8 + 4 + 1];
         if (var3) {
            --var5;
            if (var5 < 0) {
               var5 = 3;
            }
         } else {
            ++var5;
            if (var5 > 3) {
               var5 = 0;
            }
         }
      }

      return var4;
   }

   private boolean a(float var1, float var2, float var3) {
      float var4 = MathHelper.abs(var1 - var2);
      return var4 < var3;
   }
}
