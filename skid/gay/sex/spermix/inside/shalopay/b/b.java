package skid.gay.sex.spermix.inside.shalopay.b;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;
import skid.gay.sex.spermix.inside.shalopay.features.idk.n;
import net.a.k;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import skid.gay.sex.spermix.inside.shalopay.features.smthLikeInit.Main;
import skid.gay.sex.spermix.inside.shalopay.features.module.Module;

public class b {
   
   public Module a;
   
   public double d;
   
   public double e;
   
   public boolean h = false;
   
   public double g;
   
   public ArrayList b;
   
   public double f;
   
   public ClickGUIMode c;
   
   public boolean i = false;

   public b(Module var1, ClickGUIMode var2) {
      this.a = var1;
      this.g = (double)(Minecraft.getMinecraft().fontRendererObj.FONT_HEIGHT + 2);
      this.c = var2;
      this.b = new ArrayList();
      if (Main.a.a(var1) != null) {
         Iterator var4 = Main.a.a(var1).iterator();

         while(var4.hasNext()) {
            skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode var3 = (skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode)var4.next();
            if (var3.j()) {
               this.b.add(new skid.gay.sex.spermix.inside.shalopay.features.SmthLikeHudSettings.HUD(this, var3));
            } else if (var3.k()) {
               this.b.add(new skid.gay.sex.spermix.inside.shalopay.features.SmthLikeHudSettings.SmthLikeColorGetter(this, var3));
            } else if (var3.i()) {
               this.b.add(new skid.gay.sex.spermix.inside.shalopay.features.SmthLikeHudSettings.b(this, var3));
            }
         }
      }

   }

   public boolean a(int var1, int var2) {
      return (double)var1 >= this.d && (double)var1 <= this.d + this.f && (double)var2 >= this.e && (double)var2 <= this.e + this.g;
   }

   public boolean a(int var1, int var2, int var3) {
      if (!this.a(var1, var2)) {
         return false;
      } else {
         if (var3 == 0) {
            this.a.d();
            if (Main.a.a("Sound").e()) {
               Minecraft.getMinecraft();
               Minecraft.player.playSound("random.click", 0.5F, 0.5F);
            }
         } else if (var3 == 1) {
            if (this.b != null && this.b.size() > 0) {
               boolean var4 = !this.h;
               Main.i.d();
               this.h = var4;
               if (Main.a.a("Sound").e()) {
                  if (this.h) {
                     Minecraft.getMinecraft();
                     Minecraft.player.playSound("tile.piston.out", 1.0F, 1.0F);
                  } else {
                     Minecraft.getMinecraft();
                     Minecraft.player.playSound("tile.piston.in", 1.0F, 1.0F);
                  }
               }
            }
         } else if (var3 == 2) {
            this.i = true;
         }

         return true;
      }
   }

   public boolean a(char var1, int var2) {
      if (this.i) {
         if (var2 != 1) {
            this.a.a(var2);
            n.a();
         } else {
            this.a.a(0);
            n.a();
         }

         this.i = false;
         return true;
      } else {
         return false;
      }
   }

   public void a(int var1, int var2, float var3) {
      Color var4 = skid.gay.sex.spermix.inside.shalopay.d.a.a();
      int var5 = (new Color(var4.getRed(), var4.getGreen(), var4.getBlue(), 150)).getRGB();
      int var6 = -5263441;
      if (this.a.c()) {
         Gui.drawRect(this.d - 2.0D, this.e, this.d + this.f + 2.0D, this.e + this.g + 1.0D, var5);
         var6 = -1052689;
      }

      if (this.a(var1, var2)) {
         Gui.drawRect(this.d - 2.0D, this.e, this.d + this.f + 2.0D, this.e + this.g + 1.0D, 1427181841);
      }

      skid.gay.sex.spermix.inside.shalopay.d.b.e(this.a.a(), this.d + this.f / 2.0D, this.e + 1.0D + this.g / 2.0D, var6);
   }
}
