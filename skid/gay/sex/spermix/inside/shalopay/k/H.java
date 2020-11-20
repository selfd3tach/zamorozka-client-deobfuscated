package skid.gay.sex.spermix.inside.shalopay.k;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import skid.gay.sex.spermix.inside.shalopay.j.bx;

public class H extends B {
   
   private static final Pattern a = Pattern.compile("^\\s*#define\\s+(\\w+)\\s+(-?[0-9\\.Ff]+|\\w+)\\s*(//.*)?$");

   public static String[] b(String var0, String var1) {
      String[] var2 = new String[]{var0};
      if (var1 == null) {
         return var2;
      } else {
         var1 = var1.trim();
         var1 = bx.a(var1, "[");
         var1 = bx.b(var1, "]");
         var1 = var1.trim();
         if (var1.length() <= 0) {
            return var2;
         } else {
            String[] var3 = skid.gay.sex.spermix.inside.shalopay.RadioShanson.FastAura.a(var1, " ");
            if (var3.length <= 0) {
               return var2;
            } else {
               if (!Arrays.asList(var3).contains(var0)) {
                  var3 = (String[]) skid.gay.sex.spermix.inside.shalopay.RadioShanson.FastAura.a(var3, var0, 0);
               }

               return var3;
            }
         }
      }
   }

   public String e(String var1) {
      String var2 = var1.toLowerCase();
      return !var2.equals("false") && !var2.equals("off") ? "§a" : "§c";
   }

   public String o() {
      return String.valueOf((new StringBuilder("#define ")).append(this.a()).append(" ").append(this.d()).append(" // Shader option ").append(this.d()));
   }

   public boolean f(String var1) {
      Matcher var2 = a.matcher(var1);
      if (!var2.matches()) {
         return false;
      } else {
         String var3 = var2.group(1);
         return var3.matches(this.a());
      }
   }

   public static B a(String var0, String var1) {
      Matcher var2 = a.matcher(var0);
      if (!var2.matches()) {
         return null;
      } else {
         String var3 = var2.group(1);
         String var4 = var2.group(2);
         String var5 = var2.group(3);
         String var6 = bx.d(var5, "[", "]");
         if (var6 != null && var6.length() > 0) {
            var5 = var5.replace(var6, "").trim();
         }

         String[] var7 = b(var4, var6);
         if (var3 != null && var3.length() > 0) {
            var1 = bx.a(var1, "/shaders/");
            H var8 = new H(var3, var5, var4, var7, var1);
            return var8;
         } else {
            return null;
         }
      }
   }

   public String d(String var1) {
      String var2 = V.b(String.valueOf((new StringBuilder("prefix.")).append(this.a())), "");
      String var3 = super.d(var1);
      String var4 = V.b(String.valueOf((new StringBuilder("suffix.")).append(this.a())), "");
      String var5 = String.valueOf((new StringBuilder(String.valueOf(var2))).append(var3).append(var4));
      return var5;
   }

   public H(String var1, String var2, String var3, String[] var4, String var5) {
      super(var1, var2, var3, var4, var3, var5);
      this.b(this.p().length > 1);
   }
}
