package skid.gay.sex.spermix.inside.shalopay.features.module.modules.player2;

import net.minecraft.client.gui.GuiChat;
import net.minecraft.client.settings.GameSettings;
import skid.gay.sex.spermix.inside.shalopay.features.module.Module;
import skid.gay.sex.spermix.inside.shalopay.features.module.ModuleCategory;

public class InventoryWalk extends Module {
   public void g() {
      if (!GameSettings.isKeyDown(mc.gameSettings.keyBindForward) || mc.currentScreen != null) {
         mc.gameSettings.keyBindForward.pressed = false;
      }

      if (!GameSettings.isKeyDown(mc.gameSettings.keyBindBack) || mc.currentScreen != null) {
         mc.gameSettings.keyBindBack.pressed = false;
      }

      if (!GameSettings.isKeyDown(mc.gameSettings.keyBindRight) || mc.currentScreen != null) {
         mc.gameSettings.keyBindRight.pressed = false;
      }

      if (!GameSettings.isKeyDown(mc.gameSettings.keyBindLeft) || mc.currentScreen != null) {
         mc.gameSettings.keyBindLeft.pressed = false;
      }

      if (!GameSettings.isKeyDown(mc.gameSettings.keyBindJump) || mc.currentScreen != null) {
         mc.gameSettings.keyBindJump.pressed = false;
      }

      if (GameSettings.isKeyDown(mc.gameSettings.keyBindSprint) && mc.currentScreen != null) {
      }

   }

   public void h() {
      if (this.c()) {
         if (mc.currentScreen == null || mc.currentScreen instanceof GuiChat) {
            return;
         }

         mc.gameSettings.keyBindForward.pressed = GameSettings.isKeyDown(mc.gameSettings.keyBindForward);
         mc.gameSettings.keyBindBack.pressed = GameSettings.isKeyDown(mc.gameSettings.keyBindBack);
         mc.gameSettings.keyBindRight.pressed = GameSettings.isKeyDown(mc.gameSettings.keyBindRight);
         mc.gameSettings.keyBindLeft.pressed = GameSettings.isKeyDown(mc.gameSettings.keyBindLeft);
         mc.gameSettings.keyBindJump.pressed = GameSettings.isKeyDown(mc.gameSettings.keyBindJump);
         mc.gameSettings.keyBindSprint.pressed = GameSettings.isKeyDown(mc.gameSettings.keyBindSprint);
      }

   }

   public InventoryWalk() {
      super("InventoryWalk", 0, ModuleCategory.PLAYER2);
   }
}
