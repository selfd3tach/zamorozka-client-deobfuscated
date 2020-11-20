package skid.gay.sex.spermix.inside.shalopay.features.newmegospeed;

import java.io.IOException;
import java.net.URL;
import skid.gay.sex.spermix.inside.shalopay.features.idk.SoundUtils;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiTextField;
import org.lwjgl.input.Keyboard;

public class RadioShanson extends GuiScreen {
   
   private GuiTextField b;
   
   private SoundUtils c = new SoundUtils();
   
   private GuiScreen a;

   protected void actionPerformed(GuiButton var1) {
      if (var1.enabled) {
         if (var1.id == 1) {
            this.c.b();
         }

         if (var1.id == 0) {
            try {
               this.c.a((new URL("https://streams.ilovemusic.de/iloveradio1.mp3")).openStream());
            } catch (IOException var3) {
               var3.printStackTrace();
            }

            this.c.a();
            this.mc.displayGuiScreen(this.a);
         }

         if (var1.id == 3) {
            this.mc.displayGuiScreen(this.a);
         }

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

   protected void mouseClicked(int var1, int var2, int var3) {
      super.mouseClicked(var1, var2, var3);
      this.b.mouseClicked(var1, var2, var3);
   }

   public void updateScreen() {
      this.b.updateCursorCounter();
   }

   public RadioShanson(GuiScreen var1) {
      this.a = var1;
   }

   public void onGuiClosed() {
      Keyboard.enableRepeatEvents(false);
   }

   public void drawScreen(int var1, int var2, float var3) {
      this.drawDefaultBackground();
      super.drawScreen(var1, var2, var3);
   }

   public void initGui() {
      Keyboard.enableRepeatEvents(true);
      this.buttonList.clear();
      this.buttonList.add(new GuiButton(0, width / 2 - 100, height / 4 + 96 + 12, "Start"));
      this.buttonList.add(new GuiButton(1, width / 2 - 100, height / 4 + 120 + 12, "Stop"));
      this.buttonList.add(new GuiButton(3, width / 2 - 100, height / 4 + 140 + 12, "Exit"));
      this.b = new GuiTextField(2, fontRendererObj, width / 2 - 100, 116, 200, 20);
   }
}
