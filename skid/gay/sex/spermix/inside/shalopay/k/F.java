package skid.gay.sex.spermix.inside.shalopay.k;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import skid.gay.sex.spermix.inside.shalopay.j.aH;
import skid.gay.sex.spermix.inside.shalopay.j.bx;

public class F extends B {
   
   private static final Pattern a = Pattern.compile("^\\s*(//)?\\s*#define\\s+([A-Za-z0-9_]+)\\s*(//.*)?$");
   
   private static final Pattern b = Pattern.compile("^\\s*#if(n)?def\\s+([A-Za-z0-9_]+)(\\s*)?$");

   public boolean n() {
      return true;
   }

   public boolean g(String var1) {
      Matcher var2 = b.matcher(var1);
      if (var2.matches()) {
         String var3 = var2.group(2);
         if (var3.equals(this.a())) {
            return true;
         }
      }

      return false;
   }

   public boolean f(String var1) {
      Matcher var2 = a.matcher(var1);
      if (!var2.matches()) {
         return false;
      } else {
         String var3 = var2.group(2);
         return var3.matches(this.a());
      }
   }

   public String o() {
      return h(this.d()) ? String.valueOf((new StringBuilder("#define ")).append(this.a()).append(" // Shader option ON")) : String.valueOf((new StringBuilder("//#define ")).append(this.a()).append(" // Shader option OFF"));
   }

   public static B a(String var0, String var1) {
      Matcher var2 = a.matcher(var0);
      if (!var2.matches()) {
         return null;
      } else {
         String var3 = var2.group(1);
         String var4 = var2.group(2);
         String var5 = var2.group(3);
         if (var4 != null && var4.length() > 0) {
            boolean var6 = skid.gay.sex.spermix.inside.shalopay.RadioShanson.FastAura.a((Object)var3, (Object)"//");
            boolean var7 = !var6;
            var1 = bx.a(var1, "/shaders/");
            F var8 = new F(var4, var5, String.valueOf(var7), var1);
            return var8;
         } else {
            return null;
         }
      }
   }

   public String d(String var1) {
      String var2 = super.d(var1);
      if (var2 != var1) {
         return var2;
      } else {
         return h(var1) ? aH.b() : aH.c();
      }
   }

   public F(String var1, String var2, String var3, String var4) {
      super(var1, var2, var3, new String[]{"false", "true"}, var3, var4);
   }

   public static boolean h(String var0) {
      return Boolean.valueOf(var0);
   }

   public String e(String var1) {
      return h(var1) ? "§a" : "§c";
   }
}
