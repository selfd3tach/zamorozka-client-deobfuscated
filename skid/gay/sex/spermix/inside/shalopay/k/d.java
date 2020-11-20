package skid.gay.sex.spermix.inside.shalopay.k;

import net.minecraft.client.renderer.texture.ITextureObject;
import net.minecraft.client.renderer.texture.TextureUtil;

public class d implements m {
   
   private String b = null;
   
   private ITextureObject c = null;
   
   private int a = -1;

   public String toString() {
      return String.valueOf((new StringBuilder("textureUnit: ")).append(this.a).append(", path: ").append(this.b).append(", glTextureId: ").append(this.c.getGlTextureId()));
   }

   public int a() {
      return this.a;
   }

   public d(int var1, String var2, ITextureObject var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }

   public int c() {
      return this.c.getGlTextureId();
   }

   public void d() {
      TextureUtil.deleteTexture(this.c.getGlTextureId());
   }

   public ITextureObject b() {
      return this.c;
   }
}
