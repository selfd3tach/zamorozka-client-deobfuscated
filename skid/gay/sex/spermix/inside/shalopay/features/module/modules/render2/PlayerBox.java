package skid.gay.sex.spermix.inside.shalopay.features.module.modules.render2;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import org.lwjgl.opengl.GL11;
import skid.gay.sex.spermix.inside.shalopay.features.module.Module;
import skid.gay.sex.spermix.inside.shalopay.features.module.ModuleCategory;

import java.util.Iterator;

public class PlayerBox extends Module {
    public PlayerBox() {
        super("PlayerBox", 0, ModuleCategory.RENDER2);
    }

    public void onRender() {
        if (this.getState()) {
            Iterator var2 = mc.world.playerEntities.iterator();

            while (var2.hasNext()) {
                EntityPlayer var1 = (EntityPlayer) var2.next();
                if (var1 != null && var1.deathTime <= 0) {
                    Minecraft var10001 = mc;
                    if (var1 != Minecraft.player) {
                        double var3 = var1.lastTickPosX + (var1.posX - var1.lastTickPosX) - RenderManager.renderPosX;
                        double var5 = var1.lastTickPosY + (var1.posY - var1.lastTickPosY) - RenderManager.renderPosY;
                        double var7 = var1.lastTickPosZ + (var1.posZ - var1.lastTickPosZ) - RenderManager.renderPosZ;
                        this.a(var1, var3, var5, var7);
                    }
                }
            }
        }

    }

    private void a(Entity var1, double var2, double var4, double var6) {
        String var8 = var1.getName();
        float var9 = 5.0F;
        GL11.glPushMatrix();
        GL11.glTranslatef((float) var2, (float) var4, (float) var6);
        GL11.glNormal3f(0.0F, 1.0F, 0.0F);
        GL11.glRotatef(-RenderManager.playerViewY, 0.0F, 0.2F, 0.0F);
        GL11.glRotatef(RenderManager.playerViewX, 1.0F, 0.0F, 0.0F);
        GL11.glEnable(3042);
        GL11.glBlendFunc(770, 771);
        GL11.glEnable(2848);
        GL11.glLineWidth(2.0F);
        GL11.glDisable(3553);
        GL11.glDisable(2929);
        Tessellator var10 = Tessellator.getInstance();
        BufferBuilder var11 = var10.getBuffer();
        if (((EntityLivingBase) var1).getHealth() <= 20.0F) {
            Gui.drawRect(-0.5D, 1.5D, 0.5D, 1.0D, -14880362);
            skid.gay.sex.spermix.inside.shalopay.features.idk.RenderUtils.a(-0.5D, 2.0D, 0.5D, 0.5D, 1.0F, -14880362, -14880362);
        }

        if (((EntityLivingBase) var1).getHealth() <= 10.0F) {
            Gui.drawRect(-0.5D, 1.5D, 0.5D, 1.0D, -196692);
            skid.gay.sex.spermix.inside.shalopay.features.idk.RenderUtils.a(-0.5D, 2.0D, 0.5D, 0.5D, 1.0F, -196692, -2012213232);
        }

        if (((EntityLivingBase) var1).getHealth() <= 5.0F) {
            Gui.drawRect(-0.5D, 1.5D, 0.5D, 1.0D, -63232);
            skid.gay.sex.spermix.inside.shalopay.features.idk.RenderUtils.a(-0.5D, 2.0D, 0.5D, 0.5D, 1.0F, -63232, -2012213232);
        }

        GL11.glDisable(3042);
        GL11.glPopMatrix();
        GL11.glEnable(2929);
        GL11.glEnable(3553);
        GL11.glDisable(3042);
        GL11.glDisable(2848);
    }
}
