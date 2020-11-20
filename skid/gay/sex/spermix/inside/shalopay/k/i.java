package skid.gay.sex.spermix.inside.shalopay.k;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.util.Iterator;
import skid.gay.sex.spermix.inside.shalopay.j.aH;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.settings.GameSettings;
import org.lwjgl.Sys;

public class i extends GuiScreen {
   
   private static String[] i = new String[]{"0.5x", "1x", "2x"};
   
   protected GuiScreen a;
   
   private int c = -1;
   
   protected String b = "Shaders";
   
   private static float[] h = new float[]{0.0625F, 0.125F, 0.25F};
   
   private static float[] f = new float[]{0.5F, 0.70710677F, 1.0F, 1.4142135F, 2.0F};
   
   private static String[] g = new String[]{"0.5x", "0.7x", "1x", "1.5x", "2x"};
   
   private static int[] j;
   
   private boolean e = false;
   
   private ClickGUIMode d;

   public static String a(boolean var0) {
      String var1 = aH.b();
      String var2 = aH.c();
      return var0 ? var1 : var2;
   }

   public i(GuiScreen var1, GameSettings var2) {
      this.a = var1;
   }

   public static int a(float var0, float[] var1) {
      for(int var2 = 0; var2 < var1.length; ++var2) {
         float var3 = var1[var2];
         if (var3 >= var0) {
            return var2;
         }
      }

      return var1.length - 1;
   }

   public void a() {
      boolean var1 = skid.gay.sex.spermix.inside.shalopay.RadioShanson.FastAura.aK();
      Iterator var3 = this.buttonList.iterator();

      while(var3.hasNext()) {
         GuiButton var2 = (GuiButton)var3.next();
         if (var2.id != 201 && var2.id != 202 && var2.id != skid.gay.sex.spermix.inside.shalopay.ClickGUIMode.WhatIsTheHell.ClickGUI.ordinal()) {
            var2.enabled = var1;
         }
      }

   }

   public static String b(float var0) {
      return a(var0, h, i);
   }

   public static String a(float var0, float[] var1, String[] var2) {
      int var3 = a(var0, var1);
      return var2[var3];
   }

   public void initGui() {
      this.b = I18n.format("of.options.shadersTitle");
      if (V.bq == null) {
         V.a();
      }

      byte var1 = 120;
      byte var2 = 20;
      int var3 = width - var1 - 10;
      byte var4 = 30;
      byte var5 = 20;
      int var6 = width - var1 - 20;
      this.d = new ClickGUIMode(this, var6, height, var4, height - 50, 16);
      this.d.registerScrollButtons(7, 8);
      this.buttonList.add(new AutoTotem(skid.gay.sex.spermix.inside.shalopay.ClickGUIMode.WhatIsTheHell.ClickGUI, var3, 0 * var5 + var4, var1, var2));
      this.buttonList.add(new AutoTotem(skid.gay.sex.spermix.inside.shalopay.ClickGUIMode.WhatIsTheHell.Bind, var3, 1 * var5 + var4, var1, var2));
      this.buttonList.add(new AutoTotem(skid.gay.sex.spermix.inside.shalopay.ClickGUIMode.WhatIsTheHell.SmthLikeColorGetter, var3, 2 * var5 + var4, var1, var2));
      this.buttonList.add(new AutoTotem(skid.gay.sex.spermix.inside.shalopay.ClickGUIMode.WhatIsTheHell.TargetHUD, var3, 3 * var5 + var4, var1, var2));
      this.buttonList.add(new AutoTotem(skid.gay.sex.spermix.inside.shalopay.ClickGUIMode.WhatIsTheHell.ClientLoginGUI, var3, 4 * var5 + var4, var1, var2));
      this.buttonList.add(new AutoTotem(skid.gay.sex.spermix.inside.shalopay.ClickGUIMode.WhatIsTheHell.AutoTotem, var3, 5 * var5 + var4, var1, var2));
      this.buttonList.add(new AutoTotem(skid.gay.sex.spermix.inside.shalopay.ClickGUIMode.WhatIsTheHell.ClientLoginThread, var3, 6 * var5 + var4, var1, var2));
      this.buttonList.add(new AutoTotem(skid.gay.sex.spermix.inside.shalopay.ClickGUIMode.WhatIsTheHell.CustomMainMenu, var3, 7 * var5 + var4, var1, var2));
      int var7 = Math.min(150, var6 / 2 - 10);
      this.buttonList.add(new GuiButton(201, var6 / 4 - var7 / 2, height - 25, var7, var2, aH.a("of.options.shaders.shadersFolder")));
      this.buttonList.add(new GuiButton(202, var6 / 4 * 3 - var7 / 2, height - 25, var7, var2, I18n.format("gui.done")));
      this.buttonList.add(new GuiButton(203, var3, height - 25, var1, var2, aH.a("of.options.shaders.shaderOptions")));
      this.a();
   }

   public static String a(int var0) {
      if (var0 == 2) {
         return "FXAA 2x";
      } else {
         return var0 == 4 ? "FXAA 4x" : aH.c();
      }
   }

   public void handleMouseInput() {
      super.handleMouseInput();
      this.d.handleMouseInput();
   }

   public static String a(float var0) {
      return a(var0, f, g);
   }

   public void onGuiClosed() {
      super.onGuiClosed();
      if (!this.e) {
         V.b();
      }

   }

   public void updateScreen() {
      super.updateScreen();
      --this.c;
   }

   public static int c() {
      String var0 = System.getProperty("os.name").toLowerCase();
      if (var0.contains("win")) {
         return 1;
      } else if (var0.contains("mac")) {
         return 2;
      } else if (var0.contains("solaris")) {
         return 3;
      } else if (var0.contains("sunos")) {
         return 3;
      } else if (var0.contains("linux")) {
         return 4;
      } else {
         return var0.contains("unix") ? 4 : 0;
      }
   }

   public Minecraft b() {
      return this.mc;
   }

   // $FF: synthetic method
   static int[] d() {
      int[] var10000 = j;
      if (var10000 != null) {
         return var10000;
      } else {
         int[] var0 = new int[skid.gay.sex.spermix.inside.shalopay.ClickGUIMode.WhatIsTheHell.d().length];

         try {
            var0[skid.gay.sex.spermix.inside.shalopay.ClickGUIMode.WhatIsTheHell.ClickGUI.ordinal()] = 1;
         } catch (NoSuchFieldError var18) {
         }

         try {
            var0[skid.gay.sex.spermix.inside.shalopay.ClickGUIMode.WhatIsTheHell.BowAimBot.ordinal()] = 7;
         } catch (NoSuchFieldError var17) {
         }

         try {
            var0[skid.gay.sex.spermix.inside.shalopay.ClickGUIMode.WhatIsTheHell.AutoTotem.ordinal()] = 6;
         } catch (NoSuchFieldError var16) {
         }

         try {
            var0[skid.gay.sex.spermix.inside.shalopay.ClickGUIMode.WhatIsTheHell.Bind.ordinal()] = 2;
         } catch (NoSuchFieldError var15) {
         }

         try {
            var0[skid.gay.sex.spermix.inside.shalopay.ClickGUIMode.WhatIsTheHell.ClientLoginThread.ordinal()] = 8;
         } catch (NoSuchFieldError var14) {
         }

         try {
            var0[skid.gay.sex.spermix.inside.shalopay.ClickGUIMode.WhatIsTheHell.CustomMainMenu.ordinal()] = 9;
         } catch (NoSuchFieldError var13) {
         }

         try {
            var0[skid.gay.sex.spermix.inside.shalopay.ClickGUIMode.WhatIsTheHell.TargetHUD.ordinal()] = 4;
         } catch (NoSuchFieldError var12) {
         }

         try {
            var0[skid.gay.sex.spermix.inside.shalopay.ClickGUIMode.WhatIsTheHell.RadioShanson.ordinal()] = 10;
         } catch (NoSuchFieldError var11) {
         }

         try {
            var0[skid.gay.sex.spermix.inside.shalopay.ClickGUIMode.WhatIsTheHell.CommandManager.ordinal()] = 12;
         } catch (NoSuchFieldError var10) {
         }

         try {
            var0[skid.gay.sex.spermix.inside.shalopay.ClickGUIMode.WhatIsTheHell.ClientLoginGUI.ordinal()] = 5;
         } catch (NoSuchFieldError var9) {
         }

         try {
            var0[skid.gay.sex.spermix.inside.shalopay.ClickGUIMode.WhatIsTheHell.SmthLikeColorGetter.ordinal()] = 3;
         } catch (NoSuchFieldError var8) {
         }

         try {
            var0[skid.gay.sex.spermix.inside.shalopay.ClickGUIMode.WhatIsTheHell.NameLoader.ordinal()] = 16;
         } catch (NoSuchFieldError var7) {
         }

         try {
            var0[skid.gay.sex.spermix.inside.shalopay.ClickGUIMode.WhatIsTheHell.FastAura.ordinal()] = 17;
         } catch (NoSuchFieldError var6) {
         }

         try {
            var0[skid.gay.sex.spermix.inside.shalopay.ClickGUIMode.WhatIsTheHell.ArrayList.ordinal()] = 18;
         } catch (NoSuchFieldError var5) {
         }

         try {
            var0[skid.gay.sex.spermix.inside.shalopay.ClickGUIMode.WhatIsTheHell.RotationUtils.ordinal()] = 13;
         } catch (NoSuchFieldError var4) {
         }

         try {
            var0[skid.gay.sex.spermix.inside.shalopay.ClickGUIMode.WhatIsTheHell.MobAura.ordinal()] = 14;
         } catch (NoSuchFieldError var3) {
         }

         try {
            var0[skid.gay.sex.spermix.inside.shalopay.ClickGUIMode.WhatIsTheHell.FontUtils.ordinal()] = 15;
         } catch (NoSuchFieldError var2) {
         }

         try {
            var0[skid.gay.sex.spermix.inside.shalopay.ClickGUIMode.WhatIsTheHell.JetAura.ordinal()] = 11;
         } catch (NoSuchFieldError var1) {
         }

         j = var0;
         return var0;
      }
   }

   public void a(String var1, int var2, int var3, int var4) {
      this.drawCenteredString(fontRendererObj, var1, var2, var3, var4);
   }

   protected void actionPerformed(GuiButton var1) {
      if (var1.enabled) {
         if (var1 instanceof AutoTotem) {
            AutoTotem var2 = (AutoTotem)var1;
            switch(d()[var2.a().ordinal()]) {
            case 1:
               V.an();
               V.s();
               break;
            case 2:
               V.bK = !V.bK;
               V.s();
               this.mc.scheduleResourcesRefresh();
               break;
            case 3:
               V.bL = !V.bL;
               V.s();
               this.mc.scheduleResourcesRefresh();
               break;
            case 4:
               float var3 = V.bB;
               float[] var4 = f;
               String[] var5 = g;
               int var6 = a(var3, var4);
               if (isShiftKeyDown()) {
                  --var6;
                  if (var6 < 0) {
                     var6 = var4.length - 1;
                  }
               } else {
                  ++var6;
                  if (var6 >= var4.length) {
                     var6 = 0;
                  }
               }

               V.bB = var4[var6];
               V.s();
               V.t();
               break;
            case 5:
               float var7 = V.bC;
               float[] var8 = f;
               String[] var9 = g;
               int var10 = a(var7, var8);
               if (isShiftKeyDown()) {
                  --var10;
                  if (var10 < 0) {
                     var10 = var8.length - 1;
                  }
               } else {
                  ++var10;
                  if (var10 >= var8.length) {
                     var10 = 0;
                  }
               }

               V.bC = var8[var10];
               V.s();
               V.u();
               break;
            case 6:
               float var11 = V.bA;
               float[] var12 = h;
               String[] var13 = i;
               int var14 = a(var11, var12);
               if (isShiftKeyDown()) {
                  --var14;
                  if (var14 < 0) {
                     var14 = var12.length - 1;
                  }
               } else {
                  ++var14;
                  if (var14 >= var12.length) {
                     var14 = 0;
                  }
               }

               V.bA = var12[var14];
               V.s();
               break;
            case 7:
               V.bz = !V.bz;
               break;
            case 8:
               V.bN.a();
               V.s();
               break;
            case 9:
               V.bM.a();
               V.g();
               V.s();
               this.mc.scheduleResourcesRefresh();
            case 10:
            case 14:
            case 15:
            case 16:
            default:
               break;
            case 11:
               V.by = !V.by;
               break;
            case 12:
               V.bJ = !V.bJ;
               var1.displayString = String.valueOf((new StringBuilder("ShadowClipFrustrum: ")).append(a(V.bJ)));
               X.b();
               break;
            case 13:
               V.bD = (V.bD + 1) % 3;
               V.bE = V.bF = V.bD;
               var1.displayString = String.valueOf((new StringBuilder("Tex Min: ")).append(V.bP[V.bD]));
               X.b();
               break;
            case 17:
               V.bH = (V.bH + 1) % 2;
               var1.displayString = String.valueOf((new StringBuilder("Tex_n Mag: ")).append(V.bQ[V.bH]));
               X.b();
               break;
            case 18:
               V.bI = (V.bI + 1) % 2;
               var1.displayString = String.valueOf((new StringBuilder("Tex_s Mag: ")).append(V.bQ[V.bI]));
               X.b();
            }

            var2.b();
         } else {
            switch(var1.id) {
            case 201:
               switch(c()) {
               case 1:
                  String var18 = String.format("cmd.exe /C start \"Open file\" \"%s\"", V.cb.getAbsolutePath());

                  try {
                     Runtime.getRuntime().exec(var18);
                     return;
                  } catch (IOException var17) {
                     var17.printStackTrace();
                     break;
                  }
               case 2:
                  try {
                     Runtime.getRuntime().exec(new String[]{"/usr/bin/open", V.cb.getAbsolutePath()});
                     return;
                  } catch (IOException var16) {
                     var16.printStackTrace();
                  }
               }

               boolean var19 = false;

               try {
                  Class var21 = Class.forName("java.awt.Desktop");
                  Object var22 = var21.getMethod("getDesktop").invoke((Object)null);
                  var21.getMethod("browse", URI.class).invoke(var22, (new File(this.mc.mcDataDir, V.bY)).toURI());
               } catch (Throwable var15) {
                  var15.printStackTrace();
                  var19 = true;
               }

               if (var19) {
                  skid.gay.sex.spermix.inside.shalopay.RadioShanson.FastAura.a("Opening via system class!");
                  Sys.openURL(String.valueOf((new StringBuilder("file://")).append(V.cb.getAbsolutePath())));
               }
               break;
            case 202:
               new File(V.ca, "current.cfg");
               V.b();
               this.e = true;
               this.mc.displayGuiScreen(this.a);
               break;
            case 203:
               ClientLoginThread var20 = new ClientLoginThread(this, skid.gay.sex.spermix.inside.shalopay.RadioShanson.FastAura.aL());
               skid.gay.sex.spermix.inside.shalopay.RadioShanson.FastAura.R().displayGuiScreen(var20);
               break;
            default:
               this.d.actionPerformed(var1);
            }
         }
      }

   }

   public void drawScreen(int var1, int var2, float var3) {
      this.drawDefaultBackground();
      this.d.drawScreen(var1, var2, var3);
      if (this.c <= 0) {
         this.d.a();
         this.c += 20;
      }

      this.drawCenteredString(fontRendererObj, String.valueOf((new StringBuilder(String.valueOf(this.b))).append(" ")), width / 2, 15, 16777215);
      String var4 = String.valueOf((new StringBuilder("OpenGL: ")).append(V.f).append(", ").append(V.g).append(", ").append(V.h));
      int var5 = fontRendererObj.getStringWidth(var4);
      if (var5 < width - 5) {
         this.drawCenteredString(fontRendererObj, var4, width / 2, height - 40, 8421504);
      } else {
         drawString(fontRendererObj, var4, 5, height - 40, 8421504);
      }

      super.drawScreen(var1, var2, var3);
   }
}
