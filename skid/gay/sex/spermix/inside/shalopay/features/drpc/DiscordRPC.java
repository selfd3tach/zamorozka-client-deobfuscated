package skid.gay.sex.spermix.inside.shalopay.features.drpc;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public final class DiscordRPC {
   
   private static final String DLL_VERSION = "3.4.0";
   
   private static final String LIB_VERSION = "1.6.2";

   public static void discordUpdateEventHandlers(DiscordEventHandlers var0) {
      DiscordRPC$DLL.INSTANCE.Discord_UpdateHandlers(var0);
   }

   public static void discordInitialize(String var0, DiscordEventHandlers var1, boolean var2) {
      DiscordRPC$DLL.INSTANCE.Discord_Initialize(var0, var1, var2 ? 1 : 0, (String)null);
   }

   public static void discordUpdatePresence(DiscordRichPresence var0) {
      DiscordRPC$DLL.INSTANCE.Discord_UpdatePresence(var0);
   }

   public static void discordInitialize(String var0, DiscordEventHandlers var1, boolean var2, String var3) {
      DiscordRPC$DLL.INSTANCE.Discord_Initialize(var0, var1, var2 ? 1 : 0, var3);
   }

   public static void discordRegisterSteam(String var0, String var1) {
      DiscordRPC$DLL.INSTANCE.Discord_RegisterSteamGame(var0, var1);
   }

   static {
      loadDLL();
   }

   public static void discordShutdown() {
      DiscordRPC$DLL.INSTANCE.Discord_Shutdown();
   }

   public static void discordClearPresence() {
      DiscordRPC$DLL.INSTANCE.Discord_ClearPresence();
   }

   public static void discordRespond(String var0, DiscordRPC$DiscordReply var1) {
      DiscordRPC$DLL.INSTANCE.Discord_Respond(var0, var1.reply);
   }

   private static void loadDLL() {
      String var0 = System.mapLibraryName("discord-rpc");
      OSUtil var1 = new OSUtil();
      File var2;
      String var4;
      String var5;
      if (var1.isMac()) {
         var2 = new File(String.valueOf((new StringBuilder()).append(System.getProperty("user.home")).append(File.separator).append("Library").append(File.separator).append("Application Support").append(File.separator)));
         var5 = "darwin";
         var4 = String.valueOf((new StringBuilder()).append(var2).append(File.separator).append("discord-rpc").append(File.separator).append(var0));
      } else if (var1.isWindows()) {
         var2 = new File(System.getenv("TEMP"));
         boolean var6 = System.getProperty("sun.arch.data.model").equals("64");
         var5 = var6 ? "win-x64" : "win-x86";
         var4 = String.valueOf((new StringBuilder()).append(var2).append(File.separator).append("discord-rpc").append(File.separator).append(var0));
      } else {
         var2 = new File(System.getProperty("user.home"), ".discord-rpc");
         var5 = "linux";
         var4 = String.valueOf((new StringBuilder()).append(var2).append(File.separator).append(var0));
      }

      String var3 = String.valueOf((new StringBuilder()).append("/").append(var5).append("/").append(var0));
      File var16 = new File(var4);

      try {
         InputStream var7 = DiscordRPC.class.getResourceAsStream(var3);

         try {
            FileOutputStream var8 = openOutputStream(var16);

            try {
               copyFile(var7, var8);
               var16.deleteOnExit();
            } catch (Throwable var13) {
               if (var8 != null) {
                  try {
                     var8.close();
                  } catch (Throwable var12) {
                     var13.addSuppressed(var12);
                  }
               }

               throw var13;
            }

            if (var8 != null) {
               var8.close();
            }
         } catch (Throwable var14) {
            if (var7 != null) {
               try {
                  var7.close();
               } catch (Throwable var11) {
                  var14.addSuppressed(var11);
               }
            }

            throw var14;
         }

         if (var7 != null) {
            var7.close();
         }
      } catch (IOException var15) {
         var15.printStackTrace();
      }

      System.load(var16.getAbsolutePath());
   }

   private static FileOutputStream openOutputStream(File var0) throws IOException {
      if (var0.exists()) {
         if (var0.isDirectory()) {
            throw new IOException(String.valueOf((new StringBuilder()).append("File '").append(var0).append("' exists but is a directory")));
         }

         if (!var0.canWrite()) {
            throw new IOException(String.valueOf((new StringBuilder()).append("File '").append(var0).append("' cannot be written to")));
         }
      } else {
         File var1 = var0.getParentFile();
         if (var1 != null && !var1.mkdirs() && !var1.isDirectory()) {
            throw new IOException(String.valueOf((new StringBuilder()).append("Directory '").append(var1).append("' could not be created")));
         }
      }

      return new FileOutputStream(var0);
   }

   public static void discordRunCallbacks() {
      DiscordRPC$DLL.INSTANCE.Discord_RunCallbacks();
   }

   private static void copyFile(InputStream var0, OutputStream var1) throws IOException {
      byte[] var2 = new byte[4096];

      int var3;
      while(-1 != (var3 = var0.read(var2))) {
         var1.write(var2, 0, var3);
      }

   }

   public static void discordRegister(String var0, String var1) {
      DiscordRPC$DLL.INSTANCE.Discord_Register(var0, var1);
   }
}
