package skid.gay.sex.spermix.inside.shalopay.features.idk;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderGlobal;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import org.lwjgl.opengl.GL11;
import skid.gay.sex.spermix.inside.shalopay.features.smthLikeInit.Main;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class RenderUtils {

    public static boolean a;

    public static void b(BlockPos var0) {
        double var1 = var0.getX();
        Minecraft.getMinecraft().getRenderManager();
        double var3 = var1 - RenderManager.renderPosX;
        var1 = var0.getY();
        Minecraft.getMinecraft().getRenderManager();
        double var5 = var1 - RenderManager.renderPosY;
        var1 = var0.getZ();
        Minecraft.getMinecraft().getRenderManager();
        double var7 = var1 - RenderManager.renderPosZ;
        GL11.glPushMatrix();
        GL11.glEnable(3042);
        GL11.glBlendFunc(770, 771);
        GL11.glLineWidth(1.5F);
        GL11.glDisable(2896);
        GL11.glDisable(3553);
        GL11.glLineWidth(2.0F);
        GL11.glEnable(2848);
        GL11.glDisable(2929);
        GL11.glDepthMask(false);
        RenderManager var9 = Minecraft.getMinecraft().getRenderManager();
        RenderGlobal.drawSelectionBoundingBox(new AxisAlignedBB(var3, var5, var7, var3 + 1.0D, var5 + 1.0D, var7 + 1.0D), 0.8F, 0.4F, 0.8F, 0.5F);
        GL11.glLineWidth(2.0F);
        GL11.glDisable(2848);
        GL11.glEnable(3553);
        GL11.glEnable(2896);
        GL11.glEnable(2929);
        GL11.glDepthMask(true);
        GL11.glDisable(3042);
        GL11.glPopMatrix();
    }

    public static void a(AxisAlignedBB var0, float var1, float var2, float var3, float var4) {
        Tessellator var5 = Tessellator.getInstance();
        BufferBuilder var6 = var5.getBuffer();
        var6.begin(7, DefaultVertexFormats.POSITION_TEX);
        var6.pos(var0.minX, var0.minY, var0.minZ).color(var1, var2, var3, var4).endVertex();
        var6.pos(var0.minX, var0.maxY, var0.minZ).color(var1, var2, var3, var4).endVertex();
        var6.pos(var0.maxX, var0.minY, var0.minZ).color(var1, var2, var3, var4).endVertex();
        var6.pos(var0.maxX, var0.maxY, var0.minZ).color(var1, var2, var3, var4).endVertex();
        var6.pos(var0.maxX, var0.minY, var0.maxZ).color(var1, var2, var3, var4).endVertex();
        var6.pos(var0.maxX, var0.maxY, var0.maxZ).color(var1, var2, var3, var4).endVertex();
        var6.pos(var0.minX, var0.minY, var0.maxZ).color(var1, var2, var3, var4).endVertex();
        var6.pos(var0.minX, var0.maxY, var0.maxZ).color(var1, var2, var3, var4).endVertex();
        var5.draw();
        var6.begin(7, DefaultVertexFormats.POSITION_TEX);
        var6.pos(var0.maxX, var0.maxY, var0.minZ).color(var1, var2, var3, var4).endVertex();
        var6.pos(var0.maxX, var0.minY, var0.minZ).color(var1, var2, var3, var4).endVertex();
        var6.pos(var0.minX, var0.maxY, var0.minZ).color(var1, var2, var3, var4).endVertex();
        var6.pos(var0.minX, var0.minY, var0.minZ).color(var1, var2, var3, var4).endVertex();
        var6.pos(var0.minX, var0.maxY, var0.maxZ).color(var1, var2, var3, var4).endVertex();
        var6.pos(var0.minX, var0.minY, var0.maxZ).color(var1, var2, var3, var4).endVertex();
        var6.pos(var0.maxX, var0.maxY, var0.maxZ).color(var1, var2, var3, var4).endVertex();
        var6.pos(var0.maxX, var0.minY, var0.maxZ).color(var1, var2, var3, var4).endVertex();
        var5.draw();
        var6.begin(7, DefaultVertexFormats.POSITION_TEX);
        var6.pos(var0.minX, var0.maxY, var0.minZ).color(var1, var2, var3, var4).endVertex();
        var6.pos(var0.maxX, var0.maxY, var0.minZ).color(var1, var2, var3, var4).endVertex();
        var6.pos(var0.maxX, var0.maxY, var0.maxZ).color(var1, var2, var3, var4).endVertex();
        var6.pos(var0.minX, var0.maxY, var0.maxZ).color(var1, var2, var3, var4).endVertex();
        var6.pos(var0.minX, var0.maxY, var0.minZ).color(var1, var2, var3, var4).endVertex();
        var6.pos(var0.minX, var0.maxY, var0.maxZ).color(var1, var2, var3, var4).endVertex();
        var6.pos(var0.maxX, var0.maxY, var0.maxZ).color(var1, var2, var3, var4).endVertex();
        var6.pos(var0.maxX, var0.maxY, var0.minZ).color(var1, var2, var3, var4).endVertex();
        var5.draw();
        var6.begin(7, DefaultVertexFormats.POSITION_TEX);
        var6.pos(var0.minX, var0.minY, var0.minZ).color(var1, var2, var3, var4).endVertex();
        var6.pos(var0.maxX, var0.minY, var0.minZ).color(var1, var2, var3, var4).endVertex();
        var6.pos(var0.maxX, var0.minY, var0.maxZ).color(var1, var2, var3, var4).endVertex();
        var6.pos(var0.minX, var0.minY, var0.maxZ).color(var1, var2, var3, var4).endVertex();
        var6.pos(var0.minX, var0.minY, var0.minZ).color(var1, var2, var3, var4).endVertex();
        var6.pos(var0.minX, var0.minY, var0.maxZ).color(var1, var2, var3, var4).endVertex();
        var6.pos(var0.maxX, var0.minY, var0.maxZ).color(var1, var2, var3, var4).endVertex();
        var6.pos(var0.maxX, var0.minY, var0.minZ).color(var1, var2, var3, var4).endVertex();
        var5.draw();
        var6.begin(7, DefaultVertexFormats.POSITION_TEX);
        var6.pos(var0.minX, var0.minY, var0.minZ).color(var1, var2, var3, var4).endVertex();
        var6.pos(var0.minX, var0.maxY, var0.minZ).color(var1, var2, var3, var4).endVertex();
        var6.pos(var0.minX, var0.minY, var0.maxZ).color(var1, var2, var3, var4).endVertex();
        var6.pos(var0.minX, var0.maxY, var0.maxZ).color(var1, var2, var3, var4).endVertex();
        var6.pos(var0.maxX, var0.minY, var0.maxZ).color(var1, var2, var3, var4).endVertex();
        var6.pos(var0.maxX, var0.maxY, var0.maxZ).color(var1, var2, var3, var4).endVertex();
        var6.pos(var0.maxX, var0.minY, var0.minZ).color(var1, var2, var3, var4).endVertex();
        var6.pos(var0.maxX, var0.maxY, var0.minZ).color(var1, var2, var3, var4).endVertex();
        var5.draw();
        var6.begin(7, DefaultVertexFormats.POSITION_TEX);
        var6.pos(var0.minX, var0.maxY, var0.maxZ).color(var1, var2, var3, var4).endVertex();
        var6.pos(var0.minX, var0.minY, var0.maxZ).color(var1, var2, var3, var4).endVertex();
        var6.pos(var0.minX, var0.maxY, var0.minZ).color(var1, var2, var3, var4).endVertex();
        var6.pos(var0.minX, var0.minY, var0.minZ).color(var1, var2, var3, var4).endVertex();
        var6.pos(var0.maxX, var0.maxY, var0.minZ).color(var1, var2, var3, var4).endVertex();
        var6.pos(var0.maxX, var0.minY, var0.minZ).color(var1, var2, var3, var4).endVertex();
        var6.pos(var0.maxX, var0.maxY, var0.maxZ).color(var1, var2, var3, var4).endVertex();
        var6.pos(var0.maxX, var0.minY, var0.maxZ).color(var1, var2, var3, var4).endVertex();
        var5.draw();
    }

    public static void a(BlockPos var0) {
        double var1 = var0.getX();
        Minecraft.getMinecraft().getRenderManager();
        double var3 = var1 - RenderManager.renderPosX;
        var1 = var0.getY();
        Minecraft.getMinecraft().getRenderManager();
        double var5 = var1 - RenderManager.renderPosY;
        var1 = var0.getZ();
        Minecraft.getMinecraft().getRenderManager();
        double var7 = var1 - RenderManager.renderPosZ;
        GL11.glBlendFunc(770, 771);
        GL11.glEnable(3042);
        GL11.glLineWidth(2.0F);
        GL11.glDisable(3553);
        GL11.glDisable(2929);
        GL11.glDepthMask(false);
        RenderGlobal.drawSelectionBoundingBox(new AxisAlignedBB(var3, var5, var7, var3 + 1.0D, var5 + 1.0D, var7 + 1.0D), 34.0F, 255.0F, 5.0F, 1.0F);
        GL11.glEnable(3553);
        GL11.glEnable(2929);
        GL11.glDepthMask(true);
        GL11.glDisable(3042);
    }

    public static void a(BlockPos var0, Color var1) {
        double var2 = var0.getX();
        Minecraft.getMinecraft().getRenderManager();
        double var4 = var2 - RenderManager.renderPosX;
        var2 = var0.getY();
        Minecraft.getMinecraft().getRenderManager();
        double var6 = var2 - RenderManager.renderPosY;
        var2 = var0.getZ();
        Minecraft.getMinecraft().getRenderManager();
        double var8 = var2 - RenderManager.renderPosZ;
        GL11.glBlendFunc(770, 771);
        Tessellator var10 = Tessellator.getInstance();
        BufferBuilder var11 = var10.getBuffer();
        GL11.glPushMatrix();
        GL11.glBlendFunc(770, 771);
        GL11.glEnable(3042);
        GL11.glLineWidth(1.0F);
        GL11.glDisable(3553);
        GL11.glDisable(2896);
        GL11.glDisable(2929);
        GL11.glDepthMask(false);
        GL11.glColor4d((double) ((float) var1.getRed() / 255.0F), (double) ((float) var1.getGreen() / 255.0F), (double) ((float) var1.getBlue() / 255.0F), 0.15000000596046448D);
        RenderManager var12 = Minecraft.getMinecraft().getRenderManager();
        a(new AxisAlignedBB(var4, var6, var8, var4 + 1.0D, var6 + 1.0D, var8 + 1.0D), 0.0F, 0.0F, 0.0F, 0.0F);
        GL11.glColor4d(0.4000000059604645D, 0.6000000238418579D, 1.0D, 1.0D);
        GL11.glLineWidth(2.0F);
        GL11.glEnable(3553);
        GL11.glEnable(2929);
        GL11.glDepthMask(true);
        GL11.glDisable(3042);
        GL11.glPopMatrix();
    }

    public static void a(AxisAlignedBB var0) {
        Tessellator var1 = Tessellator.getInstance();
        BufferBuilder var2 = var1.getBuffer();
        var2.begin(3, DefaultVertexFormats.POSITION);
        var2.pos(var0.minX, var0.minY, var0.minZ).endVertex();
        var2.pos(var0.maxX, var0.minY, var0.minZ).endVertex();
        var2.pos(var0.maxX, var0.minY, var0.maxZ).endVertex();
        var2.pos(var0.minX, var0.minY, var0.maxZ).endVertex();
        var2.pos(var0.minX, var0.minY, var0.minZ).endVertex();
        var1.draw();
        var2.begin(3, DefaultVertexFormats.POSITION);
        var2.pos(var0.minX, var0.maxY, var0.minZ).endVertex();
        var2.pos(var0.maxX, var0.maxY, var0.minZ).endVertex();
        var2.pos(var0.maxX, var0.maxY, var0.maxZ).endVertex();
        var2.pos(var0.minX, var0.maxY, var0.maxZ).endVertex();
        var2.pos(var0.minX, var0.maxY, var0.minZ).endVertex();
        var1.draw();
        var2.begin(1, DefaultVertexFormats.POSITION);
        var2.pos(var0.minX, var0.minY, var0.minZ).endVertex();
        var2.pos(var0.minX, var0.maxY, var0.minZ).endVertex();
        var2.pos(var0.maxX, var0.minY, var0.minZ).endVertex();
        var2.pos(var0.maxX, var0.maxY, var0.minZ).endVertex();
        var2.pos(var0.maxX, var0.minY, var0.maxZ).endVertex();
        var2.pos(var0.maxX, var0.maxY, var0.maxZ).endVertex();
        var2.pos(var0.minX, var0.minY, var0.maxZ).endVertex();
        var2.pos(var0.minX, var0.maxY, var0.maxZ).endVertex();
        var1.draw();
    }

    public static void b(Entity var0, Color var1) {
        GL11.glPushMatrix();
        GL11.glBlendFunc(770, 771);
        GL11.glLineWidth(1.0F);
        GL11.glDisable(3553);
        GL11.glDepthMask(false);
        GL11.glColor4d((double) ((float) var1.getRed() / 255.0F), (double) ((float) var1.getGreen() / 255.0F), (double) ((float) var1.getBlue() / 255.0F), 0.15000000596046448D);
        RenderManager var2 = Minecraft.getMinecraft().getRenderManager();
        a(new AxisAlignedBB(var0.boundingBox.minX - 0.05D - var0.posX + (var0.posX - RenderManager.renderPosX), var0.boundingBox.minY - var0.posY + (var0.posY - RenderManager.renderPosY), var0.boundingBox.minZ - 0.05D - var0.posZ + (var0.posZ - RenderManager.renderPosZ), var0.boundingBox.maxX + 0.05D - var0.posX + (var0.posX - RenderManager.renderPosX), var0.boundingBox.maxY + 0.1D - var0.posY + (var0.posY - RenderManager.renderPosY), var0.boundingBox.maxZ + 0.05D - var0.posZ + (var0.posZ - RenderManager.renderPosZ)), 0.0F, 0.0F, 0.0F, 0.0F);
        GL11.glColor4d(0.0D, 0.0D, 0.0D, 0.5D);
        a(new AxisAlignedBB(var0.boundingBox.minX - 0.05D - var0.posX + (var0.posX - RenderManager.renderPosX), var0.boundingBox.minY - var0.posY + (var0.posY - RenderManager.renderPosY), var0.boundingBox.minZ - 0.05D - var0.posZ + (var0.posZ - RenderManager.renderPosZ), var0.boundingBox.maxX + 0.05D - var0.posX + (var0.posX - RenderManager.renderPosX), var0.boundingBox.maxY + 0.1D - var0.posY + (var0.posY - RenderManager.renderPosY), var0.boundingBox.maxZ + 0.05D - var0.posZ + (var0.posZ - RenderManager.renderPosZ)));
        GL11.glLineWidth(2.0F);
        GL11.glEnable(3553);
        GL11.glDepthMask(true);
        GL11.glPopMatrix();
    }

    public static void a(float var0, float var1, float var2, float var3, int var4) {
        float var5 = (float) (var4 >> 24 & 255) / 255.0F;
        float var6 = (float) (var4 >> 16 & 255) / 255.0F;
        float var7 = (float) (var4 >> 8 & 255) / 255.0F;
        float var8 = (float) (var4 & 255) / 255.0F;
        GL11.glPushMatrix();
        GL11.glEnable(3042);
        GL11.glDisable(3553);
        GL11.glBlendFunc(770, 771);
        GL11.glEnable(2848);
        GL11.glColor4f(var6, var7, var8, var5);
        GL11.glBegin(7);
        GL11.glVertex2d((double) var2, (double) var1);
        GL11.glVertex2d((double) var0, (double) var1);
        GL11.glVertex2d((double) var0, (double) var3);
        GL11.glVertex2d((double) var2, (double) var3);
        GL11.glEnd();
        GL11.glEnable(3553);
        GL11.glDisable(3042);
        GL11.glDisable(2848);
        GL11.glPopMatrix();
    }

    public static void a(Entity var0, Color var1) {
        GL11.glPushMatrix();
        GL11.glBlendFunc(770, 771);
        GL11.glEnable(3042);
        GL11.glLineWidth(1.0F);
        GL11.glDisable(3553);
        GL11.glDisable(2929);
        GL11.glDepthMask(false);
        GL11.glColor4d((double) ((float) var1.getRed() / 255.0F), (double) ((float) var1.getGreen() / 255.0F), (double) ((float) var1.getBlue() / 255.0F), 0.15000000596046448D);
        RenderManager var2 = Minecraft.getMinecraft().getRenderManager();
        a(new AxisAlignedBB(var0.boundingBox.minX - 0.05D - var0.posX + (var0.posX - RenderManager.renderPosX), var0.boundingBox.minY - var0.posY + (var0.posY - RenderManager.renderPosY), var0.boundingBox.minZ - 0.07D - var0.posZ + (var0.posZ - RenderManager.renderPosZ), var0.boundingBox.maxX + 0.07D - var0.posX + (var0.posX - RenderManager.renderPosX), var0.boundingBox.maxY + 0.1D - var0.posY + (var0.posY - RenderManager.renderPosY), var0.boundingBox.maxZ + 0.07D - var0.posZ + (var0.posZ - RenderManager.renderPosZ)), 0.0F, 0.0F, 0.0F, 0.0F);
        GL11.glColor4d(0.4000000059604645D, 0.6000000238418579D, 1.0D, 1.0D);
        a(new AxisAlignedBB(var0.boundingBox.minX - 0.05D - var0.posX + (var0.posX - RenderManager.renderPosX), var0.boundingBox.minY - var0.posY + (var0.posY - RenderManager.renderPosY), var0.boundingBox.minZ - 0.07D - var0.posZ + (var0.posZ - RenderManager.renderPosZ), var0.boundingBox.maxX + 0.07D - var0.posX + (var0.posX - RenderManager.renderPosX), var0.boundingBox.maxY + 0.1D - var0.posY + (var0.posY - RenderManager.renderPosY), var0.boundingBox.maxZ + 0.07D - var0.posZ + (var0.posZ - RenderManager.renderPosZ)));
        GL11.glLineWidth(2.0F);
        GL11.glEnable(3553);
        GL11.glEnable(2929);
        GL11.glDepthMask(true);
        GL11.glDisable(3042);
        GL11.glPopMatrix();
    }

    public static void a() throws IOException {
        String var0 = "http://zamorozka.fun/version.php";
        URL var1 = new URL(var0);
        HttpURLConnection var2 = (HttpURLConnection) var1.openConnection();
        var2.setRequestMethod("GET");
        var2.setRequestProperty("User-Agent", "Mozilla/5.0");
        int var3 = var2.getResponseCode();
        BufferedReader var4 = new BufferedReader(new InputStreamReader(var2.getInputStream()));
        StringBuffer var6 = new StringBuffer();

        String var5;
        while ((var5 = var4.readLine()) != null) {
            var6.append(var5);
        }

        var4.close();
        new ScaledResolution(Minecraft.getMinecraft());
        a = var6.toString().indexOf(Main.d) != -1;

    }

    public static void a(double var0, double var2, double var4, double var6, float var8, int var9, int var10) {
        a((float) var0, (float) var2, (float) var4, (float) var6, var10);
        float var11 = (float) (var9 >> 24 & 255) / 255.0F;
        float var12 = (float) (var9 >> 16 & 255) / 255.0F;
        float var13 = (float) (var9 >> 8 & 255) / 255.0F;
        float var14 = (float) (var9 & 255) / 255.0F;
        GL11.glPushMatrix();
        GL11.glEnable(3042);
        GL11.glDisable(3553);
        GL11.glBlendFunc(770, 771);
        GL11.glEnable(2848);
        GL11.glColor4f(var12, var13, var14, var11);
        GL11.glLineWidth(var8);
        GL11.glBegin(1);
        GL11.glVertex2d(var0, var2);
        GL11.glVertex2d(var0, var6);
        GL11.glVertex2d(var4, var6);
        GL11.glVertex2d(var4, var2);
        GL11.glVertex2d(var0, var2);
        GL11.glVertex2d(var4, var2);
        GL11.glVertex2d(var0, var6);
        GL11.glVertex2d(var4, var6);
        GL11.glEnd();
        GL11.glEnable(3553);
        GL11.glDisable(3042);
        GL11.glDisable(2848);
        GL11.glPopMatrix();
    }

    public static void a(int var0, int var1, int var2, int var3, ResourceLocation var4) {
        GlStateManager.enableAlpha();
        GlStateManager.disableLighting();
        GlStateManager.disableFog();
        Tessellator var5 = Tessellator.getInstance();
        BufferBuilder var6 = var5.getBuffer();
        Minecraft.getMinecraft().getTextureManager().bindTexture(var4);
        GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
        var6.begin(7, DefaultVertexFormats.POSITION_TEX_COLOR);
        var6.pos(var0, var1 + var3, 0.0D).tex(0.0D, 1.0D).color(255, 255, 255, 255).endVertex();
        var6.pos(var0 + var2, var1 + var3, 0.0D).tex(1.0D, 1.0D).color(255, 255, 255, 255).endVertex();
        var6.pos(var0 + var2, var1, 0.0D).tex(1.0D, 0.0D).color(255, 255, 255, 255).endVertex();
        var6.pos(var0, var1, 0.0D).tex(0.0D, 0.0D).color(255, 255, 255, 255).endVertex();
        var5.draw();
        GlStateManager.disableAlpha();
    }
}
