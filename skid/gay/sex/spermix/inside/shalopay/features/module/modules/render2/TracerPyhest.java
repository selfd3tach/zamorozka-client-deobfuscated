package skid.gay.sex.spermix.inside.shalopay.features.module.modules.render2;

import java.util.ArrayList;
import java.util.Iterator;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import org.lwjgl.opengl.GL11;
import skid.gay.sex.spermix.inside.shalopay.features.smthLikeInit.Main;
import skid.gay.sex.spermix.inside.shalopay.features.module.Module;
import skid.gay.sex.spermix.inside.shalopay.features.module.ModuleCategory;

public class TracerPyhest extends Module {
   public void j() {
      ArrayList var1 = new ArrayList();
      var1.add("Color");
      var1.add("Rainbow");
      Main.a.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("TypeTracer", this, "Color", var1));
      Main.a.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("Dist", this, true));
      if (Main.a.a("TypeTracer").c().equalsIgnoreCase("Rainbow")) {
         float var2 = (float)(System.currentTimeMillis() % 2000L) / 1000.0F;
         float var3 = 0.5F + 0.5F * MathHelper.sin(var2 * 3.1415927F);
         float var4 = 0.5F + 0.5F * MathHelper.sin((var2 + 1.3333334F) * 3.1415927F);
         float var5 = 0.5F + 0.5F * MathHelper.sin((var2 + 2.6666667F) * 3.1415927F);
         GL11.glColor4f(var3, var4, var5, 0.5F);
      }

   }

   public void i() {
      if (this.c()) {
         GL11.glPushMatrix();
         GL11.glEnable(2848);
         GL11.glDisable(2929);
         GL11.glDisable(3553);
         GL11.glDepthMask(false);
         GL11.glBlendFunc(770, 771);
         GL11.glEnable(3042);
         GL11.glLineWidth(1.0F);
         Iterator var2 = mc.world.loadedTileEntityList.iterator();

         while(var2.hasNext()) {
            TileEntity var1 = (TileEntity)var2.next();
            if (var1 instanceof TileEntityChest) {
               float var3 = (float)(System.currentTimeMillis() % 2000L) / 1000.0F;
               float var4 = 0.5F + 0.5F * MathHelper.sin(var3 * 3.1415927F);
               float var5 = 0.5F + 0.5F * MathHelper.sin((var3 + 1.3333334F) * 3.1415927F);
               float var6 = 0.5F + 0.5F * MathHelper.sin((var3 + 2.6666667F) * 3.1415927F);
               double var7 = (double)(var1.getPos().getX() + (var1.getPos().getX() - var1.getPos().getX())) - RenderManager.renderPosX;
               double var9 = (double)(var1.getPos().getY() + (var1.getPos().getY() - var1.getPos().getY())) - RenderManager.renderPosY;
               double var11 = (double)(var1.getPos().getZ() + (var1.getPos().getZ() - var1.getPos().getZ())) - RenderManager.renderPosZ;
               GL11.glColor4f(0.4F, 0.6F, 1.0F, 0.5F);
               TileEntityChest var10000 = (TileEntityChest)var1;
               Minecraft var10001 = mc;
               var10000.openInventory(Minecraft.player);
               Vec3d var14 = new Vec3d(0.0D, 0.0D, 1.0D);
               var10001 = mc;
               var14 = var14.rotatePitch(-((float)Math.toRadians((double)Minecraft.player.rotationPitch)));
               var10001 = mc;
               Vec3d var13 = var14.rotateYaw(-((float)Math.toRadians((double)Minecraft.player.rotationYaw)));
               GL11.glBegin(2);
               var10001 = mc;
               GL11.glVertex3d(var13.xCoord, (double)Minecraft.player.getEyeHeight() + var13.yCoord, var13.zCoord);
               GL11.glVertex3d(var7, var9, var11);
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

   public TracerPyhest() {
      super("Tracer Сhest", 0, ModuleCategory.RENDER2);
   }
}
