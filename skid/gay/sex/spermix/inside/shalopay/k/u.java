package skid.gay.sex.spermix.inside.shalopay.k;

import skid.gay.sex.spermix.inside.shalopay.j.aH;

public class u extends MatrixAura {
   
   public static final String[] a = new String[]{"default", "true", "false"};
   
   public static final String[] b = new String[]{"Default", "ON", "OFF"};

   public boolean f() {
      return this.b() == 0;
   }

   public boolean h() {
      return this.b() == 2;
   }

   public boolean g() {
      return this.b() == 1;
   }

   public String c() {
      if (this.f()) {
         return aH.f();
      } else if (this.g()) {
         return aH.b();
      } else {
         return this.h() ? aH.c() : super.c();
      }
   }

   public u(String var1, String var2, int var3) {
      super(var1, a, var2, b, var3);
   }
}
