package skid.gay.sex.spermix.inside.shalopay.features.newmegospeed;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import org.lwjgl.input.Keyboard;

public class ClientLoginThread extends GuiScreen {
   
   private GuiScreen a;

   protected void actionPerformed(GuiButton var1) {
      if (var1.enabled) {
         if (var1.id == 1) {
            this.mc.displayGuiScreen(this.a);
         }

         if (var1.id == 0) {
            this.mc.displayGuiScreen(this.a);
         }

         if (var1.id == 7) {
            this.mc.displayGuiScreen(new GuiAltManager(this.a));
         }

         if (var1.id == 6) {
            this.mc.displayGuiScreen(new AltLogin(this.a));
         }

      }
   }

   public ClientLoginThread(GuiScreen var1) {
      this.a = var1;
   }

   public void drawScreen(int var1, int var2, float var3) {
      String var4 = "http://zamorozka.fun/hlsd.txt";
      URL var5 = null;

      try {
         var5 = new URL(var4);
      } catch (MalformedURLException var66) {
         var66.printStackTrace();
      }

      HttpURLConnection var6 = null;

      try {
         var6 = (HttpURLConnection)var5.openConnection();
      } catch (IOException var65) {
         var65.printStackTrace();
      }

      try {
         var6.setRequestMethod("GET");
      } catch (ProtocolException var64) {
         var64.printStackTrace();
      }

      BufferedReader var7 = null;

      try {
         var7 = new BufferedReader(new InputStreamReader(var6.getInputStream()));
      } catch (IOException var63) {
         var63.printStackTrace();
      }

      StringBuffer var9 = new StringBuffer();

      String var8;
      try {
         while((var8 = var7.readLine()) != null) {
            var9.append(var8);
         }
      } catch (IOException var71) {
         var71.printStackTrace();
      }

      String var10 = var9.toString();

      try {
         var7.close();
      } catch (IOException var62) {
         var62.printStackTrace();
      }

      String var11 = "http://zamorozka.fun/mc.txt";
      URL var12 = null;

      try {
         var12 = new URL(var11);
      } catch (MalformedURLException var61) {
         var61.printStackTrace();
      }

      HttpURLConnection var13 = null;

      try {
         var13 = (HttpURLConnection)var12.openConnection();
      } catch (IOException var60) {
         var60.printStackTrace();
      }

      try {
         var13.setRequestMethod("GET");
      } catch (ProtocolException var59) {
         var59.printStackTrace();
      }

      BufferedReader var14 = null;

      try {
         var14 = new BufferedReader(new InputStreamReader(var13.getInputStream()));
      } catch (IOException var58) {
         var58.printStackTrace();
      }

      StringBuffer var16 = new StringBuffer();

      String var15;
      try {
         while((var15 = var14.readLine()) != null) {
            var16.append(var15);
         }
      } catch (IOException var70) {
         var70.printStackTrace();
      }

      String var17 = var16.toString();

      try {
         var14.close();
      } catch (IOException var57) {
         var57.printStackTrace();
      }

      String var18 = "http://zamorozka.fun/us.txt";
      URL var19 = null;

      try {
         var19 = new URL(var18);
      } catch (MalformedURLException var56) {
         var56.printStackTrace();
      }

      HttpURLConnection var20 = null;

      try {
         var20 = (HttpURLConnection)var19.openConnection();
      } catch (IOException var55) {
         var55.printStackTrace();
      }

      try {
         var20.setRequestMethod("GET");
      } catch (ProtocolException var54) {
         var54.printStackTrace();
      }

      BufferedReader var21 = null;

      try {
         var21 = new BufferedReader(new InputStreamReader(var20.getInputStream()));
      } catch (IOException var53) {
         var53.printStackTrace();
      }

      StringBuffer var23 = new StringBuffer();

      String var22;
      try {
         while((var22 = var21.readLine()) != null) {
            var23.append(var22);
         }
      } catch (IOException var69) {
         var69.printStackTrace();
      }

      String var24 = var23.toString();

      try {
         var21.close();
      } catch (IOException var52) {
         var52.printStackTrace();
      }

      this.drawDefaultBackground();
      skid.gay.sex.spermix.inside.shalopay.discordrpc.AutoArmor.Criticals.TextRadar.a("Personal Area", (float)(width / 2 - 100), 50.0F, 16775930);
      drawString(fontRendererObj, String.valueOf((new StringBuilder("Никнейм: ")).append(this.mc.session.getUsername())), width / 2 - 100, 104, 10526880);
      if (a()) {
         String var25 = "wmic csproduct get UUID";
         StringBuffer var26 = new StringBuffer();
         Process var27 = null;

         try {
            var27 = Runtime.getRuntime().exec(var25);
         } catch (IOException var51) {
            var51.printStackTrace();
         }

         try {
            var27 = Runtime.getRuntime().exec(var25);
         } catch (IOException var50) {
            var50.printStackTrace();
         }

         BufferedReader var28 = new BufferedReader(new InputStreamReader(var27.getInputStream()));
         String var29 = "";

         try {
            while((var29 = var28.readLine()) != null) {
               var26.append(String.valueOf((new StringBuilder(String.valueOf(var29))).append("\n")));
            }
         } catch (IOException var68) {
            var68.printStackTrace();
         }

         String var30 = var26.toString().substring(var26.indexOf("\n"), var26.length()).trim();
         drawString(fontRendererObj, String.valueOf((new StringBuilder("Hwid: ")).append(var30)), width / 2 - 100, 120, 10526880);
         MessageDigest var31 = null;
         byte[] var32 = new byte[0];

         try {
            var31 = MessageDigest.getInstance("MD5");
            var31.reset();
            var31.update(var30.getBytes());
            var32 = var31.digest();
         } catch (NoSuchAlgorithmException var49) {
            var49.printStackTrace();
         }

         BigInteger var33 = new BigInteger(1, var32);

         String var34;
         for(var34 = var33.toString(16); var34.length() < 32; var34 = String.valueOf((new StringBuilder("0")).append(var34))) {
         }

         System.out.print(var34);
         String var35 = String.valueOf((new StringBuilder(String.valueOf(var10))).append(var34));
         URL var36 = null;

         try {
            var36 = new URL(var35);
         } catch (MalformedURLException var48) {
            var48.printStackTrace();
         }

         HttpURLConnection var37 = null;

         try {
            var37 = (HttpURLConnection)var36.openConnection();
         } catch (IOException var47) {
            var47.printStackTrace();
         }

         try {
            var37.setRequestMethod("GET");
         } catch (ProtocolException var46) {
            var46.printStackTrace();
         }

         String var38 = "Mozilla/5.0";
         var37.setRequestProperty("User-Agent", "Mozilla/5.0");

         try {
            int var39 = var37.getResponseCode();
         } catch (IOException var45) {
            var45.printStackTrace();
         }

         BufferedReader var72 = null;

         try {
            var72 = new BufferedReader(new InputStreamReader(var37.getInputStream()));
         } catch (IOException var44) {
            var44.printStackTrace();
         }

         StringBuffer var41 = new StringBuffer();

         String var40;
         try {
            while((var40 = var72.readLine()) != null) {
               var41.append(var40);
            }
         } catch (IOException var67) {
            var67.printStackTrace();
         }

         try {
            var72.close();
         } catch (IOException var43) {
            var43.printStackTrace();
         }

         String[] var42 = var41.toString().split(" ");
         drawString(fontRendererObj, "System: Windows", width / 2 - 100, 135, 10526880);
         drawString(fontRendererObj, String.valueOf((new StringBuilder("Status: ")).append(var42[2])), width / 2 - 100, 150, 10526880);
      }

      super.drawScreen(var1, var2, var3);
   }

   protected void keyTyped(char var1, int var2) {
      if (var1 == '\r') {
         this.actionPerformed((GuiButton)this.buttonList.get(0));
      }

   }

   public void onGuiClosed() {
      Keyboard.enableRepeatEvents(false);
   }

   public void initGui() {
      Keyboard.enableRepeatEvents(true);
      this.buttonList.clear();
      this.buttonList.add(new GuiButton(1, width / 2 - 100, height / 2 + 120 + 12, "Cancel"));
   }

   protected void mouseClicked(int var1, int var2, int var3) {
      super.mouseClicked(var1, var2, var3);
   }

   public static boolean a() {
      String var0 = System.getProperty("os.name").toLowerCase();
      return var0.indexOf("win") >= 0;
   }

   public void updateScreen() {
   }
}
