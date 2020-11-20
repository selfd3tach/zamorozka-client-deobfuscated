package skid.gay.sex.spermix.inside.shalopay.j;

import java.lang.reflect.Field;

public class Z implements az {
   
   private bl a = null;
   
   private String b = null;

   private Field a(Class var1, String var2) {
      Field[] var3 = var1.getDeclaredFields();

      for(int var4 = 0; var4 < var3.length; ++var4) {
         Field var5 = var3[var4];
         if (var5.getName().equals(var2)) {
            return var5;
         }
      }

      if (var1 == Object.class) {
         throw new NoSuchFieldException(var2);
      } else {
         return this.a(var1.getSuperclass(), var2);
      }
   }

   public Field a() {
      Class var1 = this.a.a();
      if (var1 == null) {
         return null;
      } else {
         try {
            Field var2 = this.a(var1, this.b);
            var2.setAccessible(true);
            return var2;
         } catch (NoSuchFieldException var3) {
            FastAura.d(String.valueOf((new StringBuilder("(Reflector) Field not present: ")).append(var1.getName()).append(".").append(this.b)));
            return null;
         } catch (SecurityException var4) {
            var4.printStackTrace();
            return null;
         } catch (Throwable var5) {
            var5.printStackTrace();
            return null;
         }
      }
   }

   public Z(bl var1, String var2) {
      this.a = var1;
      this.b = var2;
   }
}
