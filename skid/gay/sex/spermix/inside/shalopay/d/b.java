package skid.gay.sex.spermix.inside.shalopay.d;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.util.StringUtils;

public class b {
   
   private static FontRenderer a;

   public static void a(String var0, double var1, double var3, int var5) {
      a.drawString(var0, var1, var3, var5);
   }

   public static void d(String var0, double var1, double var3, int var5) {
      a(var0, var1 - (double)(a.getStringWidth(var0) / 2), var3 - (double)(a.FONT_HEIGHT / 2), var5);
   }

   public static int b() {
      return a.FONT_HEIGHT;
   }

   public static void e(String var0, double var1, double var3, int var5) {
      b(var0, var1 - (double)(a.getStringWidth(var0) / 2), var3 - (double)((float)a.FONT_HEIGHT / 2.0F), var5);
   }

   public static int a(String var0) {
      return a.getStringWidth(StringUtils.stripControlCodes(var0));
   }

   public static void c(String var0, double var1, double var3, int var5) {
      a(var0, var1 - (double)(a.getStringWidth(var0) / 2), var3, var5);
   }

   public static void a() {
      a = Minecraft.getMinecraft().fontRendererObj;
   }

   public static void b(String var0, double var1, double var3, int var5) {
      a.drawStringWithShadow(var0, (float)var1, (float)var3, var5);
   }
}
