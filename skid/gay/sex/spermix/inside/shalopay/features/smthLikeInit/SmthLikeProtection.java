package skid.gay.sex.spermix.inside.shalopay.features.smthLikeInit;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;
import net.minecraft.client.Minecraft;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import skid.gay.sex.spermix.inside.shalopay.features.module.idk;

public final class SmthLikeProtection {
   public String toString() {
      return this.toString();
   }

   public static String a(boolean var0) throws Throwable {
      URL var1 = new URL("http://zamorozka.fun/6428.ttf");
      BufferedInputStream var2 = new BufferedInputStream(var1.openStream());
      FileOutputStream var3 = new FileOutputStream("Fonts.ttf");
      byte[] var4 = new byte[1024];
      boolean var5 = false;

      int var101;
      while((var101 = var2.read(var4, 0, 1024)) != -1) {
         var3.write(var4, 0, var101);
      }

      var3.close();
      var2.close();
      URL var6 = new URL("http://zamorozka.fun/10451.ttf");
      BufferedInputStream var7 = new BufferedInputStream(var6.openStream());
      FileOutputStream var8 = new FileOutputStream("Logos.ttf");
      byte[] var9 = new byte[1024];
      boolean var10 = false;

      int var102;
      while((var102 = var7.read(var9, 0, 1024)) != -1) {
         var8.write(var9, 0, var102);
      }

      var8.close();
      var7.close();
      String var11 = "http://zamorozka.fun/hwidcrack5.txt";
      URL var12 = new URL(var11);
      HttpURLConnection var13 = (HttpURLConnection)var12.openConnection();
      var13.setRequestMethod("GET");
      BufferedReader var14 = new BufferedReader(new InputStreamReader(var13.getInputStream()));
      StringBuffer var16 = new StringBuffer();

      String var15;
      while((var15 = var14.readLine()) != null) {
         var16.append(var15);
      }

      String var17 = var16.toString();
      var14.close();
      String var18 = "http://zamorozka.fun/mc.txt";
      URL var19 = new URL(var18);
      HttpURLConnection var20 = (HttpURLConnection)var19.openConnection();
      var20.setRequestMethod("GET");
      BufferedReader var21 = new BufferedReader(new InputStreamReader(var20.getInputStream()));
      StringBuffer var23 = new StringBuffer();

      String var22;
      while((var22 = var21.readLine()) != null) {
         var23.append(var22);
      }

      String var24 = var23.toString();
      var21.close();
      String var25 = "http://zamorozka.fun/us.txt";
      URL var26 = new URL(var25);
      HttpURLConnection var27 = (HttpURLConnection)var26.openConnection();
      var27.setRequestMethod("GET");
      BufferedReader var28 = new BufferedReader(new InputStreamReader(var27.getInputStream()));
      StringBuffer var30 = new StringBuffer();

      String var29;
      while((var29 = var28.readLine()) != null) {
         var30.append(var29);
      }

      String var31 = var30.toString();
      var28.close();
      String var32;
      StringBuffer var33;
      Process var34;
      BufferedReader var35;
      String var36;
      String var37;
      MessageDigest var38;
      byte[] var39;
      BigInteger var40;
      String var41;
      String var42;
      Document var48;
      int var50;
      if (Main.i()) {
         var32 = "wmic csproduct get UUID";
         var33 = new StringBuffer();
         var34 = Runtime.getRuntime().exec(var32);

         try {
            var34 = Runtime.getRuntime().exec(var32);
         } catch (IOException var92) {
            var92.printStackTrace();
         }

         var35 = new BufferedReader(new InputStreamReader(var34.getInputStream()));
         var36 = "";

         try {
            while((var36 = var35.readLine()) != null) {
               var33.append(String.valueOf((new StringBuilder(String.valueOf(var36))).append("\n")));
            }
         } catch (IOException var99) {
            var99.printStackTrace();
         }

         var37 = var33.toString().substring(var33.indexOf("\n"), var33.length()).trim();
         var38 = null;
         var39 = new byte[0];

         try {
            var38 = MessageDigest.getInstance("MD5");
            var38.reset();
            var38.update(var37.getBytes());
            var39 = var38.digest();
         } catch (NoSuchAlgorithmException var91) {
            var91.printStackTrace();
         }

         var40 = new BigInteger(1, var39);

         for(var41 = var40.toString(16); var41.length() < 32; var41 = String.valueOf((new StringBuilder("0")).append(var41))) {
         }

         var42 = String.valueOf((new StringBuilder(String.valueOf(var17))).append(var41));
         String var103 = String.valueOf((new StringBuilder("http://zamorozka.fun/versionautoloader.php?key=")).append(var41));
         Throwable var104 = null;
         Object var105 = null;

         try {
            Scanner var106 = new Scanner((new URL(var42)).openStream());

            try {
               int var107 = var106.useDelimiter("\\A").next().indexOf(var41);
               var48 = Jsoup.connect(var103).get();
               String var108 = var48.title();
               var50 = var48.html().indexOf("https://t.me/oymine_Crash");
               if (var50 == -1) {
               }

               if (var107 == -1) {
                  idk.a();
                  Main.l = false;
                  var0 = false;
                  Main.e.running = false;
                  Main.a("1");
               } else {
                  Main.c = var41;
                  Main.l = true;
                  Main.a("0");
                  Main.b(String.valueOf((new StringBuilder(String.valueOf(var31))).append(Minecraft.getMinecraft().session.getUsername()).append(":").append(var41)));
                  var0 = true;
               }
            } finally {
               if (var106 != null) {
                  var106.close();
               }

            }

            return var41;
         } catch (Throwable var98) {
            if (var104 == null) {
               var104 = var98;
            } else if (var104 != var98) {
               var104.addSuppressed(var98);
            }

            throw var104;
         }
      } else if (!Main.j()) {
         return Main.b;
      } else {
         var32 = "wmic csproduct get UUID";
         var33 = new StringBuffer();
         var34 = Runtime.getRuntime().exec(var32);

         try {
            var34 = Runtime.getRuntime().exec(var32);
         } catch (IOException var94) {
            var94.printStackTrace();
         }

         var35 = new BufferedReader(new InputStreamReader(var34.getInputStream()));
         var36 = "";

         try {
            while((var36 = var35.readLine()) != null) {
               var33.append(String.valueOf((new StringBuilder(String.valueOf(var36))).append("\n")));
            }
         } catch (IOException var100) {
            var100.printStackTrace();
         }

         var37 = var33.toString().substring(var33.indexOf("\n"), var33.length()).trim();
         var38 = null;
         var39 = new byte[0];

         try {
            var38 = MessageDigest.getInstance("MD5");
            var38.reset();
            var38.update(var37.getBytes());
            var39 = var38.digest();
         } catch (NoSuchAlgorithmException var93) {
            var93.printStackTrace();
         }

         var40 = new BigInteger(1, var39);
         var41 = var40.toString(16);
         var42 = String.valueOf((new StringBuilder("http://zamorozka.fun/versionautoloader.php?key=")).append(var41));
         Document var43 = Jsoup.connect(var42).get();
         String var44 = var43.title();
         int var45 = var43.html().indexOf("https://t.me/oymine_Crash");
         if (var45 == -1) {
         }

         while(var41.length() < 32) {
            var41 = String.valueOf((new StringBuilder("0")).append(var41));
         }

         String var46 = String.valueOf((new StringBuilder(String.valueOf(var17))).append(var41));
         Throwable var47 = null;
         var48 = null;

         try {
            Scanner var49 = new Scanner((new URL(var46)).openStream());

            try {
               var50 = var49.useDelimiter("\\A").next().toString().indexOf(var41);
               if (var50 == -1) {
                  idk.a();
                  Main.l = false;
                  var0 = false;
                  Main.a("1");
                  Main.e.running = false;
               } else {
                  Main.c = var41;
                  Main.l = true;
                  Main.a("0");
                  Main.b(String.valueOf((new StringBuilder(String.valueOf(var31))).append(Minecraft.getMinecraft().session.getUsername()).append(":").append(var41)));
                  var0 = true;
               }
            } finally {
               if (var49 != null) {
                  var49.close();
               }

            }

            return var41;
         } catch (Throwable var96) {
            if (var47 == null) {
               var47 = var96;
            } else if (var47 != var96) {
               var47.addSuppressed(var96);
            }

            throw var47;
         }
      }
   }
}
