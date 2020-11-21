package skid.gay.sex.spermix.inside.shalopay.features.newmegospeed;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiTextField;
import org.lwjgl.input.Keyboard;

public class GuiProxy extends GuiScreen {

    public static String a = "";
    private GuiTextField c;
    private final GuiScreen b;

    public GuiProxy(GuiScreen var1) {
        this.b = var1;
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
            } else if (var1.id == 0) {
                try {
                    a = this.c.getText();
                    if (a.equals("")) {
                        System.setProperty("proxySet", "false");
                    } else {
                        System.setProperty("proxySet", "true");
                        System.setProperty("socksProxyHost", a.split(":")[0]);
                        System.setProperty("socksProxyPort", a.split(":")[1]);
                    }
                } catch (Exception var3) {
                    System.setProperty("proxySet", "false");
                    a = "";
                }
            }

            this.mc.displayGuiScreen(this.b);
        }
    }

    public void onGuiClosed() {
        Keyboard.enableRepeatEvents(false);
    }

    public void updateScreen() {
        this.c.updateCursorCounter();
    }

    public void initGui() {
        Keyboard.enableRepeatEvents(true);
        this.buttonList.clear();
        this.buttonList.add(new GuiButton(0, width / 2 - 100, height / 4 + 50 + 12, "Done"));
        this.buttonList.add(new GuiButton(1, width / 2 - 100, height / 4 + 75 + 12, "Cancel"));
        this.c = new GuiTextField(2, fontRendererObj, width / 2 - 100, 116, 200, 20);
    }

    public void drawScreen(int var1, int var2, float var3) throws Throwable {
        this.drawDefaultBackground();
        this.drawCenteredString(fontRendererObj, "Proxy", width / 2, height / 4 - 60 + 20, 16777215);
        drawString(fontRendererObj, "IP:Port (Socks 4/5)", width / 2 - 100, 104, 10526880);
        this.c.drawTextBox();
        super.drawScreen(var1, var2, var3);
    }

    protected void mouseClicked(int var1, int var2, int var3) {
        super.mouseClicked(var1, var2, var3);
        this.c.mouseClicked(var1, var2, var3);
    }
}
