package skid.gay.sex.spermix.inside.shalopay.j;

public class bi {
   
   private int b;
   
   private int a;

   public String toString() {
      return String.valueOf((new StringBuilder("min: ")).append(this.a).append(", max: ").append(this.b));
   }

   public int a() {
      return this.a;
   }

   public bi(int var1, int var2) {
      this.a = Math.min(var1, var2);
      this.b = Math.max(var1, var2);
   }

   public boolean a(int var1) {
      if (var1 < this.a) {
         return false;
      } else {
         return var1 <= this.b;
      }
   }
}
