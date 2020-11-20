package skid.gay.sex.spermix.inside.shalopay.j;

import java.lang.reflect.Field;

public class bn {
   
   private az a;
   
   private Field c;
   
   private boolean b;

   public void a(Object var1) {
      bk.a((Object)null, (bn)this, (Object)var1);
   }

   public bn(bl var1, String var2, boolean var3) {
      this(new Z(var1, var2), var3);
   }

   public boolean c() {
      return this.a() != null;
   }

   public bn(az var1, boolean var2) {
      this.a = null;
      this.b = false;
      this.c = null;
      this.a = var1;
      if (!var2) {
         this.a();
      }

   }

   public Field a() {
      if (this.b) {
         return this.c;
      } else {
         this.b = true;
         this.c = this.a.a();
         if (this.c != null) {
            this.c.setAccessible(true);
         }

         return this.c;
      }
   }

   public void a(Object var1, Object var2) {
      bk.a(var1, this, var2);
   }

   public Object b() {
      return bk.a((Object)null, (bn)this);
   }

   public bn(az var1) {
      this(var1, false);
   }

   public bn(bl var1, Class var2) {
      this(var1, var2, 0);
   }

   public bn(bl var1, Class var2, int var3) {
      this((az)(new Reflection(var1, var2, var3)));
   }

   public bn(bl var1, String var2) {
      this((az)(new Z(var1, var2)));
   }

   public bn(Field var1) {
      this((az)(new Y(var1)));
   }
}
