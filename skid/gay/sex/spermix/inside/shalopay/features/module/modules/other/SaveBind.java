package skid.gay.sex.spermix.inside.shalopay.features.module.modules.other;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import org.lwjgl.input.Keyboard;
import skid.gay.sex.spermix.inside.shalopay.features.idk.n;
import skid.gay.sex.spermix.inside.shalopay.features.module.Module;
import skid.gay.sex.spermix.inside.shalopay.features.module.ModuleCategory;

import java.io.*;

public class SaveBind extends Module {
    public SaveBind() {
        super("SaveBind", 0, ModuleCategory.OTHER);
    }

    public void onUpdate() {
        if (this.getState()) {
            try {
                File var1 = new File(n.a.getAbsolutePath(), "bind.txt");
                FileInputStream var2 = new FileInputStream(var1.getAbsolutePath());
                DataInputStream var3 = new DataInputStream(var2);
                BufferedReader var4 = new BufferedReader(new InputStreamReader(var3));

                String var5;
                while ((var5 = var4.readLine()) != null) {
                    String var6 = var5.toLowerCase().trim();
                    String[] var7 = var6.split(":");
                    String var8 = var7[1];
                    int var9 = Keyboard.getKeyIndex(var7[0].toUpperCase());
                    if (mc.currentScreen instanceof Gui) {
                        return;
                    }

                    byte var10 = 0;
                    if (Keyboard.isKeyDown(var9) && var10 < 1) {
                        Minecraft var10000 = mc;
                        Minecraft.player.sendChatMessage(var8);
                        int var12 = var10 + 1;
                    }
                }

                var4.close();
            } catch (Exception var11) {
            }
        }

    }
}
