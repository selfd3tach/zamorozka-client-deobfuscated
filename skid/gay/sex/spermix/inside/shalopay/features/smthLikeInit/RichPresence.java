package skid.gay.sex.spermix.inside.shalopay.features.smthLikeInit;

import skid.gay.sex.spermix.inside.shalopay.features.drpc.DiscordEventHandlers;
import skid.gay.sex.spermix.inside.shalopay.features.drpc.DiscordEventHandlers$Builder;
import skid.gay.sex.spermix.inside.shalopay.features.drpc.DiscordRPC;
import skid.gay.sex.spermix.inside.shalopay.features.drpc.DiscordRichPresence$Builder;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiTextField;
import org.lwjgl.input.Keyboard;

public class RichPresence extends GuiScreen {
   
   private GuiTextField d;
   
   private boolean a = true;
   
   private GuiScreen c;
   
   private long b = 0L;
   private DiscordRPC discordRPC;

   public void a() {
      this.b = System.currentTimeMillis();
      DiscordEventHandlers var1 = (new DiscordEventHandlers$Builder()).setReadyEventHandler(new RPCLogger(this)).build();
      DiscordRPC.discordInitialize("671755884405194802", var1, true);
      (new RPCManager(discordRPC, "Discord RPC Collback")).start();
   }

   public void onGuiClosed() {
      Keyboard.enableRepeatEvents(false);
   }

   protected void actionPerformed(GuiButton var1) {
      if (var1.enabled) {
         if (var1.id == 0) {
            this.a(String.valueOf((new StringBuilder("Build: ")).append(skid.gay.sex.spermix.inside.shalopay.discordrpc.AutoArmor.TextRadar)), this.d.getText());
            this.mc.displayGuiScreen(this.c);
         }

      }
   }

   protected void keyTyped(char var1, int var2) {
      this.d.textboxKeyTyped(var1, var2);
      if (var1 == '\t' && this.d.isFocused()) {
         this.d.setFocused(false);
      }

      if (var1 == '\r') {
         this.actionPerformed((GuiButton)this.buttonList.get(0));
      }

   }

   public RichPresence(GuiScreen var1) {
      this.c = var1;
   }

   public void initGui() {
      Keyboard.enableRepeatEvents(true);
      this.buttonList.clear();
      this.buttonList.add(new GuiButton(0, width / 2 - 100, height / 4 + 96 + 12, "Done"));
      this.d = new GuiTextField(2, fontRendererObj, width / 2 - 100, 116, 200, 20);
   }

   public void a(String var1, String var2) {
      DiscordRichPresence$Builder var3 = new DiscordRichPresence$Builder(var2);
      var3.setBigImage("large", "");
      var3.setDetails(var1);
      var3.setStartTimestamps(this.b);
      DiscordRPC.discordUpdatePresence(var3.build());
   }

   protected void mouseClicked(int var1, int var2, int var3) {
      super.mouseClicked(var1, var2, var3);
      this.d.mouseClicked(var1, var2, var3);
   }

   public void drawScreen(int var1, int var2, float var3) throws Throwable {
      this.drawDefaultBackground();
      skid.gay.sex.spermix.inside.shalopay.discordrpc.AutoArmor.Criticals.TextRadar.a("DiscordRPC", (float)(width / 2 - 100), 50.0F, 16775930);
      drawString(fontRendererObj, "Статус в Discord.", width / 2 - 100, 104, 10526880);
      drawString(fontRendererObj, "", width / 2, height / 4 - 40 + 20, 16777215);
      this.d.drawTextBox();
      super.drawScreen(var1, var2, var3);
   }

   // $FF: synthetic method
   static boolean a(RichPresence var0) {
      return var0.a;
   }

   public void updateScreen() {
      this.d.updateCursorCounter();
   }
}
