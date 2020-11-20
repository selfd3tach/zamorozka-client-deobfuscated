package skid.gay.sex.spermix.inside.shalopay.j;

public class bj {
   
   private bi[] a = new bi[0];

   public void a(bi var1) {
      this.a = (bi[])FastAura.a((Object[])this.a, (Object)var1);
   }

   public boolean a(int var1) {
      for(int var2 = 0; var2 < this.a.length; ++var2) {
         bi var3 = this.a[var2];
         if (var3.a(var1)) {
            return true;
         }
      }

      return false;
   }

   public bi b(int var1) {
      return this.a[var1];
   }

   public int a() {
      return this.a.length;
   }

   public String toString() {
      StringBuffer var1 = new StringBuffer();
      var1.append("[");

      for(int var2 = 0; var2 < this.a.length; ++var2) {
         bi var3 = this.a[var2];
         if (var2 > 0) {
            var1.append(", ");
         }

         var1.append(var3.toString());
      }

      var1.append("]");
      return var1.toString();
   }
}
