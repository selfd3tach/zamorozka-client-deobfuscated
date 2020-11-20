package skid.gay.sex.spermix.inside.shalopay.features.newmegospeed;

import skid.gay.sex.spermix.inside.shalopay.features.idk.w;
import skid.gay.sex.spermix.inside.shalopay.features.idk.RenderUtils;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiScreenResourcePacks;
import net.minecraft.client.resources.I18n;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.Sys;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

public class CustomMainMenu extends GuiScreen {
   
   private w b;
   
   private GuiScreen a;

   protected void actionPerformed(GuiButton var1) {
      if (var1.enabled) {
         if (var1.id == 0) {
            this.mc.displayGuiScreen(this.a);
         } else if (var1.id == 1) {
            this.mc.displayGuiScreen(new GuiAltManager2(this.a));
         } else if (var1.id == 5) {
            this.mc.displayGuiScreen(new GuiAltManager(this.a));
         } else if (var1.id == 2) {
            this.mc.displayGuiScreen(new GuiProxy(this.a));
         } else if (var1.id == 3) {
            this.mc.displayGuiScreen(new IpChecker(this.a));
         } else if (var1.id == 4) {
            this.mc.displayGuiScreen(new SmthLikeGuiCheck(this.a));
         } else if (var1.id == 66) {
            Sys.openURL("https://t.me/OYMineBonus_bot");
         } else if (var1.id == 21) {
            this.mc.displayGuiScreen(new GuiScreenResourcePacks(this.a));
         }

         if (var1.id == 227) {
            this.mc.displayGuiScreen(new ClientLoginThread(this));
         }

         if (var1.id == 233) {
            this.mc.displayGuiScreen(new idk3(this));
         }

         if (var1.id == 229) {
            Sys.openURL("https://www.donationalerts.com/r/shalopay_");
         }

         if (var1.id == 230) {
            Sys.openURL("http://www.youtube.com/c/Шалопай");
         }

         if (var1.id == 238) {
            this.mc.displayGuiScreen(new skid.gay.sex.spermix.inside.shalopay.discordrpc.DiscordRPC(this));
         }

      }
   }

   protected void mouseClicked(int var1, int var2, int var3) {
      super.mouseClicked(var1, var2, var3);
   }

   public void updateScreen() {
      this.b.b(20);
   }

   public void drawScreen(int var1, int var2, float var3) {
      this.b.a();
      this.drawDefaultBackground();
      drawRect(0.0D, 1000.0D, 150.0D, 0.0D, Integer.MIN_VALUE);
      skid.gay.sex.spermix.inside.shalopay.discordrpc.AutoArmor.Criticals.TextRadar.a("ZAMOROZKA", 300.0F, 50.0F, 16775930);
      RenderUtils.a(300, 93, 160, 160, new ResourceLocation("zamorozka/zamlogm.jpg"));
      GL11.glPushMatrix();
      GL11.glScalef(5.0F, 5.0F, 1.0F);
      GL11.glPopMatrix();
      drawString(fontRendererObj, "                     Telegram-https://t.me/oymine_Crash", width - fontRendererObj.getStringWidth("https://www.youtube.com/channel/UCsEB5W8k5M5JdvZdn5FSPqQ") - 2, height - 10, -1);
      super.drawScreen(var1, var2, var3);
   }

   public CustomMainMenu(GuiScreen var1) {
      this.a = var1;
   }

   public void onGuiClosed() {
      Keyboard.enableRepeatEvents(false);
   }

   public void initGui() {
      Keyboard.enableRepeatEvents(true);
      this.b = new w(200, true, true, 1);
      this.buttonList.clear();
      this.buttonList.add(new GuiButton(1, width / -200 + 15, 10, 130, 20, "Set Name"));
      this.buttonList.add(new GuiButton(66, width / 1000 + 629, 10, 50, 20, "Bonus"));
      this.buttonList.add(new GuiButton(6, width / -200 + 15, 35, 130, 20, "ClickGui"));
      this.buttonList.add(new GuiButton(2, width / -200 + 15, 60, 130, 20, "Proxy"));
      this.buttonList.add(new GuiButton(3, width / -200 + 15, 85, 130, 20, "You Ip"));
      this.buttonList.add(new GuiButton(4, width / -200 + 15, 110, 130, 20, "Uuid"));
      this.buttonList.add(new GuiButton(227, width / -200 + 15, 135, 130, 20, I18n.format("Personal Area")));
      this.buttonList.add(new GuiButton(229, width / -200 + 15, 160, 130, 20, I18n.format("Donate")));
      this.buttonList.add(new GuiButton(230, width / -200 + 15, 189, 130, 20, I18n.format("You§4Tube")));
      this.buttonList.add(new GuiButton(0, width / -200 + 15, 324, 130, 20, "Cancel"));
   }
}
