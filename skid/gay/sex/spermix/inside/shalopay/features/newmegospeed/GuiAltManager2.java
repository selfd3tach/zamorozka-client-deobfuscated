package skid.gay.sex.spermix.inside.shalopay.features.newmegospeed;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiTextField;
import net.minecraft.util.Session;
import org.lwjgl.input.Keyboard;
import skid.gay.sex.spermix.inside.shalopay.features.smthLikeInit.Main;

public class GuiAltManager2 extends GuiScreen {

    private GuiTextField b;

    private final GuiScreen a;

    public GuiAltManager2(GuiScreen var1) {
        this.a = var1;
    }

    public void updateScreen() {
        this.b.updateCursorCounter();
    }

    public void initGui() {
        Keyboard.enableRepeatEvents(true);
        this.buttonList.clear();
        this.buttonList.add(new GuiButton(6, width / 8 + 390, 34, "User/Pass"));
        this.buttonList.add(new GuiButton(7, width / 8 + 390, 10, "Email:Password"));
        this.buttonList.add(new GuiButton(0, width / 2 - 100, height / 4 + 96 + 12, "Done"));
        this.buttonList.add(new GuiButton(1, width / 2 - 100, height / 4 + 120 + 12, "Cancel"));
        this.b = new GuiTextField(2, fontRendererObj, width / 2 - 100, 116, 200, 20);
    }

    public void onGuiClosed() {
        Keyboard.enableRepeatEvents(false);
    }

    protected void actionPerformed(GuiButton var1) {
        if (var1.enabled) {
            if (var1.id == 1) {
                this.mc.displayGuiScreen(this.a);
            }

            if (var1.id == 0) {
                this.mc.session = new Session(this.b.getText(), "", "", "");
                this.mc.displayGuiScreen(this.a);
            }

            if (var1.id == 7) {
                this.mc.displayGuiScreen(new GuiAltManager(this.a));
            }

            if (var1.id == 6) {
                this.mc.displayGuiScreen(new AltLogin(this.a));
            }

        }
    }

    protected void mouseClicked(int var1, int var2, int var3) {
        super.mouseClicked(var1, var2, var3);
        this.b.mouseClicked(var1, var2, var3);
    }

    protected void keyTyped(char var1, int var2) {
        this.b.textboxKeyTyped(var1, var2);
        if (var1 == '\t' && this.b.isFocused()) {
            this.b.setFocused(false);
        }

        if (var1 == '\r') {
            this.actionPerformed((GuiButton) this.buttonList.get(0));
        }

    }

    public void drawScreen(int var1, int var2, float var3) throws Throwable {
        this.drawDefaultBackground();
        Main.h.d.a("AUTHORIZATION", (float) (width / 2 - 100), 50.0F, 16775930);
        drawString(fontRendererObj, "Nick/Никнейм", width / 2 - 100, 104, 10526880);
        drawString(fontRendererObj, "", width / 2, height / 4 - 40 + 20, 16777215);
        this.b.drawTextBox();
        super.drawScreen(var1, var2, var3);
    }
}
