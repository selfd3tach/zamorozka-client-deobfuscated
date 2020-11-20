package skid.gay.sex.spermix.inside.shalopay.j;

import java.awt.Dimension;
import java.awt.image.BufferedImage;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.texture.DynamicTexture;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.util.ResourceLocation;

public class aZ {
   
   private boolean b = false;
   
   private bb[] c = new bb[0];
   
   private ResourceLocation d = null;
   
   private DynamicTexture f = null;
   
   private ResourceLocation g = new ResourceLocation("textures/blocks/wool_colored_red.png");
   
   private BufferedImage e = null;
   
   private Dimension a = null;

   public void a(ResourceLocation var1) {
      this.d = var1;
   }

   public boolean a() {
      return this.b;
   }

   public static ModelRenderer a(ModelBiped var0, int var1) {
      switch(var1) {
      case 0:
         return var0.bipedBody;
      case 1:
         return var0.bipedHead;
      case 2:
         return var0.bipedLeftArm;
      case 3:
         return var0.bipedRightArm;
      case 4:
         return var0.bipedLeftLeg;
      case 5:
         return var0.bipedRightLeg;
      default:
         return null;
      }
   }

   public void a(BufferedImage var1) {
      this.e = var1;
   }

   public aZ(Dimension var1, boolean var2, bb[] var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }

   public void a(ModelBiped var1, AbstractClientPlayer var2, float var3, float var4) {
      TextureManager var5 = FastAura.S();
      if (this.b) {
         var5.bindTexture(var2.getLocationSkin());
      } else if (this.d != null) {
         if (this.f == null && this.e != null) {
            this.f = new DynamicTexture(this.e);
            Minecraft.getMinecraft().getTextureManager().loadTexture(this.d, this.f);
         }

         var5.bindTexture(this.d);
      } else {
         var5.bindTexture(this.g);
      }

      for(int var6 = 0; var6 < this.c.length; ++var6) {
         bb var7 = this.c[var6];
         GlStateManager.pushMatrix();
         if (var2.isSneaking()) {
            GlStateManager.translate(0.0F, 0.2F, 0.0F);
         }

         var7.a(var1, var3);
         GlStateManager.popMatrix();
      }

   }
}
