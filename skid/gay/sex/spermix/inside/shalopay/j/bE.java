package skid.gay.sex.spermix.inside.shalopay.j;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiVideoSettings;
import net.minecraft.client.settings.GameSettings$Options;

public class bE {
   
   private int b = 0;
   
   private int c = 0;
   
   private GuiScreen a = null;
   
   private long d = 0L;

   private static String[] a(String var0) {
      ArrayList var1 = new ArrayList();

      for(int var2 = 0; var2 < 10; ++var2) {
         String var3 = String.valueOf((new StringBuilder(String.valueOf(var0))).append(".tooltip.").append(var2 + 1));
         String var4 = aH.a((String)var3, (String)null);
         if (var4 == null) {
            break;
         }

         var1.add(var4);
      }

      if (var1.size() <= 0) {
         return null;
      } else {
         String[] var5 = (String[])var1.toArray(new String[var1.size()]);
         return var5;
      }
   }

   public void a(int var1, int var2, List var3) {
      if (Math.abs(var1 - this.b) <= 5 && Math.abs(var2 - this.c) <= 5) {
         short var4 = 700;
         if (System.currentTimeMillis() >= this.d + (long)var4) {
            int var5 = GuiScreen.width / 2 - 150;
            int var6 = GuiScreen.height / 6 - 7;
            if (var2 <= var6 + 98) {
               var6 += 105;
            }

            int var7 = var5 + 150 + 150;
            int var8 = var6 + 84 + 10;
            GuiButton var9 = this.b(var1, var2, var3);
            if (var9 instanceof aC) {
               aC var10 = (aC)var9;
               GameSettings$Options var11 = var10.a();
               String[] var12 = a(var11);
               if (var12 == null) {
                  return;
               }

               GuiVideoSettings.drawRect((double)var5, (double)var6, (double)var7, (double)var8, -536870912);

               for(int var13 = 0; var13 < var12.length; ++var13) {
                  String var14 = var12[var13];
                  int var15 = 14540253;
                  if (var14.endsWith("!")) {
                     var15 = 16719904;
                  }

                  FontRenderer var16 = Minecraft.getMinecraft().fontRendererObj;
                  var16.drawStringWithShadow(var14, (float)(var5 + 5), (float)(var6 + 5 + var13 * 11), var15);
               }
            }
         }
      } else {
         this.b = var1;
         this.c = var2;
         this.d = System.currentTimeMillis();
      }

   }

   public bE(GuiScreen var1) {
      this.a = var1;
   }

   private GuiButton b(int var1, int var2, List var3) {
      for(int var4 = 0; var4 < var3.size(); ++var4) {
         GuiButton var5 = (GuiButton)var3.get(var4);
         int var6 = GuiVideoSettings.getButtonWidth(var5);
         int var7 = GuiVideoSettings.getButtonHeight(var5);
         boolean var8 = var1 >= var5.xPosition && var2 >= var5.yPosition && var1 < var5.xPosition + var6 && var2 < var5.yPosition + var7;
         if (var8) {
            return var5;
         }
      }

      return null;
   }

   private static String[] a(GameSettings$Options var0) {
      return a(var0.getEnumString());
   }
}
