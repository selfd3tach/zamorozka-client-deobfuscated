package skid.gay.sex.spermix.inside.shalopay.k;

import org.lwjgl.opengl.ARBShaderObjects;

public class S extends R {
   
   private float[] a = new float[4];

   public void a(float var1, float var2, float var3, float var4) {
      if (this.c() >= 0 && (this.a[0] != var1 || this.a[1] != var2 || this.a[2] != var3 || this.a[3] != var4)) {
         ARBShaderObjects.glUniform4fARB(this.c(), var1, var2, var3, var4);
         V.e(this.b());
         this.a[0] = var1;
         this.a[1] = var2;
         this.a[2] = var3;
         this.a[3] = var4;
      }

   }

   protected void a() {
      this.a[0] = 0.0F;
      this.a[1] = 0.0F;
      this.a[2] = 0.0F;
      this.a[3] = 0.0F;
   }

   public S(String var1) {
      super(var1);
   }
}
