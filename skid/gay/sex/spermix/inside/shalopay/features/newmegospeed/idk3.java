package skid.gay.sex.spermix.inside.shalopay.features.newmegospeed;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiTextField;
import org.lwjgl.input.Keyboard;

public class idk3 extends GuiScreen {

    private final GuiScreen a;

    private GuiTextField b;

    public idk3(GuiScreen var1) {
        this.a = var1;
    }

    protected void actionPerformed(GuiButton var1) {
        if (var1.enabled) {
            if (var1.id == 1) {
                this.mc.displayGuiScreen(this.a);
            }

        }
    }

    protected void mouseClicked(int var1, int var2, int var3) {
        super.mouseClicked(var1, var2, var3);
    }

    public void initGui() {
        Keyboard.enableRepeatEvents(true);
        this.buttonList.clear();
        this.buttonList.add(new GuiButton(0, width / 2 - 100, height / 4 + 96 + 12, "Done"));
        this.buttonList.add(new GuiButton(1, width / 2 - 100, height / 4 + 120 + 12, "Cancel"));
    }

    public void updateScreen() {
        this.b.updateCursorCounter();
    }

    public void onGuiClosed() {
        Keyboard.enableRepeatEvents(false);
    }

    public void drawScreen(int var1, int var2, float var3) throws Throwable {
        this.drawDefaultBackground();
        drawString(fontRendererObj, "", width / 2, height / 4 - 40 + 20, 16777215);
        super.drawScreen(var1, var2, var3);
    }

    protected void keyTyped(char var1, int var2) {
        if (var1 == '\r') {
            this.actionPerformed((GuiButton) this.buttonList.get(0));
        }

    }
}
