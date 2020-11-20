package skid.gay.sex.spermix.inside.shalopay.features.SmthLikeHudSettings;

import java.awt.Color;
import net.minecraft.client.gui.Gui;
import skid.gay.sex.spermix.inside.shalopay.features.smthLikeInit.Main;

public class HUD extends skid.gay.sex.spermix.inside.shalopay.b.a {
   public static Color a(double var0, float var2) {
      float var3 = (float)((double)(System.nanoTime() * -5L) + var0) / 1.0E10F % 1.0F;
      long var4 = Long.parseLong(Integer.toHexString(Integer.valueOf(Color.HSBtoRGB(var3, 1.0F, 1.0F))), 16);
      Color var6 = new Color((int)var4);
      return new Color((float)var6.getRed() / 255.0F * var2, (float)var6.getGreen() / 255.0F * var2, (float)var6.getBlue() / 255.0F * var2);
   }

   public void a(int var1, int var2, float var3) {
      Color var4 = skid.gay.sex.spermix.inside.shalopay.d.a.a();
      int var5 = (new Color(var4.getRed(), var4.getGreen(), var4.getBlue(), 200)).getRGB();
      Gui.drawRect(this.e, this.f, this.e + this.g, this.f + this.h, -15066598);
      skid.gay.sex.spermix.inside.shalopay.d.b.a(this.i, this.e + this.g - (double) skid.gay.sex.spermix.inside.shalopay.d.b.a(this.i), this.f + (double)(skid.gay.sex.spermix.inside.shalopay.d.b.b() / 2) - 0.5D, -1);
      Gui.drawRect(this.e + 1.0D, this.f + 2.0D, this.e + 12.0D, this.f + 13.0D, this.c.e() ? var5 : -16777216);
      if (this.b(var1, var2)) {
         if (Main.a.a("Type").c().equalsIgnoreCase("Rainbow")) {
            Gui.drawRect(this.e + 1.0D, this.f + 2.0D, this.e + 12.0D, this.f + 13.0D, a(1.0E7D * this.f, 1.0F).getRGB());
         } else {
            Gui.drawRect(this.e + 1.0D, this.f + 2.0D, this.e + 12.0D, this.f + 13.0D, 1427181841);
         }
      }

   }

   public boolean a(int var1, int var2, int var3) {
      if (var3 == 0 && this.b(var1, var2)) {
         this.c.a(!this.c.e());
         return true;
      } else {
         return super.a(var1, var2, var3);
      }
   }

   public boolean b(int var1, int var2) {
      return (double)var1 >= this.e + 1.0D && (double)var1 <= this.e + 12.0D && (double)var2 >= this.f + 2.0D && (double)var2 <= this.f + 13.0D;
   }

   public HUD(skid.gay.sex.spermix.inside.shalopay.b.b var1, skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode var2) {
      this.b = var1;
      this.c = var2;
      super.a();
   }
}
