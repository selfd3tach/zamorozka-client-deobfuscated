package skid.gay.sex.spermix.inside.shalopay.features.SmthLikeHudSettings;

import java.awt.Color;
import java.util.Iterator;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import skid.gay.sex.spermix.inside.shalopay.features.smthLikeInit.Main;

public class b extends skid.gay.sex.spermix.inside.shalopay.b.a {
   public void a(int var1, int var2, float var3) {
      Color var4 = skid.gay.sex.spermix.inside.shalopay.d.a.a();
      int var5 = (new Color(var4.getRed(), var4.getGreen(), var4.getBlue(), 150)).getRGB();
      Gui.drawRect(this.e, this.f, this.e + this.g, this.f + this.h, -15066598);
      skid.gay.sex.spermix.inside.shalopay.d.b.d(this.i, this.e + this.g / 2.0D, this.f + 7.0D, -1);
      int var6 = var5;
      int var7 = var4.getRGB();
      Gui.drawRect(this.e, this.f + 14.0D, this.e + this.g, this.f + 15.0D, -1);
      if (this.j) {
         Gui.drawRect(this.e, this.f + 15.0D, this.e + this.g, this.f + this.h, -1441656302);
         double var8 = this.f + 15.0D;

         for(Iterator var11 = this.c.d().iterator(); var11.hasNext(); var8 += (double)(skid.gay.sex.spermix.inside.shalopay.d.b.b() + 2)) {
            String var10 = (String)var11.next();
            String var12 = String.valueOf((new StringBuilder(String.valueOf(var10.substring(0, 1).toUpperCase()))).append(var10.substring(1, var10.length())));
            skid.gay.sex.spermix.inside.shalopay.d.b.c(var12, this.e + this.g / 2.0D, var8 + 2.0D, -1);
            if (var10.equalsIgnoreCase(this.c.c())) {
               Gui.drawRect(this.e, var8, this.e + 1.5D, var8 + (double) skid.gay.sex.spermix.inside.shalopay.d.b.b() + 2.0D, var6);
            }

            if ((double)var1 >= this.e && (double)var1 <= this.e + this.g && (double)var2 >= var8 && (double)var2 < var8 + (double) skid.gay.sex.spermix.inside.shalopay.d.b.b() + 2.0D) {
               Gui.drawRect(this.e + this.g - 1.2D, var8, this.e + this.g, var8 + (double) skid.gay.sex.spermix.inside.shalopay.d.b.b() + 2.0D, var7);
            }
         }
      }

   }

   public boolean a(int var1, int var2, int var3) {
      if (var3 == 0) {
         if (this.b(var1, var2)) {
            this.j = !this.j;
            return true;
         }

         if (!this.j) {
            return false;
         }

         double var4 = this.f + 15.0D;

         for(Iterator var7 = this.c.d().iterator(); var7.hasNext(); var4 += (double)(skid.gay.sex.spermix.inside.shalopay.d.b.b() + 2)) {
            String var6 = (String)var7.next();
            if ((double)var1 >= this.e && (double)var1 <= this.e + this.g && (double)var2 >= var4 && (double)var2 <= var4 + (double) skid.gay.sex.spermix.inside.shalopay.d.b.b() + 2.0D) {
               if (Main.a.a("Sound").e()) {
                  Minecraft.getMinecraft();
                  Minecraft.player.playSound("tile.piston.in", 20.0F, 20.0F);
               }

               if (this.a != null && this.a.c != null) {
                  this.a.c.a(this.c.a()).a(var6.toLowerCase());
               }

               return true;
            }
         }
      }

      return super.a(var1, var2, var3);
   }

   public boolean b(int var1, int var2) {
      return (double)var1 >= this.e && (double)var1 <= this.e + this.g && (double)var2 >= this.f && (double)var2 <= this.f + 15.0D;
   }

   public b(skid.gay.sex.spermix.inside.shalopay.b.b var1, skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode var2) {
      this.b = var1;
      this.c = var2;
      super.a();
   }
}
