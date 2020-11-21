package skid.gay.sex.spermix.inside.shalopay.features.idk;

import net.minecraft.client.Minecraft;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

public class RotationUtils {

    public static float[] b = null;

    public static Minecraft a = Minecraft.getMinecraft();

    public static Vec3d a() {
        return new Vec3d(Minecraft.player.posX, Minecraft.player.posY + (double) Minecraft.player.getEyeHeight(), Minecraft.player.posZ);
    }

    private static float[] b(Vec3d var0) {
        Vec3d var1 = a();
        double var2 = var0.xCoord - var1.xCoord;
        double var4 = var0.yCoord - var1.yCoord;
        double var6 = var0.zCoord - var1.zCoord;
        double var8 = Math.sqrt(var2 * var2 + var6 * var6);
        float var10 = (float) Math.toDegrees(Math.atan2(var6, var2)) - 90.0F;
        float var11 = (float) (-Math.toDegrees(Math.atan2(var4, var8)));
        return new float[]{Minecraft.player.rotationYaw + MathHelper.wrapDegrees(var10 - Minecraft.player.rotationYaw), Minecraft.player.rotationPitch + MathHelper.wrapDegrees(var11 - Minecraft.player.rotationPitch)};
    }

    public static void a(Vec3d var0) {
        b = b(var0);
    }
}
