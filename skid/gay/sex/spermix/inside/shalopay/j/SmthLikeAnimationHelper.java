package skid.gay.sex.spermix.inside.shalopay.j;

public class SmthLikeAnimationHelper {
   
   public long b = 0L;
   
   public long a = 0L;

   public void a() {
      if (aF.ClickGUI && this.a == 0L) {
         this.a = System.nanoTime();
      }

   }

   private void c() {
      this.b = 0L;
      this.a = 0L;
   }

   // $FF: synthetic method
   static void a(SmthLikeAnimationHelper var0) {
      var0.c();
   }

   public void b() {
      if (aF.ClickGUI && this.a != 0L) {
         this.b += System.nanoTime() - this.a;
         this.a = 0L;
      }

   }
}
