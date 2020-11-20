package skid.gay.sex.spermix.inside.shalopay.j;

public class MathUtils {
   public static int a(int var0, int var1, int var2, int var3) {
      int var4 = a(var0, var1);
      int var5 = a(var2, var3);
      int var6 = a(var4, var5);
      return var6;
   }

   private static int a(int var0, int var1) {
      int var2 = (var0 & -16777216) >> 24 & 255;
      int var3 = (var1 & -16777216) >> 24 & 255;
      int var4 = (var2 + var3) / 2;
      if (var2 == 0 && var3 == 0) {
         var2 = 1;
         var3 = 1;
      } else {
         if (var2 == 0) {
            var0 = var1;
            var4 /= 2;
         }

         if (var3 == 0) {
            var1 = var0;
            var4 /= 2;
         }
      }

      int var5 = (var0 >> 16 & 255) * var2;
      int var6 = (var0 >> 8 & 255) * var2;
      int var7 = (var0 & 255) * var2;
      int var8 = (var1 >> 16 & 255) * var3;
      int var9 = (var1 >> 8 & 255) * var3;
      int var10 = (var1 & 255) * var3;
      int var11 = (var5 + var8) / (var2 + var3);
      int var12 = (var6 + var9) / (var2 + var3);
      int var13 = (var7 + var10) / (var2 + var3);
      return var4 << 24 | var11 << 16 | var12 << 8 | var13;
   }
}
