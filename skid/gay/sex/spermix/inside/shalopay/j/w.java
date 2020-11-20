package skid.gay.sex.spermix.inside.shalopay.j;

import java.util.HashMap;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.crash.CrashReport;
import net.minecraft.crash.CrashReportCategory;

public class w {
   private static String b(CrashReport var0) {
      Throwable var1 = var0.getCrashCause();
      if (var1 == null) {
         return "Unknown";
      } else {
         StackTraceElement[] var2 = var1.getStackTrace();
         String var3 = "unknown";
         if (var2.length > 0) {
            var3 = var2[0].toString().trim();
         }

         String var4 = String.valueOf((new StringBuilder(String.valueOf(var1.getClass().getName()))).append(": ").append(var1.getMessage()).append(" (").append(var0.getDescription()).append(") [").append(var3).append("]"));
         return var4;
      }
   }

   public static void a(CrashReport var0, CrashReportCategory var1) {
      try {
         GameSettings var2 = FastAura.aL();
         if (var2 == null) {
            return;
         }

         if (!var2.snooperEnabled) {
            return;
         }

         Throwable var3 = var0.getCrashCause();
         if (var3 == null) {
            return;
         }

         if (var3.getClass() == Throwable.class) {
            return;
         }

         if (var3.getClass().getName().contains(".fml.client.SplashProgress")) {
            return;
         }

         a(var1);
         String var4 = "http://optifine.net/crashReport";
         String var5 = a(var0);
         byte[] var6 = var5.getBytes("ASCII");
         x var7 = new x();
         HashMap var8 = new HashMap();
         var8.put("OF-Version", FastAura.a());
         var8.put("OF-Summary", b(var0));
         ac var9 = new ac(var4, var8, var6, var7);
         var9.setPriority(10);
         var9.start();
         Thread.sleep(1000L);
      } catch (Exception var10) {
         FastAura.a(String.valueOf((new StringBuilder(String.valueOf(var10.getClass().getName()))).append(": ").append(var10.getMessage())));
      }

   }

   public static void a(CrashReportCategory var0) {
      var0.addCrashSection("OptiFine Version", FastAura.a());
      if (FastAura.aL() != null) {
         var0.addCrashSection("Render Distance Chunks", String.valueOf((new StringBuilder()).append(FastAura.aT())));
         var0.addCrashSection("Mipmaps", String.valueOf((new StringBuilder()).append(FastAura.n())));
         var0.addCrashSection("Anisotropic Filtering", String.valueOf((new StringBuilder()).append(FastAura.al())));
         var0.addCrashSection("Antialiasing", String.valueOf((new StringBuilder()).append(FastAura.an())));
         var0.addCrashSection("Multitexture", String.valueOf((new StringBuilder()).append(FastAura.aq())));
      }

      var0.addCrashSection("Shaders", String.valueOf((new StringBuilder()).append(skid.gay.sex.spermix.inside.shalopay.k.V.am())));
      var0.addCrashSection("OpenGlVersion", String.valueOf((new StringBuilder()).append(FastAura.ClickGUI)));
      var0.addCrashSection("OpenGlRenderer", String.valueOf((new StringBuilder()).append(FastAura.Bind)));
      var0.addCrashSection("OpenGlVendor", String.valueOf((new StringBuilder()).append(FastAura.SmthLikeColorGetter)));
      var0.addCrashSection("CpuCount", String.valueOf((new StringBuilder()).append(FastAura.aN())));
   }

   private static String a(CrashReport var0) {
      StringBuffer var1 = new StringBuffer();
      var1.append(String.valueOf((new StringBuilder("OptiFineVersion: ")).append(FastAura.a()).append("\n")));
      var1.append(String.valueOf((new StringBuilder("Summary: ")).append(b(var0)).append("\n")));
      var1.append("\n");
      var1.append(var0.getCompleteReport());
      var1.append("\n");
      return var1.toString();
   }
}
