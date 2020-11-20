package skid.gay.sex.spermix.inside.shalopay.b;

import skid.gay.sex.spermix.inside.shalopay.features.newmegospeed.TargetHUD;

import java.util.Iterator;

public class a {
   
   public double e;
   
   public skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode c;
   
   public b b;
   
   public double h;
   
   public String i;
   
   public double f;
   
   public boolean j;
   
   public TargetHUD[] a;
   
   public double d;
   
   public double g;

   public void b() {
      this.e = this.b.d + this.b.f + 2.0D;
      this.f = this.b.e + this.d;
      this.g = this.b.f + 10.0D;
      this.h = 15.0D;
      String var1 = this.c.a();
      if (this.c.j()) {
         this.i = String.valueOf((new StringBuilder(String.valueOf(var1.substring(0, 1).toUpperCase()))).append(var1.substring(1, var1.length())));
         double var2 = this.e + this.g - (double) skid.gay.sex.spermix.inside.shalopay.d.b.a(this.i);
         if (var2 < this.e + 13.0D) {
            this.g += this.e + 13.0D - var2 + 1.0D;
         }
      } else {
         String var3;
         if (this.c.i()) {
            this.h = (double)(this.j ? this.c.d().size() * (skid.gay.sex.spermix.inside.shalopay.d.b.b() + 2) + 15 : 15);
            this.i = String.valueOf((new StringBuilder(String.valueOf(var1.substring(0, 1).toUpperCase()))).append(var1.substring(1, var1.length())));
            int var6 = skid.gay.sex.spermix.inside.shalopay.d.b.a(this.i);
            Iterator var4 = this.c.d().iterator();

            while(var4.hasNext()) {
               var3 = (String)var4.next();
               int var5 = skid.gay.sex.spermix.inside.shalopay.d.b.a(var3);
               if (var5 > var6) {
                  var6 = var5;
               }
            }

            double var8 = this.e + this.g - (double)var6;
            if (var8 < this.e) {
               this.g += this.e - var8 + 1.0D;
            }
         } else if (this.c.k()) {
            this.i = String.valueOf((new StringBuilder(String.valueOf(var1.substring(0, 1).toUpperCase()))).append(var1.substring(1, var1.length())));
            String var7 = String.valueOf((new StringBuilder()).append((double)Math.round(this.c.f() * 100.0D) / 100.0D));
            var3 = String.valueOf((new StringBuilder()).append((double)Math.round(this.c.h() * 100.0D) / 100.0D));
            double var9 = this.e + this.g - (double) skid.gay.sex.spermix.inside.shalopay.d.b.a(this.i) - (double) skid.gay.sex.spermix.inside.shalopay.d.b.a(var3) - 4.0D;
            if (var9 < this.e) {
               this.g += this.e - var9 + 1.0D;
            }
         }
      }

   }

   public void b(int var1, int var2, int var3) {
   }

   public boolean a(int var1, int var2) {
      return (double)var1 >= this.e && (double)var1 <= this.e + this.g && (double)var2 >= this.f && (double)var2 <= this.f + this.h;
   }

   public void a() {
      this.a = this.b.c.k;
   }

   public void a(int var1, int var2, float var3) {
   }

   public boolean a(int var1, int var2, int var3) {
      return this.a(var1, var2);
   }
}
