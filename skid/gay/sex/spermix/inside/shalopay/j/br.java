package skid.gay.sex.spermix.inside.shalopay.j;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class br {
   public static Field[] a(Field[] var0, Class var1) {
      try {
         ArrayList var2 = new ArrayList();

         for(int var3 = 0; var3 < var0.length; ++var3) {
            Field var4 = var0[var3];
            if (var4.getType() == var1) {
               var4.setAccessible(true);
               var2.add(var4);
            }
         }

         Field[] var6 = (Field[])var2.toArray(new Field[var2.size()]);
         return var6;
      } catch (Exception var5) {
         return null;
      }
   }

   public static Field[] a(Object var0, Field[] var1, Class var2, Object var3) {
      try {
         ArrayList var4 = new ArrayList();

         for(int var5 = 0; var5 < var1.length; ++var5) {
            Field var6 = var1[var5];
            if (var6.getType() == var2) {
               boolean var7 = Modifier.isStatic(var6.getModifiers());
               if ((var0 != null || var7) && (var0 == null || !var7)) {
                  var6.setAccessible(true);
                  Object var8 = var6.get(var0);
                  if (var8 == var3) {
                     var4.add(var6);
                  } else if (var8 != null && var3 != null && var8.equals(var3)) {
                     var4.add(var6);
                  }
               }
            }
         }

         Field[] var10 = (Field[])var4.toArray(new Field[var4.size()]);
         return var10;
      } catch (Exception var9) {
         return null;
      }
   }

   public static Field[] a(Class var0, Field var1, Class var2) {
      try {
         Field[] var3 = var0.getDeclaredFields();
         List var4 = Arrays.asList(var3);
         int var5 = var4.indexOf(var1);
         if (var5 < 0) {
            return new Field[0];
         } else {
            List var6 = var4.subList(var5 + 1, var4.size());
            Field[] var7 = (Field[])var6.toArray(new Field[var6.size()]);
            return a(var7, var2);
         }
      } catch (Exception var8) {
         return null;
      }
   }

   public static Field a(Class var0, Field var1, Class var2, int var3) {
      Field[] var4 = a(var0, var1, var2);
      return var3 >= 0 && var3 < var4.length ? var4[var3] : null;
   }
}
