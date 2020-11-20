package skid.gay.sex.spermix.inside.shalopay.features.idk;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.Iterator;
import net.minecraft.client.Minecraft;
import org.lwjgl.input.Keyboard;
import skid.gay.sex.spermix.inside.shalopay.features.module.SmthLikeModuleRegister;
import skid.gay.sex.spermix.inside.shalopay.features.smthLikeInit.idk;
import skid.gay.sex.spermix.inside.shalopay.features.module.Module;

public class n {
   
   public static File a;
   
   public static Minecraft b = Minecraft.getMinecraft();

   public static void e() {
      try {
         File var0 = new File(a.getAbsolutePath(), "friend.txt");
         BufferedWriter var1 = new BufferedWriter(new FileWriter(var0));
         Iterator var3 = q.a.iterator();

         while(var3.hasNext()) {
            p var2 = (p)var3.next();
            var1.write(String.valueOf((new StringBuilder(String.valueOf(var2.a().toLowerCase().replace(" ", "")))).append(":").append(var2.b())));
            var1.write("\r\n");
         }

         var1.close();
      } catch (Exception var4) {
         Minecraft.player.sendChatMessage("Failed to save friend!");
      }

   }

   public void f() {
      try {
         File var1 = new File(a.getAbsolutePath(), "friend.txt");
         FileInputStream var2 = new FileInputStream(var1.getAbsolutePath());
         DataInputStream var3 = new DataInputStream(var2);
         BufferedReader var4 = new BufferedReader(new InputStreamReader(var3));

         String var5;
         while((var5 = var4.readLine()) != null) {
            String var6 = var5.trim();
            String var7 = var6.split(":")[0];
            String var8 = var6.split(":")[1];
            idk.a().a(var7, var8);
         }

         var4.close();
      } catch (Exception var9) {
         var9.printStackTrace();
      }

   }

   public void b() {
      try {
         File var1 = new File(a.getAbsolutePath(), "bind.txt");
         FileInputStream var2 = new FileInputStream(var1.getAbsolutePath());
         DataInputStream var3 = new DataInputStream(var2);
         BufferedReader var4 = new BufferedReader(new InputStreamReader(var3));

         String var5;
         while((var5 = var4.readLine()) != null) {
            String var6 = var5.toLowerCase().trim();
            String[] var7 = var6.split(":");
            String var8 = var7[0];
            int var9 = Keyboard.getKeyIndex(var7[1].toUpperCase());
            Iterator var11 = SmthLikeModuleRegister.a().iterator();

            while(var11.hasNext()) {
               Module var10 = (Module)var11.next();
               if (var8.equalsIgnoreCase(String.valueOf((new StringBuilder("key-")).append(var10.a().toLowerCase().replace(" ", ""))))) {
                  var10.a(var9);
               }
            }
         }

         var4.close();
      } catch (Exception var12) {
         var12.printStackTrace();
         a();
         var12.printStackTrace();
      }

   }

   public n() {
      a = new File(String.valueOf((new StringBuilder()).append(b.mcDataDir).append(File.separator).append("Zamorozka")));
      if (!a.exists()) {
         a.mkdirs();
      }

      this.b();
      this.d();
      this.f();
   }

   public static void a() {
      try {
         File var0 = new File(a.getAbsolutePath(), "bind.txt");
         BufferedWriter var1 = new BufferedWriter(new FileWriter(var0));
         Iterator var3 = SmthLikeModuleRegister.a().iterator();

         while(var3.hasNext()) {
            Module var2 = (Module)var3.next();
            int var4 = var2.l();
            if (var4 <= 114) {
               var1.write(String.valueOf((new StringBuilder("key-")).append(var2.a().toLowerCase().replace(" ", "")).append(":").append(Keyboard.getKeyName(var4))));
               var1.write("\r\n");
            }
         }

         var1.close();
      } catch (Exception var5) {
         Minecraft.player.sendChatMessage("Failed to save keybind!");
      }

   }

   public static void c() {
      try {
         File var0 = new File(a.getAbsolutePath(), "module.txt");
         BufferedWriter var1 = new BufferedWriter(new FileWriter(var0));
         Iterator var3 = SmthLikeModuleRegister.a().iterator();

         while(var3.hasNext()) {
            Module var2 = (Module)var3.next();
            if (var2.c()) {
               var1.write(var2.a().toLowerCase().replace(" ", ""));
               var1.write("\r\n");
            }
         }

         var1.close();
      } catch (Exception var4) {
      }

   }

   public void d() {
      try {
         File var1 = new File(a.getAbsolutePath(), "module.txt");
         FileInputStream var2 = new FileInputStream(var1.getAbsolutePath());
         DataInputStream var3 = new DataInputStream(var2);
         BufferedReader var4 = new BufferedReader(new InputStreamReader(var3));

         String var5;
         while((var5 = var4.readLine()) != null) {
            String var6 = var5.toLowerCase().trim();
            String var7 = var6.split(":")[0];
            Iterator var9 = SmthLikeModuleRegister.a().iterator();

            while(var9.hasNext()) {
               Module var8 = (Module)var9.next();
               if (var8.a().toLowerCase().replace(" ", "").equals(var7)) {
                  var8.a(true);
               }
            }
         }

         var4.close();
      } catch (Exception var10) {
         var10.printStackTrace();
      }

   }
}
