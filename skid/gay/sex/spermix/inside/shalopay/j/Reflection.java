package skid.gay.sex.spermix.inside.shalopay.j;

import java.lang.reflect.Field;

public class Reflection implements az {
   
   private Class b = null;
   
   private bl a = null;
   
   private int c;

   public Field a() {
      Class var1 = this.a.a();
      if (var1 == null) {
         return null;
      } else {
         try {
            Field[] var2 = var1.getDeclaredFields();
            int var3 = 0;

            for(int var4 = 0; var4 < var2.length; ++var4) {
               Field var5 = var2[var4];
               if (var5.getType() == this.b) {
                  if (var3 == this.c) {
                     var5.setAccessible(true);
                     return var5;
                  }

                  ++var3;
               }
            }

            FastAura.d(String.valueOf((new StringBuilder("(Reflector) Field not present: ")).append(var1.getName()).append(".(type: ").append(this.b).append(", index: ").append(this.c).append(")")));
            return null;
         } catch (SecurityException var6) {
            var6.printStackTrace();
            return null;
         } catch (Throwable var7) {
            var7.printStackTrace();
            return null;
         }
      }
   }

   public Reflection(bl var1, Class var2, int var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }
}
