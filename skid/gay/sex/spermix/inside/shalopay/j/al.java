package skid.gay.sex.spermix.inside.shalopay.j;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiOptionButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiYesNo;
import net.minecraft.client.gui.GuiYesNoCallback;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.client.settings.GameSettings$Options;

public class al extends GuiScreen implements GuiYesNoCallback {
   
   private GuiScreen b;
   
   private bE e = new bE(this);
   
   private static GameSettings$Options[] d;
   
   private GameSettings c;
   
   protected String a;

   protected void actionPerformed(GuiButton var1) {
      if (var1.enabled) {
         if (var1.id < 200 && var1 instanceof GuiOptionButton) {
            this.c.setOptionValue(((GuiOptionButton)var1).returnEnumOptions(), 1);
            var1.displayString = this.c.getKeyBinding(GameSettings$Options.getEnumOptions(var1.id));
         }

         if (var1.id == 200) {
            this.mc.gameSettings.saveOptions();
            this.mc.displayGuiScreen(this.b);
         }

         if (var1.id == 210) {
            this.mc.gameSettings.saveOptions();
            GuiYesNo var2 = new GuiYesNo(this, I18n.format("of.message.other.reset"), "", 9999);
            this.mc.displayGuiScreen(var2);
         }
      }

   }

   public al(GuiScreen var1, GameSettings var2) {
      this.b = var1;
      this.c = var2;
   }

   public void confirmClicked(boolean var1, int var2) {
      if (var1) {
         this.mc.gameSettings.resetSettings();
      }

      this.mc.displayGuiScreen(this);
   }

   public void drawScreen(int var1, int var2, float var3) {
      this.drawDefaultBackground();
      this.drawCenteredString(fontRendererObj, this.a, width / 2, 15, 16777215);
      super.drawScreen(var1, var2, var3);
      this.e.a(var1, var2, this.buttonList);
   }

   public void initGui() {
      this.a = I18n.format("of.options.otherTitle");
      this.buttonList.clear();

      for(int var1 = 0; var1 < d.length; ++var1) {
         GameSettings$Options var2 = d[var1];
         int var3 = width / 2 - 155 + var1 % 2 * 160;
         int var4 = height / 6 + 21 * (var1 / 2) - 12;
         if (!var2.getEnumFloat()) {
            this.buttonList.add(new aj(var2.returnEnumOrdinal(), var3, var4, var2, this.c.getKeyBinding(var2)));
         } else {
            this.buttonList.add(new ak(var2.returnEnumOrdinal(), var3, var4, var2));
         }
      }

      this.buttonList.add(new GuiButton(210, width / 2 - 100, height / 6 + 168 + 11 - 44, I18n.format("of.options.other.reset")));
      this.buttonList.add(new GuiButton(200, width / 2 - 100, height / 6 + 168 + 11, I18n.format("gui.done")));
   }

   static {
      d = new GameSettings$Options[]{GameSettings$Options.LAGOMETER, GameSettings$Options.PROFILER, GameSettings$Options.SHOW_FPS, GameSettings$Options.ADVANCED_TOOLTIPS, GameSettings$Options.WEATHER, GameSettings$Options.TIME, GameSettings$Options.USE_FULLSCREEN, GameSettings$Options.FULLSCREEN_MODE, GameSettings$Options.ANAGLYPH, GameSettings$Options.AUTOSAVE_TICKS, GameSettings$Options.SCREENSHOT_SIZE};
   }
}
