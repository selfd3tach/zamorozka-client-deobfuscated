package skid.gay.sex.spermix.inside.shalopay.j;

import java.util.Map;

class ar implements ap {
   
   private final Map a;

   public void a(aw var1, Exception var2) {
      synchronized(this.a) {
         this.a.put("Exception", var2);
         this.a.notifyAll();
      }
   }

   ar(Map var1) {
      this.a = var1;
   }

   public void a(aw var1, ax var2) {
      synchronized(this.a) {
         this.a.put("Response", var2);
         this.a.notifyAll();
      }
   }
}
