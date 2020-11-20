package skid.gay.sex.spermix.inside.shalopay.k;

import java.util.Arrays;
import java.util.List;
import skid.gay.sex.spermix.inside.shalopay.j.bx;

public abstract class B {
   
   private String[] f = null;
   
   private boolean g = true;
   
   private String a = null;
   
   private String c = null;
   
   private String[] d = null;
   
   private String e = null;
   
   private String b = null;
   
   private boolean h = true;

   public void b(boolean var1) {
      this.h = var1;
   }

   public boolean b(String var1) {
      int var2 = a(var1, this.d);
      if (var2 < 0) {
         return false;
      } else {
         this.c = var1;
         return true;
      }
   }

   public String toString() {
      return String.valueOf((new StringBuilder()).append(this.a).append(", value: ").append(this.c).append(", valueDefault: ").append(this.e).append(", paths: ").append(skid.gay.sex.spermix.inside.shalopay.RadioShanson.FastAura.a((Object[])this.f)));
   }

   public B(String var1, String var2, String var3, String[] var4, String var5, String var6) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
      this.e = var5;
      if (var6 != null) {
         this.f = new String[]{var6};
      }

   }

   public String c() {
      String var1 = skid.gay.sex.spermix.inside.shalopay.RadioShanson.FastAura.f(this.b);
      var1 = bx.a(var1, "//");
      var1 = V.b(String.valueOf((new StringBuilder("option.")).append(this.a()).append(".comment")), var1);
      return var1;
   }

   public boolean f(String var1) {
      return false;
   }

   public String o() {
      return null;
   }

   public void a(boolean var1) {
      this.g = var1;
   }

   public String[] p() {
      return (String[])this.d.clone();
   }

   public boolean g(String var1) {
      return false;
   }

   public void h() {
      int var1 = a(this.c, this.d);
      if (var1 >= 0) {
         var1 = (var1 - 1 + this.d.length) % this.d.length;
         this.c = this.d[var1];
      }

   }

   public String d() {
      return this.c;
   }

   public String[] i() {
      return this.f;
   }

   public void a(String[] var1) {
      List var2 = Arrays.asList(this.f);

      for(int var3 = 0; var3 < var1.length; ++var3) {
         String var4 = var1[var3];
         if (!var2.contains(var4)) {
            this.f = (String[]) skid.gay.sex.spermix.inside.shalopay.RadioShanson.FastAura.a((Object[])this.f, (Object)var4);
         }
      }

   }

   public void a(float var1) {
      if (this.d.length > 1) {
         var1 = skid.gay.sex.spermix.inside.shalopay.RadioShanson.FastAura.a(var1, 0.0F, 1.0F);
         int var2 = Math.round(var1 * (float)(this.d.length - 1));
         this.c = this.d[var2];
      }

   }

   public void f() {
      this.c = this.e;
   }

   public void g() {
      int var1 = a(this.c, this.d);
      if (var1 >= 0) {
         var1 = (var1 + 1) % this.d.length;
         this.c = this.d[var1];
      }

   }

   public String e(String var1) {
      return "";
   }

   public boolean k() {
      return !skid.gay.sex.spermix.inside.shalopay.RadioShanson.FastAura.a((Object)this.c, (Object)this.e);
   }

   public void a(String var1) {
      this.b = var1;
   }

   public boolean n() {
      return false;
   }

   public boolean l() {
      return this.h;
   }

   public String d(String var1) {
      return V.b(String.valueOf((new StringBuilder("value.")).append(this.a).append(".").append(var1)), var1);
   }

   public String e() {
      return this.e;
   }

   public String b() {
      return this.b;
   }

   public boolean c(String var1) {
      return a(var1, this.d) >= 0;
   }

   public float q() {
      if (this.d.length <= 1) {
         return 0.0F;
      } else {
         int var1 = a(this.c, this.d);
         if (var1 < 0) {
            return 0.0F;
         } else {
            float var2 = 1.0F * (float)var1 / ((float)this.d.length - 1.0F);
            return var2;
         }
      }
   }

   public String m() {
      return V.b(String.valueOf((new StringBuilder("option.")).append(this.a)), this.a);
   }

   private static int a(String var0, String[] var1) {
      for(int var2 = 0; var2 < var1.length; ++var2) {
         String var3 = var1[var2];
         if (var3.equals(var0)) {
            return var2;
         }
      }

      return -1;
   }

   public boolean j() {
      return this.g;
   }

   public String a() {
      return this.a;
   }
}
