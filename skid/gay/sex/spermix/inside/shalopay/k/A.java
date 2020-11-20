package skid.gay.sex.spermix.inside.shalopay.k;

import net.minecraft.util.Util;
import net.minecraft.util.Util$EnumOS;

public class A {
   
   private static String a = "MC_";
   
   private static int[] c;
   
   private static String[] b;

   // $FF: synthetic method
   static int[] g() {
      int[] var10000 = c;
      if (var10000 != null) {
         return var10000;
      } else {
         int[] var0 = new int[Util$EnumOS.values().length];

         try {
            var0[Util$EnumOS.LINUX.ordinal()] = 1;
         } catch (NoSuchFieldError var5) {
         }

         try {
            var0[Util$EnumOS.OSX.ordinal()] = 4;
         } catch (NoSuchFieldError var4) {
         }

         try {
            var0[Util$EnumOS.SOLARIS.ordinal()] = 2;
         } catch (NoSuchFieldError var3) {
         }

         try {
            var0[Util$EnumOS.UNKNOWN.ordinal()] = 5;
         } catch (NoSuchFieldError var2) {
         }

         try {
            var0[Util$EnumOS.WINDOWS.ordinal()] = 3;
         } catch (NoSuchFieldError var1) {
         }

         c = var0;
         return var0;
      }
   }

   public static String f() {
      StringBuilder var0 = new StringBuilder();
      a(var0, "MC_VERSION", skid.gay.sex.spermix.inside.shalopay.RadioShanson.FastAura.f());
      a(var0, String.valueOf((new StringBuilder("MC_GL_VERSION ")).append(skid.gay.sex.spermix.inside.shalopay.RadioShanson.FastAura.h().d())));
      a(var0, String.valueOf((new StringBuilder("MC_GLSL_VERSION ")).append(skid.gay.sex.spermix.inside.shalopay.RadioShanson.FastAura.i().d())));
      a(var0, a());
      a(var0, b());
      a(var0, c());
      if (V.bO > 0) {
         a(var0, "MC_FXAA_LEVEL", V.bO);
      }

      if (V.bK) {
         a(var0, "MC_NORMAL_MAP");
      }

      if (V.bL) {
         a(var0, "MC_SPECULAR_MAP");
      }

      a(var0, "MC_RENDER_QUALITY", V.bB);
      a(var0, "MC_SHADOW_QUALITY", V.bC);
      a(var0, "MC_HAND_DEPTH", V.bA);
      if (V.h()) {
         a(var0, "MC_OLD_HAND_LIGHT");
      }

      if (V.j()) {
         a(var0, "MC_OLD_LIGHTING");
      }

      return String.valueOf(var0);
   }

   private static void a(StringBuilder var0, String var1, float var2) {
      var0.append("#define ");
      var0.append(var1);
      var0.append(" ");
      var0.append(var2);
      var0.append("\n");
   }

   private static void a(StringBuilder var0, String var1, int var2) {
      var0.append("#define ");
      var0.append(var1);
      var0.append(" ");
      var0.append(var2);
      var0.append("\n");
   }

   public static String[] e() {
      if (b == null) {
         String[] var0 = skid.gay.sex.spermix.inside.shalopay.RadioShanson.FastAura.j();
         String[] var1 = new String[var0.length];

         for(int var2 = 0; var2 < var0.length; ++var2) {
            var1[var2] = String.valueOf((new StringBuilder(String.valueOf(a))).append(var0[var2]));
         }

         b = var1;
      }

      return b;
   }

   private static void a(StringBuilder var0, String var1) {
      var0.append("#define ");
      var0.append(var1);
      var0.append("\n");
   }

   public static String a() {
      Util$EnumOS var0 = Util.getOSType();
      switch(g()[var0.ordinal()]) {
      case 1:
         return "MC_OS_LINUX";
      case 2:
      default:
         return "MC_OS_OTHER";
      case 3:
         return "MC_OS_WINDOWS";
      case 4:
         return "MC_OS_MAC";
      }
   }

   public static String d() {
      return a;
   }

   public static String b() {
      String var0 = skid.gay.sex.spermix.inside.shalopay.RadioShanson.FastAura.SmthLikeColorGetter;
      if (var0 == null) {
         return "MC_GL_VENDOR_OTHER";
      } else {
         var0 = var0.toLowerCase();
         if (var0.startsWith("ati")) {
            return "MC_GL_VENDOR_ATI";
         } else if (var0.startsWith("intel")) {
            return "MC_GL_VENDOR_INTEL";
         } else if (var0.startsWith("nvidia")) {
            return "MC_GL_VENDOR_NVIDIA";
         } else {
            return var0.startsWith("x.org") ? "MC_GL_VENDOR_XORG" : "MC_GL_VENDOR_OTHER";
         }
      }
   }

   public static String c() {
      String var0 = skid.gay.sex.spermix.inside.shalopay.RadioShanson.FastAura.Bind;
      if (var0 == null) {
         return "MC_GL_RENDERER_OTHER";
      } else {
         var0 = var0.toLowerCase();
         if (var0.startsWith("amd")) {
            return "MC_GL_RENDERER_RADEON";
         } else if (var0.startsWith("ati")) {
            return "MC_GL_RENDERER_RADEON";
         } else if (var0.startsWith("radeon")) {
            return "MC_GL_RENDERER_RADEON";
         } else if (var0.startsWith("gallium")) {
            return "MC_GL_RENDERER_GALLIUM";
         } else if (var0.startsWith("intel")) {
            return "MC_GL_RENDERER_INTEL";
         } else if (var0.startsWith("geforce")) {
            return "MC_GL_RENDERER_GEFORCE";
         } else if (var0.startsWith("nvidia")) {
            return "MC_GL_RENDERER_GEFORCE";
         } else if (var0.startsWith("quadro")) {
            return "MC_GL_RENDERER_QUADRO";
         } else if (var0.startsWith("nvs")) {
            return "MC_GL_RENDERER_QUADRO";
         } else {
            return var0.startsWith("mesa") ? "MC_GL_RENDERER_MESA" : "MC_GL_RENDERER_OTHER";
         }
      }
   }
}
