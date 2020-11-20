package skid.gay.sex.spermix.inside.shalopay.j;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Properties;
import net.minecraft.client.renderer.texture.ITextureObject;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class R {
   
   private static CustomWeather[][] a = null;

   public static boolean a(World var0) {
      if (a == null) {
         return false;
      } else if (FastAura.aL().renderDistanceChunks < 8) {
         return false;
      } else {
         int var1 = var0.provider.getDimensionType().getId();
         if (var1 >= 0 && var1 < a.length) {
            CustomWeather[] var2 = a[var1];
            if (var2 == null) {
               return false;
            } else {
               return var2.length > 0;
            }
         } else {
            return false;
         }
      }
   }

   private static CustomWeather[][] c() {
      CustomWeather[][] var0 = new CustomWeather[10][0];
      String var1 = "mcpatcher/sky/world";
      int var2 = -1;

      int var3;
      for(var3 = 0; var3 < var0.length; ++var3) {
         String var4 = String.valueOf((new StringBuilder(String.valueOf(var1))).append(var3).append("/sky"));
         ArrayList var5 = new ArrayList();

         for(int var6 = 1; var6 < 1000; ++var6) {
            String var7 = String.valueOf((new StringBuilder(String.valueOf(var4))).append(var6).append(".properties"));

            try {
               ResourceLocation var8 = new ResourceLocation(var7);
               InputStream var9 = FastAura.a(var8);
               if (var9 == null) {
                  break;
               }

               Properties var10 = new Properties();
               var10.load(var9);
               var9.close();
               FastAura.a(String.valueOf((new StringBuilder("CustomSky properties: ")).append(var7)));
               String var11 = String.valueOf((new StringBuilder(String.valueOf(var4))).append(var6).append(".png"));
               CustomWeather var12 = new CustomWeather(var10, var11);
               if (var12.a(var7)) {
                  ResourceLocation var13 = new ResourceLocation(var12.a);
                  ITextureObject var14 = bB.a(var13);
                  if (var14 == null) {
                     FastAura.d(String.valueOf((new StringBuilder("CustomSky: Texture not found: ")).append(var13)));
                  } else {
                     var12.b = var14.getGlTextureId();
                     var5.add(var12);
                     var9.close();
                  }
               }
            } catch (FileNotFoundException var15) {
               break;
            } catch (IOException var16) {
               var16.printStackTrace();
            }
         }

         if (var5.size() > 0) {
            CustomWeather[] var19 = (CustomWeather[])var5.toArray(new CustomWeather[var5.size()]);
            var0[var3] = var19;
            var2 = var3;
         }
      }

      if (var2 < 0) {
         return null;
      } else {
         var3 = var2 + 1;
         CustomWeather[][] var17 = new CustomWeather[var3][0];

         for(int var18 = 0; var18 < var17.length; ++var18) {
            var17[var18] = var0[var18];
         }

         return var17;
      }
   }

   public static void a() {
      a = null;
   }

   public static void a(World var0, TextureManager var1, float var2) {
      if (a != null) {
         int var3 = var0.provider.getDimensionType().getId();
         if (var3 >= 0 && var3 < a.length) {
            CustomWeather[] var4 = a[var3];
            if (var4 != null) {
               long var5 = var0.getWorldTime();
               int var7 = (int)(var5 % 24000L);
               float var8 = var0.getCelestialAngle(var2);
               float var9 = var0.getRainStrength(var2);
               float var10 = var0.getThunderStrength(var2);
               if (var9 > 0.0F) {
                  var10 /= var9;
               }

               for(int var11 = 0; var11 < var4.length; ++var11) {
                  CustomWeather var12 = var4[var11];
                  if (var12.a(var0, var7)) {
                     var12.a(var7, var8, var9, var10);
                  }
               }

               float var13 = 1.0F - var9;
               d.a(var13);
            }
         }
      }

   }

   public static void b() {
      a();
      if (FastAura.aD()) {
         a = c();
      }

   }
}
