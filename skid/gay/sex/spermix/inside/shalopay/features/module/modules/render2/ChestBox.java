package skid.gay.sex.spermix.inside.shalopay.features.module.modules.render2;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderGlobal;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.inventory.ContainerChest;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.tileentity.TileEntityDispenser;
import net.minecraft.tileentity.TileEntityEnderChest;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import org.lwjgl.opengl.GL11;
import skid.gay.sex.spermix.inside.shalopay.features.smthLikeInit.Main;
import skid.gay.sex.spermix.inside.shalopay.features.module.Module;
import skid.gay.sex.spermix.inside.shalopay.features.module.ModuleCategory;

public class ChestBox extends Module {
   
   public static ArrayList e = new ArrayList();
   
   TileEntity d;

   public ChestBox() {
      super("ChestBox", 0, ModuleCategory.RENDER2);
   }

   public void i() {
      if (this.c()) {
         Iterator var2 = mc.world.loadedTileEntityList.iterator();

         while(var2.hasNext()) {
            Object var1 = var2.next();
            if (var1 instanceof TileEntityChest) {
               float[] var3 = this.a(this.d);
               a(((TileEntityChest)var1).getPos(), (AxisAlignedBB)null, (new Color(var3[0], var3[1], var3[2])).getRGB());
            }
         }
      }

   }

   public static void a(BlockPos var0, AxisAlignedBB var1, int var2) {
      double var3 = (double)var0.getX();
      Minecraft.getMinecraft().getRenderManager();
      double var5 = var3 - RenderManager.renderPosX;
      var3 = (double)var0.getY();
      Minecraft.getMinecraft().getRenderManager();
      double var7 = var3 - RenderManager.renderPosY;
      var3 = (double)var0.getZ();
      Minecraft.getMinecraft().getRenderManager();
      double var9 = var3 - RenderManager.renderPosZ;
      GL11.glPushMatrix();
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 771);
      GL11.glLineWidth(1.5F);
      GL11.glDisable(2896);
      GL11.glDisable(3553);
      GL11.glLineWidth(1.0F);
      GL11.glEnable(2848);
      GL11.glDisable(2929);
      GL11.glDepthMask(false);
      RenderManager var11 = Minecraft.getMinecraft().getRenderManager();
      if (Main.a.a("LineBox").e()) {
         RenderGlobal.drawSelectionBoundingBox(new AxisAlignedBB(var5, var7, var9, var5 + 1.0D, var7 + 1.0D, var9 + 1.0D), 0.4F, 0.6F, 1.0F, 1.0F);
      }

      Minecraft var10000;
      float var12;
      if (Main.a.a("CFilledBox").e()) {
         var10000 = mc;
         var12 = (float)Minecraft.player.getDistanceSq(var0);
         GL11.glColor4f(var12, 0.0F, 1.0F, 0.5F);
         skid.gay.sex.spermix.inside.shalopay.features.idk.RenderUtils.a(new AxisAlignedBB(var5, var7, var9, var5 + 1.0D, var7 + 1.0D, var9 + 1.0D), 0.4F, 0.6F, 1.0F, 1.0F);
      }

      if (Main.a.a("FilledBox").e()) {
         RenderGlobal.renderFilledBox(new AxisAlignedBB(var5 + 0.1D, var7, var9, var5 + 0.9D, var7 + 1.0D, var9 + 1.0D), 0.4F, 0.6F, 1.0F, 1.0F);
      }

      if (Main.a.a("AutoEsp").e()) {
         if (Main.e().openContainer != null && Main.e().openContainer instanceof ContainerChest) {
            e.add(var0);
         }

         if (e.contains(var0)) {
            GL11.glColor3f(0.0F, 149.0F, 199.0F);
            skid.gay.sex.spermix.inside.shalopay.features.idk.RenderUtils.a(new AxisAlignedBB(var5, var7, var9, var5 + 1.0D, var7 + 1.0D, var9 + 1.0D), 0.4F, 0.6F, 1.0F, 1.0F);
         } else {
            var10000 = mc;
            var12 = (float)Minecraft.player.getDistanceSq(var0);
            GL11.glColor4f(var12, 0.0F, 1.0F, 0.5F);
            skid.gay.sex.spermix.inside.shalopay.features.idk.RenderUtils.a(new AxisAlignedBB(var5, var7, var9, var5 + 1.0D, var7 + 1.0D, var9 + 1.0D), 0.4F, 0.6F, 1.0F, 1.0F);
         }
      }

      GL11.glLineWidth(2.0F);
      GL11.glDisable(2848);
      GL11.glEnable(3553);
      GL11.glEnable(2896);
      GL11.glEnable(2929);
      GL11.glDepthMask(true);
      GL11.glDisable(3042);
      GL11.glPopMatrix();
   }

   public void j() {
      Main.a.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("LineBox", this, true));
      Main.a.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("AutoEsp", this, false));
      Main.a.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("WallHack", this, false));
      Main.a.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("FilledBox", this, false));
      Main.a.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("CFilledBox", this, false));
   }

   private float[] a(TileEntity var1) {
      if (var1 instanceof TileEntityChest) {
         return new float[]{0.0F, 0.5F, 0.5F};
      } else if (var1 instanceof TileEntityDispenser) {
         return new float[]{0.5F, 0.5F, 0.5F};
      } else {
         return var1 instanceof TileEntityEnderChest ? new float[]{0.3F, 0.0F, 0.3F} : new float[]{1.0F, 1.0F, 1.0F};
      }
   }
}
