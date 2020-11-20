package skid.gay.sex.spermix.inside.shalopay.j;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.world.World;

public class CustomWeather {
   
   public static final float[] c = new float[]{1.0F, 0.0F, 0.0F};
   
   private float[] k;
   
   private int h = 1;
   
   private boolean o;
   
   public int b;
   
   private int f = -1;
   
   private bj l;
   
   private int m;
   
   private int e = -1;
   
   private int g = -1;
   
   private float j = 1.0F;
   
   private boolean p;
   
   private int d = -1;
   
   private boolean n;
   
   private boolean i = false;
   
   public String a = null;

   private float a(String var1, float var2) {
      if (var1 == null) {
         return var2;
      } else {
         float var3 = FastAura.a(var1, Float.MIN_VALUE);
         if (var3 == Float.MIN_VALUE) {
            FastAura.b(String.valueOf((new StringBuilder("Invalid value: ")).append(var1)));
            return var2;
         } else {
            return var3;
         }
      }
   }

   public void a(int var1, float var2, float var3, float var4) {
      float var5 = 1.0F - var3;
      float var6 = var3 - var4;
      float var7 = 0.0F;
      if (this.n) {
         var7 += var5;
      }

      if (this.o) {
         var7 += var6;
      }

      if (this.p) {
         var7 += var4;
      }

      var7 = FastAura.a(var7, 0.0F, 1.0F);
      float var8 = var7 * this.b(var1);
      var8 = FastAura.a(var8, 0.0F, 1.0F);
      if (var8 >= 1.0E-4F) {
         GlStateManager.bindTexture(this.b);
         skid.gay.sex.spermix.inside.shalopay.j.d.a(this.h, var8);
         GlStateManager.pushMatrix();
         if (this.i) {
            GlStateManager.rotate(var2 * 360.0F * this.j, this.k[0], this.k[1], this.k[2]);
         }

         Tessellator var9 = Tessellator.getInstance();
         GlStateManager.rotate(90.0F, 1.0F, 0.0F, 0.0F);
         GlStateManager.rotate(-90.0F, 0.0F, 0.0F, 1.0F);
         this.a((Tessellator)var9, 4);
         GlStateManager.pushMatrix();
         GlStateManager.rotate(90.0F, 1.0F, 0.0F, 0.0F);
         this.a((Tessellator)var9, 1);
         GlStateManager.popMatrix();
         GlStateManager.pushMatrix();
         GlStateManager.rotate(-90.0F, 1.0F, 0.0F, 0.0F);
         this.a((Tessellator)var9, 0);
         GlStateManager.popMatrix();
         GlStateManager.rotate(90.0F, 0.0F, 0.0F, 1.0F);
         this.a((Tessellator)var9, 5);
         GlStateManager.rotate(90.0F, 0.0F, 0.0F, 1.0F);
         this.a((Tessellator)var9, 2);
         GlStateManager.rotate(90.0F, 0.0F, 0.0F, 1.0F);
         this.a((Tessellator)var9, 3);
         GlStateManager.popMatrix();
      }

   }

   public boolean a(String var1) {
      if (this.a == null) {
         FastAura.b(String.valueOf((new StringBuilder("No source texture: ")).append(var1)));
         return false;
      } else {
         this.a = bB.a(this.a, bB.a(var1));
         if (this.d >= 0 && this.e >= 0 && this.g >= 0) {
            int var2 = this.a(this.e - this.d);
            if (this.f < 0) {
               this.f = this.a(this.g - var2);
               if (this.a(this.f, this.d, this.e)) {
                  this.f = this.e;
               }
            }

            int var3 = this.a(this.f - this.e);
            int var4 = this.a(this.g - this.f);
            int var5 = this.a(this.d - this.g);
            int var6 = var2 + var3 + var4 + var5;
            if (var6 != 24000) {
               FastAura.b(String.valueOf((new StringBuilder("Invalid fadeIn/fadeOut times, sum is not 24h: ")).append(var6)));
               return false;
            } else if (this.j < 0.0F) {
               FastAura.b(String.valueOf((new StringBuilder("Invalid speed: ")).append(this.j)));
               return false;
            } else if (this.m <= 0) {
               FastAura.b(String.valueOf((new StringBuilder("Invalid daysLoop: ")).append(this.m)));
               return false;
            } else {
               return true;
            }
         } else {
            FastAura.b("Invalid times, required are: startFadeIn, endFadeIn and endFadeOut.");
            return false;
         }
      }
   }

   private int a(int var1) {
      while(var1 >= 24000) {
         var1 -= 24000;
      }

      while(var1 < 0) {
         var1 += 24000;
      }

      return var1;
   }

   private boolean a(int var1, int var2, int var3) {
      if (var2 <= var3) {
         return var1 >= var2 && var1 <= var3;
      } else {
         return var1 >= var2 || var1 <= var3;
      }
   }

   public boolean a(World var1, int var2) {
      if (this.a(var2, this.g, this.d)) {
         return false;
      } else {
         if (this.l != null) {
            long var3 = var1.getWorldTime();

            long var5;
            for(var5 = var3 - (long)this.d; var5 < 0L; var5 += (long)(24000 * this.m)) {
            }

            int var7 = (int)(var5 / 24000L);
            int var8 = var7 % this.m;
            if (!this.l.a(var8)) {
               return false;
            }
         }

         return true;
      }
   }

   private List b(String var1) {
      List var2 = Arrays.asList("clear", "rain", "thunder");
      ArrayList var3 = new ArrayList();
      String[] var4 = FastAura.a(var1, " ");

      for(int var5 = 0; var5 < var4.length; ++var5) {
         String var6 = var4[var5];
         if (!var2.contains(var6)) {
            FastAura.b(String.valueOf((new StringBuilder("Unknown weather: ")).append(var6)));
         } else {
            var3.add(var6);
         }
      }

      return var3;
   }

   private void a(Tessellator var1, int var2) {
      BufferBuilder var3 = var1.getBuffer();
      double var4 = (double)(var2 % 3) / 3.0D;
      double var6 = (double)(var2 / 3) / 2.0D;
      var3.begin(7, DefaultVertexFormats.POSITION_TEX);
      var3.pos(-100.0D, -100.0D, -100.0D).tex(var4, var6).endVertex();
      var3.pos(-100.0D, -100.0D, 100.0D).tex(var4, var6 + 0.5D).endVertex();
      var3.pos(100.0D, -100.0D, 100.0D).tex(var4 + 0.3333333333333333D, var6 + 0.5D).endVertex();
      var3.pos(100.0D, -100.0D, -100.0D).tex(var4 + 0.3333333333333333D, var6).endVertex();
      var1.draw();
   }

   public CustomWeather(Properties var1, String var2) {
      this.k = c;
      this.l = null;
      this.m = 8;
      this.n = true;
      this.o = false;
      this.p = false;
      this.b = -1;
      ArrayList var3 = new ArrayList("CustomSky");
      this.a = var1.getProperty("source", var2);
      this.d = this.c(var1.getProperty("startFadeIn"));
      this.e = this.c(var1.getProperty("endFadeIn"));
      this.f = this.c(var1.getProperty("startFadeOut"));
      this.g = this.c(var1.getProperty("endFadeOut"));
      this.h = skid.gay.sex.spermix.inside.shalopay.j.d.a(var1.getProperty("blend"));
      this.i = this.a(var1.getProperty("rotate"), true);
      this.j = this.a(var1.getProperty("speed"), 1.0F);
      this.k = this.a(var1.getProperty("axis"), c);
      this.l = var3.k(var1.getProperty("days"));
      this.m = var3.a((String)var1.getProperty("daysLoop"), 8);
      List var4 = this.b(var1.getProperty("weather", "clear"));
      this.n = var4.contains("clear");
      this.o = var4.contains("rain");
      this.p = var4.contains("thunder");
   }

   private boolean a(String var1, boolean var2) {
      if (var1 == null) {
         return var2;
      } else if (var1.toLowerCase().equals("true")) {
         return true;
      } else if (var1.toLowerCase().equals("false")) {
         return false;
      } else {
         FastAura.b(String.valueOf((new StringBuilder("Unknown boolean: ")).append(var1)));
         return var2;
      }
   }

   private float[] a(String var1, float[] var2) {
      if (var1 == null) {
         return var2;
      } else {
         String[] var3 = FastAura.a(var1, " ");
         if (var3.length != 3) {
            FastAura.b(String.valueOf((new StringBuilder("Invalid axis: ")).append(var1)));
            return var2;
         } else {
            float[] var4 = new float[3];

            for(int var5 = 0; var5 < var3.length; ++var5) {
               var4[var5] = FastAura.a(var3[var5], Float.MIN_VALUE);
               if (var4[var5] == Float.MIN_VALUE) {
                  FastAura.b(String.valueOf((new StringBuilder("Invalid axis: ")).append(var1)));
                  return var2;
               }

               if (var4[var5] < -1.0F || var4[var5] > 1.0F) {
                  FastAura.b(String.valueOf((new StringBuilder("Invalid axis values: ")).append(var1)));
                  return var2;
               }
            }

            float var9 = var4[0];
            float var6 = var4[1];
            float var7 = var4[2];
            if (var9 * var9 + var6 * var6 + var7 * var7 < 1.0E-5F) {
               FastAura.b(String.valueOf((new StringBuilder("Invalid axis values: ")).append(var1)));
               return var2;
            } else {
               float[] var8 = new float[]{var7, var6, -var9};
               return var8;
            }
         }
      }
   }

   public String toString() {
      return String.valueOf((new StringBuilder()).append(this.a).append(", ").append(this.d).append("-").append(this.e).append(" ").append(this.f).append("-").append(this.g));
   }

   private int c(String var1) {
      if (var1 == null) {
         return -1;
      } else {
         String[] var2 = FastAura.a(var1, ":");
         if (var2.length != 2) {
            FastAura.b(String.valueOf((new StringBuilder("Invalid time: ")).append(var1)));
            return -1;
         } else {
            String var3 = var2[0];
            String var4 = var2[1];
            int var5 = FastAura.a((String)var3, -1);
            int var6 = FastAura.a((String)var4, -1);
            if (var5 >= 0 && var5 <= 23 && var6 >= 0 && var6 <= 59) {
               var5 -= 6;
               if (var5 < 0) {
                  var5 += 24;
               }

               int var7 = var5 * 1000 + (int)((double)var6 / 60.0D * 1000.0D);
               return var7;
            } else {
               FastAura.b(String.valueOf((new StringBuilder("Invalid time: ")).append(var1)));
               return -1;
            }
         }
      }
   }

   private float b(int var1) {
      int var2;
      int var3;
      if (this.a(var1, this.d, this.e)) {
         var2 = this.a(this.e - this.d);
         var3 = this.a(var1 - this.d);
         return (float)var3 / (float)var2;
      } else if (this.a(var1, this.e, this.f)) {
         return 1.0F;
      } else if (this.a(var1, this.f, this.g)) {
         var2 = this.a(this.g - this.f);
         var3 = this.a(var1 - this.f);
         return 1.0F - (float)var3 / (float)var2;
      } else {
         return 0.0F;
      }
   }
}
