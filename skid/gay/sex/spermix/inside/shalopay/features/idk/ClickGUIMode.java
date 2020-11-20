package skid.gay.sex.spermix.inside.shalopay.features.idk;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;
import net.minecraft.client.gui.Gui;

public class ClickGUIMode {
   
   public double e;
   
   public ArrayList j = new ArrayList();
   
   public double d;
   
   private double a;
   
   public boolean h;
   
   public double c;
   
   public boolean g;
   
   private double l;
   
   public String b;
   
   public ClickGUI k;
   
   public boolean i;
   
   public double f;

   public void a(int var1) {
      this.c = (double)var1;
   }

   public void b(int var1) {
      this.d = (double)var1;
   }

   public static Color a(double var0, float var2) {
      float var3 = (float)((double)(System.nanoTime() * -5L) + var0) / 1.0E10F % 1.0F;
      long var4 = Long.parseLong(Integer.toHexString(Integer.valueOf(Color.HSBtoRGB(var3, 1.0F, 1.0F))), 16);
      Color var6 = new Color((int)var4);
      return new Color((float)var6.getRed() / 255.0F * var2, (float)var6.getGreen() / 255.0F * var2, (float)var6.getBlue() / 255.0F * var2);
   }

   public int d() {
      return (int)this.d;
   }

   public void a(boolean var1) {
      this.h = var1;
   }

   public boolean e() {
      return this.h;
   }

   public boolean a(int var1, int var2, int var3) {
      if (!this.i) {
         return false;
      } else if (var3 == 0 && this.a(var1, var2)) {
         this.a = this.c - (double)var1;
         this.l = this.d - (double)var2;
         this.g = true;
         return true;
      } else if (var3 == 1 && this.a(var1, var2)) {
         this.h = !this.h;
         return true;
      } else {
         if (this.h) {
            Iterator var5 = this.j.iterator();

            while(var5.hasNext()) {
               skid.gay.sex.spermix.inside.shalopay.b.b var4 = (skid.gay.sex.spermix.inside.shalopay.b.b)var5.next();
               if (var4.a(var1, var2, var3)) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   public boolean a(int var1, int var2) {
      return (double)var1 >= this.c && (double)var1 <= this.c + this.e && (double)var2 >= this.d && (double)var2 <= this.d + this.f;
   }

   public String c() {
      return this.b;
   }

   public ClickGUIMode(String var1, double var2, double var4, double var6, double var8, boolean var10, ClickGUI var11) {
      this.b = var1;
      this.c = var2;
      this.d = var4;
      this.e = var6;
      this.f = var8;
      this.h = var10;
      this.g = false;
      this.i = true;
      this.k = var11;
      this.a();
   }

   public void a(int var1, int var2, float var3) {
      if (this.i) {
         if (this.g) {
            this.c = this.a + (double)var1;
            this.d = this.l + (double)var2;
         }

         if (skid.gay.sex.spermix.inside.shalopay.discordrpc.AutoArmor.AimBot.a("LineGui").e()) {
            Color var4 = skid.gay.sex.spermix.inside.shalopay.d.a.a().darker();
            int var5 = (new Color(var4.getRed(), var4.getGreen(), var4.getBlue(), 170)).getRGB();
            Gui.drawRect(this.c, this.d, this.c + this.e, this.d + this.f, 84215046);
            if (skid.gay.sex.spermix.inside.shalopay.discordrpc.AutoArmor.AimBot.a("Design").c().equalsIgnoreCase("New")) {
               if (skid.gay.sex.spermix.inside.shalopay.discordrpc.AutoArmor.AimBot.a("Type").c().equalsIgnoreCase("Defaulted")) {
                  Gui.drawRect(this.c - 1.0D, this.d, this.c + this.e + 1.0D, this.d + this.f, -1722789635);
               } else {
                  Gui.drawRect(this.c, this.d, this.c + this.e, this.d + this.f, a(1.0E7D * this.l, 1.0F).getRGB());
               }
            }

            if (skid.gay.sex.spermix.inside.shalopay.discordrpc.AutoArmor.AimBot.a("Design").c().equalsIgnoreCase("New")) {
               if (skid.gay.sex.spermix.inside.shalopay.discordrpc.AutoArmor.AimBot.a("Type").c().equalsIgnoreCase("Defaulted")) {
                  skid.gay.sex.spermix.inside.shalopay.d.b.b(this.b, this.c + 2.0D, this.d + this.f / 2.0D - (double)(skid.gay.sex.spermix.inside.shalopay.d.b.b() / 2), -1052689);
               } else {
                  Gui.drawRect(this.c - 2.0D, this.d, this.c, this.d + this.f, a(1.0E7D * this.l, 1.0F).getRGB());
                  skid.gay.sex.spermix.inside.shalopay.d.b.b(this.b, this.c + 2.0D, this.d + this.f / 2.0D - (double)(skid.gay.sex.spermix.inside.shalopay.d.b.b() / 2), -1052689);
               }
            }

            if (this.h && !this.j.isEmpty()) {
               double var6 = this.d + this.f;
               int var10000;
               if (skid.gay.sex.spermix.inside.shalopay.discordrpc.AutoArmor.AimBot.a("Design").c().equalsIgnoreCase("New")) {
                  var10000 = -14474461;
               } else {
                  var10000 = skid.gay.sex.spermix.inside.shalopay.discordrpc.AutoArmor.AimBot.a("Design").c().equalsIgnoreCase("JellyLike") ? -1156246251 : 0;
               }

               skid.gay.sex.spermix.inside.shalopay.b.b var9;
               for(Iterator var10 = this.j.iterator(); var10.hasNext(); var6 += var9.g + 1.0D) {
                  var9 = (skid.gay.sex.spermix.inside.shalopay.b.b)var10.next();
                  Gui.drawRect(this.c + 86.0D, var6 - 1.0D, this.c + this.e, var6 + var9.g + 1.0D, -1722789635);
                  Gui.drawRect(this.c, var6, this.c - this.e + 84.0D, var6 + var9.g + 1.0D, -1722789635);
                  if (skid.gay.sex.spermix.inside.shalopay.discordrpc.AutoArmor.AimBot.a("Type").c().equalsIgnoreCase("Defaulted")) {
                     Gui.drawRect(this.c, var6, this.c + this.e, var6 + var9.g + 1.0D, -2012213232);
                  } else {
                     Gui.drawRect(this.c - 2.0D, var6, this.c + this.e, var6 + var9.g + 1.0D, -2012213232);
                  }

                  Gui.drawRect(this.c, var6, this.c + this.e, var6 + var9.g + 1.0D, -2012213232);
                  var9.d = this.c + 2.0D;
                  var9.e = var6;
                  var9.f = this.e - 4.0D;
                  var9.a(var1, var2, var3);
               }

               Gui.drawRect(this.c, var6 + 1.0D, this.c + this.e, var6 + 1.0D, -14483531);
               skid.gay.sex.spermix.inside.shalopay.discordrpc.AutoArmor.Criticals.AutoClicker.a("-", (double)((float)this.c + 70.0F), (double)((float)this.d + 5.0F), 16775930);
            } else {
               skid.gay.sex.spermix.inside.shalopay.discordrpc.AutoArmor.Criticals.AutoClicker.a("+", (double)((float)this.c + 70.0F), (double)((float)this.d + 5.0F), 16775930);
            }
         }

      }
   }

   public void b(int var1, int var2, int var3) {
      if (this.i) {
         if (var3 == 0) {
            this.g = false;
         }

      }
   }

   public int b() {
      return (int)this.c;
   }

   public void a() {
   }
}
