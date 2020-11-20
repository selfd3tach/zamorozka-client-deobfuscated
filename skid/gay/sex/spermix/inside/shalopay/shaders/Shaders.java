package skid.gay.sex.spermix.inside.shalopay.shaders;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class Shaders {
   
   private static final Logger a = LogManager.getLogger();

   public static void b(String var0) {
      a.warn(String.valueOf((new StringBuilder("[Shaders] ")).append(var0)));
   }

   public static void a(String var0) {
      a.error(String.valueOf((new StringBuilder("[Shaders] ")).append(var0)));
   }

   public static void a(String var0, Object... var1) {
      String var2 = String.format(var0, var1);
      a.warn(String.valueOf((new StringBuilder("[Shaders] ")).append(var2)));
   }

   public static void b(String var0, Object... var1) {
      String var2 = String.format(var0, var1);
      a.info(String.valueOf((new StringBuilder("[Shaders] ")).append(var2)));
   }

   public static void c(String var0) {
      a.info(String.valueOf((new StringBuilder("[Shaders] ")).append(var0)));
   }
}
