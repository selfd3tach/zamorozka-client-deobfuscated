package skid.gay.sex.spermix.inside.shalopay.j;

public class bo {
   
   private Class b;
   
   private bn[] c;
   
   private bl a;

   public bo(bl var1, Class var2, int var3) {
      this.a = var1;
      this.b = var2;
      if (var1.b() && var2 != null) {
         this.c = new bn[var3];

         for(int var4 = 0; var4 < this.c.length; ++var4) {
            this.c[var4] = new bn(var1, var2, var4);
         }
      }

   }

   public bn a(int var1) {
      return var1 >= 0 && var1 < this.c.length ? this.c[var1] : null;
   }
}
