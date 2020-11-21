package skid.gay.sex.spermix.inside.shalopay.features.module.modules.render2;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import org.lwjgl.opengl.GL11;
import skid.gay.sex.spermix.inside.shalopay.features.module.Module;
import skid.gay.sex.spermix.inside.shalopay.features.module.ModuleCategory;
import skid.gay.sex.spermix.inside.shalopay.features.smthLikeInit.Main;
import skid.gay.sex.spermix.inside.shalopay.features.smthLikeInit.idk;

import java.util.ArrayList;
import java.util.Iterator;

public class TracerPlayers extends Module {
    public TracerPlayers() {
        super("Tracer Players", 0, ModuleCategory.RENDER2);
    }

    public void onRender() {
        if (this.getState()) {
            GL11.glPushMatrix();
            GL11.glEnable(2848);
            GL11.glDisable(2929);
            GL11.glDisable(3553);
            GL11.glDepthMask(false);
            GL11.glBlendFunc(770, 771);
            GL11.glEnable(3042);
            GL11.glLineWidth(1.0F);
            Iterator var2 = mc.world.loadedEntityList.iterator();

            while (var2.hasNext()) {
                Entity var1 = (Entity) var2.next();
                Minecraft var10001 = mc;
                if (var1 != Minecraft.player && var1 != null && var1 instanceof EntityPlayer) {
                    float var3 = mc.renderViewEntity.getDistanceToEntity(var1);
                    double var4 = var1.lastTickPosX + (var1.posX - var1.lastTickPosX) - RenderManager.renderPosX;
                    double var6 = var1.lastTickPosY + (var1.posY - var1.lastTickPosY) - RenderManager.renderPosY;
                    double var8 = var1.lastTickPosZ + (var1.posZ - var1.lastTickPosZ) - RenderManager.renderPosZ;
                    float var10 = (float) (System.currentTimeMillis() % 2000L) / 1000.0F;
                    float var11 = 0.5F + 0.5F * MathHelper.sin(var10 * 3.1415927F);
                    float var12 = 0.5F + 0.5F * MathHelper.sin((var10 + 1.3333334F) * 3.1415927F);
                    float var13 = 0.5F + 0.5F * MathHelper.sin((var10 + 2.6666667F) * 3.1415927F);
                    float var14;
                    Minecraft var10000;
                    if (Main.a.a("TypeTracer").c().equalsIgnoreCase("Rainbow")) {
                        var10000 = mc;
                        var14 = Minecraft.player.getDistanceToEntity(var1) / 20.0F;
                        GL11.glColor4f(var11, var12, var14, 0.5F);
                    } else if (idk.a().b(var1.getName())) {
                        GL11.glColor4d(0.0D, 1.0D, 0.0D, 0.8999999761581421D);
                    } else if (Main.a.a("Dist").e()) {
                        var10000 = mc;
                        var14 = Minecraft.player.getDistanceToEntity(var1) / 20.0F;
                        GL11.glColor4f(var14, 0.0F, 1.0F, 0.5F);
                    } else {
                        GL11.glColor4f(0.4F, 0.6F, 1.0F, 1.71F);
                    }

                    Vec3d var16 = new Vec3d(0.0D, 0.0D, 1.0D);
                    var10001 = mc;
                    var16 = var16.rotatePitch(-((float) Math.toRadians(Minecraft.player.rotationPitch)));
                    var10001 = mc;
                    Vec3d var15 = var16.rotateYaw(-((float) Math.toRadians(Minecraft.player.rotationYaw)));
                    GL11.glBegin(2);
                    var10001 = mc;
                    GL11.glVertex3d(var15.xCoord, (double) Minecraft.player.getEyeHeight() + var15.yCoord, var15.zCoord);
                    GL11.glVertex3d(var4, var6, var8);
                    GL11.glEnd();
                }
            }

            GL11.glDisable(3042);
            GL11.glDepthMask(true);
            GL11.glEnable(3553);
            GL11.glEnable(2929);
            GL11.glDisable(2848);
            GL11.glPopMatrix();
        }
    }

    public void initModule() {
        ArrayList var1 = new ArrayList();
        var1.add("Color");
        var1.add("Rainbow");
        Main.a.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("TypeTracer", this, "Color", var1));
        Main.a.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("Dist", this, true));
        if (Main.a.a("TypeTracer").c().equalsIgnoreCase("Rainbow")) {
            float var2 = (float) (System.currentTimeMillis() % 2000L) / 1000.0F;
            float var3 = 0.5F + 0.5F * MathHelper.sin(var2 * 3.1415927F);
            float var4 = 0.5F + 0.5F * MathHelper.sin((var2 + 1.3333334F) * 3.1415927F);
            float var5 = 0.5F + 0.5F * MathHelper.sin((var2 + 2.6666667F) * 3.1415927F);
            GL11.glColor4f(var3, var4, var5, 0.5F);
        }

    }
}
