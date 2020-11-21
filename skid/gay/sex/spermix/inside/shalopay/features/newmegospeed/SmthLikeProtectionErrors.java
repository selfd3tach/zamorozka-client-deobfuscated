package skid.gay.sex.spermix.inside.shalopay.features.newmegospeed;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import org.lwjgl.input.Keyboard;
import skid.gay.sex.spermix.inside.shalopay.features.smthLikeInit.Main;

import java.util.Timer;

public class SmthLikeProtectionErrors extends GuiScreen {
    public SmthLikeProtectionErrors() {
    }

    public void drawScreen(int var1, int var2, float var3) {
        this.drawDefaultBackground();
        ScaledResolution var4 = new ScaledResolution(Minecraft.getMinecraft());
        Gui.drawRect(var4.getScaledWidth() - 180, 80.0D, var4.getScaledWidth() - 500, var4.getScaledHeight() - 30, -2012213232);
        Main.h.a.a("Error connecting to the game!", var4.getScaledWidth() - 445, 90.0D, -4063187);
        Main.h.e.a("Your client version is not valid.", var4.getScaledWidth() - 420, 120.0D, -4063187);
        Main.h.e.a("Attempted authorization without licenses was noticed.", var4.getScaledWidth() - 445, 140.0D, -4063187);
        Main.h.e.a("Your data has been sent for processing.", var4.getScaledWidth() - 445, 160.0D, -4063187);
        short var5 = 10000;
        Main.h.e.a(String.valueOf((new StringBuilder("You will be kicked out of the game through: ")).append(var5)), var4.getScaledWidth() - 445, 200.0D, -4063187);
        (new Timer()).schedule(new idk4(this), var5);
        ItemStack var6 = new ItemStack(Items.GOLDEN_APPLE);
        itemRender.renderItemAndEffectIntoGUI(var6, 1, 20);
        itemRender.renderItemOverlays(fontRendererObj, var6, 1, 20);
    }

    public void updateScreen() {
    }

    public void onGuiClosed() {
        Keyboard.enableRepeatEvents(false);
    }
}
