package skid.gay.sex.spermix.inside.shalopay.features.idk;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.input.Keyboard;
import skid.gay.sex.spermix.inside.shalopay.features.module.ModuleCategory;

public class ClickGUI extends GuiScreen {
   
   int d;
   
   public skid.gay.sex.spermix.inside.shalopay.features.helpers.Bind c;
   
   public static ArrayList b;
   
   private skid.gay.sex.spermix.inside.shalopay.b.b e = null;
   
   public static ArrayList a;

   public void c() {
      File var1 = new File(String.valueOf((new StringBuilder()).append(this.mc.mcDataDir).append(File.separator).append("Zamorozka")), "clickgui");

      try {
         PrintWriter var2 = new PrintWriter(new FileWriter(var1));
         Iterator var3 = this.a().iterator();

         while(var3.hasNext()) {
            ClickGUIMode var4 = (ClickGUIMode)var3.next();
            String var5 = var4.c();
            Boolean var6 = var4.e();
            int var7 = var4.b();
            int var8 = var4.d();
            String var9 = String.valueOf((new StringBuilder(String.valueOf(var5))).append(":").append(var6).append(":").append(var7).append(":").append(var8));
            var2.println(var9);
         }

         var2.close();
      } catch (Exception var10) {
      }

   }

   public void mouseReleased(int var1, int var2, int var3) {
      if (this.e == null) {
         Iterator var5 = b.iterator();

         label57:
         while(true) {
            ClickGUIMode var4;
            do {
               do {
                  do {
                     if (!var5.hasNext()) {
                        var5 = b.iterator();

                        while(var5.hasNext()) {
                           var4 = (ClickGUIMode)var5.next();
                           var4.b(var1, var2, var3);
                        }

                        super.mouseReleased(var1, var2, var3);
                        return;
                     }

                     var4 = (ClickGUIMode)var5.next();
                  } while(!var4.h);
               } while(!var4.i);
            } while(var4.j == null);

            Iterator var7 = var4.j.iterator();

            while(true) {
               skid.gay.sex.spermix.inside.shalopay.b.b var6;
               do {
                  if (!var7.hasNext()) {
                     continue label57;
                  }

                  var6 = (skid.gay.sex.spermix.inside.shalopay.b.b)var7.next();
               } while(!var6.h);

               Iterator var9 = var6.b.iterator();

               while(var9.hasNext()) {
                  skid.gay.sex.spermix.inside.shalopay.b.a var8 = (skid.gay.sex.spermix.inside.shalopay.b.a)var9.next();
                  var8.b(var1, var2, var3);
               }
            }
         }
      }
   }

   public void drawScreen(int var1, int var2, float var3) {
      Iterator var5 = a.iterator();

      ClickGUIMode var4;
      while(var5.hasNext()) {
         var4 = (ClickGUIMode)var5.next();
         var4.a(var1, var2, var3);
      }

      this.e = null;
      var5 = a.iterator();

      skid.gay.sex.spermix.inside.shalopay.b.b var6;
      Iterator var7;
      label113:
      while(var5.hasNext()) {
         var4 = (ClickGUIMode)var5.next();
         if (var4 != null && var4.i && var4.h && var4.j != null && var4.j.size() > 0) {
            var7 = var4.j.iterator();

            while(var7.hasNext()) {
               var6 = (skid.gay.sex.spermix.inside.shalopay.b.b)var7.next();
               if (var6.i) {
                  this.e = var6;
                  break label113;
               }
            }
         }
      }

      var5 = a.iterator();

      label93:
      while(true) {
         do {
            do {
               do {
                  if (!var5.hasNext()) {
                     ScaledResolution var15 = new ScaledResolution(this.mc);
                     if (this.e != null) {
                        drawRect((double)(var15.getScaledWidth() * 4), (double)(var15.getScaledHeight() * 4), (double)var15.getScaledWidth() * 1.45D, (double)var15.getScaledHeight() * 1.6D, -2012213232);
                        skid.gay.sex.spermix.inside.shalopay.d.b.e("", 0.0D, -10.0D, -1);
                        Gui.drawRect((double)var15.getScaledWidth(), (double)var15.getScaledHeight() / 1.22D, (double)(var15.getScaledWidth() - 190), (double)(var15.getScaledWidth() - 50), -2012213232);
                        skid.gay.sex.spermix.inside.shalopay.discordrpc.AutoArmor.Criticals.AimBot.a(this.e.a.a(), (double)var15.getScaledWidth() / 1.37D, (double)var15.getScaledHeight() / 1.21D, -9839430);
                        skid.gay.sex.spermix.inside.shalopay.discordrpc.AutoArmor.Criticals.AimBot.a(this.e.a.l() > -1 ? String.valueOf((new StringBuilder(" ")).append(Keyboard.getKeyName(this.e.a.l()))) : "", (double)var15.getScaledWidth() / 1.19D, (double)var15.getScaledHeight() / 1.15D, 16775930);
                        skid.gay.sex.spermix.inside.shalopay.d.b.e(String.valueOf((new StringBuilder("В«ESCВ», С‡С‚РѕР±С‹ СѓР±СЂР°С‚СЊ Р±РёРЅРґ ")).append(this.e.a.a()).append(this.e.a.l() > -1 ? String.valueOf((new StringBuilder(" (")).append(Keyboard.getKeyName(this.e.a.l())).append(") вќ„")) : "")), (double)var15.getScaledWidth() / 1.18D, (double)var15.getScaledHeight() / 1.03D, -9839430);
                        skid.gay.sex.spermix.inside.shalopay.d.b.e("", 0.0D, 20.0D, -1);
                     }

                     super.drawScreen(var1, var2, var3);
                     return;
                  }

                  var4 = (ClickGUIMode)var5.next();
               } while(!var4.h);
            } while(!var4.i);
         } while(var4.j == null);

         var7 = var4.j.iterator();

         while(true) {
            do {
               do {
                  do {
                     if (!var7.hasNext()) {
                        continue label93;
                     }

                     var6 = (skid.gay.sex.spermix.inside.shalopay.b.b)var7.next();
                  } while(!var6.h);
               } while(var6.b == null);
            } while(var6.b.isEmpty());

            double var8 = 0.0D;
            Color var10 = skid.gay.sex.spermix.inside.shalopay.d.a.a().darker();
            int var11 = (new Color(var10.getRed(), var10.getGreen(), var10.getBlue(), 170)).getRGB();
            byte var12 = 0;

            skid.gay.sex.spermix.inside.shalopay.b.a var13;
            for(Iterator var14 = var6.b.iterator(); var14.hasNext(); var8 += var13.h) {
               var13 = (skid.gay.sex.spermix.inside.shalopay.b.a)var14.next();
               ++this.d;
               var13.d = var8;
               var13.b();
               if (skid.gay.sex.spermix.inside.shalopay.discordrpc.AutoArmor.AimBot.a("Design").c().equalsIgnoreCase("New")) {
                  if (skid.gay.sex.spermix.inside.shalopay.discordrpc.AutoArmor.AimBot.a("Type").c().equalsIgnoreCase("Defaulted")) {
                     Gui.drawRect(var13.e, var13.f, var13.e + var13.g + 2.0D, var13.f + var13.h, var11);
                  } else {
                     if (this.d > 1) {
                        Gui.drawRect(var13.e, var13.f, var13.e + var13.g + 2.0D, var13.f + var13.h, a(1L * (long)var12, 1.0F).getRGB());
                     }

                     this.d = 4;
                  }
               }

               var13.a(var1, var2, var3);
            }
         }
      }
   }

   public ClickGUI() {
      this.c = skid.gay.sex.spermix.inside.shalopay.discordrpc.AutoArmor.AimBot;
      skid.gay.sex.spermix.inside.shalopay.d.b.a();
      a = new ArrayList();
      double var1 = 85.0D;
      double var3 = 18.0D;
      double var5 = 10.0D;
      double var7 = 10.0D;
      double var9 = var3 + 10.0D;
      if (skid.gay.sex.spermix.inside.shalopay.discordrpc.AutoArmor.AimBot.a("LineGui").e()) {
         skid.gay.sex.spermix.inside.shalopay.discordrpc.AutoArmor.AimBot.a("NewGui").a(false);
         ModuleCategory[] var14;
         int var13 = (var14 = ModuleCategory.a()).length;

         for(int var12 = 0; var12 < var13; ++var12) {
            ModuleCategory var11 = var14[var12];
            String var15;
            if (var11.name() == ModuleCategory.COMBAT.name()) {
               var15 = String.valueOf((new StringBuilder("В§lвљ”В§f ")).append(Character.toUpperCase(var11.name().toLowerCase().charAt(0))).append(var11.name().toLowerCase().substring(1)));
               a.add(new Bind(this, var15, var5, var7, var1, var3, false, this, var11));
            } else if (var11.name() == ModuleCategory.b.name()) {
               var15 = String.valueOf((new StringBuilder("В§lв�ЃВ§f ")).append(Character.toUpperCase(var11.name().toLowerCase().charAt(0))).append(var11.name().toLowerCase().substring(1)));
               a.add(new SmthLikeColorGetter(this, var15, var5, var7, var1, var3, false, this, var11));
            } else if (var11.name() == ModuleCategory.PLAYER.name()) {
               var15 = String.valueOf((new StringBuilder("В§lвћіВ§f ")).append(Character.toUpperCase(var11.name().toLowerCase().charAt(0))).append(var11.name().toLowerCase().substring(1)));
               a.add(new TargetHUD(this, var15, var5, var7, var1, var3, false, this, var11));
            } else if (var11.name() == ModuleCategory.RENDER2.name()) {
               var15 = String.valueOf((new StringBuilder("В§lвЃњВ§f ")).append(Character.toUpperCase(var11.name().toLowerCase().charAt(0))).append(var11.name().toLowerCase().substring(1)));
               a.add(new WhatIsTheHell(this, var15, var5, var7, var1, var3, false, this, var11));
            } else if (var11.name() == ModuleCategory.PLAYER2.name()) {
               var15 = String.valueOf((new StringBuilder("В§lвњЎ\u200d ")).append(Character.toUpperCase(var11.name().toLowerCase().charAt(0))).append(var11.name().toLowerCase().substring(1)));
               a.add(new AutoTotem(this, var15, var5, var7, var1, var3, false, this, var11));
            } else if (var11.name() == ModuleCategory.MOVEMENT.name()) {
               var15 = String.valueOf((new StringBuilder("В§lв�ў\u200d ")).append(Character.toUpperCase(var11.name().toLowerCase().charAt(0))).append(var11.name().toLowerCase().substring(1)));
               a.add(new BowAimBot(this, var15, var5, var7, var1, var3, false, this, var11));
            } else if (var11.name() == ModuleCategory.RENDER.name()) {
               var15 = String.valueOf((new StringBuilder("В§lвљ±В§f ")).append(Character.toUpperCase(var11.name().toLowerCase().charAt(0))).append(var11.name().toLowerCase().substring(1)));
               a.add(new ClientLoginThread(this, var15, var5, var7, var1, var3, false, this, var11));
            } else if (var11.name() == ModuleCategory.OTHER.name()) {
               var15 = String.valueOf((new StringBuilder("В§lвќ„В§f ")).append(Character.toUpperCase(var11.name().toLowerCase().charAt(0))).append(var11.name().toLowerCase().substring(1)));
               a.add(new CustomMainMenu(this, var15, var5, var7, var1, var3, false, this, var11));
            } else {
               var15 = String.valueOf((new StringBuilder("вќ† ")).append(Character.toUpperCase(var11.name().toLowerCase().charAt(0))).append(var11.name().toLowerCase().substring(1)));
               a.add(new RadioShanson(this, var15, var5, var7, var1, var3, false, this, var11));
            }

            var7 += var9;
         }
      }

      skid.gay.sex.spermix.inside.shalopay.discordrpc.AutoArmor.AimBot.a("NewGui").e();
      b = new ArrayList();
      Iterator var17 = a.iterator();

      while(var17.hasNext()) {
         ClickGUIMode var16 = (ClickGUIMode)var17.next();
         b.add(var16);
      }

      Collections.reverse(b);
   }

   public void b() {
      try {
         File var1 = new File(String.valueOf((new StringBuilder()).append(this.mc.mcDataDir).append(File.separator).append("Zamorozka")), "clickgui");
         FileInputStream var2 = new FileInputStream(var1.getAbsolutePath());
         DataInputStream var3 = new DataInputStream(var2);
         BufferedReader var4 = new BufferedReader(new InputStreamReader(var3));

         while(var4.readLine() != null) {
            String var6 = "";
            String[] var7 = var6.split(":");
            Iterator var8 = this.a().iterator();

            while(var8.hasNext()) {
               ClickGUIMode var9 = (ClickGUIMode)var8.next();
               if (var9.c().equalsIgnoreCase(var7[0])) {
                  var9.a(Boolean.valueOf(var7[1]));
                  var9.a(Integer.valueOf(var7[2]));
                  var9.b(Integer.valueOf(var7[3]));
               }
            }
         }
      } catch (Exception var10) {
      }

   }

   public void d() {
      Iterator var2 = b.iterator();

      while(true) {
         ClickGUIMode var1;
         do {
            do {
               do {
                  do {
                     do {
                        if (!var2.hasNext()) {
                           return;
                        }

                        var1 = (ClickGUIMode)var2.next();
                     } while(var1 == null);
                  } while(!var1.i);
               } while(!var1.h);
            } while(var1.j == null);
         } while(var1.j.size() <= 0);

         skid.gay.sex.spermix.inside.shalopay.b.b var3;
         for(Iterator var4 = var1.j.iterator(); var4.hasNext(); var3 = (skid.gay.sex.spermix.inside.shalopay.b.b)var4.next()) {
         }
      }
   }

   protected void keyTyped(char var1, int var2) {
      Iterator var4 = b.iterator();

      while(true) {
         ClickGUIMode var3;
         do {
            do {
               do {
                  do {
                     do {
                        if (!var4.hasNext()) {
                           super.keyTyped(var1, var2);

                           return;
                        }

                        var3 = (ClickGUIMode)var4.next();
                     } while(var3 == null);
                  } while(!var3.i);
               } while(!var3.h);
            } while(var3.j == null);
         } while(var3.j.size() <= 0);

         Iterator var6 = var3.j.iterator();

         while(var6.hasNext()) {
            skid.gay.sex.spermix.inside.shalopay.b.b var5 = (skid.gay.sex.spermix.inside.shalopay.b.b)var6.next();

            if (var5.a(var1, var2)) {
                  return;
               }
         }
      }
   }

   public List a() {
      return a;
   }

   public static Color a(long var0, float var2) {
      float var3 = (float)(System.nanoTime() * -5L + var0) / 1.0E10F % 1.0F;
      long var4 = Long.parseLong(Integer.toHexString(Integer.valueOf(Color.HSBtoRGB(var3, 1.0F, 1.0F))), 16);
      Color var6 = new Color((int)var4);
      return new Color((float)var6.getRed() / 255.0F * var2, (float)var6.getGreen() / 255.0F * var2, (float)var6.getBlue() / 255.0F * var2);
   }

   public void onGuiClosed() {
      this.c();
      if (this.mc.entityRenderer.theShaderGroup != null) {
         this.mc.entityRenderer.theShaderGroup.deleteShaderGroup();
         this.mc.entityRenderer.theShaderGroup = null;
      }

      Iterator var2 = b.iterator();

      label50:
      while(true) {
         ClickGUIMode var1;
         do {
            do {
               do {
                  if (!var2.hasNext()) {
                     return;
                  }

                  var1 = (ClickGUIMode)var2.next();
               } while(!var1.h);
            } while(!var1.i);
         } while(var1.j == null);

         Iterator var4 = var1.j.iterator();

         while(true) {
            skid.gay.sex.spermix.inside.shalopay.b.b var3;
            do {
               if (!var4.hasNext()) {
                  continue label50;
               }

               var3 = (skid.gay.sex.spermix.inside.shalopay.b.b)var4.next();
            } while(!var3.h);

            Iterator var6 = var3.b.iterator();

            while(var6.hasNext()) {
               skid.gay.sex.spermix.inside.shalopay.b.a var5 = (skid.gay.sex.spermix.inside.shalopay.b.a)var6.next();
               if (var5 instanceof skid.gay.sex.spermix.inside.shalopay.features.SmthLikeHudSettings.SmthLikeColorGetter) {
                  ((skid.gay.sex.spermix.inside.shalopay.features.SmthLikeHudSettings.SmthLikeColorGetter)var5).k = false;
               }
            }
         }
      }
   }

   public void mouseClicked(int var1, int var2, int var3) {
      if (this.e == null) {
         Iterator var5 = b.iterator();

         label68:
         while(true) {
            ClickGUIMode var4;
            do {
               do {
                  do {
                     if (!var5.hasNext()) {
                        var5 = b.iterator();

                        while(var5.hasNext()) {
                           var4 = (ClickGUIMode)var5.next();
                           if (var4.a(var1, var2, var3)) {
                              return;
                           }
                        }

                        super.mouseClicked(var1, var2, var3);

                        return;
                     }

                     var4 = (ClickGUIMode)var5.next();
                  } while(!var4.h);
               } while(!var4.i);
            } while(var4.j == null);

            Iterator var7 = var4.j.iterator();

            while(true) {
               skid.gay.sex.spermix.inside.shalopay.b.b var6;
               do {
                  if (!var7.hasNext()) {
                     continue label68;
                  }

                  var6 = (skid.gay.sex.spermix.inside.shalopay.b.b)var7.next();
               } while(!var6.h);

               Iterator var9 = var6.b.iterator();

               while(var9.hasNext()) {
                  skid.gay.sex.spermix.inside.shalopay.b.a var8 = (skid.gay.sex.spermix.inside.shalopay.b.a)var9.next();
                  if (var8.a(var1, var2, var3)) {
                     return;
                  }
               }
            }
         }
      }
   }

   public void initGui() {
      this.b();
      if (OpenGlHelper.shadersSupported && this.mc.getRenderViewEntity() instanceof EntityPlayer) {
         if (this.mc.entityRenderer.theShaderGroup != null) {
            this.mc.entityRenderer.theShaderGroup.deleteShaderGroup();
         }

         this.mc.entityRenderer.loadShader(new ResourceLocation("shaders/post/blur.json"));
      }

      skid.gay.sex.spermix.inside.shalopay.discordrpc.AutoArmor.AimBot.a("NewGui").e();
   }
}
