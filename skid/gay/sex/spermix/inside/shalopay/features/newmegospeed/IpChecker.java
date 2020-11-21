package skid.gay.sex.spermix.inside.shalopay.features.newmegospeed;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiTextField;
import org.lwjgl.input.Keyboard;

import java.io.IOException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class IpChecker extends GuiScreen {

    public static String a = "";
    private final GuiScreen b;
    private GuiTextField c;

    public IpChecker(GuiScreen var1) {
        this.b = var1;
    }

    public void drawScreen(int var1, int var2, float var3) throws Throwable {
        this.drawDefaultBackground();
        this.drawCenteredString(fontRendererObj, "You Ip check:", width / 2, height / 4 - 60 + 20, 16777215);

        try {
            Throwable var4 = null;
            Object var5 = null;

            try {
                Scanner var6 = (new Scanner((new URL("https://api.ipify.org")).openStream(), StandardCharsets.UTF_8)).useDelimiter("\\A");

                try {
                    drawString(fontRendererObj, String.valueOf((new StringBuilder("                  IP:")).append(var6.next())), width / 2 - 100, 104, 16777215);
                } finally {
                    if (var6 != null) {
                        var6.close();
                    }

                }
            } catch (Throwable var14) {
                if (var4 == null) {
                    var4 = var14;
                } else if (var4 != var14) {
                    var4.addSuppressed(var14);
                }

                throw var4;
            }
        } catch (IOException var15) {
            var15.printStackTrace();
        }

        super.drawScreen(var1, var2, var3);
    }

    public void onGuiClosed() {
        Keyboard.enableRepeatEvents(false);
    }

    protected void keyTyped(char var1, int var2) {
        this.c.textboxKeyTyped(var1, var2);
        if (var1 == '\t' && this.c.isFocused()) {
            this.c.setFocused(false);
        }

        if (var1 == '\r') {
            this.actionPerformed((GuiButton) this.buttonList.get(0));
        }

    }

    protected void actionPerformed(GuiButton var1) {
        if (var1.enabled) {
            if (var1.id == 1) {
                this.mc.displayGuiScreen(this.b);
            } else {
                int var10000 = var1.id;
            }

            this.mc.displayGuiScreen(this.b);
        }
    }

    public void updateScreen() {
        this.c.updateCursorCounter();
    }

    public void initGui() {
        Keyboard.enableRepeatEvents(true);
        this.buttonList.clear();
        this.buttonList.add(new GuiButton(1, width / 2 - 100, height / 4 + 75 + 12, "Cancel"));
        this.c = new GuiTextField(2, fontRendererObj, width / 2 - 100, 116, 200, 20);
    }

    protected void mouseClicked(int var1, int var2, int var3) {
        super.mouseClicked(var1, var2, var3);
        this.c.mouseClicked(var1, var2, var3);
    }
}
