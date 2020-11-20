package skid.gay.sex.spermix.inside.shalopay.j;

import net.minecraft.client.renderer.GlStateManager;

public class d {
   public static int a(String var0) {
      if (var0 == null) {
         return 1;
      } else {
         var0 = var0.toLowerCase().trim();
         if (var0.equals("alpha")) {
            return 0;
         } else if (var0.equals("add")) {
            return 1;
         } else if (var0.equals("subtract")) {
            return 2;
         } else if (var0.equals("multiply")) {
            return 3;
         } else if (var0.equals("dodge")) {
            return 4;
         } else if (var0.equals("burn")) {
            return 5;
         } else if (var0.equals("screen")) {
            return 6;
         } else if (var0.equals("overlay")) {
            return 7;
         } else if (var0.equals("replace")) {
            return 8;
         } else {
            FastAura.b(String.valueOf((new StringBuilder("Unknown blend: ")).append(var0)));
            return 1;
         }
      }
   }

   public static void a(int var0, float var1) {
      switch(var0) {
      case 0:
         GlStateManager.disableAlpha();
         GlStateManager.enableBlend();
         GlStateManager.blendFunc(770, 771);
         GlStateManager.color(1.0F, 1.0F, 1.0F, var1);
         break;
      case 1:
         GlStateManager.disableAlpha();
         GlStateManager.enableBlend();
         GlStateManager.blendFunc(770, 1);
         GlStateManager.color(1.0F, 1.0F, 1.0F, var1);
         break;
      case 2:
         GlStateManager.disableAlpha();
         GlStateManager.enableBlend();
         GlStateManager.blendFunc(775, 0);
         GlStateManager.color(var1, var1, var1, 1.0F);
         break;
      case 3:
         GlStateManager.disableAlpha();
         GlStateManager.enableBlend();
         GlStateManager.blendFunc(774, 771);
         GlStateManager.color(var1, var1, var1, var1);
         break;
      case 4:
         GlStateManager.disableAlpha();
         GlStateManager.enableBlend();
         GlStateManager.blendFunc(1, 1);
         GlStateManager.color(var1, var1, var1, 1.0F);
         break;
      case 5:
         GlStateManager.disableAlpha();
         GlStateManager.enableBlend();
         GlStateManager.blendFunc(0, 769);
         GlStateManager.color(var1, var1, var1, 1.0F);
         break;
      case 6:
         GlStateManager.disableAlpha();
         GlStateManager.enableBlend();
         GlStateManager.blendFunc(1, 769);
         GlStateManager.color(var1, var1, var1, 1.0F);
         break;
      case 7:
         GlStateManager.disableAlpha();
         GlStateManager.enableBlend();
         GlStateManager.blendFunc(774, 768);
         GlStateManager.color(var1, var1, var1, 1.0F);
         break;
      case 8:
         GlStateManager.enableAlpha();
         GlStateManager.disableBlend();
         GlStateManager.color(1.0F, 1.0F, 1.0F, var1);
      }

      GlStateManager.enableTexture2D();
   }

   public static void a(float var0) {
      GlStateManager.disableAlpha();
      GlStateManager.enableBlend();
      GlStateManager.blendFunc(770, 1);
      GlStateManager.color(1.0F, 1.0F, 1.0F, var0);
   }
}
