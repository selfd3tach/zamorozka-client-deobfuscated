package skid.gay.sex.spermix.inside.shalopay.k;

import net.minecraft.client.renderer.culling.ClippingHelper;
import net.minecraft.util.math.MathHelper;

public class c extends ClippingHelper {
   
   private static c f = new c();
   
   float[] e = new float[4];
   
   float[] d = new float[16];
   
   float[] a = new float[6];
   
   float[][] b = new float[10][4];
   
   int c;

   private void a(float[] var1, float[] var2, float[] var3) {
      var1[0] = var2[1] * var3[2] - var2[2] * var3[1];
      var1[1] = var2[2] * var3[0] - var2[0] * var3[2];
      var1[2] = var2[0] * var3[1] - var2[1] * var3[0];
   }

   private double a(float[] var1, float[] var2) {
      return (double)var1[0] * (double)var2[0] + (double)var1[1] * (double)var2[1] + (double)var1[2] * (double)var2[2];
   }

   private float a(float var1, float var2, float var3) {
      return (float)Math.sqrt((double)(var1 * var1 + var2 * var2 + var3 * var3));
   }

   private void a(float[] var1, float var2, float var3, float var4, float var5) {
      float var6 = (float)Math.sqrt((double)(var2 * var2 + var3 * var3 + var4 * var4));
      var1[0] = var2 / var6;
      var1[1] = var3 / var6;
      var1[2] = var4 / var6;
      var1[3] = var5 / var6;
   }

   private void a(float[] var1) {
      float var2 = MathHelper.sqrt(var1[0] * var1[0] + var1[1] * var1[1] + var1[2] * var1[2]);
      if (var2 == 0.0F) {
         var2 = 1.0F;
      }

      var1[0] /= var2;
      var1[1] /= var2;
      var1[2] /= var2;
   }

   public static ClippingHelper a() {
      f.b();
      return f;
   }

   private void b(float[] var1, float[] var2) {
      var1[0] = var2[0];
      var1[1] = var2[1];
      var1[2] = var2[2];
      var1[3] = var2[3];
   }

   public void b() {
      float[] var1 = this.projectionMatrix;
      float[] var2 = this.modelviewMatrix;
      float[] var3 = this.clippingMatrix;
      System.arraycopy(V.cL, 0, var1, 0, 16);
      System.arraycopy(V.cN, 0, var2, 0, 16);
      RenderUtils2.a(var3, var2, var1);
      this.a(this.frustum[0], var3[3] - var3[0], var3[7] - var3[4], var3[11] - var3[8], var3[15] - var3[12]);
      this.a(this.frustum[1], var3[3] + var3[0], var3[7] + var3[4], var3[11] + var3[8], var3[15] + var3[12]);
      this.a(this.frustum[2], var3[3] + var3[1], var3[7] + var3[5], var3[11] + var3[9], var3[15] + var3[13]);
      this.a(this.frustum[3], var3[3] - var3[1], var3[7] - var3[5], var3[11] - var3[9], var3[15] - var3[13]);
      this.a(this.frustum[4], var3[3] - var3[2], var3[7] - var3[6], var3[11] - var3[10], var3[15] - var3[14]);
      this.a(this.frustum[5], var3[3] + var3[2], var3[7] + var3[6], var3[11] + var3[10], var3[15] + var3[14]);
      float[] var4 = V.B;
      float var5 = (float)this.a(this.frustum[0], var4);
      float var6 = (float)this.a(this.frustum[1], var4);
      float var7 = (float)this.a(this.frustum[2], var4);
      float var8 = (float)this.a(this.frustum[3], var4);
      float var9 = (float)this.a(this.frustum[4], var4);
      float var10 = (float)this.a(this.frustum[5], var4);
      this.c = 0;
      if (var5 >= 0.0F) {
         this.b(this.b[this.c++], this.frustum[0]);
         if (var5 > 0.0F) {
            if (var7 < 0.0F) {
               this.a(this.b[this.c++], this.frustum[0], this.frustum[2], var4);
            }

            if (var8 < 0.0F) {
               this.a(this.b[this.c++], this.frustum[0], this.frustum[3], var4);
            }

            if (var9 < 0.0F) {
               this.a(this.b[this.c++], this.frustum[0], this.frustum[4], var4);
            }

            if (var10 < 0.0F) {
               this.a(this.b[this.c++], this.frustum[0], this.frustum[5], var4);
            }
         }
      }

      if (var6 >= 0.0F) {
         this.b(this.b[this.c++], this.frustum[1]);
         if (var6 > 0.0F) {
            if (var7 < 0.0F) {
               this.a(this.b[this.c++], this.frustum[1], this.frustum[2], var4);
            }

            if (var8 < 0.0F) {
               this.a(this.b[this.c++], this.frustum[1], this.frustum[3], var4);
            }

            if (var9 < 0.0F) {
               this.a(this.b[this.c++], this.frustum[1], this.frustum[4], var4);
            }

            if (var10 < 0.0F) {
               this.a(this.b[this.c++], this.frustum[1], this.frustum[5], var4);
            }
         }
      }

      if (var7 >= 0.0F) {
         this.b(this.b[this.c++], this.frustum[2]);
         if (var7 > 0.0F) {
            if (var5 < 0.0F) {
               this.a(this.b[this.c++], this.frustum[2], this.frustum[0], var4);
            }

            if (var6 < 0.0F) {
               this.a(this.b[this.c++], this.frustum[2], this.frustum[1], var4);
            }

            if (var9 < 0.0F) {
               this.a(this.b[this.c++], this.frustum[2], this.frustum[4], var4);
            }

            if (var10 < 0.0F) {
               this.a(this.b[this.c++], this.frustum[2], this.frustum[5], var4);
            }
         }
      }

      if (var8 >= 0.0F) {
         this.b(this.b[this.c++], this.frustum[3]);
         if (var8 > 0.0F) {
            if (var5 < 0.0F) {
               this.a(this.b[this.c++], this.frustum[3], this.frustum[0], var4);
            }

            if (var6 < 0.0F) {
               this.a(this.b[this.c++], this.frustum[3], this.frustum[1], var4);
            }

            if (var9 < 0.0F) {
               this.a(this.b[this.c++], this.frustum[3], this.frustum[4], var4);
            }

            if (var10 < 0.0F) {
               this.a(this.b[this.c++], this.frustum[3], this.frustum[5], var4);
            }
         }
      }

      if (var9 >= 0.0F) {
         this.b(this.b[this.c++], this.frustum[4]);
         if (var9 > 0.0F) {
            if (var5 < 0.0F) {
               this.a(this.b[this.c++], this.frustum[4], this.frustum[0], var4);
            }

            if (var6 < 0.0F) {
               this.a(this.b[this.c++], this.frustum[4], this.frustum[1], var4);
            }

            if (var7 < 0.0F) {
               this.a(this.b[this.c++], this.frustum[4], this.frustum[2], var4);
            }

            if (var8 < 0.0F) {
               this.a(this.b[this.c++], this.frustum[4], this.frustum[3], var4);
            }
         }
      }

      if (var10 >= 0.0F) {
         this.b(this.b[this.c++], this.frustum[5]);
         if (var10 > 0.0F) {
            if (var5 < 0.0F) {
               this.a(this.b[this.c++], this.frustum[5], this.frustum[0], var4);
            }

            if (var6 < 0.0F) {
               this.a(this.b[this.c++], this.frustum[5], this.frustum[1], var4);
            }

            if (var7 < 0.0F) {
               this.a(this.b[this.c++], this.frustum[5], this.frustum[2], var4);
            }

            if (var8 < 0.0F) {
               this.a(this.b[this.c++], this.frustum[5], this.frustum[3], var4);
            }
         }
      }

   }

   private double a(float[] var1, double var2, double var4, double var6) {
      return (double)var1[0] * var2 + (double)var1[1] * var4 + (double)var1[2] * var6 + (double)var1[3];
   }

   private void a(float[] var1, float[] var2, float[] var3, float[] var4) {
      this.a(this.e, var2, var3);
      this.a(var1, this.e, var4);
      this.a(var1);
      float var5 = (float)this.a(var2, var3);
      float var6 = (float)this.a(var1, var3);
      float var7 = this.a(var1[0], var1[1], var1[2], var3[0] * var6, var3[1] * var6, var3[2] * var6);
      float var8 = this.a(var2[0], var2[1], var2[2], var3[0] * var5, var3[1] * var5, var3[2] * var5);
      float var9 = var7 / var8;
      float var10 = (float)this.a(var1, var2);
      float var11 = this.a(var1[0], var1[1], var1[2], var2[0] * var10, var2[1] * var10, var2[2] * var10);
      float var12 = this.a(var3[0], var3[1], var3[2], var2[0] * var5, var2[1] * var5, var2[2] * var5);
      float var13 = var11 / var12;
      var1[3] = var2[3] * var9 + var3[3] * var13;
   }

   private float a(float var1, float var2, float var3, float var4, float var5, float var6) {
      return this.a(var1 - var4, var2 - var5, var3 - var6);
   }

   public boolean isBoxInFrustum(double var1, double var3, double var5, double var7, double var9, double var11) {
      for(int var13 = 0; var13 < this.c; ++var13) {
         float[] var14 = this.b[var13];
         if (this.a(var14, var1, var3, var5) <= 0.0D && this.a(var14, var7, var3, var5) <= 0.0D && this.a(var14, var1, var9, var5) <= 0.0D && this.a(var14, var7, var9, var5) <= 0.0D && this.a(var14, var1, var3, var11) <= 0.0D && this.a(var14, var7, var3, var11) <= 0.0D && this.a(var14, var1, var9, var11) <= 0.0D && this.a(var14, var7, var9, var11) <= 0.0D) {
            return false;
         }
      }

      return true;
   }
}
