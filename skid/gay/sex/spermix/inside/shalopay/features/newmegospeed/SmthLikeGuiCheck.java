package skid.gay.sex.spermix.inside.shalopay.features.newmegospeed;

import com.google.common.base.Charsets;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiTextField;
import org.lwjgl.input.Keyboard;
import skid.gay.sex.spermix.inside.shalopay.features.smthLikeInit.Main;

import java.util.UUID;

public class SmthLikeGuiCheck extends GuiScreen {

    private GuiTextField c;

    private GuiTextField b;

    private final GuiScreen a;

    public SmthLikeGuiCheck(GuiScreen var1) {
        this.a = var1;
    }

    public void updateScreen() {
        this.b.updateCursorCounter();
        this.c.updateCursorCounter();
    }

    protected void actionPerformed(GuiButton var1) {
        if (var1.enabled) {
            if (var1.id == 1) {
                this.mc.displayGuiScreen(this.a);
            } else if (var1.id == 0) {
                Main.b();
                idk5.b(UUID.nameUUIDFromBytes(String.valueOf((new StringBuilder("OfflinePlayer:")).append(this.c.getText())).getBytes(Charsets.UTF_8)).toString());
                Main.b();
                idk5.a(this.b.getText());
            }

            this.mc.displayGuiScreen(this.a);
        }
    }

    protected void keyTyped(char var1, int var2) {
        this.b.textboxKeyTyped(var1, var2);
        this.c.textboxKeyTyped(var1, var2);
        if (var1 == '\t' && this.b.isFocused()) {
            this.b.setFocused(false);
        }

        if (var1 == '\r') {
            this.actionPerformed((GuiButton) this.buttonList.get(0));
        }

    }

    public void drawScreen(int var1, int var2, float var3) throws Throwable {
        this.drawDefaultBackground();
        this.b.drawTextBox();
        this.drawCenteredString(fontRendererObj, "↑  Nick, ↓ IP.", width / 2, height / 4 - 60 + 20, 16777215);
        this.c.drawTextBox();
        super.drawScreen(var1, var2, var3);
    }

    public void initGui() {
        Keyboard.enableRepeatEvents(true);
        this.buttonList.clear();
        this.buttonList.add(new GuiButton(0, width / 2 - 100, height / 4 + 96 + 12, "Done"));
        this.buttonList.add(new GuiButton(1, width / 2 - 100, height / 4 + 120 + 12, "Cancel"));
        this.b = new GuiTextField(2, fontRendererObj, width / 2 - 100, 116, 200, 20);
        this.c = new GuiTextField(3, fontRendererObj, width / 2 - 100, 96, 200, 20);
        this.b.setMaxStringLength(500);
        this.c.setMaxStringLength(500);
    }

    public void onGuiClosed() {
        Keyboard.enableRepeatEvents(false);
    }

    protected void mouseClicked(int var1, int var2, int var3) {
        super.mouseClicked(var1, var2, var3);
        this.b.mouseClicked(var1, var2, var3);
        this.c.mouseClicked(var1, var2, var3);
    }
}
