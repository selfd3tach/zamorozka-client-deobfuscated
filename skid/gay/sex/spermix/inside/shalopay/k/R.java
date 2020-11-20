package skid.gay.sex.spermix.inside.shalopay.k;

import org.lwjgl.opengl.ARBShaderObjects;

public abstract class R {
   
   private int b = -1;
   
   private int c = -1;
   
   private String a;

   public R(String var1) {
      this.a = var1;
   }

   public String b() {
      return this.a;
   }

   public boolean d() {
      return this.c >= 0;
   }

   public void a(int var1) {
      if (this.b != var1) {
         this.b = var1;
         this.c = ARBShaderObjects.glGetUniformLocationARB(var1, this.a);
         this.a();
      }

   }

   protected abstract void a();

   public int c() {
      return this.c;
   }
}
