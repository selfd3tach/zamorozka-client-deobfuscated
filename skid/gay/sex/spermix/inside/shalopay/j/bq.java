package skid.gay.sex.spermix.inside.shalopay.j;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class bq {
   
   private bl a;
   
   private String b;
   
   private boolean d;
   
   private Class[] c;
   
   private Method e;

   public Class c() {
      Method var1 = this.a();
      return var1 == null ? null : var1.getReturnType();
   }

   public bq(bl var1, String var2, Class[] var3) {
      this(var1, var2, var3, false);
   }

   public boolean b() {
      if (this.d) {
         return this.e != null;
      } else {
         return this.a() != null;
      }
   }

   public static Method a(Class var0, String var1, Class[] var2) {
      Method[] var3 = var0.getDeclaredMethods();

      for(int var4 = 0; var4 < var3.length; ++var4) {
         Method var5 = var3[var4];
         if (var5.getName().equals(var1)) {
            Class[] var6 = var5.getParameterTypes();
            if (bk.a(var2, var6)) {
               return var5;
            }
         }
      }

      return null;
   }

   public bq(bl var1, String var2, Class[] var3, boolean var4) {
      this.a = null;
      this.b = null;
      this.c = null;
      this.d = false;
      this.e = null;
      this.a = var1;
      this.b = var2;
      this.c = var3;
      if (!var4) {
         Method var5 = this.a();
      }

   }

   public Method a() {
      if (this.d) {
         return this.e;
      } else {
         this.d = true;
         Class var1 = this.a.a();
         if (var1 == null) {
            return null;
         } else {
            try {
               if (this.c == null) {
                  Method[] var2 = a(var1, this.b);
                  if (var2.length <= 0) {
                     FastAura.d(String.valueOf((new StringBuilder("(Reflector) Method not present: ")).append(var1.getName()).append(".").append(this.b)));
                     return null;
                  }

                  if (var2.length > 1) {
                     FastAura.b(String.valueOf((new StringBuilder("(Reflector) More than one method found: ")).append(var1.getName()).append(".").append(this.b)));

                     for(int var3 = 0; var3 < var2.length; ++var3) {
                        Method var4 = var2[var3];
                        FastAura.b(String.valueOf((new StringBuilder("(Reflector)  - ")).append(var4)));
                     }

                     return null;
                  }

                  this.e = var2[0];
               } else {
                  this.e = a(var1, this.b, this.c);
               }

               if (this.e == null) {
                  FastAura.d(String.valueOf((new StringBuilder("(Reflector) Method not present: ")).append(var1.getName()).append(".").append(this.b)));
                  return null;
               } else {
                  this.e.setAccessible(true);
                  return this.e;
               }
            } catch (Throwable var5) {
               var5.printStackTrace();
               return null;
            }
         }
      }
   }

   public void d() {
      this.d = true;
      this.e = null;
   }

   public bq(bl var1, String var2) {
      this(var1, var2, (Class[])null, false);
   }

   public static Method[] a(Class var0, String var1) {
      ArrayList var2 = new ArrayList();
      Method[] var3 = var0.getDeclaredMethods();

      for(int var4 = 0; var4 < var3.length; ++var4) {
         Method var5 = var3[var4];
         if (var5.getName().equals(var1)) {
            var2.add(var5);
         }
      }

      Method[] var6 = (Method[])var2.toArray(new Method[var2.size()]);
      return var6;
   }
}
