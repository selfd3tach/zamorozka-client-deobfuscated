package skid.gay.sex.spermix.inside.shalopay.features.module.modules.render2;

import java.util.Iterator;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityShulkerBox;
import net.minecraft.util.math.Vec3d;
import org.lwjgl.opengl.GL11;
import skid.gay.sex.spermix.inside.shalopay.features.module.Module;
import skid.gay.sex.spermix.inside.shalopay.features.module.ModuleCategory;

public class TracerShulker extends Module {
   public void i() {
      if (this.c()) {
         GL11.glPushMatrix();
         GL11.glEnable(2848);
         GL11.glDisable(2929);
         GL11.glDisable(3553);
         GL11.glDepthMask(false);
         GL11.glBlendFunc(770, 771);
         GL11.glEnable(3042);
         GL11.glLineWidth(1.5F);
         Iterator var2 = mc.world.loadedTileEntityList.iterator();

         while(var2.hasNext()) {
            TileEntity var1 = (TileEntity)var2.next();
            if (var1 instanceof TileEntityShulkerBox) {
               double var3 = (double)(var1.getPos().getX() + (var1.getPos().getX() - var1.getPos().getX())) - RenderManager.renderPosX;
               double var5 = (double)(var1.getPos().getY() + (var1.getPos().getY() - var1.getPos().getY())) - RenderManager.renderPosY;
               double var7 = (double)(var1.getPos().getZ() + (var1.getPos().getZ() - var1.getPos().getZ())) - RenderManager.renderPosZ;
               GL11.glColor4f(0.8F, 0.4F, 0.8F, 0.3F);
               Vec3d var10000 = new Vec3d(0.0D, 0.0D, 1.0D);
               Minecraft var10001 = mc;
               var10000 = var10000.rotatePitch(-((float)Math.toRadians((double)Minecraft.player.rotationPitch)));
               var10001 = mc;
               Vec3d var9 = var10000.rotateYaw(-((float)Math.toRadians((double)Minecraft.player.rotationYaw)));
               GL11.glBegin(2);
               var10001 = mc;
               GL11.glVertex3d(var9.xCoord, (double)Minecraft.player.getEyeHeight() + var9.yCoord, var9.zCoord);
               GL11.glVertex3d(var3, var5, var7);
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

   public TracerShulker() {
      super("Tracer Shulker", 0, ModuleCategory.RENDER2);
   }
}
