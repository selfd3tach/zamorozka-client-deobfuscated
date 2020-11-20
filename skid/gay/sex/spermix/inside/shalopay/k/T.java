package skid.gay.sex.spermix.inside.shalopay.k;

import org.lwjgl.opengl.ARBShaderObjects;

public class T extends R {
   
   private int a = -1;

   public void b(int var1) {
      if (this.c() >= 0 && this.a != var1) {
         ARBShaderObjects.glUniform1iARB(this.c(), var1);
         V.e(this.b());
         this.a = var1;
      }

   }

   public T(String var1) {
      super(var1);
   }

   protected void a() {
      this.a = -1;
   }
}
