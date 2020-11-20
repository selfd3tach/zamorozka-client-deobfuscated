package skid.gay.sex.spermix.inside.shalopay.j;

public class bl {
   
   private String a;
   
   private Class c;
   
   private boolean b;

   public bl(String var1, boolean var2) {
      this.a = null;
      this.b = false;
      this.c = null;
      this.a = var1;
      if (!var2) {
         Class var3 = this.a();
      }

   }

   public bq a(String var1) {
      return new bq(this, var1);
   }

   public bl(String var1) {
      this(var1, false);
   }

   public boolean a(Object var1) {
      return this.a() == null ? false : this.a().isInstance(var1);
   }

   public bl(Class var1) {
      this.a = null;
      this.b = false;
      this.c = null;
      this.c = var1;
      this.a = var1.getName();
      this.b = true;
   }

   public boolean b() {
      return this.a() != null;
   }

   public Class a() {
      if (this.b) {
         return this.c;
      } else {
         this.b = true;

         try {
            this.c = Class.forName(this.a);
         } catch (ClassNotFoundException var2) {
            FastAura.d(String.valueOf((new StringBuilder("(Reflector) Class not present: ")).append(this.a)));
         } catch (Throwable var3) {
            var3.printStackTrace();
         }

         return this.c;
      }
   }
}
