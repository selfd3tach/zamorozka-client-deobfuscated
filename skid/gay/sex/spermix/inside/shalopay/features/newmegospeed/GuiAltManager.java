package skid.gay.sex.spermix.inside.shalopay.features.newmegospeed;

import com.mojang.authlib.Agent;
import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
import com.mojang.authlib.yggdrasil.YggdrasilUserAuthentication;
import java.awt.Color;
import java.net.Proxy;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiTextField;
import net.minecraft.util.Session;
import org.lwjgl.input.Keyboard;

public class GuiAltManager extends GuiScreen {
   
   private GuiScreen a;
   
   private GuiTextField b;

   public void updateScreen() {
      this.b.updateCursorCounter();
   }

   public void onGuiClosed() {
      Keyboard.enableRepeatEvents(false);
   }

   public void drawScreen(int var1, int var2, float var3) throws Throwable {
      this.drawDefaultBackground();
      drawString(this.mc.fontRendererObj, "Email:Password", width / 2, height / 3 - 20 + 20, Color.white.getRGB());
      this.b.drawTextBox();
      super.drawScreen(var1, var2, var3);
   }

   public void initGui() {
      Keyboard.enableRepeatEvents(true);
      this.buttonList.clear();
      this.buttonList.add(new GuiButton(4, width / 2 - 75, 190, "Login"));
      this.buttonList.add(new GuiButton(5, width / 2 - 75, 230, "Back"));
      this.buttonList.add(new GuiButton(6, width / 8 + 390, 10, "User/Pass"));
      this.b = new GuiTextField(2, fontRendererObj, width / 2 - 75, 130, 200, 20);
   }

   protected void mouseClicked(int var1, int var2, int var3) {
      super.mouseClicked(var1, var2, var3);
      this.b.mouseClicked(var1, var2, var3);
   }

   protected void actionPerformed(GuiButton var1) {
      if (var1.id == 4) {
         if (this.b.getText() != null && !this.b.getText().isEmpty()) {
            if (!this.b.getText().contains(" ")) {
               try {
                  String[] var2 = this.b.getText().split(":");
                  if (var2[0].contains("@")) {
                     YggdrasilUserAuthentication var3 = (YggdrasilUserAuthentication)(new YggdrasilAuthenticationService(Proxy.NO_PROXY, "")).createUserAuthentication(Agent.MINECRAFT);
                     var3.setUsername(var2[0]);
                     var3.setPassword(var2[1]);

                     try {
                        var3.logIn();
                        this.mc.session = new Session(var3.getSelectedProfile().getName(), var3.getSelectedProfile().getId().toString(), var3.getAuthenticatedToken(), "mojang");
                        System.out.print("True Login");
                     } catch (Exception var5) {
                     }
                  } else {
                     System.out.print("No @");
                  }
               } catch (Exception var6) {
                  System.out.print("Erroe alt");
               }
            } else {
               System.out.print("Error alt");
            }
         } else {
            System.out.print("No Alt");
         }
      }

      if (var1.id == 5) {
         this.mc.displayGuiScreen((GuiScreen)null);
      }

      if (var1.id == 6) {
         this.mc.displayGuiScreen(new AltLogin(this.a));
      }

   }

   protected void keyTyped(char var1, int var2) {
      this.b.textboxKeyTyped(var1, var2);
      if (var1 == '\t' && this.b.isFocused()) {
         this.b.setFocused(false);
      }

      if (var1 == '\r') {
         this.actionPerformed((GuiButton)this.buttonList.get(0));
      }

   }

   public GuiAltManager(GuiScreen var1) {
      this.a = var1;
   }
}
