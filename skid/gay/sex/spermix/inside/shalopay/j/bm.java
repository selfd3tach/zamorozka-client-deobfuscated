package skid.gay.sex.spermix.inside.shalopay.j;

import java.lang.reflect.Constructor;

public class bm {
   
   private boolean c = false;
   
   private bl a = null;
   
   private Class[] b = null;
   
   private Constructor d = null;

   private static Constructor a(Class var0, Class[] var1) {
      Constructor[] var2 = var0.getDeclaredConstructors();

      for(int var3 = 0; var3 < var2.length; ++var3) {
         Constructor var4 = var2[var3];
         Class[] var5 = var4.getParameterTypes();
         if (bk.a(var1, var5)) {
            return var4;
         }
      }

      return null;
   }

   public void c() {
      this.c = true;
      this.d = null;
   }

   public Constructor a() {
      if (this.c) {
         return this.d;
      } else {
         this.c = true;
         Class var1 = this.a.a();
         if (var1 == null) {
            return null;
         } else {
            try {
               this.d = a(var1, this.b);
               if (this.d == null) {
                  FastAura.a(String.valueOf((new StringBuilder("(Reflector) Constructor not present: ")).append(var1.getName()).append(", params: ").append(FastAura.a((Object[])this.b))));
               }

               if (this.d != null) {
                  this.d.setAccessible(true);
               }
            } catch (Throwable var3) {
               var3.printStackTrace();
            }

            return this.d;
         }
      }
   }

   public boolean b() {
      if (this.c) {
         return this.d != null;
      } else {
         return this.a() != null;
      }
   }

   public bm(bl var1, Class[] var2) {
      this.a = var1;
      this.b = var2;
      Constructor var3 = this.a();
   }
}
