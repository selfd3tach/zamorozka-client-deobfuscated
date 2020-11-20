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

public class AltLogin extends GuiScreen {
   
   private GuiScreen a;
   
   private GuiTextField b;
   
   private GuiTextField c;

   protected void actionPerformed(GuiButton var1) {
      if (var1.id == 4) {
         if (this.b.getText() != null && !this.b.getText().isEmpty() && this.c.getText() != null && !this.c.getText().isEmpty()) {
            if (!this.b.getText().contains(" ") && !this.c.getText().contains(" ")) {
               try {
                  YggdrasilUserAuthentication var2 = (YggdrasilUserAuthentication)(new YggdrasilAuthenticationService(Proxy.NO_PROXY, "")).createUserAuthentication(Agent.MINECRAFT);
                  var2.setUsername(this.b.getText());
                  var2.setPassword(this.c.getText());

                  try {
                     var2.logIn();
                     this.mc.session = new Session(var2.getSelectedProfile().getName(), var2.getSelectedProfile().getId().toString(), var2.getAuthenticatedToken(), "mojang");
                  } catch (Exception var4) {
                  }
               } catch (Exception var5) {
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

      this.mc.displayGuiScreen(this.a);
   }

   public void initGui() {
      Keyboard.enableRepeatEvents(true);
      this.buttonList.clear();
      this.buttonList.add(new GuiButton(4, width / 2 - 75, 190, "Login"));
      this.buttonList.add(new GuiButton(5, width / 2 - 75, 230, "Back"));
      this.b = new GuiTextField(2, fontRendererObj, width / 2 - 75, 100, 200, 20);
      this.c = new GuiTextField(2, fontRendererObj, width / 2 - 75, 132, 200, 20);
   }

   public void drawScreen(int var1, int var2, float var3) {
      this.drawDefaultBackground();
      skid.gay.sex.spermix.inside.shalopay.discordrpc.AutoArmor.Criticals.TextRadar.a("AUTHORIZATION", (float)(width / 2 - 75), 50.0F, 16775930);
      drawString(this.mc.fontRendererObj, "Email:", width / 2 - 75, 90, Color.white.getRGB());
      drawString(this.mc.fontRendererObj, "Password:", width / 2 - 75, 122, Color.white.getRGB());
      this.b.drawTextBox();
      this.c.drawTextBox();
      super.drawScreen(var1, var2, var3);
   }

   protected void keyTyped(char var1, int var2) {
      this.b.textboxKeyTyped(var1, var2);
      this.c.textboxKeyTyped(var1, var2);
      if (var1 == '\t' && this.b.isFocused() && this.c.isFocused()) {
         this.b.setFocused(false);
         this.c.setFocused(false);
      }

      if (var1 == '\r') {
         this.actionPerformed((GuiButton)this.buttonList.get(0));
      }

   }

   public void onGuiClosed() {
      Keyboard.enableRepeatEvents(false);
   }

   public void updateScreen() {
      this.b.updateCursorCounter();
      this.c.updateCursorCounter();
   }

   protected void mouseClicked(int var1, int var2, int var3) {
      super.mouseClicked(var1, var2, var3);
      this.b.mouseClicked(var1, var2, var3);
      this.c.mouseClicked(var1, var2, var3);
   }

   public AltLogin(GuiScreen var1) {
      this.a = var1;
   }
}
