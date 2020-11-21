package skid.gay.sex.spermix.inside.shalopay.features.module.modules.render2;

import net.minecraft.client.Minecraft;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import org.lwjgl.opengl.GL11;
import skid.gay.sex.spermix.inside.shalopay.features.module.Module;
import skid.gay.sex.spermix.inside.shalopay.features.module.ModuleCategory;

public class TracerPortal extends Module {

    private static final int g = 40;

    private int d;

    private int e;

    private int f;

    public TracerPortal() {
        super("Tracer Portal", 0, ModuleCategory.RENDER2);
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

            for (int var1 = -g; var1 < g; ++var1) {
                for (int var2 = g; var2 > -g; --var2) {
                    for (int var3 = -g; var3 < g; ++var3) {
                        Minecraft var10001 = mc;
                        this.d = (int) Minecraft.player.posX + var1;
                        var10001 = mc;
                        this.e = (int) Minecraft.player.posY + var2;
                        var10001 = mc;
                        this.f = (int) Minecraft.player.posZ + var3;
                        float var4 = (float) (System.currentTimeMillis() % 2000L) / 1000.0F;
                        float var5 = 0.5F + 0.5F * MathHelper.sin(var4 * 3.1415927F);
                        float var6 = 0.5F + 0.5F * MathHelper.sin((var4 + 1.3333334F) * 3.1415927F);
                        float var7 = 0.5F + 0.5F * MathHelper.sin((var4 + 2.6666667F) * 3.1415927F);
                        GL11.glColor4f(0.4F, 0.6F, 1.0F, 1.71F);
                        Vec3d var10000 = new Vec3d(0.0D, 0.0D, 1.0D);
                        var10001 = mc;
                        var10000 = var10000.rotatePitch(-((float) Math.toRadians(Minecraft.player.rotationPitch)));
                        var10001 = mc;
                        Vec3d var8 = var10000.rotateYaw(-((float) Math.toRadians(Minecraft.player.rotationYaw)));
                        GL11.glBegin(2);
                        var10001 = mc;
                        GL11.glVertex3d(var8.xCoord, (double) Minecraft.player.getEyeHeight() + var8.yCoord, var8.zCoord);
                        GL11.glVertex3d((double) this.d, (double) this.e, (double) this.f);
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
    }
}
