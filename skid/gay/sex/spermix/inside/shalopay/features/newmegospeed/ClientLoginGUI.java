package skid.gay.sex.spermix.inside.shalopay.features.newmegospeed;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiMainMenu;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiTextField;
import org.lwjgl.input.Keyboard;

public class ClientLoginGUI extends GuiScreen {

   private GuiScreen a;
   
   private GuiTextField b;

   public static boolean b() {
      String var0 = System.getProperty("os.name").toLowerCase();
      return var0.indexOf("mac") >= 0;
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

   public void updateScreen() {
      this.b.updateCursorCounter();
   }

   public ClientLoginGUI(GuiScreen var1) {
      this.a = var1;
   }

   public void initGui() {
      Keyboard.enableRepeatEvents(true);
      this.buttonList.clear();
      this.buttonList.add(new GuiButton(0, width / 2 - 100, height / 4 + 96 + 12, "Done"));
      this.b = new GuiTextField(2, fontRendererObj, width / 2 - 100, 116, 200, 20);
   }

   protected void actionPerformed(GuiButton var1) {
      if (var1.id == 0) {
         if (this.b.getText().trim().contains("NullSquad")) {
            Minecraft.getMinecraft().displayGuiScreen(new GuiMainMenu());
         } else {
            Minecraft.getMinecraft().shutdown();
         }
      }

   }

   protected void mouseClicked(int var1, int var2, int var3) {
      super.mouseClicked(var1, var2, var3);
      this.b.mouseClicked(var1, var2, var3);
   }

   public static boolean a() {
      String var0 = System.getProperty("os.name").toLowerCase();
      return var0.indexOf("win") >= 0;
   }

   public void drawScreen(int var1, int var2, float var3) {
      this.drawDefaultBackground();
      drawString(fontRendererObj, "Your Password:", width / 2 - 100, 104, 10526880);
      drawString(fontRendererObj, "", width / 2, height / 4 - 40 + 20, 16777215);
      this.b.drawTextBox();
      super.drawScreen(var1, var2, var3);
   }
}
