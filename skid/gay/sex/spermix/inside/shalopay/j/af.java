package skid.gay.sex.spermix.inside.shalopay.j;

public class af {
   
   private String d;
   
   private int c;
   
   private int b;
   
   private int a;

   public int d() {
      if (this.b > 9) {
         return this.a * 100 + this.b;
      } else {
         return this.c > 9 ? this.a * 100 + this.b * 10 + 9 : this.a * 100 + this.b * 10 + this.c;
      }
   }

   public int a() {
      return this.a;
   }

   public int b() {
      return this.b;
   }

   public af(int var1, int var2, int var3) {
      this(var1, var2, var3, (String)null);
   }

   public String toString() {
      return this.d == null ? String.valueOf((new StringBuilder()).append(this.a).append(".").append(this.b).append(".").append(this.c)) : String.valueOf((new StringBuilder()).append(this.a).append(".").append(this.b).append(".").append(this.c).append(this.d));
   }

   public af(int var1, int var2) {
      this(var1, var2, 0);
   }

   public af(int var1, int var2, int var3, String var4) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
   }

   public int c() {
      return this.c;
   }
}
