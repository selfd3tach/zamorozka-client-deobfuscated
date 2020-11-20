package skid.gay.sex.spermix.inside.shalopay.j;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import net.minecraft.client.resources.AbstractResourcePack;
import net.minecraft.client.resources.DefaultResourcePack;
import net.minecraft.client.resources.IResourcePack;
import net.minecraft.client.resources.LegacyV2Adapter;
import net.minecraft.util.ResourceLocation;

public class bu {
   public static String[] a(IResourcePack var0, String[] var1, String[] var2, String[] var3) {
      if (var0 instanceof DefaultResourcePack) {
         return a(var0, var3);
      } else {
         if (var0 instanceof LegacyV2Adapter) {
            IResourcePack var4 = (IResourcePack)bk.a((Object)var0, (bn)bk.dt);
            if (var4 == null) {
               FastAura.b(String.valueOf((new StringBuilder("LegacyV2Adapter base resource pack not found: ")).append(var0)));
               return new String[0];
            }

            var0 = var4;
         }

         if (!(var0 instanceof AbstractResourcePack)) {
            FastAura.b(String.valueOf((new StringBuilder("Unknown resource pack type: ")).append(var0)));
            return new String[0];
         } else {
            AbstractResourcePack var6 = (AbstractResourcePack)var0;
            File var5 = var6.resourcePackFile;
            if (var5 == null) {
               return new String[0];
            } else if (var5.isDirectory()) {
               return a(var5, "", var1, var2);
            } else if (var5.isFile()) {
               return a(var5, var1, var2);
            } else {
               FastAura.b(String.valueOf((new StringBuilder("Unknown resource pack file: ")).append(var5)));
               return new String[0];
            }
         }
      }
   }

   private static String[] a(File var0, String[] var1, String[] var2) {
      ArrayList var3 = new ArrayList();
      String var4 = "assets/minecraft/";

      try {
         ZipFile var5 = new ZipFile(var0);
         Enumeration var6 = var5.entries();

         while(var6.hasMoreElements()) {
            ZipEntry var7 = (ZipEntry)var6.nextElement();
            String var8 = var7.getName();
            if (var8.startsWith(var4)) {
               var8 = var8.substring(var4.length());
               if (bx.a(var8, var1) && bx.b(var8, var2)) {
                  if (!a(var8)) {
                     FastAura.b(String.valueOf((new StringBuilder("Skipping non-lowercase path: ")).append(var8)));
                  } else {
                     var3.add(var8);
                  }
               }
            }
         }

         var5.close();
         String[] var10 = (String[])var3.toArray(new String[var3.size()]);
         return var10;
      } catch (IOException var9) {
         var9.printStackTrace();
         return new String[0];
      }
   }

   private static boolean a(String var0) {
      return var0.equals(var0.toLowerCase(Locale.ROOT));
   }

   public static String[] a(String[] var0, String[] var1) {
      LinkedHashSet var2 = new LinkedHashSet();
      IResourcePack[] var3 = FastAura.U();

      for(int var4 = 0; var4 < var3.length; ++var4) {
         IResourcePack var5 = var3[var4];
         String[] var6 = a((IResourcePack)var5, (String[])var0, (String[])var1, (String[])null);
         var2.addAll(Arrays.asList(var6));
      }

      String[] var7 = (String[])var2.toArray(new String[var2.size()]);
      return var7;
   }

   public static String[] a(IResourcePack var0, String var1, String var2, String[] var3) {
      return a(var0, new String[]{var1}, new String[]{var2}, var3);
   }

   private static String[] a(IResourcePack var0, String[] var1) {
      if (var1 == null) {
         return new String[0];
      } else {
         ArrayList var2 = new ArrayList();

         for(int var3 = 0; var3 < var1.length; ++var3) {
            String var4 = var1[var3];
            if (!a(var4)) {
               FastAura.b(String.valueOf((new StringBuilder("Skipping non-lowercase path: ")).append(var4)));
            } else {
               ResourceLocation var5 = new ResourceLocation(var4);
               if (var0.resourceExists(var5)) {
                  var2.add(var4);
               }
            }
         }

         String[] var6 = (String[])var2.toArray(new String[var2.size()]);
         return var6;
      }
   }

   private static String[] a(File var0, String var1, String[] var2, String[] var3) {
      ArrayList var4 = new ArrayList();
      String var5 = "assets/minecraft/";
      File[] var6 = var0.listFiles();
      if (var6 == null) {
         return new String[0];
      } else {
         for(int var7 = 0; var7 < var6.length; ++var7) {
            File var8 = var6[var7];
            String var9;
            if (var8.isFile()) {
               var9 = String.valueOf((new StringBuilder(String.valueOf(var1))).append(var8.getName()));
               if (var9.startsWith(var5)) {
                  var9 = var9.substring(var5.length());
                  if (bx.a(var9, var2) && bx.b(var9, var3)) {
                     if (!a(var9)) {
                        FastAura.b(String.valueOf((new StringBuilder("Skipping non-lowercase path: ")).append(var9)));
                     } else {
                        var4.add(var9);
                     }
                  }
               }
            } else if (var8.isDirectory()) {
               var9 = String.valueOf((new StringBuilder(String.valueOf(var1))).append(var8.getName()).append("/"));
               String[] var10 = a(var8, var9, var2, var3);

               for(int var11 = 0; var11 < var10.length; ++var11) {
                  String var12 = var10[var11];
                  var4.add(var12);
               }
            }
         }

         String[] var13 = (String[])var4.toArray(new String[var4.size()]);
         return var13;
      }
   }

   public static String[] a(IResourcePack var0, String[] var1, String[] var2) {
      return a((IResourcePack)var0, (String[])var1, (String[])var2, (String[])null);
   }

   public static String[] a(String var0, String var1) {
      return a(new String[]{var0}, new String[]{var1});
   }
}
