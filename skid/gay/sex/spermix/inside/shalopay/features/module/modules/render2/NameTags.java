package skid.gay.sex.spermix.inside.shalopay.features.module.modules.render2;

import java.util.Iterator;
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

public class NameTags extends Module {
   public NameTags() {
      super("NameTags", 0, ModuleCategory.RENDER2);
   }

   public void i() {
      if (this.c()) {
         Iterator var2 = mc.world.playerEntities.iterator();

         while(var2.hasNext()) {
            EntityPlayer var1 = (EntityPlayer)var2.next();
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
      String var8 = "";
      String var9 = var1.getName();
      if (var1 instanceof EntityLivingBase) {
         if (((EntityLivingBase)var1).getHealth() < 15.0F) {
            var8 = String.valueOf((new StringBuilder(" §6")).append((double)Math.round(((EntityLivingBase)var1).getHealth() * 100.0F / 100.0F) / 2.0D));
         } else if (((EntityLivingBase)var1).getHealth() > 15.0F) {
            var8 = String.valueOf((new StringBuilder(" §a")).append((double)Math.round(((EntityLivingBase)var1).getHealth() * 100.0F / 100.0F) / 2.0D));
         } else if (((EntityLivingBase)var1).getHealth() < 8.0F) {
            var8 = String.valueOf((new StringBuilder(" §4")).append((double)Math.round(((EntityLivingBase)var1).getHealth() * 100.0F / 100.0F) / 2.0D));
         }
      }

      float var10 = 1.6F;
      Minecraft var10000 = mc;
      float var11;
      Tessellator var12;
      BufferBuilder var13;
      int var14;
      int var15;
      if (Minecraft.player.getDistanceToEntity(var1) > 5.0F) {
         Minecraft var10001 = mc;
         var11 = 0.016666668F * Minecraft.player.getDistanceToEntity(var1) / 3.0F;
         GL11.glPushMatrix();
         GL11.glTranslatef((float)var2, (float)var4 + var1.height + 0.5F, (float)var6);
         GL11.glNormal3f(0.0F, 1.0F, 0.0F);
         GL11.glRotatef(-RenderManager.playerViewY, 0.0F, 1.0F, 0.0F);
         GL11.glRotatef(RenderManager.playerViewX, 1.0F, 0.0F, 0.0F);
         GL11.glScalef(-var11, -var11, var11);
         GL11.glEnable(3042);
         GL11.glBlendFunc(770, 771);
         GL11.glEnable(2848);
         GL11.glLineWidth(2.0F);
         GL11.glDisable(3553);
         GL11.glDisable(2929);
         var12 = Tessellator.getInstance();
         var13 = var12.getBuffer();
         var10000 = mc;
         var14 = (int)(-Minecraft.player.getDistanceToEntity(var1)) / (int)var10;
         if (var1.isSneaking()) {
            ++var14;
         } else if (var14 < -14) {
            var14 = -5;
         }

         var15 = mc.fontRendererObj.getStringWidth(String.valueOf((new StringBuilder(String.valueOf(var9))).append(var8))) / 2;
         Gui.drawRect((double)(-var15 - 2), (double)(var14 - 10), (double)(var15 + 2), (double)var14, 1442840575);
         if (((EntityLivingBase)var1).getHealth() < 15.0F) {
            Gui.drawRect((double)(-var15 - 2), (double)(var14 + 1), (double)(var15 + 2), (double)var14, -1711277188);
         } else if (((EntityLivingBase)var1).getHealth() > 15.0F) {
            Gui.drawRect((double)(-var15 - 2), (double)(var14 + 1), (double)(var15 + 2), (double)var14, -1727424768);
         } else if (((EntityLivingBase)var1).getHealth() < 8.0F) {
            Gui.drawRect((double)(-var15 - 2), (double)(var14 + 1), (double)(var15 + 2), (double)var14, -1711341560);
         }

         mc.fontRendererObj.drawStringWithShadow(String.valueOf((new StringBuilder(String.valueOf(var9))).append(":").append(var8)), (float)(-var15), (float)(var14 - 10), 16777215);
         Minecraft.getMinecraft().entityRenderer.disableLightmap();
         GL11.glLineWidth(1.0F);
         GL11.glEnable(3553);
         GL11.glDisable(3042);
         GL11.glDisable(2896);
         GL11.glBlendFunc(770, 771);
         GL11.glPopMatrix();
         GL11.glEnable(2929);
         GL11.glEnable(3553);
         GL11.glDisable(3042);
         GL11.glDisable(2848);
      } else {
         var11 = 0.033333335F;
         GL11.glPushMatrix();
         GL11.glTranslatef((float)var2, (float)var4 + var1.height + 0.5F, (float)var6);
         GL11.glNormal3f(0.0F, 1.0F, 0.0F);
         GL11.glRotatef(-RenderManager.playerViewY, 0.0F, 1.0F, 0.0F);
         GL11.glRotatef(RenderManager.playerViewX, 1.0F, 0.0F, 0.0F);
         GL11.glScalef(-var11, -var11, var11);
         GL11.glEnable(3042);
         GL11.glBlendFunc(770, 771);
         GL11.glEnable(2848);
         GL11.glLineWidth(2.0F);
         GL11.glDisable(3553);
         GL11.glDisable(2929);
         var12 = Tessellator.getInstance();
         var13 = var12.getBuffer();
         var10000 = mc;
         var14 = (int)(-Minecraft.player.getDistanceToEntity(var1)) / (int)var10;
         if (var1.isSneaking()) {
            ++var14;
         } else if (var14 < -14) {
            var14 = -5;
         }

         var15 = mc.fontRendererObj.getStringWidth(String.valueOf((new StringBuilder(String.valueOf(var9))).append(var8))) / 2;
         Gui.drawRect((double)(-var15 - 2), (double)(var14 - 20), (double)(var15 + 2), (double)var14, -1711276033);
         if (((EntityLivingBase)var1).getHealth() < 15.0F) {
            Gui.drawRect((double)(-var15 - 2), (double)(var14 + 1), (double)(var15 + 2), (double)var14, -1711277188);
         } else if (((EntityLivingBase)var1).getHealth() > 15.0F) {
            Gui.drawRect((double)(-var15 - 2), (double)(var14 + 1), (double)(var15 + 2), (double)var14, -1727424768);
         } else if (((EntityLivingBase)var1).getHealth() < 8.0F) {
            Gui.drawRect((double)(-var15 - 2), (double)(var14 + 1), (double)(var15 + 2), (double)var14, -1711341560);
         }

         mc.fontRendererObj.drawStringWithShadow(var9, (float)(-var15), (float)(var14 - 20), -16735761);
         mc.fontRendererObj.drawStringWithShadow(String.valueOf((new StringBuilder("Health:")).append(var8)), (float)(-var15), (float)(var14 - 10), -1);
         Minecraft.getMinecraft().entityRenderer.disableLightmap();
         GL11.glLineWidth(1.0F);
         GL11.glEnable(3553);
         GL11.glDisable(3042);
         GL11.glDisable(2896);
         GL11.glBlendFunc(770, 771);
         GL11.glPopMatrix();
         GL11.glEnable(2929);
         GL11.glEnable(3553);
         GL11.glDisable(3042);
         GL11.glDisable(2848);
      }

   }
}
