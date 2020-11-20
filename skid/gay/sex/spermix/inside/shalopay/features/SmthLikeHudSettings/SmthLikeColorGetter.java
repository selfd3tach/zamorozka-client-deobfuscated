package skid.gay.sex.spermix.inside.shalopay.features.SmthLikeHudSettings;

import java.awt.Color;
import net.minecraft.client.gui.Gui;
import net.minecraft.util.math.MathHelper;
import skid.gay.sex.spermix.inside.shalopay.features.smthLikeInit.Main;

public class SmthLikeColorGetter extends skid.gay.sex.spermix.inside.shalopay.b.a {
   
   public boolean k;

   public void b(int var1, int var2, int var3) {
      this.k = false;
   }

   public boolean b(int var1, int var2) {
      return (double)var1 >= this.e && (double)var1 <= this.e + this.g && (double)var2 >= this.f + 11.0D && (double)var2 <= this.f + 14.0D;
   }

   public static Color a(double var0, float var2) {
      float var3 = (float)((double)(System.nanoTime() * -5L) + var0) / 1.0E10F % 1.0F;
      long var4 = Long.parseLong(Integer.toHexString(Integer.valueOf(Color.HSBtoRGB(var3, 1.0F, 1.0F))), 16);
      Color var6 = new Color((int)var4);
      return new Color((float)var6.getRed() / 255.0F * var2, (float)var6.getGreen() / 255.0F * var2, (float)var6.getBlue() / 255.0F * var2);
   }

   public SmthLikeColorGetter(skid.gay.sex.spermix.inside.shalopay.b.b var1, skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode var2) {
      this.b = var1;
      this.c = var2;
      this.k = false;
      super.a();
   }

   public boolean a(int var1, int var2, int var3) {
      if (var3 == 0 && this.b(var1, var2)) {
         this.k = true;
         return true;
      } else {
         return super.a(var1, var2, var3);
      }
   }

   public void a(int var1, int var2, float var3) {
      String var4 = String.valueOf((new StringBuilder()).append((double)Math.round(this.c.f() * 100.0D) / 100.0D));
      boolean var5 = this.b(var1, var2) || this.k;
      Color var6 = skid.gay.sex.spermix.inside.shalopay.d.a.a();
      int var7 = (new Color(var6.getRed(), var6.getGreen(), var6.getBlue(), var5 ? 250 : 200)).getRGB();
      int var8 = (new Color(var6.getRed(), var6.getGreen(), var6.getBlue(), var5 ? 255 : 230)).getRGB();
      double var9 = (this.c.f() - this.c.g()) / (this.c.h() - this.c.g());
      Gui.drawRect(this.e, this.f, this.e + this.g, this.f + this.h, -15066598);
      skid.gay.sex.spermix.inside.shalopay.d.b.a(this.i, this.e + 1.0D, this.f + 2.0D, -1);
      skid.gay.sex.spermix.inside.shalopay.d.b.a(var4, this.e + this.g - (double) skid.gay.sex.spermix.inside.shalopay.d.b.a(var4), this.f + 2.0D, -1);
      if (Main.a.a("Type").c().equalsIgnoreCase("Rainbow")) {
         Gui.drawRect(this.e, this.f + 12.0D, this.e + this.g, this.f + 13.5D, -15724528);
         Gui.drawRect(this.e, this.f + 12.0D, this.e + var9 * this.g, this.f + 13.5D, a(1.0E7D * this.f, 1.0F).getRGB());
      } else {
         Gui.drawRect(this.e, this.f + 12.0D, this.e + this.g, this.f + 13.5D, -15724528);
         Gui.drawRect(this.e, this.f + 12.0D, this.e + var9 * this.g, this.f + 13.5D, -11513603);
      }

      if (var9 > 0.0D && var9 < 1.0D) {
         Gui.drawRect(this.e + var9 * this.g - 1.0D, this.f + 12.0D, this.e + Math.min(var9 * this.g, this.g), this.f + 13.5D, var8);
      }

      if (this.k) {
         double var11 = this.c.h() - this.c.g();
         double var13 = this.c.g() + MathHelper.clamp_double(((double)var1 - this.e) / this.g, 0.0D, 1.0D) * var11;
         this.c.a(var13);
      }

   }
}
