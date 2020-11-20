package skid.gay.sex.spermix.inside.shalopay.j;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Random;
import net.minecraft.util.ResourceLocation;

public class P {
   
   private static Q a = null;
   
   private static final Random b = new Random();

   public static Q a() {
      return a;
   }

   private static Properties[] a(String[] var0) {
      Properties[] var1 = new Properties[var0.length];

      for(int var2 = 0; var2 < var0.length; ++var2) {
         String var3 = var0[var2];
         if (var2 == 0) {
            var3 = "optifine/gui";
         } else {
            FastAura.a(String.valueOf((new StringBuilder("CustomPanorama: ")).append(var3)));
         }

         ResourceLocation var4 = new ResourceLocation(String.valueOf((new StringBuilder(String.valueOf(var3))).append("/background.properties")));

         try {
            InputStream var5 = FastAura.a(var4);
            if (var5 != null) {
               Properties var6 = new Properties();
               var6.load(var5);
               FastAura.a(String.valueOf((new StringBuilder("CustomPanorama: ")).append(var4.getResourcePath())));
               var1[var2] = var6;
               var5.close();
            }
         } catch (IOException var7) {
         }
      }

      return var1;
   }

   private static int[] a(Properties[] var0) {
      int[] var1 = new int[var0.length];

      for(int var2 = 0; var2 < var1.length; ++var2) {
         Properties var3 = var0[var2];
         if (var3 == null) {
            var3 = var0[0];
         }

         if (var3 == null) {
            var1[var2] = 1;
         } else {
            String var4 = var3.getProperty("weight", (String)null);
            var1[var2] = FastAura.a((String)var4, 1);
         }
      }

      return var1;
   }

   private static String[] c() {
      ArrayList var0 = new ArrayList();
      var0.add("textures/gui/title/background");

      for(int var1 = 0; var1 < 100; ++var1) {
         String var2 = String.valueOf((new StringBuilder("optifine/gui/background")).append(var1));
         String var3 = String.valueOf((new StringBuilder(String.valueOf(var2))).append("/panorama_0.png"));
         ResourceLocation var4 = new ResourceLocation(var3);
         if (FastAura.b(var4)) {
            var0.add(var2);
         }
      }

      String[] var5 = (String[])var0.toArray(new String[var0.size()]);
      return var5;
   }

   public static void b() {
      a = null;
      String[] var0 = c();
      if (var0.length > 1) {
         Properties[] var1 = a(var0);
         int[] var2 = a(var1);
         int var3 = a(var2);
         String var4 = var0[var3];
         Properties var5 = var1[var3];
         if (var5 == null) {
            var5 = var1[0];
         }

         if (var5 == null) {
            var5 = new Properties();
         }

         Q var6 = new Q(var4, var5);
         a = var6;
      }

   }

   private static int a(int[] var0) {
      int var1 = aL.b(var0);
      int var2 = b.nextInt(var1);
      int var3 = 0;

      for(int var4 = 0; var4 < var0.length; ++var4) {
         var3 += var0[var4];
         if (var3 > var2) {
            return var4;
         }
      }

      return var0.length - 1;
   }
}
