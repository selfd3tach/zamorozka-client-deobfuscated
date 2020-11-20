package skid.gay.sex.spermix.inside.shalopay.features.idk;

import java.awt.Font;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.texture.DynamicTexture;
import org.lwjgl.opengl.GL11;
import skid.gay.sex.spermix.inside.shalopay.features.SmthLikeHudSettings.SmthLikeColorGetter;
import skid.gay.sex.spermix.inside.shalopay.features.newmegospeed.TargetHUD;

public class FontRenderer extends SmthLikeColorGetter {
   
   private final String o = "0123456789abcdefklmnor";
   
   private final int[] n = new int[32];
   
   protected TargetHUD[] j = new TargetHUD[256];
   
   protected DynamicTexture l;
   
   protected DynamicTexture k;
   
   protected TargetHUD[] i = new TargetHUD[256];
   
   protected TargetHUD[] h = new TargetHUD[256];
   
   protected DynamicTexture m;

   public float a(String var1, double var2, double var4, int var6) {
      float var7 = this.a(var1, var2 + 1.0D, var4 + 1.0D, var6, true);
      return Math.max(var7, this.a(var1, var2, var4, var6, false));
   }

   public float a(String var1, double var2, double var4, int var6, boolean var7) {
      --var2;
      if (var1 == null) {
         return 0.0F;
      } else {
         if (var6 == 553648127) {
            var6 = 16777215;
         }

         if ((var6 & -67108864) == 0) {
            var6 |= -16777216;
         }

         if (var7) {
            var6 = (var6 & 16579836) >> 2 | var6 & -16777216;
         }

         TargetHUD[] var8 = this.a;
         float var9 = (float)(var6 >> 24 & 255) / 255.0F;
         boolean var10 = false;
         boolean var11 = false;
         boolean var12 = false;
         boolean var13 = false;
         boolean var14 = false;
         boolean var15 = true;
         var2 *= 2.0D;
         var4 = (var4 - 3.0D) * 2.0D;
         if (var15) {
            GL11.glPushMatrix();
            GlStateManager.scale(0.5D, 0.5D, 0.5D);
            GlStateManager.enableBlend();
            GlStateManager.blendFunc(770, 771);
            GlStateManager.color((float)(var6 >> 16 & 255) / 255.0F, (float)(var6 >> 8 & 255) / 255.0F, (float)(var6 & 255) / 255.0F, var9);
            int var16 = var1.length();
            GlStateManager.enableTexture2D();
            GlStateManager.bindTexture(this.g.getGlTextureId());
            GL11.glBindTexture(3553, this.g.getGlTextureId());

            for(int var17 = 0; var17 < var16; ++var17) {
               char var18 = var1.charAt(var17);
               if (var18 == 167 && var17 < var16) {
                  int var19 = 21;

                  try {
                     var19 = "0123456789abcdefklmnor".indexOf(var1.charAt(var17 + 1));
                  } catch (Exception var21) {
                     var21.printStackTrace();
                  }

                  if (var19 < 16) {
                     var11 = false;
                     var12 = false;
                     var10 = false;
                     var14 = false;
                     var13 = false;
                     GlStateManager.bindTexture(this.g.getGlTextureId());
                     var8 = this.a;
                     if (var19 < 0 || var19 > 15) {
                        var19 = 15;
                     }

                     if (var7) {
                        var19 += 16;
                     }

                     int var20 = this.n[var19];
                     GlStateManager.color((float)(var20 >> 16 & 255) / 255.0F, (float)(var20 >> 8 & 255) / 255.0F, (float)(var20 & 255) / 255.0F, var9);
                  } else if (var19 == 16) {
                     var10 = true;
                  } else if (var19 == 17) {
                     var11 = true;
                     if (var12) {
                        GlStateManager.bindTexture(this.m.getGlTextureId());
                        var8 = this.j;
                     } else {
                        GlStateManager.bindTexture(this.k.getGlTextureId());
                        var8 = this.h;
                     }
                  } else if (var19 == 18) {
                     var13 = true;
                  } else if (var19 == 19) {
                     var14 = true;
                  } else if (var19 == 20) {
                     var12 = true;
                     if (var11) {
                        GlStateManager.bindTexture(this.m.getGlTextureId());
                        var8 = this.j;
                     } else {
                        GlStateManager.bindTexture(this.l.getGlTextureId());
                        var8 = this.i;
                     }
                  } else if (var19 == 21) {
                     var11 = false;
                     var12 = false;
                     var10 = false;
                     var14 = false;
                     var13 = false;
                     GlStateManager.color((float)(var6 >> 16 & 255) / 255.0F, (float)(var6 >> 8 & 255) / 255.0F, (float)(var6 & 255) / 255.0F, var9);
                     GlStateManager.bindTexture(this.g.getGlTextureId());
                     var8 = this.a;
                  }

                  ++var17;
               } else if (var18 < var8.length && var18 >= 0) {
                  GL11.glBegin(4);
                  this.a(var8, var18, var2, var4);
                  GL11.glEnd();
                  if (var13) {
                     this.a(var2, var4 + (var8[var18].b / 2), var2 + var8[var18].a - 8.0D, var4 + (var8[var18].b / 2), 1.0F);
                  }

                  if (var14) {
                     this.a(var2, var4 + var8[var18].b - 2.0D, var2 + var8[var18].a - 8.0D, var4 + var8[var18].b - 2.0D, 1.0F);
                  }

                  var2 += (double)(var8[var18].a - 8 + this.f);
               }
            }

            GL11.glHint(3155, 4352);
            GL11.glPopMatrix();
         }

         return (float)var2 / 2.0F;
      }
   }

   public float a(String var1, float var2, float var3, int var4) {
      return this.a(var1, (double)var2, (double)var3, var4, false);
   }

   public int a(String var1) {
      if (var1 == null) {
         return 0;
      } else {
         int var2 = 0;
         TargetHUD[] var3 = this.a;
         boolean var4 = false;
         boolean var5 = false;
         int var6 = var1.length();

         for(int var7 = 0; var7 < var6; ++var7) {
            char var8 = var1.charAt(var7);
            if (var8 == 167 && var7 < var6) {
               int var9 = "0123456789abcdefklmnor".indexOf(var8);
               if (var9 < 16) {
                  var4 = false;
                  var5 = false;
               } else if (var9 == 17) {
                  var4 = true;
                  if (var5) {
                     var3 = this.j;
                  } else {
                     var3 = this.h;
                  }
               } else if (var9 == 20) {
                  var5 = true;
                  if (var4) {
                     var3 = this.j;
                  } else {
                     var3 = this.i;
                  }
               } else if (var9 == 21) {
                  var4 = false;
                  var5 = false;
                  var3 = this.a;
               }

               ++var7;
            } else if (var8 < var3.length && var8 >= 0) {
               var2 += var3[var8].a - 8 + this.f;
            }
         }

         return var2 / 2;
      }
   }

   public FontRenderer(Font var1, boolean var2, boolean var3) {
      super(var1, var2, var3);
      this.b();
      this.a();
   }

   private void a(double var1, double var3, double var5, double var7, float var9) {
      GL11.glDisable(3553);
      GL11.glLineWidth(var9);
      GL11.glBegin(1);
      GL11.glVertex2d(var1, var3);
      GL11.glVertex2d(var5, var7);
      GL11.glEnd();
      GL11.glEnable(3553);
   }

   private void b() {
      for(int var1 = 0; var1 < 32; ++var1) {
         int var2 = (var1 >> 3 & 1) * 85;
         int var3 = (var1 >> 2 & 1) * 170 + var2;
         int var4 = (var1 >> 1 & 1) * 170 + var2;
         int var5 = (var1 >> 0 & 1) * 170 + var2;
         if (var1 == 6) {
            var3 += 85;
         }

         if (var1 >= 16) {
            var3 /= 4;
            var4 /= 4;
            var5 /= 4;
         }

         this.n[var1] = (var3 & 255) << 16 | (var4 & 255) << 8 | var5 & 255;
      }

   }

   private void a() {
      this.k = this.a(this.b.deriveFont(1), this.c, this.d, this.h);
      this.l = this.a(this.b.deriveFont(2), this.c, this.d, this.i);
      this.m = this.a(this.b.deriveFont(3), this.c, this.d, this.j);
   }
}
